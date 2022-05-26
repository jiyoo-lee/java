import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		
		/* 응용문제 총 두번의 질문을 하게 됩니다.
		 사용자가 숫자를 입력하여 두 수의 합을 구하는 스캐너를 제작하세요   */
		
		Scanner sc = new Scanner(System.in);
		int score; // 값 받는 변수
		int f = 1; // 조건문(몇번 반복할지)
		int sum = 0; // 합계를 도출할 변수
		
		while (f<3) {
			System.out.print(f+"번째숫자를 입력하세요.>");	
			score = sc.nextInt();
			sum += score;
			f++;
		}
		System.out.print("두 숫자의 합은 "+sum);
		
		sc.close();

	}

}