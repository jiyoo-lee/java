package test2;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {

		/*총 8번의 사용자가 숫자를 입력 합니다. 해당 숫자를 입력하는 Scanner은 userinput이라는 메소드 에서 처리를 해야 하며
		해당 모든 값에 대한 더한 결과는  result에서 값이 출력 되도록 하는 프로그램을 제작하시오.
		힌트 (외부클래스에서 메소드2개 생성)*/
		
		
		InputNumbers in = new InputNumbers();
		in.userInput();
		int sum = in.result();
		System.out.println(sum);
		
	}
}
class InputNumbers {
	
	private int sum = 0;
	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void userInput() {
		
		for(int i = 8; i >= 1; i--) {
				try {
					Scanner scanner = new Scanner(System.in);
					System.out.println("숫자를 입력해주세요." + "남은 횟수:" + i);
					int number = scanner.nextInt();	
					sum += number;
				}
				catch(Exception e) {
					System.out.println("숫자만 입력하세요.");
					i++;
				}
			}
		}
	public int result() {
		return sum;
	}
}
