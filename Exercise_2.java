import java.util.Arrays;

public class Exercise_2 {

	public static void main(String[] args) {
		/*  응용문제: 다음 배열값이 있습니다.
		 * 해당배열값을 비교하여 사용자 정보를 출력하시오.
		 * Adata [ hong kim park jang lee soun
		 * Bdata 80,100, 46, 38, 65, 88
		 * 결과배열에 따른 조건은 60점이상(포함) 중 합격자만 출력합니다.
		   result = hong kim lee soun */
		
		String [] users = {"hong", "kim", "park", "jang", "lee", "soun" }; 
		int[] scores = {80, 100, 46, 38, 65, 88};
		
		// scores 배열을 돈다.
		// 60점 이상인지 체크해서 이상이 몇 개인지 센다
		// 그 갯수 크기만한 배열 생성
		// 그 배열에 넣는다.
		int ct = 0;
		
		for(int i =0; i<scores.length; i++) {
			if(scores[i] >= 60) {
				ct++;
			}
		}
		
		int j = 0;
		String [] newUsers = new String[ct]; 
		for(int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				newUsers[j] = users[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(newUsers));
	}

}
