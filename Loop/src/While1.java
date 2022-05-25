
public class While1 {

	public static void main(String[] args) {
		// 반복문에는 String 형식이 없다.

		int a = 1; // 값을 넣고 시작 while 시작값
		while (a < 11) { // while 범위 값, 종료값 (=숫자 몇까지 할지)

			// System.out.print(a+",");

			a++; // 증감식
		}

		int b = 10;
		while (b > 4) {
			// System.out.print(b + ",");
			b--;
		}

		/*
		 * 응용문제 다음 사항을 while문으로 작성하시오. 22~16까지 숫자를 출력하세요
		 */

		int c = 22;
		while (c > 15) {
			// System.out.print(c + ",");
			c--;
		}

		/*
		 * 응용문제 종료값에 변수를 받아서 조절
		 */

		int aa = 1; // 초기값
		int bb = 10; // 범위도 변수로 설정해서 풀이하는 방식(실무에서 많이 쓴다.)

		while (aa <= bb) { // 반복범위

			// System.out.printf("%d ", aa);
			aa++; // 증가식
		}

		/*
		 * 응용문제 변수 2개를 이용하여 범위에 맞게 값을 출력하시오. 99~47까지
		 */

		int cc = 99;
		int dd = 46;

		while (cc > dd) {
			//System.out.printf("%d ", cc);
			cc--;
		}

	} // end of main

}
