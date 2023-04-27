package java0427;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame{

	public RadioButtonEx() {
		this.setTitle("라디오버튼 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("img/cherry1.png");
		ImageIcon selCherryIcon = new ImageIcon("img/cherry2.png");
		
		ButtonGroup group = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton dae= new JRadioButton("배",true);
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selCherryIcon);
		group.add(apple);
		group.add(dae);
		group.add(cherry);
		
		con.add(apple);
		con.add(dae);
		con.add(cherry);
		
		this.setSize(400,600);
		this.setVisible(true);
	}
}
