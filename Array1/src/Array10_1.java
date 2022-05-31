import java.util.Arrays;

public class Array10_1 {

	public static void main(String[] args) {
		
		int data[][] = {
				{5,7,19,22,33,27,11},
				 {1,2,3,4,5,6,7}
		       };
		
		//Double loop
		//data[0][0] + data[1][0]
		//data[0][1] + data[1][1] -> 다섯바퀴를 크게 돌린다. 
		int ea = data[0].length; // 배열에 있는 데이터 객체 수
		int ea2 = data.length; // 배열그룹 수
		int total1 = 0; 
		int total2 = 0; // 각각의 값을 이관 받는 변수
		int newdata[] = new int[ea]; //새로운 배열 객체생성
		
		int w=0; // 큰 반복문 인덱스값
		while(w<ea) { // 큰 반복문 7바퀴 (배열데이터 객체수)
			
			int ww = 0;
			while(ww<ea2) { // 작은 반복문 2바퀴 (배열그룹)
				if(ww==0) {
					total1 = data[ww][w];
				}
				else {
					total2 = data[ww][w];
				}
				ww++;
			    }
			//작은 반복문 밖으로 나와서 첫번째 배열값 + 두번째 배열값
			newdata[w] = total1 + total2; //새로운 배열 객체로 등록
			
		w++;
		}
		
	}

}
