import java.util.Scanner;

public class aaaa {

	public static void main(String[] args) {
		/* 응용문제
		 * 상품 가격은 42000입니다.
		 * 사용자가 해당 상품 갯수를 입력하게 됩니다.
		 * 해당 상품 가격에 맞는 갯수만큼 곱하여 최종 결제 금액을 출력하시오
		 * extends로 제작  42000은 숫자가 절대 바뀌지 말라구
		 * 최대 구매할 수있는 갯수는 다섯개입니다.*/
		
		Calculate cal = new Calculate();
		Scanner sc = new Scanner(System.in);
		System.out.println("구매하실 상품의 갯수를 적어주세요. (최대 구매갯수는 다섯개입니다.)");
		int pay = sc.nextInt();
		
		if(pay > 5) {
			System.out.println("최대 구매 금액은 다섯개입니다.");
			System.exit(0);
			}
		
		//Calculate cal = new Calculate();
			cal.pays(pay);
			System.out.println(cal.result());
			
		sc.close();	
		
	}
}

class Product {
	
	private int price = 42000;
	protected int sum;
	
	public void pays (int pay2) {
		this.sum = price * pay2;
		//System.out.println(this.sum); 값 넘어가는지 확인
	}	
}

class Calculate extends Product {
	
	public int result() {
		//System.out.println(this.sum);
		return this.sum;
	}
}
