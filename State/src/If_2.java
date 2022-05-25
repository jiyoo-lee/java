
public class If_2 {

	public static void main(String[] args) {

		String mid1 = "hong"; // 공백과 대소문자도 인식함
		String mid2 = "kim";
		String mpass = "a123456"; 
		
		/* 해당조건문은 문자로 확인하는 조건 형태이며 else문 적용하는 부분 =else if가 없다. */

		// 변수도 문자형태면 조건도 문자형태로
		if (mid1 == "hong") {
			System.out.println("환영합니다.");
		} else if (mid1 == "park") { // 추가로 비교대상이 있을 경우
			System.out.println("환영합니다.");
		} else {
			System.out.println("가입되지 않은 사용자입니다.");
		}
		
		/*아이디 및 패스워드를 모두 검토하는 더블 조건문*/
		
		if(mid2=="kim") { //큰 if문
			
			
			if(mpass=="a123456") { //작은 if문
				System.out.println("로그인하셨습니다.");
			}
			else {
				System.out.println("패스워드가 틀립니다.");
			} //작은if문 끝
			
		}
		else {
			System.out.println("가입되지 않은 사용자 입니다.");
		} //큰 if문 끝
		
		
		

	}
}