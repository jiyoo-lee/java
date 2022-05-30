
public class Double_loop3 {

	public static void main(String[] args) {

		/*
		 * 응용문제 다음 결과값이 출력되도록 for문으로 작성하시오 5+2=7 5+3=8 5+4=9 5+5=10 6+2=8 6+3=9 6+4=10
		 * 6+5=11 7+2=9 7+3=10 7+4=11 7+5=12 8+2=10 8+3=11 8+4=12 8+5=13 9+2=11 9+3=12
		 * 9+4=13 9+5=14
		 */

		/*
		 * for (int i = 5; i <= 9; i++) { for (int f = 2; f <= 5; f++) { int total = 0;
		 * total = i + f; //System.out.println(i + "+" + f + "=" + total); } }
		 */
		
		

		/*
		 * 응용문제 : while문 더블으로 제작 9 * 7 = 63 9 * 6 = 54 9 * 5 = 45 8 * 7 = 56 8 * 6 = 48
		 * 8 * 5 = 40 7 * 7 = 49 7 * 6 = 42 7 * 5 = 35
		 */

		/*
		 * int w = 9; while (w >= 7) { int ww = 7; while (ww >= 5) { int gugu = 1; gugu
		 * = w * ww; System.out.println(w + " * " + ww + " = " + gugu); ww--; } w--; }
		 */
		
		
		

		/*
		 * 응용문제 : 다음 결과값을 보고 do while문으로 제작 5 + 4 = 9 5 + 5 = 10 5 + 6 = 11 5 + 7 = 12 4
		 * + 4 = 8 4 + 5 = 9 4 + 6 = 10 4 + 7 = 11 3 + 4 = 7 3 + 5 = 8 3 + 6 = 9 3 + 7 =
		 * 10
		 */

		int dw = 5;
		do {
			int ddw = 4;
			do {
				int sum = 0;
				sum = dw + ddw;
				System.out.println(dw + " + " + ddw + " = " + sum);
				ddw++;
			} while (ddw <= 7);

			dw--;
		} while (dw >= 3);

	}

}
