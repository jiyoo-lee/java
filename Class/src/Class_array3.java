import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/* ���빮�� 
		 * 
		 * ���� ���� �迭������ ���� �ֽ��ϴ�.
		 * a1 : ȫ�浿 �̼��� ������ ������ ������ 
		 * a2 : 100 80 39 60 55
		 /* �����ϰ��� �ϴ� �̸��� �����ּ��� ����ϰ� �˴ϴ�.
		 * �˻�� �̼����̶�� �˻��� �ϰ� �Ǹ� "�̼��Ŵ��� 80���Դϴ�."��� ����� �Ǿ���մϴ�.*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��ϰ����ϴ� �̸��� �����ּ���.");
		String search = sc.next();
		
		member_1 m = new member_1();
		m.listOfmembers(search);
		
		sc.close();
		
		

	}

}


class member_1 {
	public void listOfmembers (String a) {
		String users [] = {"ȫ�浿","�̼���","������","������","������"};
		int score [] = {100,80,39,60,55};
		boolean exist = false;
		for(int i = 0; i <users.length; i++) {
			if(a.equals(users[i])) {
				System.out.println(users[i]+"���� "+score[i]+"�� �Դϴ�.");
				exist = true;
			}
		
		}
		if(!exist) {
			System.out.println("����� �̸��� �ٽ� Ȯ�����ּ���.");
		}
		
		
	}
	
}
