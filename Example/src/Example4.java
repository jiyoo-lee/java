import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		/* ���빮�� : 
		 * �迭 ���� + �⺻(Ŭ����) �޼ҵ� ����
		 * ����ڰ� ���� ������ ���� �Է��ϰ� �˴ϴ�.
		 * "�б� �л� �̸��� �Է����ּ���"
		 * �� �迭 �����ʹ� 5���� ���� �Ǿ����ϴ�. (��ĳ�� 5��)
		 * ������ �޼ҵ忡�� �ش� ����ڰ� �Է��� ���� �迭�� �����Ͽ�
		 * ����Ͻÿ�.
		 * ���� : ����ڰ� �Է��� ��� : [ hong, kim , park, lee, choi ]
		 * */
		
		/* �ٲ� ���� : �迭�� ���� �����ǰ� ������ �ϼ���*/
		
		Scanner sc = new Scanner(System.in);
		String lists = "";
		
		for(int i =0; i <=4; i++) {
		System.out.println("�б� �л� �̸��� �Է����ּ���.");
		String search = sc.next();
		lists += (search+"");
		}
		
		arrays(lists);
		
		sc.close();
	}
	
	public static void arrays(String listUp) {
		
	 String userin [] = listUp.split(" "); //split : ���ڿ� �Ǵ� ���ڿ��� Ư�� ���� �������� �迭�� ���� �� �ִ� ��ɾ��Դϴ�.
	 System.out.println(Arrays.toString(userin));
	}
	

}
