
public class ExampleOop1 {

	public static void main(String[] args) { //�ܺ� Ŭ���� ȣ�⸸ �մϴ�.
		//abstract ���빮��
		/*
		 1�� �迭 ���� �ֽ��ϴ�. �ش� �迭 ���� ��� ���� ���� ����մϴ�.
		 ��, abstract �⺻ void method �̸��� sender �Դϴ�. 
		  ������ ����� sender���� ��µǵ��� �մϴ�.
		  �迭�� abstract���� ����մϴ�. ������ ȣ�⸸ �մϴ�.
		 * */
		
		add ad = new add();
		ad.adder();
		ad.sender();
		
	}
}

abstract class send {
	
	protected int[] numbers = {6,13,22,9,12,64,32,47,39};
	public abstract void sender(); // �����͸� �������� �ϴ� �߻�ȭ �޼ҵ� 
}

class add extends send {
	
	protected int sum;
	
	public void adder() { // �����ִ� �޼ҵ�
		for(int i = 0; i < this.numbers.length; i++) {
			this.sum += this.numbers[i];
		}
	}
	
	@Override
	public void sender() { // �������̵� �߻�ȭ �޼ҵ� 
		System.out.println(this.sum);
	}
}