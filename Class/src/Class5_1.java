import java.util.Scanner;

public class Class5_1 {
	/* 응용문제 for_in이라는 일반 메소드(메모리)가 있습니다.
	 * 프로그램 실행시 다음과 같이 질문을 합니다.
	 * "사용하실 구구단 숫자를 하나 입력해주세요:"
	 * [결과] - 해당 메소드에서 결과를 출력해야함. */
	 // 만약 사용자가 3단을 입력시 3 * 1 = 3 ...3 * 9 =27 출력되어야함
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 구구단을 입력하세요.");
		int gugu = sc.nextInt();
		
		users.for_in(gugu);
		sc.close(); //스캐너 클로즈는 메인에 한다.
	}

}

class users {
	
	public static void for_in(int a) {
		for(int i =1; i<=9; i++) {
			System.out.printf(" %d * %d = %d%n", a, i,(a*i));
		}
		
	}
}
