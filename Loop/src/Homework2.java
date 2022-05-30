
public class Homework2 {

	public static void main(String[] args) {
		/*응용문제: 다음 해당 결과값처럼 출력이 되도록 double 반복문을 이용하시오
		 * (while ~ do while문 )
		 * 결과값 : 1+1 = 2
		 * 1+1 =2 2+2 =4 ~~~ 3+3 = 6 // 4+1=5 4+2=6 4+3 =7 4+4=8 */
		
		int w = 1;
		int sum = 0;
		while(w<=4) {
			int dw = 1;
			do {
				sum = w +dw;
				System.out.println(w+"+"+dw+"="+sum);
				dw++;
			}while(dw<=w);
			w++;
		}

	}

}
