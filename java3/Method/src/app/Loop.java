package app;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args)  {
		/*응용문제
		 * 바코드로 상품을 입력시켜주세요라고 하고 금액을 입력하고(3번반복)
		 * "할인 %를 입력해주세요"라는 문구와 함께 해당 할인 숫자를 입력하면 최종 금액이 변경되어 출력되도록 합니다.
		 * 스캐너, if문,sysout
		 * 힌트: int money = 10000 ;
		 * int coupon = 20;
		 * double discount = coupon * 0.01 -> 0.2
		 * 
		 * system.out.println(discount) 
		 * double a = money * discount
		 * system.out.println(discount)
		 * int c = money -(int)( a ) //double c로 써도 됨 
		 * system.out.println(c)*/
		
		Scanner sc = new Scanner(System.in);
		int prices = 0;
		double sum = 0;
		
		for(int i = 0; i <= 2; i++) {
			System.out.println("바코드로 상품을 입력시켜주세요.");
			prices += sc.nextInt();
		}
		System.out.println("할인 %를 입력해주세요.");
		double discount = 0;
		discount = sc.nextDouble() * 0.01;
		
		if(discount > 0) {
			sum = prices * discount;
		}
		System.out.println((int)sum+"원 입니다.");
	}
}
