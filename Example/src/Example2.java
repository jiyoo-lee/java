import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		/* 응용문제 
		 * 배열 + 기본(클래스) 메소드 문제
		 * product : 수박 참외 사과 배 딸기 키위 바나나 망고
		 * 중 참외, 배,키위를 삭제했습니다.
		 * 해당 삭제 후 배열을 다시 재리스트 하는 코드를 작성
		 * 해당 처리사항은 별도의 메소드에서 처리가 되어야 하며 반복문은 free입니다.
		 * */
		
		String product [] = {"수박","참외","사과","배","딸기","키위","바나나","망고"};
		
		mins(product);
		

	}
	
	
	public static void mins (String store[]) {
		int no = 5;
		String [] newProduct = new String [no];
		int idx = 0;
		for(String p : store) {
			if(!p.equals("참외") && !p.equals("배") && !p.equals("키위")) {
				newProduct[idx] = p; 
				idx++;
			}
			
		}
			System.out.println(Arrays.toString(newProduct));
		
		
	}

}
