package java0323;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx1 {

	public static void main(String[] args) {
		try {
			// 문자 단위 스트림
//			FileReader fin = new FileReader("c:\\test.txt");
//			FileWriter fout = new FileWriter("c:\\testoutput.txt");
			BufferedReader bin = new BufferedReader(new FileReader("c:\\test.txt"));
			BufferedWriter bout = new BufferedWriter(new FileWriter("c:\\testoutput.txt"));
			
			int c;
			
			while ((c = bin.read()) != -1) {
				System.out.print((char)c);
				bout.write(c);
			}
			bin.close();
			bout.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 없음 에러~");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 읽기,  쓰기 에러~");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러~");
		}
	}
}
