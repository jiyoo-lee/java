public class Class3 {

	public static void main(String[] args) {
		
		Apink m = new Apink();
		m.f_method("�̺���");
		
		Apink.Cafe LA = m. new Cafe();
		LA.call();

	}
}
//�߻� class (abstract�� ����ϸ� �߻�)
abstract class Father {
	
	public String u_name; //abstract �����Ƿ� �������� ����
	public abstract void f_method(String name); //�߻� �޼ҵ�
	
}

class Apink extends Father {
	
	@Override
	public void f_method(String name) { //�߻� �޼ҵ带 ���� �޼ҵ�� ��ȯ 
		this.u_name = name; //�߻�޼ҵ忡 �ִ� ���������� ���� �̰���
	}
	
	class Cafe {
		String msg = Apink.this.u_name; // �θ� Ŭ������ �ִ� ���������� �ڽ� Ŭ���� ���������� �̰� 
		
		public void call() {
			String msg2 = this.msg + "�� ¯!";
			System.out.println(msg2);
		}
		
	}
	
}
