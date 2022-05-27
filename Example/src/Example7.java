import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		 * 응용문제 7 : 사용자가 다음 질문에 확인하여 값을 입력 후 해당 결과를 도출하는 프로세서 질문 : 첫번째 입력값(단, 1~10까지만
		 * 입력) 질문2 : 두번째 입력값(단, 1~10까지만 입력) 질문3 : 세번째 입력값(단, 1~10까지만 입력) 마지막 질문 : 해당 세가지
		 * 값에 대한 산술기호를 적으시오 +-/* equals 해당 산술 기호에 맞게 수식을 산술하는 코드를 작성하시오.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("입력값을 적어주세요(단, 1~10까지만 입력)");
		int q1 = sc.nextInt();
		System.out.println("두번째 입력값(단, 1~10까지만 입력");
		int q2 = sc.nextInt();
		System.out.println("세번째 입력값(단, 1~10까지만 입력");
		int q3 = sc.nextInt();
		System.out.println("해당 세가지 값에 대한 원하는 산술기호를 적으시오 +-/*");
		String q4 = sc.next();

		if (q4.equals("+")) {
			System.out.println(q1 + q2 + q3);
		} else if (q4.equals("-")) {
			System.out.println(q1 - q2 - q3);
		} else if (q4.equals("/")) {
			System.out.println((double)+q1 / q2 / q3); //소숫점까지 표시하고싶으면 double 형변환을 해준다.
		} else {
			System.out.println(q1 * q2 * q3);
		}

		sc.close();
	}

}
