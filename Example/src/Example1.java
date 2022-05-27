import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * 응용문제 : while 문으로 코드를 작성하세요 프로세서는 다음과 같습니다. 사용자가 상품을 전체 선택하였습니다. 질문은
		 * " 7000 결제하시겠습니까? "라고 출력되며 숫자 1이라고 입력하면 최종결제 금액에 추가되어집니다. 단, 2라고 입력시 최종 결제 금액에
		 * 추가 되어지지 않습니다. 총 질문 횟수는 4번입니다. 마지막에 최종 결제 금액이 나오도록 코드를 작성하세요.
		 */

		int payment = 1;
		final int product = 7000;
		int total = 0;

		Scanner sc = new Scanner(System.in);

		while (payment < 5) {
			System.out.println("7000원 결제하시겠습니까?");
			int user = sc.nextInt();
			if (user == 1) {
				total += product;
			} else {
			}
			payment++;
		}
		System.out.println("최종 결제 값 : " + total);

		sc.close();

	} /*내가 푼 것 및 풀이한 것임*/

}
