package java_test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JProgressBar;

public class javaswing extends JFrame {

	private JPanel contentPane;
	private JTextField adult;
	private JTextField textField_1;
	private JTextField camdate;
	JProgressBar progress = null;
	JLabel msg = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					javaswing frame = new javaswing();
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
	public javaswing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uCEA0\uD551\uC7A5 \uC608\uC57D \uC2DC\uC2A4\uD15C");
		lblNewLabel.setFont(new Font("돋움체", Font.PLAIN, 12));
		lblNewLabel.setBounds(23, 10, 156, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblNewLabel_1.setBounds(33, 51, 504, 67);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblNewLabel_2.setBounds(33, 151, 504, 67);
		contentPane.add(lblNewLabel_2);
		
		JButton resevation = new JButton("\uC608\uC57D\uD558\uAE30");
		resevation.setBounds(446, 336, 93, 23);
		contentPane.add(resevation);
		
		JButton exitbtn = new JButton("\uC885\uB8CC");
		exitbtn.setBounds(446, 432, 93, 23);
		contentPane.add(exitbtn);
		
		JRadioButton location1 = new JRadioButton("남양주");
		location1.setBounds(51, 71, 115, 23);
		contentPane.add(location1);
		
		JRadioButton location2 = new JRadioButton("충북음성");
		location2.setBounds(219, 71, 115, 23);
		contentPane.add(location2);
		
		JRadioButton location3 = new JRadioButton("춘천");
		location3.setBounds(394, 71, 115, 23);
		contentPane.add(location3);
		
		ButtonGroup gp = new ButtonGroup();
		gp.add(location1);
		gp.add(location2);
		gp.add(location3);
		
		adult = new JTextField();
		adult.setText("0");
		adult.setBounds(111, 180, 96, 21);
		contentPane.add(adult);
		adult.setColumns(10);
		this.progress = new JProgressBar();
		this.progress.setBounds(35, 324, 259, 25);
		contentPane.add(this.progress);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setBounds(367, 180, 96, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uC131\uC778 :");
		lblNewLabel_3.setBounds(51, 183, 50, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel teen = new JLabel("\uCCAD\uC18C\uB144(\uB9CC 10\uC138 \uC774\uC0C1)");
		teen.setBounds(242, 183, 115, 15);
		contentPane.add(teen);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblNewLabel_2_1.setBounds(35, 247, 504, 67);
		contentPane.add(lblNewLabel_2_1);
		
		camdate = new JTextField();
		camdate.setBounds(111, 272, 96, 21);
		contentPane.add(camdate);
		camdate.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uCEA0\uD551\uC77C\uC790");
		lblNewLabel_4.setBounds(51, 273, 59, 18);
		contentPane.add(lblNewLabel_4); 
		
		JLabel lblNewLabel_5 = new JLabel("\uC608\uC2DC) 2022-06-24");
		lblNewLabel_5.setBounds(286, 275, 200, 15);
		contentPane.add(lblNewLabel_5);
		
		this.msg = new JLabel("0%");
		this.msg.setBounds(96, 359, 198, 15);
		contentPane.add(this.msg);
		
		JLabel lb = new JLabel("");
		lb.setBorder(new LineBorder(Color.GRAY));
		lb.setBounds(37, 384, 377, 71);
		contentPane.add(lb);
		
		
		
		resevation.addActionListener(new ActionListener() {
			
			String str = "일자 및 장소: ";
			int sum = 0;
			public void actionPerformed(ActionEvent e) {
				
				Timer t = new Timer();
				TimerTask tt = new TimerTask() {
					
					@Override
					public void run() {
						pstart();
					}
				};
				t.schedule(tt, 600);
				
			
			if(location1.isSelected()) {
				str += location1.getText();
			}
			
			if(location2.isSelected()) {
				str += location2.getText();
			} 
			
			if(location3.isSelected()) {
				str += location3.getText(); 
			}
			
			str += " ";
			
			str += " 성인 "+adult.getText()+" 청소년" +teen.getText();				
			
			int ad = Integer.parseInt(adult.getText());
			int te = Integer.parseInt(teen.getText());
			
			sum = ad * 10000 + te * 5000;
			
			lb.setText(str);
			}
				
		});
		
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
	}
	
	
public void pstart () {
		
	int w = 0;
	try {
		while(w <= 100 ) {
			this.progress.setValue(w); 
			Thread.sleep(100);
			this.msg.setText("잠시만 기다려주세요...");
			w++;
		}
	}catch(Exception d) {
		System.out.println("오류 발생");
	}
	if(this.progress.getValue() == 100) {
		this.msg.setText("다운로드가 완료되었습니다.");
	}
}

}
