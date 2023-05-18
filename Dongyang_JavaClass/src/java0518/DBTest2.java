package java0518;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest2 {

	public static void main(String[] args) {	
		Connection con;
		Statement stmt = null;		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
			System.out.println("sampledb 연결 완료");
			
			stmt = con.createStatement();
			ResultSet results = stmt.executeQuery("select * from student");
			while (results.next()) {
				System.out.println(results.getString("id") + "	|	" + results.getString(2) + "	|	" + results.getString(3));
			}
			
			stmt.close();
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
