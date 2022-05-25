import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {

		/*
		 * 응용문제 [인증번호 발송에 대한 번호 코드] 메세지는 인증받은 번호를 입력하세요. 숫자 220524 사용자가 숫자 220524 외에 입력시
		 * "인증번호가 틀립니다."라고 출력하시고 동일한 인증번호 숫자를 입력시 "인증확인 되셨습니다."라고 출력합니다. 단, 220524는 java
		 * 실행시 가장 먼저 실행되는 변수로 처리하세요.
		 */
		int sc = 220524; //인증번호

		Scanner s = new Scanner(System.in);
		System.out.println("인증받은 번호를 입력하세요.");
		int num = s.nextInt();

		if (num != sc) {
			System.out.println("인증번호가 틀립니다.");
		} else {
			System.out.println("인증확인 되셨습니다.");
		}

		s.close();
	}
	
}

//스캐너 import 사용 문구출력(어떤값을 입력할지에 대한 문구), 사용자가 입력한 값을 받는 변수를 지정
