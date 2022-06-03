import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*응용문제 :
		 * 반복문 하나만 돌리삼
		 * 2차배열이며, 데이터는 다음과 같습니다.
		 * user_list : 홍길동, 이순신, 강감찬, 유관순, 세종대왕, 김유신, 계백장군
		 * point :3000 1000 25000 19800 5750 3630 0
		 * 프로그램 실행과 동시에, point를 검색 할 고객명을 입력하세요라고 구현하세요
		 * 입력한 값은 별도의 class를 제작하여 해당 메소드 값으로 매개 변수를 이용하여 전달 후 해당 결과값을 출력하세요
		 * */
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("포인트 조회를 진행 할 고객명을 입력하세요.");
		String user = sc.next();
		
		search sh = new search();
		sh.point(user);
		
		sc.close();
		sh = null;

	}
	
}
class search {

public void point (String us) {
	String members [][] = { 
							{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"},
							{"3000","1000","25000","19800","5750","3630","0"}
							};
	
	for(int i = 0; i<members.length; i++) {
		for(int j = 0; j<members[0].length; j++) {
			if(members[i][j].equals(us)) {
				System.out.println("포인트 :"+members[1][j]);
			}
		}
	}
	
	
	
}


}