
public class Class5 {

	public static void main(String[] args) {
	
		member2.lists2(); //static�� �ٷ� �޸𸮿� �ø��°�
		member2 mb2 = new member2(); // static�� ���� �Լ��̹Ƿ� ��ü �� �ν��Ͻ��� ���� �ؾ� �����Ҽ�����
		mb2.lists(); // �ν��Ͻ�(�޸�)�� �ִ� �޼ҵ带 �ε��ϰ� ��.
		
		
		member2.lists3("������",12345);
		/* ���빮�� for_in�̶�� �Ϲ� �޼ҵ�(�޸�)�� �ֽ��ϴ�.
		 * ���α׷� ����� ������ ���� ������ �մϴ�.
		 * "����Ͻ� ������ ���ڸ� �ϳ� �Է����ּ���:"
		 * [���] - �ش� �޼ҵ忡�� ����� ����ؾ���. */
		 // ���� ����ڰ� 3���� �Է½� 3 * 1 = 3 ...3 * 9 =27 ��µǾ����
		
		
	}

}

class member2{
	public void lists() { //�޸𸮿� �Ҵ� �����ʴ� �޼ҵ� �Լ� (���Ŀ� ��ü�� �ν��Ͻ� �����ؼ� �� ���ִ� �޼ҵ�)
		String a = "ȫ�浿";
		System.out.println(a);
		
	}
	
	public static void lists2() { //�޸𸮿� �÷����� ���� �޼ҵ�
		String a = "�̼���";
		System.out.println(a);
		
	}
	
	public static void lists3(String nm, int pw) { 
		//nm�� �޼ҵ忡�� ���� �޴� ���� �ٷ� ��� �� ��� (nm.equal("������"))
		int user_pw = pw; 
		//�޼ҵ忡 ��ü���� ÷���Ͽ� �ε� �� �޼ҵ� �ȿ� ������ �ʵ���� �̿��Ͽ� ���� �޴� ����.

		if(nm.equals("������") && pw==123456) {
			System.out.println("ȸ�� Ȯ���� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("��ϵ��� ���� ȸ���Դϴ�.");
		}
		
	
			
	}
	
}
