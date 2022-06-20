package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Swing12 extends JFrame {
	private String[] imgdata = {"cat.jpg","dog.jpg","catdraw.jpg"};
	public int count = 0; 
	public String url = "C:\\java4\\java5\\Swing\\src\\swing1\\";
	
	//http:// naver.com/1.jpg -> ������
	//./1.jpg or ../1.jpg -> �����
	
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing12 frame = new Swing12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Swing12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb = new JLabel("");
		lb.setBorder(new LineBorder(Color.GRAY));
		lb.setBounds(10, 37, 668, 618);
		contentPane.add(lb);
		
		JButton prev = new JButton("����");
		JButton next = new JButton("����");
		
		prev.setBounds(10, 10, 135, 23);
		contentPane.add(prev);
		
		next.setBounds(543, 10, 135, 23);
		contentPane.add(next);
		ImageIcon v = new ImageIcon(url+imgdata[0]);
		lb.setIcon(v);
		
		//����
		prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing12.this.count--;
				if(Swing12.this.count < 0) {
					Swing12.this.count = 0;
				}
				ImageIcon v = new ImageIcon(url+imgdata[Swing12.this.count]);
				lb.setIcon(v);
			}
		});
		
		//���� 
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing12.this.count++;
				if(Swing12.this.count > imgdata.length-1) { //������ ���س����ʰ� �߰��ɶ����� �ٷ� ����� �� �ְ� ���� ����.
					Swing12.this.count = imgdata.length-1;
				}
				
				ImageIcon v = new ImageIcon(url+imgdata[Swing12.this.count]);
				lb.setIcon(v);
			}
		});
		
	}

}
