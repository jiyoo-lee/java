import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		/*
		 * ���빮��: �迭 {"�ܹ���","����","ġŲ","Ŀ��"} �ش� ������ �� 4���� ����Ե˴ϴ�. ��, �ֹ������� ����ڰ� �Է½� �� ���
		 * �ֹ��� ����Ǹ� �ֹ������� ����Ͻø� �˴ϴ�. foreach�� Ǯ�����
		 */
		
		 String[] menus = {"�ܹ���", "����", "ġŲ", "Ŀ��"};
	        String selectedMenus = "";

	        for (String menu : menus) {
	            System.out.println("���Ͻô� �޴��� �������ּ���");
	            System.out.println(Arrays.toString(menus));
	            System.out.println("�Է� > ");

	            Scanner scanner = new Scanner(System.in);
	            String userChoice = scanner.nextLine();

	            boolean exist = false;
	            for (String a : menus) {
	                if (userChoice.equals(a)) {
	                    exist = true;
	                }
	            }
	            if (exist) {
	                selectedMenus += userChoice + " ";
	            }
	            else if (userChoice.equals("�ֹ� ����")) {
	                break;
	            }
	            else {
	                System.out.println("�޴��ǿ� ���� �޴��Դϴ�.");
	            }
	        }
	        // ���� ��� ���
	        System.out.println(selectedMenus);
	}

}
