package java0413;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelEx extends JFrame {

	public JPanelEx() {
		setTitle("JPanel Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JPanel pan = new JPanel();
		c.add(pan);
		
		JLabel la = new JLabel("아이스크림을 좋아하나요?");
		JButton btnyes = new JButton("Yes");
		JButton btnno = new JButton("No");
		btnyes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("예, 아이스크림을 좋아합니다.");
			}
		});
		btnno.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("아니오, 아이스크림을 좋아하지 않습니다.");
			}
		});
		pan.add(la);
		pan.add(btnyes);
		pan.add(btnno);
		
		setVisible(true);
		setSize(350,150);
	}
}
