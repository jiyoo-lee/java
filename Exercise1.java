
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int balance = 100_000;
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 입력시 입금, 2번 입력시 출금입니다.");
		int type = sc.nextInt();

		if (type == 1) {
			System.out.println("입금 할 금액을 입력하세요.");
			int deposit = sc.nextInt();
			balance += deposit;
			System.out.println(balance + "원 입니다.");
		} else if (type == 2) {
			System.out.println("출금 할 금액을 입력하세요.");
			int withdraw = sc.nextInt();
			balance -= withdraw;
			if (balance >= 0) {
				System.out.println(balance + "원 입니다.");
			}
			if (balance < 0) {
				System.out.println("출금 금액이 기존 금액보다 큽니다.");
			}
		} else {
			System.out.println("번호를 다시 확인해주세요. 1: 입금 2: 출금");
		}

		sc.close();

	} // end of main

}
