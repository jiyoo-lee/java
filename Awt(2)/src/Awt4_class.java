import java.awt.*;
import java.awt.event.*;

class Awt4_class {
 //Awt.java�� ����
	protected int a;
	
	public void view() {
		Decorate de = new Decorate(); //Awt4.java �ڽ� Ŭ���� load
		
		Frame f = new Frame();
		//Label lb = new Label();
		TextArea lb = new TextArea();
		TextField input = new TextField();
		f.setBounds(200, 200, 300, 500);
		f.setVisible(true);
		f.setLayout(null);
		Button btn = new Button("���");
		Button closebtn = new Button("����");
		input.setBounds(40, 50, 110, 25);
		lb.setBounds(40, 100, 110, 300);
		btn.setBounds(180, 50, 80, 25);
		closebtn.setBounds(180, 110, 80, 25);
		lb.setBackground(Color.LIGHT_GRAY);
		
		f.add(lb);
		f.add(btn);
		f.add(closebtn);
		f.add(input);
		
		btn.addActionListener(new ActionListener() { //�������̽� ���� ����(�޼ҵ�)
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
				int c = Integer.parseInt(input.getText());
				de.btnPush(c); //event���� this ���� ���Ѵ�.
				lb.setText(de.calls());
				}
				catch(Exception ex) {
					lb.setText("���ڸ� �Է��ϼ���.");
					//System.out.println("���ڸ� �Է��ϼ���.");
				}
			}
		});

	closebtn.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	});
	}
	
}
