package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class List5 {

	public static void main(String[] args) {
		
		/* 응용문제 : 사용자가 숫자금액을 입력합니다. 
		 * 해당 숫자 금액 횟수는 총 8번입니다. 0~n까지 입력
		 * 해당 금액 입력이 끝나면 최종 합계 금액을 출력*/
		
		
		LinkedList<Integer> listup = new LinkedList<>(); // 빈 배열 
		Scanner sc = new Scanner(System.in);
		String money;
		int sum = 0; 
		
		for(;;) {
			System.out.println("입금하실 금액을 입력하세요.");
			money = sc.next();
			try {
				int banking = Integer.parseInt(money);
				listup.add(banking); 
				sum += banking;
				int ea = listup.size();
				if(ea == 8) {
					System.out.println("입금횟수가 만료되어 종료합니다.");
					break;
					}
			}catch(Exception a){
				System.out.println("숫자만 입력가능합니다. 확인 부탁드립니다.");
			}
		}
		System.out.println("총 입금액은 " +sum+"원 입니다.");
		
		sc.close();
	}

}
