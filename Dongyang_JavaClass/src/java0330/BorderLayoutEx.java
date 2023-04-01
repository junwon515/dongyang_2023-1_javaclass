package java0330;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {

	public BorderLayoutEx() {
		this.setTitle("borderLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		
		con.setLayout(new BorderLayout(30, 20));
		con.add(new JButton("Calculate"), BorderLayout.CENTER);
		con.add(new JButton("add"), BorderLayout.NORTH);
		con.add(new JButton("sub"), BorderLayout.SOUTH);
		con.add(new JButton("mul"), BorderLayout.EAST);
		con.add(new JButton("div"), BorderLayout.WEST);
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
}
