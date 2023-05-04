package java0504;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListEx extends JFrame {

	private int index;
	private String [] fruits = {"사과", "바나나", "키위", "망공", "복숭아",
			"수박", "딸기", "블루베리"};
	private Integer [] numbers = {100, 200, 300, 400, 500, 600 ,700}; 
	
	public ListEx() {
		this.setTitle("리스트 만들기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<>(fruits);
		con.add(strList);
		JList<Integer> intList = new JList<>(numbers);
		con.add(intList);
		
		JButton btnOk = new JButton("확인");
		JLabel lbFruit = new JLabel();
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				index = strList.getSelectedIndex();
				lbFruit.setText(fruits[index]);
			}
		});
		
		con.add(btnOk);
		con.add(lbFruit);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
}
