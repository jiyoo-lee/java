import java.io.IOException;

public class Exception4 {

	public static void main(String[] args)  {
		
		
		//SQLException : sql ���ӽ� ����ϴ� exception

		try {
		Ex e = new Ex();
		e.Exloader("34");
		
		//Exception aaa = new Exception(); �ڱ��ڽ��� �ٷ� ���ܻ������� �ѱ�  
		}
		catch(IOException bb) {
			
		}
		catch(Exception e) {
			System.out.println("�Է°��� �߸���µ�?");
		}
		
	}
}

class Ex {
	Exception ep = null; // �ʵ忡 �����س��� ��ٸ��� 
	IOException ep2 = null;
	
	public void Exloader(String a) throws Exception, IOException  { //throws try~catch�� �ޱ� ���� class�� �ε� 
		
		/*�߸��� ���� ���� �ڽ��� ������ ���� ���� Ŭ������ ��� �����߱⶧��.(�ڱ� Ŭ���� �ȿ��� �ذ��ؾ���)*/
//		if(a.equals("hi")) {
//			System.out.println("�����Դϴ�~~");
//		}
//		else {
//			int keycode = Integer.valueOf(0); // ���� ������ ������������ Exloader �޼ҵ� ��ü���� ������ �߻�(?)
//			
//			//�ش� ������ �ڽ��� �������׿� ���� ����ó���� �߸��� ���.
//		this.ep2 = new IOException();
//		this.ep = new Exception(); // �������ֱ�
//		//������ ����� throw �ϱ� 
//		throw this.ep;
//		
//		//throw : �ڽ��� ȣ���Ͽ� ���ܰ� �߻��ϸ� �ڽ��� ȣ���� class�� ���� ������ return ���� 
//		}
		
		try {
			if(a.equals("34")) {
				int keycode = Integer.valueOf(a);
				System.out.println(keycode);
			}
			else {
				System.out.println("����� �ٸ� �����Դϴ�.");
			}
		}
		catch(Exception bc) { // ���� ���� �޴µ����� ������ �ִٸ� catch�ض� 
			
			//�ڽ��� ���������� ���� �޾Ƽ� Ȯ����
			System.out.println(ep.getMessage());
			this.ep = new Exception();  
			throw this.ep;
		}
	}
}
