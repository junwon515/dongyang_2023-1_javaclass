package java0525;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DBPreEx1 {

	public static void main(String[] args) {
		Connection con;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		String inid = "2022001", inname = "홍길동", indept = "무용학과";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
			// 1번 방식
			stmt = con.createStatement();
			String sql = "insert into studenttbl(id, name, dept) values('" + inid + "', '" + inname + "', '" + indept + "');";
			stmt.executeUpdate(sql);
			// 2번 방식
			inid = "2022002";
			String presql = "insert into studenttbl(id, name, dept) values(?, ?, ?);";
			pstmt = con.prepareStatement(presql);
			pstmt.setString(1, inid);
			pstmt.setString(2, inname);
			pstmt.setString(3, indept);
			pstmt.executeUpdate();
			System.out.println("입력 완료~");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("db 연결이나 sql 에러~");
		}
	}
}
