package java0518;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest1 {
	
	public static void main(String[] args) {
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
			System.out.println("sampledb 연결 완료");
			
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
			e.printStackTrace();
		}
	}
}
