import java.util.Arrays;

public class ExampleOop1 {

	public static void main(String[] args) { //�ܺ� Ŭ���� ȣ�⸸ �մϴ�.
		//abstract ���빮��
		/*
		 1�� �迭 ���� �ֽ��ϴ�. �ش� �迭 ���� ��� ���� ���� ����մϴ�.
		 ��, abstract �⺻ void method �̸��� sender �Դϴ�. 
		  ������ ����� sender���� ��µǵ��� �մϴ�.
		  �迭�� abstract���� ����մϴ�. ������ ȣ�⸸ �մϴ�.
		 * */
		
		AddArrays ad = new AddArrays();
		
	}
}

abstract class SendArrays {

	public abstract void sender(); // �����͸� �������� �ϴ� �߻�ȭ �޼ҵ� 
}


class AddArrays extends SendArrays {
	
	private int[] numbers;
	
	public AddArrays() {
		this.numbers = new int[] {6,13,22,9,12,64,32,47,39};
		this.sender();
		}
	
	@Override
	public void sender() {
		int sum = 0;
		for(int i = 0; i<numbers.length; i++) {
			sum += numbers[i];
			}
		System.out.println("���հ�: "+sum);
	}
}