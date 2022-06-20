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
	//ImageIcon :  이미지 파일을 로드할때 사용합니다. 

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
		
		JButton btn = new JButton("이미지 로드");
		btn.setBackground(Color.BLACK);
		btn.setForeground(Color.WHITE);
		btn.setFont(new Font("돋움체", Font.PLAIN, 12));
		btn.setBounds(10, 10, 137, 23);
		contentPane.add(btn);
		
		JLabel lb = new JLabel("");
		lb.setBorder(new LineBorder(Color.GRAY));
		lb.setBounds(10, 43, 481, 372);
		contentPane.add(lb);
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon img  = new ImageIcon("C:\\java4\\java5\\Swing\\src\\swing1\\cat.jpg");
				Image reimg = img.getImage(); // 이미지 파일 경로를 로드
				//getScaledInstance(가로크기, 세로크기, 변환방법) 
				//SCALE_SMOOTH : 부드럽게 적용 
				//SCALE_FAST : 빠르게 적용 BUT 픽셀이 깨질 수 있음.
				//SCALE_DEFAULT : 원래 해상도에 맞춰서 
				//SCALE_AREA_AVERAGING : 평균적으로 부드럽게. (모니터의 평균값으로 적용) 
				Image resize = reimg.getScaledInstance(410, 208, Image.SCALE_SMOOTH);
				ImageIcon rimg = new ImageIcon(resize);
				lb.setIcon(rimg);	
			}
		});
	}

}
