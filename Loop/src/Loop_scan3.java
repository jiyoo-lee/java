import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		/* ��ĳ�ʸ� �̿��� do-while������ ������ �ۼ� */
		
	Scanner sc = new Scanner(System.in);
	System.out.print("���Ͻô� �������� ���� �Է��ϼ���.>");
	int gugu = sc.nextInt();
	
	int i = 1;
	int j;
	
	do { 
		j = i*gugu;
		System.out.printf("%d ",j);
		i++;
	}while(i<=9);
	
	sc.close();
	
	}

}
