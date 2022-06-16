import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Awt1 {
	
	public Awt1() {
	
	}	
	
	public static void main(String[] args) {
		// Frame > Bound > Object (Panel �Ⱦ�) �ǹ�ȯ�濡�� �Ѵ٤�........��....?
		Frame fr = new Frame(); //window â �����
		
		fr.setTitle("AWT ���� ȭ��");
		fr.setVisible(true);
		fr.setLayout(null); // �г��� �����ϱ� ���ؼ� null ���� �Է� 
		fr.setBounds(150,150,500,500); //(ȭ��x��(����), ȭ��y��(����), ����ũ��, ����ũ��)
		
		Button btn = new Button("Ŭ��");
		Button closebtn = new Button("�ݱ�");
		Label msg = new Label("");
		msg.setBackground(Color.BLUE); // setBackground(Color.blue(����)) �����Է�
		msg.setBounds(40,100,300,30);
		
		btn.setBounds(40,40,100,30);
		closebtn.setBounds(160,40,100,30);
		
		//object�� frame�� �����ϰ� �˴ϴ�. 
		fr.add(msg);
		fr.add(btn);
		fr.add(closebtn);
		
		//addActionListener(��ư���� ����˴ϴ�.) : �̺�Ʈ �޼ҵ� ��, THIS ��� ���� �ȵ�
		closebtn.addActionListener(new ActionListener() {//��� ��ư�� ACTION�� ����. new ActionListener() : Override method �ڵ�����
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
		});
		
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//String a = "ȫ�浿"; ���� ��� sysout(a)��� �ϸ� ����� ��. addActionListener �̺�Ʈ �޼ҵ忡 �ʵ忡 String�� ����
				// TODO Auto-generated method stub
				msg.setText("AWT ó������~~ ����!!"); //this�� �̿��Ͽ� �ڵ鸵 ������
				msg.setForeground(Color.white);
			}
		});
		
	}
}
