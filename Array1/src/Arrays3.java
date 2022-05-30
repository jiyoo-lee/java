import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {

		/*
		 * 응용문제: 배열 {"햄버거","피자","치킨","커피"} 해당 질문은 총 4번을 물어보게됩니다. 단, 주문종료라고 사용자가 입력시 그 즉시
		 * 주문은 종료되며 주문내역을 출력하시면 됩니다. foreach로 풀어야함
		 */
		Scanner sc = new Scanner(System.in);
		String menus[] = { "햄버거", "피자", "치킨", "커피" };
		String user = sc.next();
		int menus_length = menus.length;
		int ct = 0;
		
		for(int i = 0; i < menus_length; i++) {
			
		}
		for(String a : menus) {
			System.out.println(a);		
		}
		
	
		
		
		
	 
	}

}
