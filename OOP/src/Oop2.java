import java.util.Arrays;

public class Oop2 {

	public static void main(String[] args) {
		/* 배열 신규생성 값을 정확하게 설정하여 신규배열로 생성하는 Object */
	
		Array1 arr = new Array1();
	}
}

class Array1 {
	private int ar1[];
	private int ea;
	
	public Array1(){
		//배열을 필드에 있는 변수 선언으로 처리하는 방식(this)
		 this.ar1 = new int[] {1,2,3,4,5,6,7,10,19,8,4,7,0,2}; // 굳이 이렇게 해도 된다
		 this.ea = this.ar1.length; // 배열 갯수 파악
		 
		//5이상 배열값만 가져오기//
		int w = 0;
		String newData = ""; 
		
		while(w < ea) {
			
			if(this.ar1[w] >= 5) {
				//System.out.println(this.ar1[w]);
				newData += this.ar1[w] + ",";  //해당 조건에 맞는 값만 문자열로 변환하여 배열값과 구분을 위해+ ","로 더해주기
				}
			w++;
		}
		
	// 새로운 배열의 길이를 구하는 코드	
	String ar2[] = newData.split(","); //String에 더한 것들을 ,를 기준으로 배열에 임시로 넣는다.
	// split는 절대 숫자는 안됨. 
	int ar2Ea = ar2.length; // 배열의 길이를 구하는 변수선언
	int oridata[] = new int[ar2Ea]; // 문자 배열 길이만큼의 배열 생성자 값을 추가하게 됩니다. 
	
	int ww = 0;
		while(ww <ar2Ea) {
			oridata[ww] = Integer.parseInt(ar2[ww]); 
			// 문자를 숫자로 변환하여 신규 배열 생성자에 값을 저장
			ww++;
			}
		
		System.out.println(Arrays.toString(oridata)); //결과 배열 출력
	}
	
}