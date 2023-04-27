package java0427;

import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckBoxEx extends JFrame {

	public CheckBoxEx() {
		this.setTitle("체크박스 예쩨");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane();
		
		JPanel pan = new JPanel(); // FlowLayout
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox bae = new JCheckBox("배",true);
		ImageIcon cherryIcon = new ImageIcon("img\\cherry1.png");
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		cherry.setBorderPainted(true);
		ImageIcon selCHerryIcon = new ImageIcon("img/cherry2.png");
		cherry.setSelectedIcon(selCHerryIcon);
		apple.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if ( apple.isSelected() ) {
					System.out.println("사과가 선택됨~~");					
				} else {
					System.out.println("사과가 해제됨~~");
				}
			}
		});
		bae.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if ( bae.isSelected() ) {
					System.out.println("배가 선택됨~!");					
				} else {
					System.out.println("배가 해제됨~!");
				}
			}
		});
		cherry.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if ( cherry.isSelected() ) {
					System.out.println("체리 좋아~~");					
				} else {
					System.out.println("체리 싫어!?");
				}
			}
		});
		
		pan.add(apple);
		pan.add(bae);
		pan.add(cherry);
		
		con.add(pan);
		this.setSize(400,600);
		this.setVisible(true);
	}
}
