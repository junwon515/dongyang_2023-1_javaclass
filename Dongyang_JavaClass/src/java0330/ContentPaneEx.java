package java0330;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {

	public ContentPaneEx() {
		this.setTitle("컨테이너에 버튼 추가하기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		Container conPane = this.getContentPane();
		conPane.setBackground(Color.orange);
		conPane.setLayout(new FlowLayout());
		
		conPane.add(new JButton("Ok"));
		JButton hin = new JButton("확인");
		conPane.add(hin);
		JButton cso = new JButton("취소");
		conPane.add(cso);		
		
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
}
