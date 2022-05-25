import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {

		byte a = 10; // 조건은
		if (a < 10) {
			System.out.println("입력한 값은 10이상 숫자를 입력하세요.");
		} else if (a >= 10 || a < 22) { // 조건문에 범위를 설정하여 적용함.
			System.out.println("당첨입니다.");
		} else {
			System.out.println("범위 밖의 숫자입니다.");
		}

		/*
		 * 응용문제 Q.1~45까지 숫자 하나를 입력하세요. 0을입력: 숫자입력이 잘못되었습니다. 45보다 큰 숫자 입력시: 숫자는 1~45까지만
		 * 입력가능합니다.
		 * 1~45 숫자를 입력하였을 경우 7번,12번, 14번 세가지 숫자 입력시 당첨입니다라고 출력 그외 숫자시 다음기회에 참여하세요 출력
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Q.1~45까지 숫자 하나를 입력하세요.>");

		int num = sc.nextInt();
		
		
		// 조건을 걸때는 오류를 먼저 작성하고 조건을 else값에 적으면 수정이 편하다.
		if( num == 0) {
			System.out.println("숫자입력이 잘못되었습니다.");
		}
		else if (num>45) {
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
		}
		else {
			if(num==7 || num ==12 || num==14) {
				System.out.println("20% 쿠폰 당첨입니다.");
			}
			else if(num==41) {
				System.out.println("50% 쿠폰 당첨입니다.");
			}
			else if(num ==22) {
				System.out.println("5%쿠폰 당첨입니다.");
				}
			else {
				System.out.println("다음기회에 도전하세요.");
			}
						
		} // end of else
		
		sc.close();
		
		
	} //end of main
}
