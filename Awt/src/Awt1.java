import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt1 {

	/*
	 GUI ��� : (Java7)AWT(abstract window ����Ʋ ex. ����), �Ǵ� SWING(AWT - �׷��������� ���� UP)  
	 CUI ��� : Scanner(x)
	 
	 SWING : Jframe -> Jpanel -> Jobject
	 * */
	
	public static void main(String[] args) {
		// Awt ���� ���
		// Frame -> Panel -> Object (�����ܰ�)
		// Frame -> ex. �˾�â
		// Panel -> �˾�â �ȿ� ������ �ٹ̴� �Ͼ� ���� ���̾� html ����
		// Object -> �۵���Ű�� �� 
		// Object -> Panel -> Frame (����ܰ�)
		Popclose pc = new Popclose();
		
		Frame fr = new Frame(); //������ â �����
		fr.setTitle("������ �α���"); // ����� Ÿ��Ʋ â �̸�
		fr.setSize(500, 500); // â ũ��
		fr.setVisible(true); // ��� ���� ����false ���� ���� â�� �ȶ�.
		fr.addWindowListener(pc); //awt �޼ҵ带 ��ӹ޾� ó��
		Panel pa = new Panel(); // �г� �����
		
		
		
		CheckboxGroup radio = new CheckboxGroup(); //  üũ�ڽ� �׷� ����
		
		TextField id = new TextField(10); // �Է�â�� 10�ڱ��� �� �� ����
		TextField pw = new TextField(10);//
		TextField sa = new TextField("�����ȣ�� �Է��ϼ���."); // �Է°��� �̸� �����(html = value ���� ���)
		Button b1 = new Button("�α���"); //������Ʈ ��ư �����
		Checkbox c1 = new Checkbox("�ڵ� �α���"); // üũ�ڽ� �����
		Checkbox c2 = new Checkbox("������",false, radio); // üũ�ڽ��� �������ڸ��� üũ ǥ�ð� �Ǿ��ִ�.
		Checkbox c3 = new Checkbox("���Ǿ���",true, radio); // üũ�ڽ��� �������ڸ��� üũ ǥ�ð� �Ǿ��ִ�.
		
		pa.add(c3);
		pa.add(c2);
		pa.add(c1);
		pa.add(sa);
		pa.add(id);
		pa.add(pw);
		pa.add(b1); //add �߰� object�� �гο� ����
		fr.add(pa); // panel > frame�� ����
		
	}

}
class Popclose extends WindowAdapter{
	public void windowClosing(WindowEvent a) {
		System.out.println("���α׷� �����մϴ�.");
		System.exit(0);
		System.gc();
	}
}
