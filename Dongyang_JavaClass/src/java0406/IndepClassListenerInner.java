package java0406;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListenerInner extends JFrame {

	public IndepClassListenerInner() {
		this.setTitle("버튼 액션이벤트 리스너2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.ORANGE);
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		this.setSize(350, 150);
		this.setVisible(true);		
	}
	
	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			System.out.println(b);
			if (b.getText().equals("Action")) {
				b.setText("액션");
			} else {
				b.setText("Action");
			}
		}
	}
}
