
public class App {

	public static void main(String[] args) {

		int a = 10, b = 20;
		int c;
		// 사칙연산기호: +, - , * , /

		// c = a + b;
		// c = a - b;
		// c = a * b;
		c = b / a;
		System.out.println(c);

		String a1 = "홍길동";
		String b1 = "환영합니다.";
		String c1;

		c1 = a1 + b1; // 문자형태일때 +는 문자 + 문자열로 표현할 수 있습니다.
		System.out.println(c1);

		/*
		 * 응용문제 다음과 같이 출력되는 코드를 완성하시오 홍길동님 적립금은 50000 입니다. 단, 홍길동과 50000의 값은 지속적으로 변화할 수
		 * 있습니다.
		 */

		String name = "홍길동";
		int money = 50000;

		System.out.println(name + "님 적립금은 " + money + " 입니다.");

		/*
		 * 응용문제 아마존 사이트에서 상품을 구매했습니다. 장바구니에 담은 상품가격을 모두 더해서 총 결제 금액이 출력되도록 하시오. 단, $환율로
		 * 출력 되어야 합니다. 8.25 4.02 3.71
		 * 
		 * 결과값은 다음과 같이 출력하세요 총 결제금액 $ ㅇㅇㅇ 입니다.
		 */

		float price1 = 8.25f;
		float price2 = 4.02f;
		float price3 = 3.71f;

		float sum = price1 + price2 + price3;

		System.out.println("총 결제금액 $" + sum + "입니다.");

		double p1, p2, p3, p4;
		p1 = 8.25;
		p2 = 4.02;
		p3 = 3.71;

		p4 = p1 + p2 + p3; // 선생님 풀이 결과

		System.out.println("총 결제금액 $" + p4 + "입니다.");

		int k = 3;
		int j = 9;
		double aw = (double) k / j; // 연산형태의 자료형 또한 있는 코드
		// 변수 정수를 형변환해서 double로 변환시켜줌(테스트형태를 형변환 시켜줌)
		System.out.println(aw);

		// JAVA 구동 단축키 : CTRL+F11 (ECLIPSE 한정)
		// JAVA 코드 정렬 : CTRL + SHIFT + F
	}

}
