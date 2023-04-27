package java0427;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {

	public TextAreaEx() {
		this.setTitle("덱스트 에리어 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		con.add(new JLabel("입력후 <Enter>키를 누르시오. "));
		JTextField tf = new JTextField(20);
		JTextArea ta = new JTextArea(7, 20);
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String input = tf.getText();
				ta.append(input + "\n");
				tf.setText("");
			}
		});
		
		con.add(tf);
		con.add(new JScrollPane(ta));
		
		this.setSize(300,300);
		this.setVisible(true);
	}
}
