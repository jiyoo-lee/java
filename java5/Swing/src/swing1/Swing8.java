package swing1;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Swing8 extends JFrame {

	private JPanel contentPane;
	public JProgressBar progress = null;
	public JLabel lb = null;

	
	//Progress bar 사용법 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing8 frame = new Swing8();
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
	public Swing8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.progress = new JProgressBar();
		this.progress.setStringPainted(true);
		this.progress.setFont(new Font("돋움체", Font.PLAIN, 12));
		this.progress.setBounds(70, 40, 300, 17);
		contentPane.add(progress);
		
		this.lb = new JLabel("");
		this.lb.setFont(new Font("돋움체", Font.PLAIN, 12));
		this.lb.setBounds(70, 67, 300, 15);
		contentPane.add(this.lb);
		
		//Swing program이 작동 후 해당 메소드로 1초 후 실행되도록 적용함 
		Timer t = new Timer(); //1. 시간함수를 먼저 쓰고 
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				pstart(); //2. 후에 로드해야 한다.
			}
		};
		t.schedule(task, 100);

	}
	
	public void pstart () {
		
		int w = 0;
		try {
			while(w <= 100 ) {
				this.progress.setValue(w); 
				Thread.sleep(100);
				w++;
			}
		}catch(Exception d) {
			System.out.println("오류 발생");
		}
		if(this.progress.getValue() == 100) {
			this.lb.setText("다운로드가 완료되었습니다.");
		}
		
	}
}
