import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {

		/*
		 * ���빮�� ���� �ش� ������ Ȯ�� �� �ڵ带 �ۼ��Ͻÿ� Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���. �������: ¦��, Ȧ�� ���Դϴ�. ��� ���
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("����ڰ� ���ϴ� ���ڸ� �Է��ϼ���.>");

		int aw = scan.nextInt(); // just next�� String �϶��� ��밡���ϴ�.
		// %�� ���� �����鼭 ���������� Ȯ���ϴ� ���ı�
		if (aw % 2 == 0) {
			System.out.println("¦���Դϴ�.");

		} else {
			System.out.println("Ȧ���Դϴ�.");
		}

		scan.close();
		
		  }
		}
	

