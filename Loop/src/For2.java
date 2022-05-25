
public class For2 {

	public static void main(String[] args) {
		int a; //for문 초기값
		int b=2; //for문 연산에 사용 할 변수
		int c; //for문 연산한 결과값 사용
		
		for(a=1; a<10; a++) {
			c = b * a; //산술 연산 작업 
			System.out.print(c+","); //연산된 결과값을 출력함
		}
		
		/* 응용문제 
		 다음 결과 값을 보고 코드를 작성하세요
		 결과값 : 45,40,35,30,25,20,
		  */
		
		// int aa; for 변수값
		// int bb = 5;
		// int cc; //계산값
		// for(aa=9; aa>=4,aa--) { 
		//     cc = aa * bb;
		//     sysout(cc+","); 
		// } end of for
		
		/*int d;
		int e = 19;
		
		for(d=45; d>e; d--) {
			if (d%5==0) {
			System.out.print(d+",");
			}
		} */
			
		
		/* 응용문제 
		 다음 결과 값을 확인 후 코드를 제작하여 출력하시오
		 결과값 : 11,22,33,44,55,66,77,88,99,
		 */
		
		
		int aa;
		int bb = 11;
		int cc;
		
		for(aa=1; aa<10; aa++) {
			cc = aa*bb;  // x = (10*z)+z; 도 맞다.
			System.out.print(cc+",");
		}
		
		/* 반복문
		  for 
		  
		  while
		  
		  do ~ while
		  
		  foreach
		  
		  each
		  
		  map
		  
		  for ~ in
		  */
		
		
		
		
		
		
		
		
		
				
		
	} //end of main

}
