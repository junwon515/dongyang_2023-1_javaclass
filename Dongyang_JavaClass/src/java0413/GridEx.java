package java0413;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridEx extends JFrame {
	
	ArrayList<Student> stulist = new ArrayList<Student>();
	
	public GridEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 컨테이너
		Container c = getContentPane();
		c.setLayout(new GridLayout(6, 2, 5, 5));
		// 컴포넌트
		JTextField  textName = new JTextField(); 
		JTextField  textStudentID = new JTextField(); 
		JTextField  textDepartment = new JTextField(); 
		JTextField  textSubject = new JTextField(); 
		JButton btnOk = new JButton("확인"); 
		JButton btnCancel = new JButton("취소");
		JButton btnJohoi = new JButton("조회");
		JButton btnSearch = new JButton("이름으로검색");
		// 버튼 액션
		btnOk.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = textName.getText(); 
				String studentID = textStudentID.getText();
				String department = textDepartment.getText();
				String subject = textSubject.getText();
				System.out.println(name + studentID + department + subject);
				stulist.add(new Student(name, studentID, department, studentID)); 
			}
		});
		btnCancel.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textName.setText("");
				textStudentID.setText("");
				textDepartment.setText("");
				textSubject.setText("");
			}
		});
		btnJohoi.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (Student stu : stulist) {
					System.out.println(stu);
				}				
			}
		});
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String searchName = textName.getText(); 
				for (Student stu : stulist) {
					if (searchName.equals(stu.getName())) {
						System.out.println(stu);
					}
				}	
			}
		});
		// 구성
		c.add(new JLabel(" 이름"));
		c.add(textName);
		c.add(new JLabel(" 학번"));
		c.add(textStudentID);
		c.add(new JLabel(" 학과"));
		c.add(textDepartment);
		c.add(new JLabel(" 과목"));
		c.add(textSubject);
		c.add(btnOk);	
		c.add(btnCancel); 
		c.add(btnJohoi); 
		c.add(btnSearch); 
		
		// 컨테이너 초기 사이즈
		setSize(300, 200);
		setVisible(true);
		}
}








