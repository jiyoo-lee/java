import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է� �� ������ �����ּ��� !");
		
		//String memo = sc.next(); // next():�����̽��� �Է±����� ����
		String memo = sc.nextLine(); //nextLine(): �����̽��� ���� ��� �Է� ����
		System.out.println(memo); 

		/*���빮�� :  ����:park  ����:25  */
		
		sc.close(); //scanner ���Ḧ �⺻���� �������־�� �Ѵ�.
		
		String name = "park";   
		/* String + int = %s   int = %d(����)
		   �߰� double, float = %f
		   date,time = %t 
		   boolean(true,false) = %b */
		
		
		int age = 25;
		
		//System.out.println(name+"���� ���̴�"+age+"�Դϴ�.");
		System.out.printf("%s���� ���̴� %d�Դϴ�.",name, age); //print f-> print format�� ����
		
		
	}

}
