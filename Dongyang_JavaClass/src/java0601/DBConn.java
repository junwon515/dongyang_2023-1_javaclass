package java0601;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	public static Connection DBconnection() {
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "dongyang");
			//mydb에 연결 
			System.out.println("mydb에 연결 완료~~");
			return conn;
			
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("db driver 에러 또는 연결 에러");
			e.printStackTrace();
			return null;
		}
	}
}
