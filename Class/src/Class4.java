
public class Class4 {

	public static void main(String[] args) {
	
		Member mb = new Member(); 
		// ��ü : Member mb : �ν��Ͻ� new Member(); : �޸𸮿� �ν��Ͻ����� �����Ͽ� ��� �� �� �ֵ��� ��.
		
		mb.user_age = 33;
		System.out.println(mb.user_age);
		int total = 25 * mb.user_agree; //user_agree�� class�ۿ����� �����Ǿ������� �ش� class�ȿ��� ���� ����
		System.out.println(total);
		
		final int agree = mb.user_agree; //Member�ν��Ͻ��� �ʵ尪�� �ε��� ->agree��� �ʵ� ������� ���޽�Ų��.
		mb.user_agree = 80; //�޸𸮿� ��ϵ� �ʵ�� �ش�Ǵ� ���� ������.
		System.out.println(mb.user_agree); // �ٸ� Ŭ�������� ��ȭ�ϴ´�� �ʵ尪�� ��������.
		System.out.println(agree); // ���� �����ص� ��������� �߱⶧���� ���������� �ִ�.
		
		
		/* �Ϲ� Ŭ���� �޼ҵ� �κ�
		 * �Ϲ� Ŭ���� �޼ҵ� ���� ������ ��ü �� �ν��Ͻ��� ���� �ʿ䰡 �����ϴ�.
		 * ��? static ��ü�� �޸� �ν��Ͻ��� ����Ѵٴ� ���̱⶧���Դϴ�. (���λӸ� �ƴ϶� �ٸ� Ŭ�������� ��������)
		 */
		
		/* ���뿹�� 
		 * Ŭ���� 25000 -> ���� final 25000 ���
		 * 10% �������� �����ϴ� ��Ȳ -> �޸𸮿� �ʵ尪���� ����
		 * ����� ���� �޸𸮿� �����ؼ� ������������ ����� ���� �����Ҽ��ְ� �Ѵ�.
		 * */
		
		//Member.member_event();
		//mb.meber_event();    //���� ������ �ؼ� �ʵ弱�� �� �ʵ尪 ���� �־�� 
	}

}

class Member {    //Ŭ����
	 String user_name;
	 int user_age;
	 int user_level; 	// ���� �ʵ��(user_level)�� ���� 
	 int user_agree = 6;	//���� �ʵ�� �ʵ尪(1)�� ����.
	 public static void member_event() { 
	 coupon.events(); //Ŭ������ ���� �޼ҵ带 �ٷ� ȣ�Ⱑ�� ��, events��� �޼ҵ忡 ���� �ʵ� �� ���� �ʵ尪�� class�� �����ϰ� �Ǹ� 
	 				// �׶��� ��ü+�ν��Ͻ��� �����ؾ߸� �ε尡 �˴ϴ�.
	 }
}

/* �ϳ��� Project �� ���� �ٸ� pck�� �ѹ� ����� Class���� �ٸ� ������ 
 * ����Ͻ� �� �����ϴ�.
 * */


class coupon {
	public static void events( ) {
		int cp = 30;
		System.out.println(cp);
		
	}
}