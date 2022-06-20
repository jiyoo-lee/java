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
		tel.setFont(new Font("����ü", Font.PLAIN, 12));
		tel.setBounds(10, 38, 205, 21);
		contentPane.add(tel);
		tel.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC778\uC99D\uBC88\uD638 \uBC1B\uAE30");
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
		btnNewButton.setBounds(225, 37, 170, 23);
		contentPane.add(btnNewButton);
		
		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(new Color(0, 0, 0)));
		msg.setFont(new Font("����ü", Font.PLAIN, 12));
		msg.setBounds(10, 76, 385, 21);
		contentPane.add(msg);
		
 

		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		tel.addKeyListener(new KeyAdapter() { // addKeyListener : Ű�� ������� ����Ǵ� �̺�Ʈ Ŭ����
			//keyPressed Ű�� ������ ���� 
			//keyRealeased : Ű�� �����ٰ� up�� �Ǿ�����
			// keyTyped : Ű�� ���ڸ� �Է� ������ 
			
			@Override
			public void keyTyped(KeyEvent k) {
				
				//�Է°��� ���� �ڸ��� ���� 
				int i = tel.getText().length(); //�޴��� �Է¼����ڸ� ���ѹ� 
				if(i>11) {
					k.consume();
				}
				
				System.out.println(k);
				//System.out.println(k.getKeyCode());
				int n = Integer.valueOf(k.getKeyChar()); //�ƽ�Ű�ڵ�� ����� 
				
				//System.out.println(n);
				if(n >= 48 && n <=57) { 
					// sysout���� �������� ���� getKeyChar Integer�� ����� �ƽ�Ű�ڵ�� ����
					msg.setText("");
				}
				else {
					msg.setText("���ڸ� �Է��ϼ���");
					
					k.consume(); // keytyped�� ���Ǵ� ���� ���� �̿��� ���ڴ� �ƿ� �Է��� ���� ���ϰ� ����  
					//keytyped �̿� consume�� �ش� �Է½� null�� ������(key event������ �ش��) 
				}
			}
		}); //�ƽ�Ű�ڵ����� �ƴ��� �������ִ� �ڵ鸵 
		
	}

}
