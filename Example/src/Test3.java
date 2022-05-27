import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/* Example2 풀이 */
		
		Scanner sc = new Scanner(System.in);
		String msg = "구구단에 대한 숫자를 입력하세요.";
		String msg2; // 메세지 부분
		System.out.println(msg);
		int user = sc.nextInt();
		
		int f = 1;
		int sum = 0;
		
		do { 
			sum += (f * user);
			f++;
		}while(f<10);
		
		//System.out.println(sum);
		if(sum%2 == 0) {
			msg2 = "짝수";
			System.out.printf("결과값은 %s 입니다.", msg2);
		}
		else {
			msg2 = "홀수";
			System.out.printf("결과값은 %s 입니다.", msg2);
		}

		
		sc.close();
	}

}
