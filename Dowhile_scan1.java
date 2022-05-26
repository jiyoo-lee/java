import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/*응용문제 : 사용자가 총 3번의 숫자를 입력합니다.
		 * 세개의 숫자를 모두 곱하여 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int score = 0;
		long jumsu = 1L;  // long을 입력시 최종 결과에서 마이너스 음수가 발생함.
		
		do {
			System.out.println(a+"번째 숫자를 입력하세요.");			
			score = sc.nextInt();
			jumsu *= score ;
			
			a++;
		}while(a<4);

		System.out.println("결과값: "+jumsu);
		
		sc.close();
	}

}
