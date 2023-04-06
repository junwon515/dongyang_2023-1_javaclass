package java0406;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class YesNo extends JFrame {

	public YesNo() {
		this.setTitle("확인, 취소 버튼");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.gray);
		JButton yesButton = new JButton("확인");
		JButton noButton = new JButton("취소");
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인 버튼을 눌렀습니다.");
			}
		});
		noButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("취소 버튼을 눌렀습니다.");
			}
		});
		c.add(yesButton);
		c.add(noButton);
		
		this.setSize(350, 150);
		this.setVisible(true);
	}
}
