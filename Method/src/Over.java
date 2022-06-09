
public class Over {

	public static void main(String[] args) {
		// �������̵� �����ε�
		
		//Pt p = new Pt(); // ��ü����
		//p.display();
		Cd c = new Cd();
		c.display("���� ���� �� ���"); // �����ε��� �Ǿ���. ��? Pt�� ������ �ߴµ� �ؿ� Cd�� �ٸ� �μ������� ���� �޼ҵ带 ���������ϱ�.
		c.display(); // �������̵�
		
	}

}

/* 
 �������̵�(override) : �θ� Ŭ�������� ��� ���� ���� �޼ҵ带 ����ϴ� ���� ���մϴ�. 
 �����ε�(overloading) : �θ� Ŭ�������� ���� ���ο� �޼ҵ带 �����ϴ� ���� ���մϴ�.
  */
class Pt {
	public void display(){
		System.out.println("�θ� �ܺ� ���� ��");
	}
	public void aaaa() { // ������ָ� ���� �ذ� [2]
	}
}

// �����ε� ����
class Cd extends Pt { //���
	// aaaa() method�� �θ�Ŭ������ ���������ʾ� ó���� �������̼��� ������ [0]
	@Override // �θ� Ŭ������ ���� �޼ҵ�� �������̵带 ����.[1]
	public void aaaa() {
		System.out.println("�ڽĿ� ������� �޼ҵ�");
	}
	
	
	@Override //�������̼� (ǥ��) ���� �߻��� Ȯ���ϴ� �۾��� �ʿ�(�������̵忡�� ����)
	public void display() { // �������̵�
		System.out.println("�ڽ� Ŭ���������� ����?");
		super.display(); // �θ� �ִ� ���� �Ӽ� method ���� ���� �ö� �����. �θ� �� �Ӽ��� �ִ��� ������ Ȯ��.
	}
	
	public void display(String msg) { //�����ε��� �Ǵ� ��
		System.out.println(msg);
	}
}