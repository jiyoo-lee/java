
public class Example4 {

	public static void main(String[] args) {
		/*
		 * 다음 결과 값에 맞춰서 코드가 출력되도록 하시오 해당 코드는 for문으로 작성
		 * 
		 * 45 35 25 15 10
		 */

		int a = 5;
		int b;
		int c;

		for (b = 9; b >= 2; b--) {  // for(f=9;f>0;f--)
			c = a * b;
			if (c % 10 == 5 || c == 10) {  //if(f%2 ==1 || f ==2) { if (f! = 1) {} }
				System.out.print(c + " ");
			}
		}

	}

}
