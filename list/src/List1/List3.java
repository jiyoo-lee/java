package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List3 {

	public static void main(String[] args) {
		/* 응용문제 : 배열 결합 
		 * 넘버 데이터1: 3,6,9,12,15
		 * 넘버 데이터2: 2,4
		 * 
		 * 결과: 3,6,9,12,15,2,4
		 *  */
		
		Integer[] num1 = {3,6,9,12,15};
		Integer[] num2 = {2,4};
		
		ArrayList<Integer> nm1 = new ArrayList<>(Arrays.asList(num1));
		ArrayList<Integer> nm2 = new ArrayList<>(Arrays.asList(num2));

		int ea = nm2.size(); 
		
		for(int i = 0; i <ea; i++ ) {
			nm1.add(nm2.get(i)); // 가져와서 추가 
		}
		Collections.sort(nm1); //ArrayList 오름차순 정렬하는 법 //ArryaList, LinkedList sort 오름차순 정렬 
		System.out.println(nm1);
		
		int ea2 = nm1.size();
		System.out.println(ea2); //갯수확인 
		
		Integer c[] = num1;
		Arrays.sort(c); //본연의 배열일떄는 sort를 쓸수 있으나 ArrayList를 사용하면 sort를 사용할수 없다.
		//System.out.println(Arrays.toString(c));
		
		
	
	}
}
