import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Awt6Abstract {
	
	public abstract void randomNums();
	
	public abstract void compareNums(String num);
	
	public abstract String sender(); 
	
	Frame fr = new Frame();
	Button numsbtn = null;
	Button checkbtn = null;
	Button closebtn = null;
	TextField mNums = null;
	Label msg = new Label();
	
	public void form() {
		
		this.fr.setBounds(50, 50, 350, 180);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		this.fr.setTitle("인증번호 확인");
		
		this.numsbtn = new Button("인증번호 발송");
		this.checkbtn = new Button("인증 확인");
		this.closebtn = new Button(" X ");
		
		this.mNums = new TextField(null);
		
		this.msg.setBackground(Color.LIGHT_GRAY);
		
		this.numsbtn.setBounds(30, 50, 100, 25); // 인증번호 발송
		this.checkbtn.setBounds(240, 80, 100, 25); // 인증확인
		this.closebtn.setBounds(300, 50, 30, 25); // 종료
		this.mNums.setBounds(30, 80, 200, 25); // 번호필드 입력
		this.msg.setBounds(30, 110, 200, 25); // 라벨 메세지 출력 
		
		this.fr.add(numsbtn);
		this.fr.add(checkbtn);
		this.fr.add(closebtn);
		this.fr.add(mNums);
		this.fr.add(msg);
		
		this.click();
	}
	
	public void click() {
		
		
		// 번호 발송
		this.numsbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				randomNums();
			}
		});
		
		// 인증 확인
		this.checkbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String userNums = Awt6Abstract.this.mNums.getText();
				
				if(userNums.equals("")) {
					msg.setText("인증번호를 입력해주세요.");
				}
				else {
				compareNums(userNums);
				msg.setText(sender()); 
				}

			}
		});
		
		
		// 종료 
		this.closebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
	}
	

}
