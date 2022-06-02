
public class Class5 {

	public static void main(String[] args) {
	
		member2.lists2(); //static은 바로 메모리에 올리는것
		member2 mb2 = new member2(); // static이 없는 함수이므로 객체 및 인스턴스를 생성 해야 실행할수있음
		mb2.lists(); // 인스턴스(메모리)에 있는 메소드를 로드하게 됨.
		
		
		member2.lists3("유관순",12345);
		/* 응용문제 for_in이라는 일반 메소드(메모리)가 있습니다.
		 * 프로그램 실행시 다음과 같이 질문을 합니다.
		 * "사용하실 구구단 숫자를 하나 입력해주세요:"
		 * [결과] - 해당 메소드에서 결과를 출력해야함. */
		 // 만약 사용자가 3단을 입력시 3 * 1 = 3 ...3 * 9 =27 출력되어야함
		
		
	}

}

class member2{
	public void lists() { //메모리에 할당 하지않는 메소드 함수 (추후에 객체와 인스턴스 생성해서 쓸 수있는 메소드)
		String a = "홍길동";
		System.out.println(a);
		
	}
	
	public static void lists2() { //메모리에 올려놓고 쓰는 메소드
		String a = "이순신";
		System.out.println(a);
		
	}
	
	public static void lists3(String nm, int pw) { 
		//nm을 메소드에서 전달 받는 값을 바로 사용 할 경우 (nm.equal("유관순"))
		int user_pw = pw; 
		//메소드에 객체값을 첨부하여 로드 후 메소드 안에 별도의 필드명을 이용하여 전달 받는 형식.

		if(nm.equals("유관순") && pw==123456) {
			System.out.println("회원 확인이 되었습니다.");
		}
		else {
			System.out.println("등록되지 않은 회원입니다.");
		}
		
	
			
	}
	
}
