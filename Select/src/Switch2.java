import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/* ���빮��: 1~5������ ���ڸ� �ϳ� �Է����ּ��� ��� ������ �޽��ϴ�.
		 * 
		 * �������: 1: 5% 2: 10% 3~4: �ù�� ���� 5 : ������ȸ��..
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5������ ���ڸ� �ϳ� �Է����ּ���.");
		int user = sc.nextInt();
		String msg;
		/*		
       switch (user) {
       case 1 :
    	   msg = "5%��������";
    	   break;
       case 2 :
    	   msg = "10%��������";
    	   break;
       case 3 : case 4:
    	   msg = "�ù�񹫷��Դϴ�.";
    	   break;
    	   default:
    	   msg = "������ȸ��..";
           break;
       }*/
		
		/* switch version up ����(java 14�̻���� �� �� �ִ� */
		
		switch(user) {
		case 1 ->  {
		 msg = "5%��������";
		} //-> ȭ��ǥ, break�� {}�� �ٲ�.
		case 2 -> {
		 msg = "10%��������";
		}
		case 3,4 -> {
		msg = "�ù�񹫷��Դϴ�.";	
		}
		default -> {
	    msg = "������ȸ��..";	
		}
		
	}
		
		
		
       System.out.println(msg);
       
       sc.close();

	}

}
