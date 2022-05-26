
public class If_for {

	public static void main(String[] args) {
		// final int a = 1; // final 사용시 변수에서 상수로 변경. (절대 값이 되어서 값 변경 불가)

		/* 상수 : 절대 변하지 않는 수 */
		// System.out.println(a); 실행 불가

		// final String name = "홍길동";
		// name = "이순신";
		// System.out.println(name); 실행 불가

		int ct = 5; // 고정값 실무: 아이디
		int f; // 반복문
		boolean ok = false; // 조건에 대한 true , false

		for (f = 1; f < 10; f++) {
			if (f == ct) { // 반복문 값과 고정값이 같을 경우
				// System.out.println("등록 된 값이 확인됩니다.");
				ok = true; // 조건에 대한 값을 변경합니다.
			}

		} // end of for

		if (ok == false) {
			/*
			 * 만약에 반복문이 끝났는데도 반복문 안에 조건사항이 없을경우 출력되는 코드 입니다.
			 */
			// System.out.println("값을 확인하지 못합니다.");
		}

		/* 총 스무번의 값을 반복합니다. 그 중 홀수 값만 출력하도록 합니다. */

		int a;
		String odd = ""; // odd는 홀수 even은 짝수
		for (a = 1; a < 21; a++) {
			if (a % 2 != 1) {
				System.out.print(a + " ");
			} else { //만약에 홀수 값일 경우 odd 변수에 지속적으로 값을 추가하게 됩니다.
				odd += a + " "; //추가 할 경우 " "빈 공간을 활용하여 적용함
			}

		}
		System.out.println(odd);

	} // end of main

}
