import java.util.Scanner;

public class Extend4 {

	public static void main(String[] args) {
		/*���빮��
		 * extends : �θ�� ó�� �ڽ��� ���ó�� 
		 * ���� �ΰ��� �Է��մϴ�.
		 * �ΰ��� ���ڸ� Ȯ���Ͽ� ������ ���� üũ�մϴ�. 
		 * ù��° ���ڰ� �ι�° ���ں��� ���� ��� : �ش� �ΰ��� ���� ��ģ ����� ���
		 * ù��° ���ڰ� �ι�° ���ں��� Ŭ ��� : �ش� ������ŭ ���ڸ� ��� ���� ��� ���� ���
		 * ������� : �ش� ���� �����ϴ�.
		 * int a = 10;
		 * int b = 6;*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "���ڸ� �Է��ϼ���.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Print p = new Print();
		p.Numbers(a,b);
		p.comparisonResult();

		sc.close();
		System.exit(0);
	}
}

//���� ����ϴ� �θ� Ŭ����
class Compare {
	protected int sum = 0;
	
	public void Numbers(int first, int second) {
		// ù��°�� �ι�°���� ������ ex. ù��°-> 2 �ι�° -> 4
		if(first < second) {
			this.sum = first + second;
			}
		// ù��°�� �ι�°���� Ŭ�� ex. ù��° -> 5 �ι�° -> 1
		else if(first > second) {
			for(int i = second; i <= first; i++) {
				this.sum += i;
			}
		}
	}
}

//���� ����� ����ϴ� �ڽ� Ŭ����
class Print extends Compare {
	
	public void comparisonResult () {
		// ��� ���� ������
		if(this.sum == 0) {
			System.out.print("�� ���ڰ� �����ϴ�.");
			}
		// �� ��
		else {
			System.out.printf("������� %d�Դϴ�.",this.sum);
		}
	}	
}
