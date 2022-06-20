package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Swing11 extends JFrame {
	//ImageIcon :  �̹��� ������ �ε��Ҷ� ����մϴ�. 

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing11 frame = new Swing11();
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
	public Swing11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("�̹��� �ε�");
		btn.setBackground(Color.BLACK);
		btn.setForeground(Color.WHITE);
		btn.setFont(new Font("����ü", Font.PLAIN, 12));
		btn.setBounds(10, 10, 137, 23);
		contentPane.add(btn);
		
		JLabel lb = new JLabel("");
		lb.setBorder(new LineBorder(Color.GRAY));
		lb.setBounds(10, 43, 481, 372);
		contentPane.add(lb);
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon img  = new ImageIcon("C:\\java4\\java5\\Swing\\src\\swing1\\cat.jpg");
				Image reimg = img.getImage(); // �̹��� ���� ��θ� �ε�
				//getScaledInstance(����ũ��, ����ũ��, ��ȯ���) 
				//SCALE_SMOOTH : �ε巴�� ���� 
				//SCALE_FAST : ������ ���� BUT �ȼ��� ���� �� ����.
				//SCALE_DEFAULT : ���� �ػ󵵿� ���缭 
				//SCALE_AREA_AVERAGING : ��������� �ε巴��. (������� ��հ����� ����) 
				Image resize = reimg.getScaledInstance(410, 208, Image.SCALE_SMOOTH);
				ImageIcon rimg = new ImageIcon(resize);
				lb.setIcon(rimg);	
			}
		});
	}

}
