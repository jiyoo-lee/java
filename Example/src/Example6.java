import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*���빮�� :
		 * �ݺ��� �ϳ��� ������
		 * 2���迭�̸�, �����ʹ� ������ �����ϴ�.
		 * user_list : ȫ�浿, �̼���, ������, ������, �������, ������, ����屺
		 * point :3000 1000 25000 19800 5750 3630 0
		 * ���α׷� ����� ���ÿ�, point�� �˻� �� ������ �Է��ϼ����� �����ϼ���
		 * �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ� ������ �Ű� ������ �̿��Ͽ� ���� �� �ش� ������� ����ϼ���
		 * */
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ʈ ��ȸ�� ���� �� ������ �Է��ϼ���.");
		String user = sc.next();
		
		search sh = new search();
		sh.point(user);
		
		sc.close();
		sh = null;

	}
	
}
class search {

public void point (String us) {
	String members [][] = { 
							{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
							{"3000","1000","25000","19800","5750","3630","0"}
							};
	
	for(int i = 0; i<members.length; i++) {
		for(int j = 0; j<members[0].length; j++) {
			if(members[i][j].equals(us)) {
				System.out.println("����Ʈ :"+members[1][j]);
			}
		}
	}
	
	
	
}


}