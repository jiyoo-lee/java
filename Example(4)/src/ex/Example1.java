package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Example1 {

	public static void main(String[] args) {
		
		/*외부 class를 사용하여 문제를 푸시오.
		 * Arraylist, LinkedList 자기마음
		 * 다음 2개의 배열 데이터가 있습니다. 단, 2ㅐ긩 배열을 하나의 배열로 합치도록합니다.
		 * 그 대신 중복 된 값은 하나로 처리를 하셔야합니다.
		 * 1번 db : 11,22,33,44,55
		 * 2번 db : 8,10,11,19,44
		 * 
		 * 결과 : 8,10,11,19,22,33,44,55
		 * 
		 * 1. 1번db 2번db 비교 및 중복값 삭제
		 * 2. 2번db를 1번 db에 추가 
		 * 3. 1번 db를 sort를 이용해서 정렬  
		 * */
		
		Arrays a = new Arrays();
		a.numbers();
		
	}
}

class Arrays {
	
	ArrayList<Integer> list1 = null;
	ArrayList<Integer> list2 = null;
	private Integer[] c = new Integer[] {11,22,33,44,55};
	private Integer[] d = new Integer[] {8,10,11,19,44};
	
	public void numbers () {
		
		this.list1 = new ArrayList<>(java.util.Arrays.asList(this.c));
		this.list2 = new ArrayList<>(java.util.Arrays.asList(this.d));
		
		// 값 합치기
		list1.addAll(list2);
		
		//중복제거
		HashSet<Integer> f = new HashSet<Integer>(list1);
		list1 = new ArrayList<Integer>(f);
		
	
		//정렬
		Collections.sort(list1);
		System.out.println(list1);
		
	}
}