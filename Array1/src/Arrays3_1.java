import java.util.Arrays;
import java.util.Scanner;

public class Arrays3_1 {

	public static void main(String[] args) {

		/*
		 * 응용문제: 배열 {"햄버거","피자","치킨","커피"} 해당 질문은 총 4번을 물어보게됩니다. 단, 주문종료라고 사용자가 입력시 그 즉시
		 * 주문은 종료되며 주문내역을 출력하시면 됩니다. foreach로 풀어야함
		 */
		
		/* Null = 값이 아무것도 없을 경우, 배열 값을 초기화 할때도 쓴다. ex) int a[] = null; ->데이터 초기화됨. */
		
		String menus [] = {"햄버거","피자","치킨","커피"};
		String user_menu[] = new String[4];
		int ct = 0;
		
		for(String menu : menus) { //넘겨줄 배열과 형 맞춰주기 
			/*스캐너가 반복문안에 적용시 loop로 무조건 반복하지는 않음.
			 * 사용자가 입력할때마다 반복문 범위만큼 출력하는 형태임. (스캐너 없으면 멈춤없이 다 돌아간다.)
			 * */
			Scanner sc = new Scanner(System.in);
			System.out.println("주문하실 메뉴를 선택해주세요.");
			System.out.println(Arrays.toString(menus));
			String userMenus = sc.next();
			if(userMenus.equals("주문종료")) {
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
	     System.out.println("주문하신 메뉴는 다음과 같습니다."+Arrays.toString(user_menu));
	 
	}

}
