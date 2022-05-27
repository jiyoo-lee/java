
public class Example5 {

	public static void main(String[] args) {
		/*
		 * 응용문제 5 : int sum = 0; int i; for(i=1; i<12; i++) { if ( i % 2 == 0) { sum= i
		 * +sum; } }
		 * System.out.println("1부터 12까지 짝수의 합 =" + sum);
		 * while 문으로 변경하여 코드를 작성하시오.
		 */

		int i = 1;
		int sum = 0;

		while (i <= 12) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1부터 12까지 짝수의 합 = " + sum);

	}

}
