import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String[] args) {
		//for�� + Scanner
		
		Scanner sc = new Scanner(System.in); // �Է¿��� �ε�
		System.out.print("���Ͻô� ������ ���ڸ� �Է��ϼ���.>");
		int bb = sc.nextInt(); //����ڰ� �Է��� ����
		
		int f; // �ݺ����� ����ϴ� ����
		int zz; // �ݺ����� ������� ��� ��
		
		for(f=1; f<=9; f++) {
			zz = bb * f; // �������
			System.out.printf("%d ", zz); //���
		}
		
		
		sc.close();
	}

}
