package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class More {

	public static void main(String[] args) {
		/* ArrayList 2차 배열형태, 다차원도 포함*/

		String members [][] = new String [][] {
			{"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
			{"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"}
		};
		
		//2차원 배열 ArrayList로 변환법 
		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(members));
		//ArrayList 전화번호만 출력하는 법 
		int w = 0;
		
		while(w<list.size()) {
		System.out.println(list.get(w)[2]);
		w++;
		}
	}

}
