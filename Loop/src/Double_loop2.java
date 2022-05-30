
public class Double_loop2 {

	public static void main(String[] args) {
		// while double 문

		int w = 1;

		while (w <= 3) {
			int ww = 1;
			while (ww <= 4) { // 작은 while문은 큰 while문 밖에 있으면 초기화가 되지않는다. (한번 돌고 멈춤)
								// 따라서 변수 초기화를 큰 while문 안에서 해줘야함. (do while문도 마찬가지)
				int total = 0;
				total = w + ww;
				System.out.println(w + " + " + ww + " = " + total);
				ww++;
			}
			w++;
		}
		
		
		/* do - while문 */
		
		int dw = 1;
		
		do {
			// do while문 또한 while문 같이 초기값을 큰 반복문 안에 설정 
			int ddw = 1;
			do {
				int total2 = 0;
				total2 = dw+ddw;
				System.out.println(dw+" + "+ddw+" = "+total2);
				ddw++; // ++ 빼먹지않기
			}while(ddw<=4); //작은 반복문 범위
			dw++; // + 빼먹지않기
		}while(dw<=3); //큰 반복문 범위

	}

}
