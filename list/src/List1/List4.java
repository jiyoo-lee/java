package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class List4 {

	public static void main(String[] args) {
//		Integer[] num1 = { 3,6,9,12,15 };
//		
//		LinkedList<Integer> in = new LinkedList<>(Arrays.asList(num1)); 
//		//ArraysList�� ��������� linked�� ���� �� �߰� ������ ���ٸ� �� �����ϴ�.  -> ���������� �˻��ϹǷ� �ӵ��� �� ������.
//		System.out.println(in);
//		
//		in.add(33);
//		in.add(43);
//		in.add(23);
//		//System.out.println(in);
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();  //����ִ� int �迭 
		String user;
		// fo(;;) ���� ���� 
		while(true) { //sysout�� while�� �ۿ� ����.
			System.out.println("���ڸ� �Է��ϼ���.");
			user = sc.next();
			try { //����ڰ� �Է��� ���� ������ �ִ��� Ȯ���ϴ� ��Ʈ 
				int number = Integer.parseInt(user);
				list.add(number);
				int ea = list.size();
				if(ea > 5) {
					System.out.println("�迭�� ������ ���� �����մϴ�.");
					break; //5�������� �迭�� ����� ���ѷ����� ���������� ���ؼ� 
				}
			}
			catch (Exception e) { // ������ �߻��Ͽ��� ��� �۵��Ǵ� ��Ʈ 
				System.out.println("�ش� �Է»����� �����Դϴ�. ���ڸ� �Է��ϼ���.");
				
			}
		}
			System.out.println(list); // ���ѷ����� break �߰��ϸ� �ۿ��� sysout ���� ����.
			
			sc.close();
	}
}
