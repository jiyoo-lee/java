import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {

		/*
		 * ���빮�� 8: ����� �н������ a1234�Դϴ�. ����ڰ� �н����带 �Է��մϴ�. ��, 3ȸ �̻� ���н� ������ ���� ��µǵ��� �մϴ�.
		 * "�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�." ��, �н����尡 ���� ��� "�α��εǾ����ϴ�."��� ��µǾ�� �մϴ�.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int i;
		String user;
		String mpass = "a1234";

		password: for (i = 0; i < 3; i++) {
			System.out.println("��й�ȣ�� �Է����ּ���.");
			user = sc.next();

			if (user.equals(mpass)) {
				System.out.println("�α��εǾ����ϴ�.");
				break password; //break�� �ݺ����� ���� �����Ҷ� ����մϴ�.
			}
			if (i >= 2) {
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž��մϴ�.");
			}
		} //for�� ��
		sc.close();

		/* fianl String pw = "a1234";
		 * int c = 3;
		 * Scanner sc = new Scanner(System.in);
		  int w = 0;
		  String msg = "�н����带 �Է����ּ���."
		  
		  while (w < 3) {
		  System.out.println("msg");
		   String user_pw = sc.next();
		   if(pw.equals(user_pw)){		     
		    system.out.println("�α��� �Ǿ����ϴ�.");
		    break;
		    }
		    
		    else {
		    msg = "�ùٸ� �н����带 �־��ּ���.";
		    c--;
		    if(c ==0) { 
		    system.out. println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
		    }
		    
		  
		    w++;
		  } while �� ��
		 
		 */
		
		
		
		
	}

}
