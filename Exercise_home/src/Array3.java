import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		/* 응용문제 : 사용자가 장바구니에 내용을 결제하게 됩니다.
		 * 단, 해당 금액 리스트를 출력하지말고 최종 전체 결제 금액만 출력되도록 합니다.*/
		
		int price[] = {1500, 22000, 13000, 14500, 113800, 45000}; 
		
		Scanner sc = new Scanner(System.in);
		int arrLength = price.length;
		int i = 0;
		int sum = 0;
		
		while(i<arrLength) {
			System.out.println("금액을 입력해주세요.");
			int user = sc.nextInt();
			for(int j =0; j<arrLength; j++) {
				if(user == price[j]) {
					sum += user;
				}
				
			}
			i++;	
		}
		System.out.printf("최종금액은 %d원입니다",sum);


	}

}
