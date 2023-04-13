package java0413;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFormEx extends JFrame {

	ArrayList<Login> loginList = new ArrayList<Login>();
	
	public LoginFormEx() {
		loginList.add(new Login("hong@google.com", "1234"));
		setTitle("LOGIN FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(3,2,1,1));
		JButton btnLogin = new JButton("로그인");
		JButton btnCancel = new JButton("취소");
		JTextField emailText = new JTextField();
		JPasswordField passwordText = new JPasswordField();
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String myEmail = emailText.getText();
				String myPassword = passwordText.getText();
				String email, password;
				int check = 1;
				for (Login login : loginList) {
					email = login.getEmail();
					password = login.getPassword();
					if ((email.equals(myEmail)) && (password.equals(myPassword))) {
						System.out.println("이메일 : " + login.getEmail());
						System.out.println("비밀번호 : " + login.getPassword());
						System.out.println("는 로그인되었습니다.");
						check = 0;
					}
				}
				if (check == 1) {
					System.out.println("이메일과 비밀번호를 다시 입력하십시오.");
				}
			}
		});
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				emailText.setText("");
				passwordText.setText("");
			}
		});
		con.add(new JLabel("이메일"));
		con.add(emailText);
		con.add(new JLabel("비밀번호"));
		con.add(passwordText);
		con.add(btnLogin);
		con.add(btnCancel);
		
		setVisible(true);
		setSize(350,150);
	}
}
