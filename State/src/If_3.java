
public class If_3 {

	public static void main(String[] args) {

		boolean ck = true; // ȸ�����Խ� üũ�ڽ� ���� ���� ���� ����
		// true �� false�� �����ϰ� �ȴ�.

		if (ck == true) {
			System.out.println("ȸ�������� ���� �˴ϴ�.");
		} else {
			System.out.println("�̿����� �����ϼž߸� ���� �˴ϴ�.");
		}
		
		String id, password; 
		id = "lee";
		password = "a1234";
		
		//&& : and �� �ǹ�. �� ���� ���� �̻󿡼� ��� ���� ���
		// || : or �� �ǹ�. �� ���� ���� �̻󿡼� �� ���� ���� �� ���
		
		if(id=="park" && password=="a1234") { 
			System.out.println("�α����ϼ̽��ϴ�.");			
		}
		else {
			System.out.println("���̵� �� �н����带 Ȯ���ϼ���.");
		}
		
		
		if(id=="park"|| id=="lee") {
			//if(id=="park"|| password=="a1234") ->�۵��� ������ ��� �¾ƾ��� �� ���� �߿� �Ѱ����� �¾� ����� ���(error)
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("Ȯ�ε� ���̵� �����ϴ�.");
		}
		
		
	}
}
