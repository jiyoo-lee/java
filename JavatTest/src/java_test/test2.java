package java_test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			payment p = new payment();
			
			for(int i = 1; i <= 6; i++) {
				System.out.print("이체를 시작합니다." + i+"번째 이체하실 금액을 입력해주세요: ");
				int money = sc.nextInt();
				
				}
			
	}
}

class payroll implements test2_interface {
	
	int money = 0;
	int balance2;
	int sum;
	
	public void setBalance() {
		this.balance2 = balance;
	}
	
	@Override
	public void deposit(int a) {
		setBalance();
		this.money += a;
		this.sum = this.balance2 - money;
	}
	
	public void result() {
		System.out.println("잔액 : " + this.sum + "이체금액: "+ this.money);
	}
	
	
}
