import java.util.Scanner;

public class aaaa {

	public static void main(String[] args) {
		/* ���빮��
		 * ��ǰ ������ 42000�Դϴ�.
		 * ����ڰ� �ش� ��ǰ ������ �Է��ϰ� �˴ϴ�.
		 * �ش� ��ǰ ���ݿ� �´� ������ŭ ���Ͽ� ���� ���� �ݾ��� ����Ͻÿ�
		 * extends�� ����  42000�� ���ڰ� ���� �ٲ��� ����
		 * �ִ� ������ ���ִ� ������ �ټ����Դϴ�.*/
		
		Calculate cal = new Calculate();
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ͻ� ��ǰ�� ������ �����ּ���. (�ִ� ���Ű����� �ټ����Դϴ�.)");
		int pay = sc.nextInt();
		
		if(pay > 5) {
			System.out.println("�ִ� ���� �ݾ��� �ټ����Դϴ�.");
			System.exit(0);
			}
		
		//Calculate cal = new Calculate();
			cal.pays(pay);
			System.out.println(cal.result());
			
		sc.close();	
		
	}
}

class Product {
	
	private int price = 42000;
	protected int sum;
	
	public void pays (int pay2) {
		this.sum = price * pay2;
		//System.out.println(this.sum); �� �Ѿ���� Ȯ��
	}	
}

class Calculate extends Product {
	
	public int result() {
		//System.out.println(this.sum);
		return this.sum;
	}
}
