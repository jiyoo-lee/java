
public class Oop3 {

	/* ��Ƽ ������ : start, run, sleep(��ô��), setStop(����), cache try ..etc */
	// ��Ƽ������ : CPU core�� ���谡 �ֽ��ϴ�.
	
	
	public static void main(String[] args) {
		/*THREAD : ���μ��� ���ο��� ���������� ����Ǵ� �۾��� ����
		 * ��Ƽ ������(Multi-thread) : ���μ��� ���ο��� �ΰ��� �̻��� �۾��� ���û�� �Ҷ�*/
		// ������ -> ������ ��´�
		// ��Ƽ ������ -> ������ �����鼭 ��Ʃ�긦 ���� ������ �����. (��Ƽ�½�ŷ)
		
		
		Thread my = new MyThread(); //�θ� �޼ҵ� = �ڽ� �޼ҵ�
		//���� ������� : �ڽĸ޼ҵ� = �ڽĸ޼ҵ�(�Ϲ� ������ ���)
		// �ڽ��� ���ԵǾ��ִٰ� ��ε常 �Ѱ�. �θ� �ڽĿ� ��������� �θ� �θ��� �ڽĵ� ���� ��Ȳ
		 // �θ�class     //�ڽ� class
		//�θ� ȣ�� = �ڽ��� ȣ��
		
		
		my.start(); //Thread �ȿ� ���ִ� �޼ҵ� 
		//my.b(); �� ����
		//my.run();
		Thread my2 = new Test2();
		my2.start(); //Thread method�� �⺻ run�� �۵��ϱ� ���� start �޼ҵ�(��ɾ�)
		
		for(int j = 1; j <= 10; j++) {
			System.out.println("����Ŭ���� : "+ j);
		}
		
	}
}

class Test2 extends Thread {
	
	@Override
	public void run() { //private, protected ����ϴ� ��� ���� ����
		int a;
		for(a = 1; a <= 10; a++) {
			System.out.println("�ܺ� Ŭ����2 : " + a);
		}
	}
}

class MyThread extends Thread { 
	//Thread�� jvm�ȿ� �⺻���� ž�� �Ǿ� �ִ� method(thread�� �ܵ����� ������� ���� class thread �̷������� �Ⱦ��� ������extends ���ؼ���). 
	
	@Override // �������̼��� ���ؼ� ������ ����� �˷����Ѵ�.
	public void run () { // �θ����� �ִ� �ְ� �ƴ�. // method b -> run���� �ٲ� 
		//run�̶� Multi�޼ҵ� �⺻ ���� �޼ҵ�
		//thread�� ������ �޼ҵ� �ܾ �����Ǿ�����
		int a;
		for(a = 1; a <= 10; a++) {
			System.out.println("�ܺ� Ŭ���� : " + a);
		}
		
	}	
	
}
