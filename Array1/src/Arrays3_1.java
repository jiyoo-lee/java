import java.util.Arrays;
import java.util.Scanner;

public class Arrays3_1 {

	public static void main(String[] args) {

		/*
		 * ���빮��: �迭 {"�ܹ���","����","ġŲ","Ŀ��"} �ش� ������ �� 4���� ����Ե˴ϴ�. ��, �ֹ������� ����ڰ� �Է½� �� ���
		 * �ֹ��� ����Ǹ� �ֹ������� ����Ͻø� �˴ϴ�. foreach�� Ǯ�����
		 */
		
		/* Null = ���� �ƹ��͵� ���� ���, �迭 ���� �ʱ�ȭ �Ҷ��� ����. ex) int a[] = null; ->������ �ʱ�ȭ��. */
		
		String menus [] = {"�ܹ���","����","ġŲ","Ŀ��"};
		String user_menu[] = new String[4];
		int ct = 0;
		
		for(String menu : menus) { //�Ѱ��� �迭�� �� �����ֱ� 
			/*��ĳ�ʰ� �ݺ����ȿ� ����� loop�� ������ �ݺ������� ����.
			 * ����ڰ� �Է��Ҷ����� �ݺ��� ������ŭ ����ϴ� ������. (��ĳ�� ������ ������� �� ���ư���.)
			 * */
			Scanner sc = new Scanner(System.in);
			System.out.println("�ֹ��Ͻ� �޴��� �������ּ���.");
			System.out.println(Arrays.toString(menus));
			String userMenus = sc.next();
			if(userMenus.equals("�ֹ�����")) {
				break;
			}
			else {
				for(String ff : menus) {
					if(userMenus.equals(ff)) {
						user_menu [ct] = ff;
						ct++;
					}
				}
			}
			
		}
	     System.out.println("�ֹ��Ͻ� �޴��� ������ �����ϴ�."+Arrays.toString(user_menu));
	 
	}

}
