
public class If_for2 {

	public static void main(String[] args) {
		/* 1에서 100까지 숫자 중 80이상의 숫자만 출력 */

		/*
		 * int num; for(num=1; num<101; num++) { if(num>=80) {
		 * System.out.print(num+" "); } } //end of for
		 */

		/* 응용문제 1 : 200~300 중 240 이하의 값 */
		// int num1;
		// for(num1=200; num1<301; num1++) {
		// if(num1<=240) {
		// System.out.print(num1+" ");
		// }
		// }

		/* 응용문제 2 : 1~10까지 숫자중 짝수만 출력하시오. */

		final int a = 4;
		int b;
		for (b = 1; b < 11; b++) {
			if (b % a == 0) {
				System.out.printf("%d ", b);
			}
		}

		/* 응용문제 3 : 구구단 중 2단을 반복합니다. 단,2단 결과값 중 10이상 숫자만 출력합니다. */

		int ss;
		int dan = 2;
		int num = 10;
		int sum;

		for (ss = 1; ss < num; ss++) {
			sum = dan * ss;
			if (sum >= num) {
				System.out.println(sum);
			}
		}

		/*
		 * 응용문제 4 : 다음 결과 값을 보고 해당 값이 출력되도록 코드를 제작하시오. 결과값 : 18 36 54 72
		 */

		int num1; //초기값
		int sum1; // 결과값

		for (num1 = 1; num1 < 10; num1++) {
			sum1 = num1 * 9;
			if (num1%2 ==0) {
				System.out.println(sum1);
			}
		}
		
		
		/*응용문제 5: 다음 결과값을 보고 해당 값이 출력되도록 코드를 제작하시오
		 * 1~20 사이의 숫자입니다.
		 * 결과값 : 6 14 17 19*/
		 // 규칙성이 없는 수를 출력하는 법
		
		int j;
		
		for(j=1; j<=20; j++) {
			if(j==6 || j==14 || j==17 || j == 19 ) {
				System.out.print(j+" ");
			}
		}
		
		
		
		
		
		
		
		
		
		

	} // end of main

}
