import java.awt.*;
import java.awt.event.*;

public class Awt3 {
	//abstract���� awt �ε��ϱ�
	public static void main(String[] args) {
		
		popup p = new popup();
		p.design("awt ���� Ÿ��Ʋ");
//		popup2 pp = new popup2();
//		pp.design("awt ���� Ÿ��Ʋ �ι���");

	}

}

abstract class design{
	Frame fr = new Frame();
	
	public void design(String title) {
		this.fr.setTitle(title);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		this.fr.setBounds(0,0,300,300);
	}
	public abstract void page();
}

class popup2 extends design {
	
	@Override
	public void page() {
		
	}
}

class popup extends design {
	
	@Override
	public void page() {
		
	} 
}