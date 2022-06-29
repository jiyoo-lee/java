
public class Thread1 {

	public static void main(String[] args) {
		
		/* extends Thread */
		int w = 0;
		
		while(w < 6) {
		box b = new box(w);
		Thread t = new Thread(b); // cpu�� ���� �ؼ��ϴ°ſ� ���� �ֿܼ� ��� ���� �޶�����.
		t.start(); // thread�� start�� ����
		w++;
		}
		
		/* interface Runnable Thread */
		
		for(int i = 0; i < 10; i++) {
			//������޼ҵ带 ȣ���Ͽ� �ش� Ŭ������ CPU �Ѱ��� �Ҵ��մϴ�.
		box2 b2 = new box2(i);
		Thread t2 = new Thread(b2); // ������ ����(������� �۵���ų Ŭ������)
		
		t2.start(); //run�޼ҵ带 �۵���Ű�� ���� �޼ҵ�
		}
	}
}

//extends ���
class box extends Thread{
	
	int no = 0;
	
	public box (int a) { //������
		this.no = a;
	}
	
	@Override
	public void run() { //Thread�� �⺻ �޼ҵ� 
		
		try {
			
		Thread.sleep(1000);
		
		switch(this.no) {
		
		case 1 :
			System.out.println("����");
			break;
		case 2 : 
			System.out.println("����");
			break;
		}
		
		}catch(Exception e) {
			
		}
		System.out.println("box = "+this.no);
	}
}

//thread ���� run �������̵� �ؾ��ϰ� �۵��Ϸ��� ���ο��� thread ȣ���ؾ���.

class box2 implements Runnable { //interface �� thread
	int no = 0;
	public box2 (int b) {
			this.no = b;
	}
	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) { }
		System.out.println("box2 = "+this.no);
	}
}

class box3 implements Runnable { //interface �� thread
	
	@Override
	public void run() {
		System.out.println("tests");
	}
	
}