import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		
		/* class + method + array */
		
		/*String users[] = {"ȫ�浿","�̼���","������"};
		arrays.lists(users); //static�� ��ü���� �� �ν��Ͻ� ���� ���ϰ� �ٷ� �� �� ����.

		/* ���빮�� 
		 * ����ڰ� �ڽ��� �̸��� �Է��մϴ�. ����� �̸��� �ش� Ŭ������ ������ 
		 * ��ϵ� ��������� �̰����� ����������� Ȯ���ϴ� �ڵ带 �ۼ��Ͻÿ�
		 * ��Ͻ� = ������ �Ǿ� �ֽ��ϴ�.
		 * Ȯ���� �������� = �̰������Դϴ�.*/
		String members[] = {"ȫ�浿","�̼���","������","������"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		String users = sc.next();
		
		arrays ar = new arrays();
		//ar.usersList(users,users);
		
		sc.close();
		
		/* �ñ��Ѱ� ��Ʈ������ ��µ� ��� �迭�� ���� �޴���?*/
		
		
	}

}


class arrays{
	public static void lists(String a[]) { //�迭���� ������ [] ���ֱ�. 1��: [] 2��: [][]
		//System.out.println(Arrays.toString(a));
	}
	
	public void usersList(String name[]) {
		String members[] = {"ȫ�浿","�̼���","������","������"};
		boolean exist = false;
		String msg =""; // �ʱ�ȭ�� �Ǿ� �־���Ѵ�. �޼ҵ�� �ش� ���� ���� �Ҷ��� ����ִ� ���� ��Ȯ�ϰ� �����صξ�� �Ѵ�.
		// String ="" || null�� ����ִٴ� ��. int = 0���� ǥ��. boolean = false 
		for(int i =0; i<members.length; i++) {
			if(name.equals(members[i])) {
				msg = "��ϵ� �������Դϴ�.";
				exist = true;
			}
		}	
		if(!exist)  {
			msg = "�̰������Դϴ�.";
		}
		 //arrays.message(msg);
		arrays ar = new arrays();
		ar.message(msg); //�޼��� �޼ҵ� �θ���.
		}
	
	public void message (String m) { //������ �޼��� �޼ҵ带 ���� ���� ���
		System.out.println(m);
	}
		
	}
