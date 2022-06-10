import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		/*숫자를 입력하면 구구단이 실행되고 합이 짝, 홀인지 알려주는 문제*/
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~9사이의 숫자를 입력하세요.");
		int number = sc.nextInt();
		
		if(number > 9) {
			System.out.println("숫자를 다시 확인해주세요.");
			System.exit(0);
		}
		else {
			for(int i = 1; i <= 9; i++) {
				sum += number * i;
			}
		}
		
		String msg;
		if(sum%2 == 0) {
			msg = "짝수";
		}
		else {
			msg = "홀수";
		}
		System.out.printf("총 합은 %d이며 결과는 %s입니다.", sum, msg);
		
		sc.close();
	}

}
