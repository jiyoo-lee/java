public class Example3 {

	public static void main(String[] args) {
		/*
		 * 배열 + 기본(클래스) 메소드 문제 product : 수박 참외 사과 배 딸기 키위 바나나 망고 moneys : 35000, 8000,
		 * 4000, 5500, 3800, 4400, 11000, 18900 장바구니에 해당 상품을 모두 담았습니다. 단, 그중 사과와 바나나는
		 * 제외하고 총 결제 금액을 출력하시오. 결과값은 75600
		 * 
		 */

		String product[] = { "수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고" };
		int moneys[] = { 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900 };

		mins(product, moneys);

	}

	public static void mins(String pd[], int cash[]) {
		int sum = 0;
		for (int i = 0; i < pd.length; i++) {
			if (!pd[i].equals("사과") && !pd[i].equals("바나나")) { // 배열값에 값을 확인할때 인덱스 값 적용하기.
				sum = sum + cash[i];
			}
		}
		System.out.println("결제하실 금액: " + sum);

	}

}
