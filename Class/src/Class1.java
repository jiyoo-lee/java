
/*�θ�Ŭ���� �� �ڽ�(����) Ŭ���� ����*/
public class Class1 {

	public static void main(String[] args) {
	
	// �θ� �ν��Ͻ��� ������ ���������� �ڽ� class�� ���� ȣ������ ���Ѵ�.
	Parents p = new Parents();
	p.p_box();
	Parents.Child pc = p.new Child(); // Ŭ���� �ȿ� Ŭ������ ���� �ε��Ϸ��� �̷������� �ؾ��Ѵ�.
	// ����class.�ڽ�class �ڽ�Ŭ�����̸����� = ����Ŭ������(������ ����Ŭ������ �̸� �ҷ�����). new . �ڽ�Ŭ������(); (�ν��Ͻ��� ����)
	pc.c_box();
	
	}

}

class Parents { // ���� Ŭ����
	String a = "ȫ�浿"; // �θ� �ʵ忡 �ִ� ���� ���� �ٸ� �޼ҵ忡�� ����Ҷ��� this�� ����Ѵ�. 
	String bc;
	
	class Child { //�ڼ� Ŭ���� -> ���� �� �־ ���ȿ� ����.
		int a = 20; //(���) // �ڽ� Ŭ������ �������� �θ�Ŭ���� ���忡���� ���������� ��.
		
		public void c_box() { // �ڽ� method(���)
			double c = 10.5;
			//System.out.println(c);		
			
			//�ڽ�Ŭ���� �޼ҵ忡 ���� ���� ���� �θ� Ŭ���� ��������� ����غ���
			//System.out.println(Parents.this.a); // ��Ȯ�ϰ� ���� Ŭ������ ������� �������־�� ����� �����ϴ� �׳� this�� �Է½� �ڼ� Ŭ���� ���� ��µ� 
			// ����, child Ŭ������ a�� ���ٸ� �׳� a�� ����� �� �ִ�. 
			//System.out.println(this.a); // �ڽ� Ŭ���� ���� �������� 
			//System.out.println(c); // �ڽ� �޼ҵ� ���� ��������
			//System.out.println(Parents.this.bc);
		}
		
		class Gchild {
			String ab = "ȫ�浿";
			
			public void d_box() {
				System.out.println(Parents.this.a);
			}
		}
	}
	
	public void p_box() { // �θ� method
		String a = "�̼���"; // �������� (�޼ҵ忡�� ����ϴ� ��) p_box�� �ִ� �������� ���� 
		System.out.println(this.a); // �׳� a��� ġ�� �̼����̶�� ������ this.a �� ȫ�浿�� ���´�. �ʵ� -> �������� �޼ҵ�� -> �������� 
		//���� ���� ������ �ڼ� Ŭ������ ���� �ű��ʹٸ� ���� Ŭ������ ���������� ����� this.num = a; �̷������� �ѱ� �� �ڽĸ޼ҵ忡�� Parents.this.num �̷������� ���� 
		this.bc = a;
	}
	
}