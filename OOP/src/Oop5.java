
public class Oop5 {
	//abstract ���� �⺻���� �μ������� �߻� �޼ҵ�� ���� �ѱ�
	public static void main(String[] args) {
		
		load1 lo = new load1();
		lo.datain(20,30);
		lo.call();
		load2 lo2 = new load2();
		lo2.datain(20, 30);
		lo2.call();
	}

}

abstract class abclass {
	int data1,data2;
	public void datain(int d1, int d2) { //�⺻ �߻� �޼ҵ��̸� ��� �����͸� �μ��� �޾Ƽ� this�� ó��
	//��, �ܺ� Ŭ�������� �������� ���� ex)����� ����
		this.data1 = d1;
		this.data2 = d2;
	}
	
	public abstract void plus(); //������ ����� abstract method�� ���� ������ �Ȱ��� ����ϰ� ������ ���� ������ ����Ѵ�.
	//������ class �⺻���� plus �޼ҵ�� ������ ������ 
	
	public void call () { //�������̵� �Ѱ͸� ���� abstract void ������������ call�ؼ� ���� ���Ѿ��Ѵ�.
		this.plus();
	}
	
	
}

class load1 extends abclass {
	
	@Override
	public void plus() {
		int sum = this.data1 + this.data2;
		System.out.println(sum);
	}
}

class load2 extends abclass {

	
	@Override
	public void plus() {
		int sum = this.data1 * this.data2;
		System.out.println(sum);
		this.avg(); // �ٸ��޼ҵ嵵 ���� ��½�Ű������� �������̵� �� ���� avg�� �ҷ��´�. ����Լ�..?
	}
	
	public void avg() {
		System.out.println("ȫ�浿");
	}
}