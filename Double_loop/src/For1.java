
public class For1 {

	public static void main(String[] args) {
		/* 구구단 2단부터 3단까지만 돌리기 */

		/*
		 * int a, aa; //반복문에 사용할 변수 선언을 미리 하였음.
		 * 
		 * for(a=2; a<4; a++) { //큰 for문 -> 2~3까지만 회전
		 * System.out.println("****"+a+"단***");
		 * 
		 * for(aa=1; aa<10; aa++) { //작은 for문 -> 1~9까지 회전
		 * 
		 * //해당 작은 반복문이 작동할때마다 출력을 사용함. System.out.println(a + "*" + aa); } }
		 */

		/* 응용문제 : 구구단 5단부터 7단까지 출력을 하되, */

		int b, bb;
		int c = 0;

		for (b = 5; b < 8; b++) {
			System.out.println(b + "단");
			for (bb = 1; bb < 5; bb++) {
				System.out.println(b + "*" + bb);
				c += b * bb;
			}
		}
		System.out.println("합계:" + c);

	} // end of main

}
