package java_test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			payment p = new payment();
			
			for(int i = 1; i <= 6; i++) {
				System.out.print("��ü�� �����մϴ�." + i+"��° ��ü�Ͻ� �ݾ��� �Է����ּ���: ");
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
		System.out.println("�ܾ� : " + this.sum + "��ü�ݾ�: "+ this.money);
	}
	
	
}
