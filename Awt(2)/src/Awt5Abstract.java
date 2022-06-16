import java.awt.*;
import java.awt.event.*;

//Awt ȯ�漳�� 
public abstract class Awt5Abstract { // â ���⼭ �����
	
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
		this.fr.setTitle("���̵� �ߺ� üũ");
		
		this.bt = new Button("�ߺ�üũ");
		this.closebt = new Button("����");
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
		
		this.click(); //Awt ������ �Ϸ� �� �ش� �ڵ鸵 �޼ҵ�� �̵� 
	}
	
	public void click() {
		
		
		//�ߺ� Ȯ�� ��ư
		this.bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//SETTEXT ��� GETTEXT �Է°� �������� 
				String userid = Awt5Abstract.this.mid.getText();
				
				if(userid.equals("")) {
					msg.setText("���̵� �Է��ϼ���.");
				}
				else {
					idcheck(userid); // �� �ѱ�� 
					String result = signok();
					if(result == null) {
						msg.setText("��밡���� ���̵��Դϴ�.");
					}
					else {
						msg.setText("�ٸ� ���̵� �Է����ֽʽÿ�.");
					}
				}
			}
		});
		
		// �����ư
		this.closebt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
}

