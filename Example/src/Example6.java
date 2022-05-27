
public class Example6 {

	public static void main(String[] args) {
		/*
		 * 응용문제6 : 1~10까지 순차적으로 적용하는 반복문이 있습니다. 단, 1~5까지는 모든 값을 곱하고, 6~10까지는 모든 값을 더합니다.
		 * 해당 두개의 값을 비교하여 더한 값이 큰지 곱한 값이 큰지 결과로 출력하시오
		 * 
		 */

		int a;
		int b = 1;
		int c = 0;

		for (a = 1; a <= 10; a++) {
			if (a < 6) {
				b *= a;
			} else {
				c += a;
			}
		}
		if (b > c) {
			System.out.println("곱한 값이 더 큽니다.");
		} else if (b < c) {
			System.out.println("더한 값이 더 큽니다.");
		} else {
			System.out.println("두 값이 같습니다.");
		}

	}

}
