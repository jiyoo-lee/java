
public class Double_loop4 {

	public static void main(String[] args) {
		
		/*응용문제 : 복합 반복문 (밖에는 while 안에는 for 등등) 제일 느린 for + for가 가장 느리다.
		 * do while이 가장 빠르다. 1.do while - > while - > for문 순으로 속도가 빠르다.
		 * 밖: for 안: do while*/
		
		/* int f;
		for(f=2; f<=3; f++) {
			int w = 1;
			do {
				System.out.println(f+"*"+w+"="+(f*w));
				w++;
			}while(w<=9);
		} */

		
		/*응용문제 : 구구단 7단부터 9단까지 단, 각 구구단 곱셈값은 
		  5까지만 나오도록 합니다. 7*1 = 7 ~ 7 * 5 = 35
		  제약(밖에는 do while 안에는 while) - 헷갈리면 따로 나눠서 코드 짠 후에 넣어보기.
		 */
		
		int dw = 7;
		int total = 1;
		do {
			//System.out.println("====="+dw+"단"+"=====");
			int w = 1;
			while (w<=5) {
				total = dw * w;
				//System.out.println(dw+"*"+w+"="+total);
				w++;
			}
			dw++;
		}while(dw<=9);
		
		
		/*응용문제 : 다음은 결과값을 확인하여 코드를 작성합니다.
		 * 단, for문으로 시작하여 while문으로 제작되도록 합니다.
		 * 즉, 밖은 큰 for 안은 while문*/
		
		int g;
		int total2 = 1;
		for(g=1; g<=9; g++) {
			
			int y = g;
			while (y<=g) {
				total2 = y * g;
				System.out.println(g+"*"+y+"="+total2);
				y++;
			}
			
		}
		
		
		/*응용문제: 다음 해당 결과값처럼 출력이 되도록 double 반복문을 이용하시오
		 * (while ~ do while문 )
		 * 결과값 : 1+1 = 2
		 * 1+1 =2 2+2 =4 ~~~ 3+3 = 6 // 4+1=5 4+2=6 4+3 =7 4=4=8 */
		
		
		
	}

}
