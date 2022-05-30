import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
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
			
			int i;
			int again = 3;
			double sum= 0;
			
			for(i=1;i<=again;i++) {
				System.out.println("바코드로 상품금액을 입력시켜주세요");
				int price = sc.nextInt();
				sum += price;
			}	
			
			System.out.println("할인%를 입력시켜주세요");
			double discount = sc.nextDouble() * 0.01;
			
			if(discount >= 0) { 
				sum -= sum * discount;
			}
			
			System.out.println((int)sum+"원 입니다.");
			
			sc.close();
			
			
			/* 더블반복문 사용예 : 2차원 배열 (ex.게시판)
			 * 반복문 하나 : 홈페이지 페이지 넘버
			 * 
			 * 
			 * 
			 * 
			 * */

	}

}
