package java0525;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import assignment.Addr;

public class InputEx1 extends JFrame {
	JButton btnInsert, btnDelete, btnUpdate, btnSelect, btnSearch;
	JTextField tfId, tfName, tfDept, tfSearch;
	JTextArea ta;
	JRadioButton rbId, rbName, rbDept;
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;

	public InputEx1() {
		this.setTitle("학생 관리 프로젝트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createGUI();
		
		btnInsert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbInsert();
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbUpdate();
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbDelete();
			}
		});
		btnSelect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbSelect();
			}
		});
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbSearch();
			}
		});
		
		this.setSize(300, 550);
		this.setVisible(true);
	}
	
	// UI화면
	public void createGUI() {
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(new JLabel("학번"));
		tfId = new JTextField(20);
		con.add(tfId);
		con.add(new JLabel("이름"));
		tfName = new JTextField(20);
		con.add(tfName);
		con.add(new JLabel("학과"));
		tfDept = new JTextField(20);
		con.add(tfDept);
		btnInsert = new JButton("입력");
		con.add(btnInsert);
		btnUpdate = new JButton("수정");
		con.add(btnUpdate);
		btnDelete = new JButton("삭제");
		con.add(btnDelete);
		btnSelect = new JButton("조회");
		con.add(btnSelect);
		// 검색 부분
		tfSearch = new JTextField(18);
		rbId = new JRadioButton("학번", true);
		rbName = new JRadioButton("이름");
		rbDept = new JRadioButton("학과");
		ButtonGroup group = new ButtonGroup();
		group.add(rbId);
		group.add(rbName);
		group.add(rbDept);
		btnSearch = new JButton("검색");
		JPanel pn1 =  new JPanel();
		pn1.add(new JLabel(" "));
		pn1.add(tfSearch);
		pn1.add(btnSearch);
		JPanel pn2 =  new JPanel();
		pn2.add(rbId);
		pn2.add(rbName);
		pn2.add(rbDept);
		JPanel pMiddel = new JPanel(new BorderLayout(0, 0));
		pMiddel.add(BorderLayout.NORTH, pn1);
		pMiddel.add(BorderLayout.CENTER, pn2);
		TitledBorder tb = new TitledBorder("검색");
		pMiddel.setBorder(tb);
		con.add(pMiddel);
		ta = new JTextArea(15, 20);
		con.add(ta);
	}
	
	// 버튼 이벤트 처리
	// 데이터 삽입
	public void dbInsert() {
		try {
			conn = DBConn.dbConnection();
			String insertId = tfId.getText().toString();
			String insertName = tfName.getText().toString();
			String insertDept = tfDept.getText().toString();
		
			String presql = "insert into studenttbl(id, name, dept) values(?, ?, ?);";
			pstmt = conn.prepareStatement(presql);
			pstmt.setString(1, insertId);
			pstmt.setString(2, insertName);
			pstmt.setString(3, insertDept);
			pstmt.executeUpdate();
			
			tfId.setText("");
			tfName.setText("");
			tfDept.setText("");
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	// 데이터 수정
	public void dbUpdate() {
		try {
			conn = DBConn.dbConnection();
			String updataId = tfId.getText().toString();
			String updataName = tfName.getText().toString();
			String updataDept = tfDept.getText().toString();
		
			String presql = "update studenttbl set name = ?, dept = ? where id = ?";
			pstmt = conn.prepareStatement(presql);
			pstmt.setString(1, updataName);
			pstmt.setString(2, updataDept);
			pstmt.setString(3, updataId);
			pstmt.executeUpdate();
			
			tfId.setText("");
			tfName.setText("");
			tfDept.setText("");
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	// 데이터 삭제
	public void dbDelete() {
		try {
			conn = DBConn.dbConnection();
			String updataId = tfId.getText().toString();
		
			String presql = "delete from studenttbl where id = ?";
			pstmt = conn.prepareStatement(presql);
			pstmt.setString(1, updataId);
			pstmt.executeUpdate();
			
			tfId.setText("");
			tfName.setText("");
			tfDept.setText("");
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	// 데이터 조회
	public void dbSelect() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from studenttbl;");
			String line = "";
			ta.setText("    id                name                dept \n");
			ta.append("--------------------------------------------------- \n");
			while (rs.next()) {
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				String id = rs.getString("id");
				line = " | " + id  + " | " + name  + " | " + dept  + "\n";
				System.out.println("rs => " + line);
				ta.append(line);
			}
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	// 데이터 검색
	public void dbSearch() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
			String searchText = tfSearch.getText().toString();
			String searchSql = "";
			String id, name, dept;
			if (rbId.isSelected()) {
				searchSql = "select * from studenttbl where id = '" + searchText + "';";
			} else if (rbName.isSelected()) {
				searchSql = "select * from studenttbl where name = '" + searchText + "';";
			} else {
				searchSql = "select * from studenttbl where dept = '" + searchText + "';";
			}
			rs = stmt.executeQuery(searchSql);
			String line = "";
			ta.setText("    id                name                dept \n");
			ta.append("--------------------------------------------------- \n");
			while (rs.next()) {
				id = rs.getString("id");
				name = rs.getString("name");
				dept = rs.getString("dept");
				line = " | " + id  + " | " + name  + " | " + dept  + "\n";
				System.out.println("rs => " + line);
				ta.append(line);
			}
			
			tfSearch.setText("");
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
