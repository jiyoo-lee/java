import java.awt.*;
import java.awt.event.*;

class Awt4_class {
 //Awt.java와 연계
	protected int a;
	
	public void view() {
		Decorate de = new Decorate(); //Awt4.java 자식 클래스 load
		
		Frame f = new Frame();
		//Label lb = new Label();
		TextArea lb = new TextArea();
		TextField input = new TextField();
		f.setBounds(200, 200, 300, 500);
		f.setVisible(true);
		f.setLayout(null);
		Button btn = new Button("계산");
		Button closebtn = new Button("종료");
		input.setBounds(40, 50, 110, 25);
		lb.setBounds(40, 100, 110, 300);
		btn.setBounds(180, 50, 80, 25);
		closebtn.setBounds(180, 110, 80, 25);
		lb.setBackground(Color.LIGHT_GRAY);
		
		f.add(lb);
		f.add(btn);
		f.add(closebtn);
		f.add(input);
		
		btn.addActionListener(new ActionListener() { //인터페이스 새로 만듦(메소드)
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
				int c = Integer.parseInt(input.getText());
				de.btnPush(c); //event에는 this 쓰지 못한다.
				lb.setText(de.calls());
				}
				catch(Exception ex) {
					lb.setText("숫자만 입력하세요.");
					//System.out.println("숫자만 입력하세요.");
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
