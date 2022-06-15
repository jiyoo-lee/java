package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class List1 {

	public static void main(String[] args) {
		
		//add(추가), get(데이터 로드), remove(삭제), size(인덱스 갯수) : ArrayList 라는 utility 메소드에서 사용하는 부분
		String[] member = {"이순신","홍길동","강감찬","유관순"};
		// 중요: add는 일반적으로 무조건 가장 뒤에 데이터가 추가됨. 단, index 번호를 적용 후 값을 실행하면 해당 인덱스부분에 추가가 됩니다.
		
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member)); //ArrayasList : 블럭을 로드할 배열 변수를 적용
		//System.out.println(mb);
		int ea = mb.size(); //배열 안의 인덱스 갯수
		//System.out.println(ea+"개");
		mb.add("김유신"); //배열값 추가하는 법 
		//System.out.println(mb);
		mb.remove(1); // 배열 인덱스 1번 값 삭제 && 삭제로 인해 인덱스 번호도 바뀜 
		//System.out.println(mb);
		mb.add(3,"세종대왕"); //배열 인덱스 위치 선정 && 배열값 추가 
		//System.out.println(mb);
		String checks = mb.get(2); //원하는 인덱스 번호 가져오기 
		//System.out.println(checks);
	
		/* 응용문제 
		 * 전 배열: int[] numbers = {15,22,37,8,11,19,41};
		 * 후 배열: int[] numbers = {7,15,22,8,11,39,41};
		 * */
		
		/*ArraysList에는 int를 사용하지 않고 Integer를 사용함.*/
		Integer[] numbers = {15,22,37,8,11,19,41};
		
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(numbers));
		num.remove(2);
		num.remove(4); //인덱스 번호가 삭제할때마다 바뀌니까 확인 하면서 풀기 
		num.add(0,7);
		num.add(5,39);
		System.out.println(num);
		
	}
}