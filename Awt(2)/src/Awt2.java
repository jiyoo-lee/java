import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//외부 클래스로 awt 생성 main class에서 안씀.
//부모 클래스에 필드에 선언을 해야 이벤트 메소드에 사용이 가능하다.
public class Awt2 {

	public static void main(String[] args) {
		Login lg = new Login();
		
	}
}

class loginok extends Login { //상속시켜서 쓰기 //화면 전환하는 자식 클래스 
	public loginok () {
		this.fr.setTitle("회원가입 페이지");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);		
		this.fr.setLayout(null);
	}
	
}

class Login { //연습용 원래는 extends abstract (추상 클래스)를 먼저 로드하여 필드에 적용시킴.
	Frame fr = new Frame();
	Font font = new Font("휴먼명조체",Font.BOLD,20);  //("글자체(윈도우기준),Font.Bold(굵은체),크기)
	Font ft = new Font("휴먼명조체",Font.BOLD,10);
	Button exit = new Button("프로그램 종료");
	Button login = new Button("로그인");
	Button signin = new Button("회원가입");
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Label msg = new Label("");
	
	public Login( ) {
		this.fr.setTitle("이지유 로그인 창");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);		
		this.fr.setLayout(null);
		this.mid.setFont(font); //글자 속성을 적용하고자하는 오브젝트 선택 
		this.mpw.setFont(font);
		this.msg.setFont(ft);
		
		this.mpw.setEchoChar('*'); //얘만 외따옴표 적어야한다!! 비밀번호 * 처리
			
		this.mid.setBounds(100,60,200,40);
		this.mpw.setBounds(100,120,200,40);
		this.login.setBounds(100,180,200,40);
		this.signin.setBounds(100,240,200,40);
		this.exit.setBounds(100,300,200,40);
		this.msg.setBounds(100,100,200,20);
		//this.msg.setBackground(Color.BLUE); // setBackground(Color.blue(색상)) 색상입력
		
		this.login.setBackground(Color.magenta);
		this.signin.setBackground(Color.blue);
		this.exit.setBackground(Color.darkGray);
		
		this.fr.add(this.msg);
		this.fr.add(this.mid);
		this.fr.add(this.mpw);
		this.fr.add(this.login);
		this.fr.add(this.signin);
		this.fr.add(this.exit);
		this.clicks(); // Method 불러오기 
		
		this.login.setForeground(Color.white);
		this.signin.setForeground(Color.white);
		this.exit.setForeground(Color.white);
		this.msg.setForeground(Color.black); //글자 색 조정
	}
	
	public void clicks () { //버튼에 관한 모든 핸들링 method 집합소
		this.signin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); //창이 없어짐 해당 프레임 종료
				loginok ok = new loginok(); // 다음 프레임 로드
			}
		});
		
		
		this.exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 프로그램 종료 이벤트 핸들링 Method
				System.exit(0);
			} 
		});
		
		this.login.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); //swing API 경고옵션 로드 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// login 버튼이고 아이디 및 패스워드 검토
				String user_id = mid.getText(); //Object.getText (사용자가 입력한 값을 가져올때 사용합니다.)
				String user_pw = mpw.getText();
				
				if(user_id.equals("")) { //null 사용 금지 null 또한 값이 있는 것임.
					//msg.setText("아이디를 입력하세요.");
					alert.showMessageDialog(null, "아이디를 입력하세요.","경고 메세지", JOptionPane.ERROR_MESSAGE); //경고창
				}
				else {
					//비밀번호 경고창
					if(user_pw.equals("")) {
					alert.showMessageDialog(null, "비밀번호를 입력하세요.","경고 메세지", JOptionPane.ERROR_MESSAGE); //경고창
						}
					else {
						msg.setText("로그인을 진행합니다.");
						}
					}			
				}
		});
		
	}
}