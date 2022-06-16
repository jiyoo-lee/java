import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Awt1 {
	
	public Awt1() {
	
	}	
	
	public static void main(String[] args) {
		// Frame > Bound > Object (Panel 안씀) 실무환경에서 한다ㅋ........ㅠ....?
		Frame fr = new Frame(); //window 창 만들기
		
		fr.setTitle("AWT 기초 화면");
		fr.setVisible(true);
		fr.setLayout(null); // 패널을 사용안하기 위해서 null 값을 입력 
		fr.setBounds(150,150,500,500); //(화면x축(가로), 화면y축(세로), 가로크기, 세로크기)
		
		Button btn = new Button("클릭");
		Button closebtn = new Button("닫기");
		Label msg = new Label("");
		msg.setBackground(Color.BLUE); // setBackground(Color.blue(색상)) 색상입력
		msg.setBounds(40,100,300,30);
		
		btn.setBounds(40,40,100,30);
		closebtn.setBounds(160,40,100,30);
		
		//object를 frame에 적용하게 됩니다. 
		fr.add(msg);
		fr.add(btn);
		fr.add(closebtn);
		
		//addActionListener(버튼에만 적용됩니다.) : 이벤트 메소드 단, THIS 사용 절대 안됨
		closebtn.addActionListener(new ActionListener() {//모든 버튼은 ACTION을 쓴다. new ActionListener() : Override method 자동생성
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
		});
		
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//String a = "홍길동"; 으로 찍고 sysout(a)라고 하면 사용은 됨. addActionListener 이벤트 메소드에 필드에 String을 생성
				// TODO Auto-generated method stub
				msg.setText("AWT 처음이지~~ ㅇㅇ!!"); //this를 이용하여 핸들링 가능함
				msg.setForeground(Color.white);
			}
		});
		
	}
}
