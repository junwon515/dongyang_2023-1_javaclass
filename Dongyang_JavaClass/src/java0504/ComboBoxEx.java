package java0504;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxEx extends JFrame {
	
	private int index;
	private String [] fruits = {"사과", "바나나", "키위", "망공", "복숭아",
			"수박", "딸기", "블루베리"};
	private Integer [] numbers = {100, 200, 300, 400, 500, 600 ,700}; 
	
	public ComboBoxEx() {
		this.setTitle("컴보박스 만들기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		
		JComboBox<String> strComboBox = new JComboBox<>(fruits);
		con.add(strComboBox);
		JComboBox<Integer> intComboBox = new JComboBox<>();
//		for (int i = 0; i < numbers.length; i++) {
//			intComboBox.addItem(numbers[i]);
//		}
		for (Integer item : numbers) {
			intComboBox.addItem(item);
		}
		con.add(intComboBox);
		
		index = strComboBox.getSelectedIndex();
		JButton btnOk = new JButton("확인");
		JLabel lbFruit = new JLabel(fruits[index]);		
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				index = strComboBox.getSelectedIndex();
				lbFruit.setText(fruits[index]);
			}
		});
		
		con.add(btnOk);
		con.add(lbFruit);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
}
