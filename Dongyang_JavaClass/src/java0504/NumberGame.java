package java0504;

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
	
	int randomNumber = (int)(Math.random() * 100) + 1;
	
	public NumberGame() {	
		System.out.println("정답 ~~ " + randomNumber);
		this.setTitle("숫자 게임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		// 패널 구분
		JPanel pnTop = new JPanel();
		JPanel pnMid = new JPanel();
		JPanel pnBottom = new JPanel();
		
		// 미드 패널 바탕색 변경
		pnMid.setOpaque(true); // 레이블을 불투명하게
		pnMid.setBackground(Color.yellow);
		
		// 컴포너트 구성
		JLabel laText = new JLabel("숫자 추측 : ");
		JTextField tfText = new JTextField(10);
		JLabel lbResult = new JLabel("시작 (1~100) 숫자를  입력하시오.");
		JButton btnRetry = new JButton("다시 한번");
		JButton btnExit = new JButton("종료");
		
		// 액션 구현
		tfText.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int input = Integer.parseInt(tfText.getText());
				if (input < randomNumber) {
					lbResult.setText("숫자가 작습니다.");
					lbResult.setBackground(Color.red);
				} else if (input == randomNumber) {
					lbResult.setText("정답~");
					lbResult.setBackground(Color.green);
				} else {
					lbResult.setText("숫자가 큽니다.");
					lbResult.setBackground(Color.cyan);
				}
			}
		});
		btnRetry.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfText.setText("");
				lbResult.setText("다시하기 (1~100) 숫자를  입력하시오.");
				randomNumber = (int)(Math.random() * 100) + 1;
				System.out.println("다시한번 정답 ~~" + randomNumber);
			}
		});
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("시스템 종료");
				System.exit(1);
			}
		});
		
		// 컴포넌트 추가
		pnTop.add(laText);
		pnTop.add(tfText);
		pnMid.add(lbResult);
		pnBottom.add(btnRetry);
		pnBottom.add(btnExit);
		
		// 컨테이너에 패널 추가
		con.add(pnTop);
		con.add(pnMid);
		con.add(pnBottom);
		
		this.setSize(250,200);
		this.setVisible(true);
	}
}
