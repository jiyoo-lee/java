import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		/* 응용문제 : 
		 * 배열 생성 + 기본(클래스) 메소드 문제
		 * 사용자가 다음 질문에 값을 입력하게 됩니다.
		 * "학급 학생 이름을 입력해주세요"
		 * 총 배열 데이터는 5개가 생성 되어집니다. (스캐너 5개)
		 * 별도의 메소드에서 해당 사용자가 입력한 값을 배열로 구성하여
		 * 출력하시오.
		 * 예시 : 사용자가 입력한 결과 : [ hong, kim , park, lee, choi ]
		 * */
		
		/* 바뀐 내용 : 배열값 말고 누적되게 나오게 하세요*/
		
		Scanner sc = new Scanner(System.in);
		String lists = "";
		
		for(int i =0; i <=4; i++) {
		System.out.println("학급 학생 이름을 입력해주세요.");
		String search = sc.next();
		lists += (search+"");
		}
		
		arrays(lists);
		
		sc.close();
	}
	
	public static void arrays(String listUp) {
		
	 String userin [] = listUp.split(" "); //split : 문자열 또는 숫자열을 특정 문자 기준으로 배열을 만들 수 있는 명령어입니다.
	 System.out.println(Arrays.toString(userin));
	}
	

}
