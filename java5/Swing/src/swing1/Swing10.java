package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Swing10 extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing10 frame = new Swing10();
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
	public Swing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] list = {"SKT","KT","LGT","�˶���"};
		
		JComboBox cb = new JComboBox(list);
		cb.setFont(new Font("����ü", Font.PLAIN, 12));
		cb.setBounds(31, 60, 185, 23);
		contentPane.add(cb);
		
		
		JLabel msg = new JLabel("");
		msg.setFont(new Font("����ü", Font.PLAIN, 12));
		msg.setBorder(new LineBorder(Color.PINK));
		msg.setBounds(30, 93, 382, 23);
		contentPane.add(msg);
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				//�������� ��� 
				int v = cb.getSelectedIndex(); // �迭 �ε��� ���·� �ε� (��, �ʵ忡 �迭�� ����Ǿ�� �Ѵ�.)
				
				//String data = String.valueOf(cb.getSelectedItem());
				//String data = cb.getSelectedItem().toString();
				//String data = String.valueOf(e.getItem());
				String data = e.getItem().toString();
				msg.setText(data);
				
			}
		});
		
	}
}
