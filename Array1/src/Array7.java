import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		
/* 1차배열인데 2줄 */
		
		/*응용문제 : 해당 사용자 정보 데이터 및 각 레벨 별 데이터도 함께 제공됩니다.
		 * 그 중 레벨 데이터 값에 3미만(미포함)의 값만 확인하여 배열 데이터를 재가공합니다.
		 * 배열값 : ["강감찬,"세정대왕","유관순","김유신"]
		 */
		
		String users[] = {"홍길동","이순신","강감찬","세종대왕","유관순","김유신"};
		int levels[] = {4,3,1,1,2,2}; //조건 기준 
		String members[] = new String[4]; //미리 생성하고 시작하자
		int levels_ea = levels.length;
		int ct = 0; 
		
		for(int i =0; i<levels_ea; i++) {
			// System.out.println(levels[i]); -> 반복문 시작하고 배열 값 나오는지 확인.
			if(levels[i] < 3) {
				members[ct] = users[i];
				ct++; //조건이 맞으면!!!!! 배열 인덱스 번호를 증가시켜주렴
			}
		}
		System.out.println(Arrays.toString(members));

	}

}
