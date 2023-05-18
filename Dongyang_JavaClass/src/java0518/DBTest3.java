package java0518;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest3 {

	public static void main(String[] args) {	
		Connection con;
		Statement stmt = null;		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
			System.out.println("sampledb 연결 완료");
			
			stmt = con.createStatement();
			stmt.executeUpdate("insert into student values('21007', '아무개', '경영학과'); ");
			stmt.executeUpdate("insert into student values('21008', '리사', '스포츠학과'); ");
			stmt.executeUpdate("update student set sname='제임스본드' where id='21007'");
			stmt.executeUpdate("delete from student where sname='제임스본드'");
			
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
