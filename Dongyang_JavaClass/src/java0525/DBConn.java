package java0525;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConn {
	
	public static Connection dbConnection() {
		Connection conn;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
			System.out.println("DB Connection Success");
			return conn;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("DB class or SQL error");
			return null;
		}
	}
}
