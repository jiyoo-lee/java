
public class Oop4 {
	//�߻� Ŭ���� �� �޼ҵ� abstract
	public static void main(String[] args) {
		
		ab_2 ab = new ab_2();
		System.out.println(ab.b());
		ab.ab_a();
		ab.ab_C();
	}

}

//�߻� Ŭ����(��Ʈ) : �ܺο��� �ε尡 ���� �ȵ�, �ڼ� ������ �ȵ�, ���� ������ �ڵ� ������ �����ϸ� abstract�� ���� �ڵ� ���ظ� ���� �Ҽ��յ�.
abstract class Ab1{ //�߻�ȭ Ŭ������ ���ο� ���� ȣ���� ����. ghost ��ü�� ���°� ��������: �ڵ带 ����ȭ / ���� Ŭ�������� ���� �̸��� �����.
	
	public int c;
	public void ab_a() {
		System.out.println("�θ� Ŭ�����Դϴ�.");//ȯ�漳���Ҷ� �̸� ����.
		this.c = 123456;
	}
	
	public abstract int b(); // {}�� �ȵ���. �߻�޼ҵ� ���� ������x ����� ��. ��ü ���� �ȵ� �굵 �߻� �޼ҵ� free ����, ������ �ڽ� Ŭ������ ���
	
	public void ab_C() {
		// free�뵵�� ��� �� ���� �ִ�. (�������̵��ؼ� �ڽĸ޼ҵ忡�� Ȱ���ϴ� ���) -> ����ص� �ǰ� ���ص� �ǰ� {}�� ���� ����
	}
	
	public void ab_C(int a) {
		//free�ε� �μ����� �޴� �޼ҵ�
	} //abstract�� �ִ� �޼ҵ�� �� �����ͼ� ����Ѵ�.
	
}


class ab_2 extends Ab1{
	/* */
	
	@Override
	public int b() { //�޼ҵ� �̸��� �Ȱ��� but ���� �޼ҵ�(�߻� �޼ҵ带 �������̵� �Ѱ�)	
		return 55;
	}
	
	@Override
	public void ab_C(int a) {
	}
	
	@Override
	public void ab_a() {
		System.out.println(this.c);
	}

}