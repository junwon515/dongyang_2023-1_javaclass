package java0427;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGame extends JFrame{
	
	public NumberGame() {
		this.setTitle("숫자 게임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		// 탑 패널
		JPanel pnTop = new JPanel();
		JLabel laText = new JLabel("숫자를  추측하시오 :");
		JTextField tfText = new JTextField(10);
		pnTop.add(laText);
		pnTop.add(tfText);
		
		// 미드 패널
		JPanel pnMid = new JPanel();
		JLabel lbResult = new JLabel("시작~ 숫자를 입력하시오.");
		lbResult.setBackground(Color.yellow);
		lbResult.setOpaque(true); // 레이블을 불투명하게
		pnMid.add(lbResult);
		
		// 바텀 패널
		JPanel pnBottom = new JPanel();
		JButton btnRetry = new JButton("다시 한번");
		JButton btnExit = new JButton("종료");
		pnBottom.add(btnRetry);
		pnBottom.add(btnExit);
		
		con.add(pnTop);
		con.add(pnMid);
		con.add(pnBottom);
		
		this.setSize(300,150);
		this.setVisible(true);
	}
}
