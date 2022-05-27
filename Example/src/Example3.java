import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		/*
		 * 응용문제 : 사용자가 해당 값을 입력합니다. 단, 사용자가 2개의 숫자를 입력하되 첫번째 숫자와 두번째 숫자 범위 안에 있는 모든 숫자를
		 * 더해서 결과 값이 나오도록 제작하시오 단, 해당 코드는 do while 문으로 작성합니다.
		 * 
		 * 예시 : 첫번째 범위 숫자는? 5 두번째 범위 숫자는? 10 범위 숫자 모든 합계는 45입니다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 범위 숫자는?");
		int num1 = sc.nextInt();
		System.out.println("두번째 범위 숫자는?");
		int num2 = sc.nextInt(); //스캐너 하나로 두번 값을 받는다.
		int sum = 0;

		do {
			sum += num1; 
			num1++;
		} while (num1 <= num2);

		System.out.println(sum + "입니다.");
		sc.close();
	}

}
