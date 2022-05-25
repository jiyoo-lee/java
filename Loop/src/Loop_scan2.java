import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		/* 스캐너와 함께 while문으로 사용자가 입력하는
		 값으로 구구단 결과가 출력되는 프로그램을 제작하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 구구단의 단을 입력하세요.>");
		int a = sc.nextInt();
		
		int f = 1; //반복문 초기값
		int z; //반복문 산출연산 결과값
		
		while (f<=9) {
			z = a * f;
			System.out.printf("%d * %d =%d%n",a,f,z);
			f++;
		}
		sc.close();


		
		
		
	}

}
