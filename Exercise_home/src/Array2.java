import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		/*
		 * 응용문제: 배열 {"햄버거","피자","치킨","커피"} 해당 질문은 총 4번을 물어보게됩니다. 단, 주문종료라고 사용자가 입력시 그 즉시
		 * 주문은 종료되며 주문내역을 출력하시면 됩니다. foreach로 풀어야함
		 */
		
		 String[] menus = {"햄버거", "피자", "치킨", "커피"};
	        String selectedMenus = "";

	        for (String menu : menus) {
	            System.out.println("원하시는 메뉴를 선택해주세요");
	            System.out.println(Arrays.toString(menus));
	            System.out.println("입력 > ");

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
	            else if (userChoice.equals("주문 종료")) {
	                break;
	            }
	            else {
	                System.out.println("메뉴판에 없는 메뉴입니다.");
	            }
	        }
	        // 최종 결과 출력
	        System.out.println(selectedMenus);
	}

}
