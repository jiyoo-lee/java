
public class For_plus {

	public static void main(String[] args) {

		/* 응용문제 : 1~10까지 모든 숫자를 합한 결과값을 출력하시오 */

		int f;
		int total = 0;

		for (f = 1; f <= 10; f++) { // total 변수값에 반복 값을 지속적으로 증가시킴
			total += f; // total = total + f; ex) total /= f;, total *= f; 등등

		}
		// +=(더하기 할당) -=(빼기 할당) *= (곱하기 할당) /=(나누기 할당)
		System.out.println("총 합계: " + total);
		
		
		/* 응용문제
		 전체값은 500이 있습니다.
		 총 8회 동안 반복되면서 한번 반복할때마다 12씩 감소하도록 하여 최종 값을 출력하시오  		  
		  */
		
		int a;
		int sum = 500;
		int num = 12;
		
		for(a=1; a<=8;a++) {
			sum -= num; 
		}
		System.out.println(sum);
	}

}
