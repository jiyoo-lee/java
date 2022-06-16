import java.awt.*;
import java.awt.event.*;

//Awt 환경설정 
public abstract class Awt5Abstract { // 창 여기서 만들기
	
	public abstract String signok(); //getter
	public abstract void dataload(); // 
	public abstract void idcheck(String id); //setter
	
	Frame fr = new Frame();
	Button bt = null;
	Button closebt = null;
	TextField mid = null;
	Label msg = new Label();
	
	
	public void design() {
		this.fr.setBounds(200, 200, 300, 450);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		this.fr.setTitle("아이디 중복 체크");
		
		this.bt = new Button("중복체크");
		this.closebt = new Button("종료");
		this.mid = new TextField(null);
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.msg.setBounds(25,100,250,25);
		this.bt.setBounds(200, 50, 80, 25);
		this.closebt.setBounds(180, 380, 80, 25);
		this.mid.setBounds(30, 50, 160, 25);
		
		this.bt.setBackground(Color.black);
		this.bt.setForeground(Color.white);
		this.closebt.setBackground(Color.black);
		this.closebt.setForeground(Color.white);
		
		
		this.fr.add(this.msg);
		this.fr.add(this.bt);
		this.fr.add(this.closebt);
		this.fr.add(this.mid);
		
		this.click(); //Awt 디자인 완료 후 해당 핸들링 메소드로 이동 
	}
	
	public void click() {
		
		
		//중복 확인 버튼
		this.bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//SETTEXT 출력 GETTEXT 입력값 가져오기 
				String userid = Awt5Abstract.this.mid.getText();
				
				if(userid.equals("")) {
					msg.setText("아이디를 입력하세요.");
				}
				else {
					idcheck(userid); // 값 넘기기 
					String result = signok();
					if(result == null) {
						msg.setText("사용가능한 아이디입니다.");
					}
					else {
						msg.setText("다른 아이디를 입력해주십시오.");
					}
				}
			}
		});
		
		// 종료버튼
		this.closebt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
}

