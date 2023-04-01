package java0323;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileInOutStreamEx1 {

	public static void main(String[] args) {
		try {
			// 바이트 단위 스트림
//			FileInputStream	fin = new FileInputStream("c:\\sea.jpg");
//			FileOutputStream fout = new FileOutputStream("c:\\seaoutput.jpg");
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream("c:\\sea.jpg"));
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("c:\\seaoutput.jpg"));
			
			int c;
			
			while ((c = bin.read()) != -1) {
				bout.write(c);
			}
			bin.close();
			bout.close();
			System.out.println("복사 되었습니다.");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("에러 발생~");
		}
	}
}
