import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//�ܺ� Ŭ������ awt ���� main class���� �Ⱦ�.
//�θ� Ŭ������ �ʵ忡 ������ �ؾ� �̺�Ʈ �޼ҵ忡 ����� �����ϴ�.
public class Awt2 {

	public static void main(String[] args) {
		Login lg = new Login();
		
	}
}

class loginok extends Login { //��ӽ��Ѽ� ���� //ȭ�� ��ȯ�ϴ� �ڽ� Ŭ���� 
	public loginok () {
		this.fr.setTitle("ȸ������ ������");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);		
		this.fr.setLayout(null);
	}
	
}

class Login { //������ ������ extends abstract (�߻� Ŭ����)�� ���� �ε��Ͽ� �ʵ忡 �����Ŵ.
	Frame fr = new Frame();
	Font font = new Font("�޸ո���ü",Font.BOLD,20);  //("����ü(���������),Font.Bold(����ü),ũ��)
	Font ft = new Font("�޸ո���ü",Font.BOLD,10);
	Button exit = new Button("���α׷� ����");
	Button login = new Button("�α���");
	Button signin = new Button("ȸ������");
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Label msg = new Label("");
	
	public Login( ) {
		this.fr.setTitle("������ �α��� â");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);		
		this.fr.setLayout(null);
		this.mid.setFont(font); //���� �Ӽ��� �����ϰ����ϴ� ������Ʈ ���� 
		this.mpw.setFont(font);
		this.msg.setFont(ft);
		
		this.mpw.setEchoChar('*'); //�길 �ܵ���ǥ ������Ѵ�!! ��й�ȣ * ó��
			
		this.mid.setBounds(100,60,200,40);
		this.mpw.setBounds(100,120,200,40);
		this.login.setBounds(100,180,200,40);
		this.signin.setBounds(100,240,200,40);
		this.exit.setBounds(100,300,200,40);
		this.msg.setBounds(100,100,200,20);
		//this.msg.setBackground(Color.BLUE); // setBackground(Color.blue(����)) �����Է�
		
		this.login.setBackground(Color.magenta);
		this.signin.setBackground(Color.blue);
		this.exit.setBackground(Color.darkGray);
		
		this.fr.add(this.msg);
		this.fr.add(this.mid);
		this.fr.add(this.mpw);
		this.fr.add(this.login);
		this.fr.add(this.signin);
		this.fr.add(this.exit);
		this.clicks(); // Method �ҷ����� 
		
		this.login.setForeground(Color.white);
		this.signin.setForeground(Color.white);
		this.exit.setForeground(Color.white);
		this.msg.setForeground(Color.black); //���� �� ����
	}
	
	public void clicks () { //��ư�� ���� ��� �ڵ鸵 method ���ռ�
		this.signin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); //â�� ������ �ش� ������ ����
				loginok ok = new loginok(); // ���� ������ �ε�
			}
		});
		
		
		this.exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���α׷� ���� �̺�Ʈ �ڵ鸵 Method
				System.exit(0);
			} 
		});
		
		this.login.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); //swing API ���ɼ� �ε� 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// login ��ư�̰� ���̵� �� �н����� ����
				String user_id = mid.getText(); //Object.getText (����ڰ� �Է��� ���� �����ö� ����մϴ�.)
				String user_pw = mpw.getText();
				
				if(user_id.equals("")) { //null ��� ���� null ���� ���� �ִ� ����.
					//msg.setText("���̵� �Է��ϼ���.");
					alert.showMessageDialog(null, "���̵� �Է��ϼ���.","��� �޼���", JOptionPane.ERROR_MESSAGE); //���â
				}
				else {
					//��й�ȣ ���â
					if(user_pw.equals("")) {
					alert.showMessageDialog(null, "��й�ȣ�� �Է��ϼ���.","��� �޼���", JOptionPane.ERROR_MESSAGE); //���â
						}
					else {
						msg.setText("�α����� �����մϴ�.");
						}
					}			
				}
		});
		
	}
}