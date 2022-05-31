import java.util.Arrays;

public class Array5_1 {

	public static void main(String[] args) {
		
		//빈 배열 변수에 데이터가 있는 배열로 커스텀 방법
		
		int a[] = new int[2];// 세개의 공간만 제공함.
		int b[] = {1,2,3,4,5,6,7}; //7개의 객체가 있는 상황.
		int ea = b.length; //b배열안에 몇개의 데이터 객체가 들어있는지 확인한다.
		int a_ea = a.length;
		int ct = 0;
		
		for(int i = 0; i<ea; i++) { // 배열은 0부터 변수 시작.돌리는 횟수는 ea보다 하나 작게 한다.
			if(b[i]%2 == 0 && ct < a_ea) { // if(b배열의 값중 짝수만 && 새로운 a배열의 전체 객체크기만큼만)
				a[ct] = b[i];
				ct++; // 조건만 맞을 시, 인덱스 번호를 +1씩 증가시킴.
			}
		}
		
		System.out.println(Arrays.toString(a)); //배열 출력하는 문법 (int,String 다 가능)
		
		/*빈 공간에 있는 갯수, 원래 배열 갯수도 알아야한다. 
		 * 큰 for문으로 원래 배열 갯수 파악 -> */

	}

}
