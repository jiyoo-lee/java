import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * 응용문제 : 사용자가 입력한 숫자에 맞춰서 구구단이 작동되며 총합을 계산하여 짝수인지 홀수 인지 출력하시오 구구단을 입력하세요라고 메세지가
		 * 출력되면 해당 숫자에 맞춰서 모든 결과를 더하며 더한 값에 따라 짝수인지 홀수인지 출력 해당 반복문은 for~do while까지 한가지
		 * 선택해서 작성하세요.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 구구단을 입력하세요[결과값 및 짝수와 홀수로 알려드립니다.]");
		int user = sc.nextInt();

		int gugu;
		int sum = 0;

		for (gugu = 1; gugu < 10; gugu++) {
			sum += gugu * user;
		}

		if (sum % 2 == 0) {
			System.out.println("결과값: " + sum + "짝수입니다.");
		} else {
			System.out.println("결과값: " + sum + "홀수입니다.");
		}

		sc.close();

	}

}
