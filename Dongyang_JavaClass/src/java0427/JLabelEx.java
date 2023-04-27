package java0427;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelEx extends JFrame{
	
	public JLabelEx() {
		this.setTitle("레이블 예쩨");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane(); // 배치관리자 BorderLayout
		con.setLayout(new FlowLayout());
		JLabel txtLabel = new JLabel("사랑합니다. 여러분~~");
		ImageIcon image = new ImageIcon("img\\heart.png");
		JLabel imgLabel = new JLabel(image);
		con.add(txtLabel);
		con.add(imgLabel);
		
		this.setSize(1000,600);
		this.setVisible(true);
	}
}
