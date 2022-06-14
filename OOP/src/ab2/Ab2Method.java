package ab2;

import ab.Method1; //public이라고 적어야 패키지가 다른 클래스의 메소드를 가져올 수 있다
//package ab에서 main 클래스를 로드함 

public class Ab2Method extends ab.Method1 { //public class는 한 화면에 한번만 적을 수 있다.
											// package ab2에서 import할수 있도록 하며, 외부클래스에도 동일하게 가져오게 함.

	public static void main(String[] args) {
		//main class를 오버라이딩 했다.
		
		ab.Method1 at = new ab.Method1();
		at.main(args); // main method 실행
		at.recall();	// public 메소드 실행
		at.name();
	}

}
