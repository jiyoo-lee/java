
public class For1 {

	public static void main(String[] args) {
		// 반복문 : 데이터를 일괄적으로 입력, 출력 할 수 있도록 하는 문법		
		//for(초기값; 범위값; 증감식) a++ -> 1씩 계산 후 증가 / ++a -> 증가한 후 계산

		//int z = 1;
		//++z;
		
		//z++; 출력 후 +1 증가 
		//z--; 
		
		//++z; +1 증가 후 출력
		//--z;
		
		//System.out.println(z);
		
		for(int a = 0; a < 10; ++a) {
			//System.out.println(a);
		}
		
		int b; //변수 DB에 보관하기 위해서 따로 선언.
		for(b=5; b<=10; b++) {
			//System.out.println(b);
		}
		
		int c;
		for(c=10; c>3; c--) { //주의사항 c<3 으로 범위를 적으면 0~음수까지 전부 찍혀버리는 상황이 발생함. 조건식 기호 주의할것
			//System.out.println(c);
		}
		
		/* 응용문제 
		 20부터~27까지 출력하세요
		 */	
		int num;
		for(num=20; num<28; num++) {
		//System.out.println(num);
		}
		
		
		/* 응용문제
		 39~21까지 출력하세요 */
		int d;
		for(d=39; d>20; d--) {
			//System.out.print(d+","); 
		}
		
		
		// 범위값에 변수를 지정하는 방법 
		//1~10까지 숫자를 출력 
		int aa;
		int bb = 10; //종료값 범위값
		
		for(aa=1; aa<=bb; aa++) {
			//System.out.print(aa);
		}
		
		//응용문제 변수 2개를 이용하여 다음 데이터를 출력하시오 //
		// 55~4까지 출력합니다.
		int cc;
		int dd= 3;
		
		for(cc=55; cc>dd; cc--) {
		   //System.out.print(cc+",");
		}
		
		
		
		
		
		
		
		
	} // end of main

}
