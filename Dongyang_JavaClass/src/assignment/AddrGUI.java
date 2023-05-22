package assignment;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddrGUI extends JFrame {

    private static ArrayList<Addr> addlist = new ArrayList<Addr>();
    private static Container con;
    private static JTextField nameField;
    private static JTextField telField;
    private static JTextField comField;
    private static JTextArea resultArea;
    
    public AddrGUI() {
    	this.setTitle("주소관리 GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		con = this.getContentPane();
		con.setLayout(new BorderLayout());
		
        // 상단 패널
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("이름: "));
        nameField = new JTextField(10);
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("전화번호: "));
        telField = new JTextField(10);
        inputPanel.add(telField);
        inputPanel.add(new JLabel("회사명: "));
        comField = new JTextField(10);
        inputPanel.add(comField);

        // 중앙 패널
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        // 하단 패널
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("주소록 입력");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addrInput();
            }
        });
        buttonPanel.add(addButton);
        JButton searchButton = new JButton("주소록 검색");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addrSearch();
            }
        });
        buttonPanel.add(searchButton);
        JButton showAllButton = new JButton("주소록 전체 조회");
        showAllButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addrJohoi();
            }
        });
        buttonPanel.add(showAllButton);
        JButton updateButton = new JButton("주소록 수정");
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addrUpdate();
            }
        });
        buttonPanel.add(updateButton);
        JButton deleteButton = new JButton("주소록 삭제");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addrDelete();
            }
        });
        buttonPanel.add(deleteButton);

        // 프레임에 컴포넌트 추가
        con.add(inputPanel, BorderLayout.NORTH);
        con.add(scrollPane, BorderLayout.CENTER);
        con.add(buttonPanel, BorderLayout.SOUTH);

		this.pack();
		this.setVisible(true);
    }

    private static void addrDelete() {
        String name = JOptionPane.showInputDialog(con, "삭제할 이름을 입력하세요.");
        for (int i = 0; i < addlist.size(); i++) {
	        if (addlist.get(i).getName().equals(name)) {
	            addlist.remove(i);
	            JOptionPane.showMessageDialog(con, "주소록이 삭제되었습니다.");
	            return;
	        }
        }
        JOptionPane.showMessageDialog(con, "해당하는 이름의 주소록이 없습니다.");
    }
    
    private static void addrUpdate() {
        String name = JOptionPane.showInputDialog(con, "수정할 이름을 입력하세요.");
        String tel = JOptionPane.showInputDialog(con, "수정할 전화번호를 입력하세요.");
        String com = JOptionPane.showInputDialog(con, "수정할 회사이름을 입력하세요.");

        for (Addr addr : addlist) {
            if (addr.getName().equals(name)) {
                addr.setTel(tel);
                addr.setCom(com);
                JOptionPane.showMessageDialog(con, "주소록이 수정되었습니다.");
                return;
            }
        }
        JOptionPane.showMessageDialog(con, "해당하는 이름의 주소록이 없습니다.");
    }

    private static void addrInput() {
        String name = nameField.getText();
        String tel = telField.getText();
        String com = comField.getText();
        LocalDateTime date = LocalDateTime.now();

        Addr add1 = new Addr(name, tel, com, date);
        addlist.add(add1);

        // 입력 후 필드 초기화
        nameField.setText("");
        telField.setText("");
        comField.setText("");
    }

    private static void addrJohoi() {
        resultArea.setText("");
        for (Addr item : addlist) {
            resultArea.append(item.toString() + "\n");
        }
    }

    private static void addrSearch() {
        String name = JOptionPane.showInputDialog(con, "검색할 이름을 입력하세요.");

        for (Addr item : addlist) {
            if (item.getName().equals(name)) {
                resultArea.setText(item.toString());
                return;
            }
        }
        JOptionPane.showMessageDialog(con, "해당하는 이름의 주소록이 없습니다.");
    }
}
