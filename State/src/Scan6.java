import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		//����: �ҷ����� ���� �� �Է��Ұ��� ����ϰ� ����ڰ� �Է��� ���� ������ ��ȯ�Ѵ�.
		
		Scanner mid = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���:");
		String m = mid.next(); //����ڰ� ���̵� �Է�
				
		Scanner mpass = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���:");
		String p = mpass.next(); //����ڰ� �н����� �Է�

	

		/*���빮��
		 * �α��� ���α׷�
		 * ȸ������ ���̵�� jung,su
		 * �н����� 
		 * jung : j1234
		 * su : ssh
		 * �ش� ���̵� �ܿ� �������� ���� ���� ���� ������Դϴ�.��� ����ϼ���
		 * ���� �н����尡 Ʋ����� ȸ�������� �ٽ� Ȯ���ϼ����� ����մϴ�.
		 * ���̵� �� �н����尡 ��� ���� ��� �α��� �Ǽ̽��ϴٶ��  ����մϴ�.
		*/
		
		
	if(m.equals("jung") || m.equals("su")) {
		if(m.equals("jung") || p.equals("j1234")) {
			System.out.println("�α��εǼ̽��ϴ�.");
		}
	
	else if (m.equals("su") && p.equals("ssh")) {
		System.out.println("�α��εǼ̽��ϴ�.");
	
	}
	else {
		System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���.");
	}
	
	}
	
	else {
		System.out.println("���Ե��� ���� ������Դϴ�.");
		}
	
	mid.close();
	mpass.close();
	}

}