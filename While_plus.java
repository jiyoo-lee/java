
public class While_plus {

	public static void main(String[] args) {
		/* 응용문제 *
		  5에서 10까지 합계를 출력하세요*/

		int a = 5; // 초기값
		int b = 11; // 범위값
		int sum = 0; // 산술의 합계치를 누적시키기 위한 변수값
		
		while(a<b) {
			sum += a; //sum = sum + a;
			a++;
		}
		
		System.out.println("합계: "+sum);
		
		/* 응용문제 : 3 ~ 8까지 곱한 총 합계 수를 출력하시오 */
		
		int aa = 3;
		int bb = 1; //곱하기 합계를 설정시 1 기본값으로 설정 
		
		while(aa<9) {
			bb = bb * aa ; //곱하기는 0
			aa++;
		}
		System.out.println(bb);
	}

}
