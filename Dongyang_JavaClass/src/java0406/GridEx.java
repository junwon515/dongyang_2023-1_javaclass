package java0406;

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
	ArrayList<Student> studentList = new ArrayList<>();
	public GridEx() {
		this.setTitle("Grid Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(6, 2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" 이름"));
		JTextField textName = new JTextField();
		c.add(textName);
		c.add(new JLabel(" 학번"));
		JTextField textStudentID = new JTextField();
		c.add(textStudentID);
		c.add(new JLabel(" 학과"));
		JTextField textDepartment = new JTextField();
		c.add(textDepartment);
		c.add(new JLabel(" 과목"));
		JTextField textSubject = new JTextField();
		c.add(textSubject );
		JButton okButton = new JButton("확인");
		JButton cancelButton = new JButton("취소");
		JButton checkButton = new JButton("조회");
		c.add(okButton);
		c.add(cancelButton);
		c.add(checkButton);
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = textName.getText();
				int studentID = Integer.parseInt(textStudentID.getText());
				String department = textDepartment.getText();
				String subject = textSubject.getText();
				System.out.println("확인 버튼을 클릭했습니다. ");
				System.out.println("이름 : " + name + "\n학번 : " + studentID + "\n학과 : " + department + "\n과목 : " + subject);
				studentList.add(new Student(name, studentID, department, subject));
			}
		});
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("취소 버튼을 클릭했습니다. ");
				textName.setText("");
				textStudentID.setText("");
				textDepartment.setText("");
				textSubject.setText("");
			}
		});
		checkButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("=================================목록=================================");
				for (Student student : studentList) {
					System.out.println("이름 : " + student.getName() + "\n학번 : " + student.getStudentID() + "\n학과 : " + student.getDepartment() + "\n과목 : " + student.getSubject());
					System.out.println("====================================================================");
				}
			}
		});
		
		
		this.setSize(300, 200);
		this.setVisible(true);
		
	}
}
