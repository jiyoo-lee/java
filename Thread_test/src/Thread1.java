//Thread�� ���� class���� ������� ���� class(extends), interface(implements) 
// main���� ����ϰ������ ���� Ŭ������ �����ȴ�.
public class Thread1 {

	public static void main(String[] args) {
		
		//������ ���, �ܵ�ó����
		classBox cb = new classBox();
		for(int i = 0; i < 10; i++) {
			//cb.run("Ŭ���� ó����Ȳ : " + i);
		}
		
		
		// ������, �ѹ��� ó�� �ҽ�
		cpuBox cp = null; 
		
		for(int i = 0; i < 10; i++) {
			cp =	new cpuBox("Thread ó����Ȳ : "+i);
			//cp.start(); //run ��� start
		}
		
		/*Thread�� �̿��Ͽ� ���� ����ó�� ��� ������ �߻��ϴ��� �ش� ������ �߻��� �����常 ����ó�� �׿� ������ ��� ó���ϴ� ����*/
		callBox bb = null;
		
		String msg = "";
		String msg2 = "";
		for(int i = 0; i < 10; i++ ) {
			if(i == 5) {
				 msg2 = "5";
			}
			else {
				 msg2 = "";
			}
			bb = new callBox(msg+msg2); //nullnull
			bb.start();
		}
	}
}


class callBox extends Thread {
	
	String callname = null;
	
	public callBox(String z) {
		this.callname = z;
	}
	
	@Override
	public void run() {
		
		try {
			
			if(this.callname.length() > 0) {
				throw new Exception();
			}
			else {
				System.out.println(this.callname.length());
			}
			
		}catch(Exception e) {
			System.out.println("�ش� ���� �߸��� ���� �߻��Ͽ����ϴ�.");
		}
	}
	
}

class cpuBox extends Thread {
	String name = null;
	
	public cpuBox (String a) {
		this.name = a;
	}

	@Override
	public void run() { //�Ķ���͸� ���� �� ����.
		System.out.println(this.name);
	}
	
	//Thread�� �������̵� method run�� �Ķ���� ���� ���� �� ���� �����ڸ� ���ؼ� this�� �Ѱܼ��� �����ؾ��Ѵ�. 
	
}

class classBox {
	
	public void run (String name) {
		System.out.println(name);
	}
	
	
}