import java.util.Scanner;

public class academy {
	public static void main(String args[]) {
	
	/*���빮��
	 * */
		
	Scanner sc = new Scanner(System.in);
	System.out.print("ù��° ���ڰ��� �Է��ϼ���.>");
	int num1 = sc.nextInt();
	
	Scanner sc2 = new Scanner(System.in);
	System.out.print("�ι�° ���ڰ��� �Է��ϼ���.>");
	int num2 = sc2.nextInt();
	
	if(num1 * num2 <=100) {
		System.out.println("100������ ������Դϴ�.");
	}
	else {
		System.out.println("�ش� ���� 100 �̻� ������Դϴ�.");
	}
	
	sc.close();
	sc2.close();
		
	} // main
}