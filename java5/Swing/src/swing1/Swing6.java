package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;

public class Swing6 extends JFrame {

	private JPanel contentPane;
	private JTextField tel;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing6 frame = new Swing6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Swing6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tel = new JTextField();
		
		
		tel.setBorder(new LineBorder(new Color(0, 0, 255)));
		tel.setFont(new Font("굴림체", Font.PLAIN, 12));
		tel.setBounds(10, 38, 205, 21);
		contentPane.add(tel);
		tel.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC778\uC99D\uBC88\uD638 \uBC1B\uAE30");
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 12));
		btnNewButton.setBounds(225, 37, 170, 23);
		contentPane.add(btnNewButton);
		
		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(new Color(0, 0, 0)));
		msg.setFont(new Font("돋움체", Font.PLAIN, 12));
		msg.setBounds(10, 76, 385, 21);
		contentPane.add(msg);
		
 

		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		tel.addKeyListener(new KeyAdapter() { // addKeyListener : 키를 누를경우 적용되는 이벤트 클래스
			//keyPressed 키를 누를때 적용 
			//keyRealeased : 키를 눌렀다가 up이 되었을때
			// keyTyped : 키를 문자를 입력 받을때 
			
			@Override
			public void keyTyped(KeyEvent k) {
				
				//입력값에 대한 자릿수 제한 
				int i = tel.getText().length(); //휴대폰 입력숫자자리 제한법 
				if(i>11) {
					k.consume();
				}
				
				System.out.println(k);
				//System.out.println(k.getKeyCode());
				int n = Integer.valueOf(k.getKeyChar()); //아스키코드로 변경됨 
				
				//System.out.println(n);
				if(n >= 48 && n <=57) { 
					// sysout에는 정상적인 문자 getKeyChar Integer로 변경시 아스키코드로 변경
					msg.setText("");
				}
				else {
					msg.setText("숫자만 입력하세요");
					
					k.consume(); // keytyped에 사용되는 형태 조건 이외의 문자는 아예 입력을 받지 못하게 해줌  
					//keytyped 이용 consume는 해당 입력시 null로 간주함(key event에서만 해당됨) 
				}
			}
		}); //아스키코드인지 아닌지 구분해주는 핸들링 
		
	}

}
