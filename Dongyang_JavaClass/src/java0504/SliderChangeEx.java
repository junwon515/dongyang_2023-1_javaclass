package java0504;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderChangeEx extends JFrame {
	
	private int r, g, b;
	private JLabel lbColor;
	private JSlider sl[] = new JSlider[3];
	public SliderChangeEx() {
		this.setTitle("슬라이더와 ChangeEvent 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		lbColor = new JLabel("슬라이더 예제");
		for (int i = 0; i < sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			con.add(sl[i]);
			sl[i].addChangeListener(new ChangeListener() {
				
				@Override
				public void stateChanged(ChangeEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		con.add(lbColor);
		sl[0].setForeground(Color.red);
		sl[1].setForeground(Color.green);
		sl[2].setForeground(Color.blue);
		
		r = sl[0].getValue();
		g = sl[1].getValue();
		b = sl[2].getValue();
		
		lbColor.setOpaque(true);
		lbColor.setBackground(new Color(r,g,b));
		
		JButton btnOk = new JButton("확인");
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				r = sl[0].getValue();
				g = sl[1].getValue();
				b = sl[2].getValue();
				lbColor.setBackground(new Color(r,g,b));
			}
		});
		con.add(btnOk);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
}
