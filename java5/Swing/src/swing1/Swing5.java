package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Swing5 extends JFrame {

	private JPanel contentPane;
	private JTextField mid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing5 frame = new Swing5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Swing5() {
		
		 /*Frame을 absolute 형태로 layer를 변경합니다.*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\uC544\uC774\uB514 \uCCB4\uD06C");
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(140, 151, 175, 28);
		contentPane.add(btnNewButton);
		
		mid = new JTextField();
		mid.setFont(new Font("돋움체", Font.PLAIN, 12));
		mid.setBounds(105, 120, 240, 21);
		contentPane.add(mid);
		mid.setColumns(10);
		
		JLabel msg = new JLabel("");
		msg.setFont(new Font("돋움체", Font.PLAIN, 12));
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(105, 210, 244, 28);
		contentPane.add(msg);
		
		// 핸들링 class가 object보다 상위코드에 있으면 해당 오브젝트를 로드하지못합니다.
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(mid.getText().equals("")) {
					msg.setText("아이디를 입력하세요");
				}
				else {
					int lg = mid.getText().length(); //입력 문자 갯수를 확인하는 코드 
					if(lg < 5) {
						msg.setText("아이디는 5자 이상 사용가능합니다.");
					}
					else {
						msg.setText("아이디 검토중입니다...");
					}
				}
			}
		});
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\uB3D9\uC758");
		chckbxNewCheckBox.setBounds(304, 244, 49, 28);
		contentPane.add(chckbxNewCheckBox);
	}
}
