
public class Array1 {

	public static void main(String[] args) {
		/* 응용문제 : 해당 사용자 리스트 배열이 있습니다.
		 * 해당 배열값 중 사용자 아이디 3단어 이상만 출력하시오.*/
		/*응용문제 : 배열 : hong kim park lee jang jung*/
		
		String id [] = {"hong","kim","park","lee","jang","jung"};
		
		int word;
		int arrayLength = id.length;
		for(int i =0; i<arrayLength; i++) {
			word = id[i].length();
			if(word > 3) {
				System.out.println(id[i]);
			}
		}
		

	}

}
