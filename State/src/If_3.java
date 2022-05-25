
public class If_3 {

	public static void main(String[] args) {

		boolean ck = true; // 회원가입시 체크박스 같은 곳에 많이 쓰임
		// true 와 false로 구분하게 된다.

		if (ck == true) {
			System.out.println("회원가입이 진행 됩니다.");
		} else {
			System.out.println("이용약관에 동의하셔야만 진행 됩니다.");
		}
		
		String id, password; 
		id = "lee";
		password = "a1234";
		
		//&& : and 의 의미. 한 가지 조건 이상에서 모두 맞을 경우
		// || : or 의 의미. 한 가지 조건 이상에서 한 개라도 충족 할 경우
		
		if(id=="park" && password=="a1234") { 
			System.out.println("로그인하셨습니다.");			
		}
		else {
			System.out.println("아이디 및 패스워드를 확인하세요.");
		}
		
		
		if(id=="park"|| id=="lee") {
			//if(id=="park"|| password=="a1234") ->작동은 되지만 모두 맞아야할 두 조건 중에 한가지라도 맞아 실행된 경우(error)
			System.out.println("회원이 확인 되었습니다.");
		}
		else {
			System.out.println("확인된 아이디가 없습니다.");
		}
		
		
	}
}
