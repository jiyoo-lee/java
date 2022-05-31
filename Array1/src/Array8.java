import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/*2차원 배열 (그 이상은 다차원 배열)
		 * [][] 
		 * int a[] = new int[2]; 신규공간을 만들고 데이터를 입력하는 방식
		 * a[0] = 1;
		 * a[1] = 2; -> 정적배열
		 * 
		 * int b[] = {1,2,3,4};
		 * int[] c = {1,2,3,4};  -> 동적배열
		 * int [] d = new int [] {1,2,3,4}; : 공간을 잡지않고 자유자재로 데이터를 입력하는 방식
		 * */
		
		//********* String member2 [][] = new String[3][3]; // 정적 배열
		
		String member [][] = {
								{ "홍길동", "김유신", "유관순"} //항상 ,를 잊지말기
							,   { "25", "31", "22" }				
		}; // ->동적 배열 
		
		//System.out.println(member[1][2]); //일단 먼저 출력해본다.
		int f, ff;
		int data_ea = member[0].length; //선택을 잡아줘야 그 해당 배열의 객체 갯수가 나온다.
		int data = member.length; // 배열 갯수가 몇개 있는지를  확인
		
		
		 for(f=0; f<data; f++) { //큰 반복문은 배열 갯수만큼 루프
			for(ff=0; ff<data_ea; ff++) { // 작은 반복문은 배열에 있는 데이터 갯수만큼 루프가 돕니다.
				//System.out.println(member[f][ff]);
			}			
		}
		 
		 /* 2차원 배열 합계치 구하는 법 */
		 
		 int datas [][] = {
				 			{1,3,5},
				 			{2,4,6}			 
		 			};
		 
		 int fea = datas.length; // 배열이 몇줄인지 ->2줄 = 두번 돌린다 크게
		 int dea = datas[0].length; //첫번째 인덱스 배열의 객체 갯수 -> 각 줄의 배열의 갯수(보통 같으니 0 1 등등 인덱스 번호를 넣어준다.)
		 int sum = 0; 
		 int w, ww;
		 
		 for(w=0;w<fea; w++) { //큰 for문
			for(ww=0; ww<dea; ww++) { // 작은 for문
				// System.out.println(datas[w][ww]);  //배열을 확인
				sum += datas[w][ww];
			} //end of small for
		 } //end of big for
		 //System.out.println("총 합계: "+sum);
		 
		 
		 /* 응용문제 : 해당 데이터 배열에 있는 모든 값 중 짝수값만 모두 더하시오. */
		 
		 int score [][] = {
				 			{11,42,22,16},
				 			{7,33,10,29}				 			
		 				};
		 
		 int score_ea1 = score.length;
		 int score_ea2 = score[0].length;
		 int total = 0;
		 int i, ii;
		 
		 for(i=0; i<score_ea1; i++) {
			 for(ii=0; ii<score_ea2; ii++){
				 if(score[i][ii]%2 == 0)  {
					 total += score[i][ii];
				 }
			 }
		 }
		 System.out.println("결과값: "+total);
		 
		 
		 
		 
	}

}
