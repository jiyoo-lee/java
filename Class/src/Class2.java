public class Class2 {
			//package를 사용하지못함(default라서)
	public static void main(String[] args) {
		// 별도의 클래스 지정후 함수를 이용하여 값을 전달받기	
		//inject.oksign("홍길동"); // 가장 기본이 되는 함수 즉, static void를 사용시
		//inject.test();
		members.user("이순신"); // 괄호안에 있는 데이터 (인자값)
		members.cal(5, 10); //members class 안에 cal라는 일반함수에 5와 10 인자값을 던짐.
		
	}
}

class inject {
	// public static void :
	// public String 
	// public static void : 가장 기본이 되는 일반 함수를 뜻합니다. ->메소드 함수
	//어디든지 쓸수 있고 메인 클래스에서 새로 선언 없이 클래스명을 쓰고 바로 로드할수있다.
	public static void oksign(String adata) {
		String user = "홍길동";
		System.out.println(user);
	}
	public static void test( ) {
		int aa = 1;
		int bb = 3;
		int cc = aa + bb;
		System.out.println(cc);
	}
	
}

class members {
	public static void user (String names) {
		String msg = names + "님 환영합니다.";
		System.out.println(msg);
	}
	
	public static void cal(int a, int b) { // (자료형 이름, 자료형 이름) : 인자값 2개를 받음
		int c = a * b;
		System.out.println(c);
		
	}
		
}