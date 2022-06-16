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
		this.fr.setTitle("������ȣ Ȯ��");
		
		this.numsbtn = new Button("������ȣ �߼�");
		this.checkbtn = new Button("���� Ȯ��");
		this.closebtn = new Button(" X ");
		
		this.mNums = new TextField(null);
		
		this.msg.setBackground(Color.LIGHT_GRAY);
		
		this.numsbtn.setBounds(30, 50, 100, 25); // ������ȣ �߼�
		this.checkbtn.setBounds(240, 80, 100, 25); // ����Ȯ��
		this.closebtn.setBounds(300, 50, 30, 25); // ����
		this.mNums.setBounds(30, 80, 200, 25); // ��ȣ�ʵ� �Է�
		this.msg.setBounds(30, 110, 200, 25); // �� �޼��� ��� 
		
		this.fr.add(numsbtn);
		this.fr.add(checkbtn);
		this.fr.add(closebtn);
		this.fr.add(mNums);
		this.fr.add(msg);
		
		this.click();
	}
	
	public void click() {
		
		
		// ��ȣ �߼�
		this.numsbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				randomNums();
			}
		});
		
		// ���� Ȯ��
		this.checkbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String userNums = Awt6Abstract.this.mNums.getText();
				
				if(userNums.equals("")) {
					msg.setText("������ȣ�� �Է����ּ���.");
				}
				else {
				compareNums(userNums);
				msg.setText(sender()); 
				}

			}
		});
		
		
		// ���� 
		this.closebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
	}
	

}
