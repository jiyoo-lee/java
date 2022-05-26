
public class If_dowhile1 {

	public static void main(String[] args) {
		/*
		 * 응용문제 do-while문 구구단 6단 중에서 35이상 출력
		 */

		int a = 1;
		int b = 0;

		do {
			b = a * 6;
			if (b > 35) {
				//System.out.print(b + " ");
			}
			a++;
		} while (a < 10);

		/*
		 * 응용문제 14~27까지 숫자 중 짝수값만 모두 더하여 최종 결과 값을 출력하세여
		 */

		int c = 14;
		int sum = 0;
		
		do {
			if(c %2 ==0) {
				sum += c;
			} 
			c++;
		}while(c<28);
		
		System.out.print("총합 : "+sum);

	}

}
