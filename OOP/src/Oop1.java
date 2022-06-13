import java.util.Scanner;

public class Oop1 {

	public static void main(String[] args) {
		
		/* Object oriented program 마지막
		 * 재귀메소드 사용법 (사용예: 로그인) */
		// main은 많이 쓰지않고 대부분 클래스 호출을 사용해서 쓴다.
		//extends 에서는 재귀함수를 잘 쓰지않고 class안에서 돌게 하기 위해서 재귀함수를 많이 쓴다.
		
		OpMethod om = new OpMethod();

	}

}

/*재귀 Method : 메소드를 직접 또는 간접으로 호출하는 프로세서를 말합니다.
 반복문, 외부 클래스를 재실행 등 복잡한 문제를 쉽게 해결 하기 위해서 구현하는 메소드 형태를 말함. */

class OpMethod {  
	//클래스 안에서 값을 넘길땐 인수값을 넣지않고 호출만 해도 돌아다닌다. 추가로 값을 받아서 처리하는 경우도 있음
	
	Scanner sc = new Scanner(System.in); // 필드에 미리 생성하면 반복적으로 메모리에 쌓이지않고 최소화 할 수 있다. (awt할때도 필드에 panel이나 등등을 만들수 있음.)
	private String name;
	
	public OpMethod() { //생성자
		this.m1();
	}
	
	public void m1() { // 스캐너를 필드에 올려놓으면 두 메소드에 사용이 가능하다. /메소드 m1작동
		System.out.println("찾을 이름을 입력하세요.");
		this.name = sc.next();
		this.m2(); //값을 호출하지않고 m2로 넘길 수 있음.
	}
	
	public void m2() { //m1에 대한 결과값을 m2가 확인
		
		if(this.name.equals("홍길동")) {
			System.out.println("시스템을 종료합니다.");
			sc.close();
			System.exit(0);
			}
		else {
			System.out.println("해당 이름은 없습니다.");
			this.m1(); //조건이 맞지않으면 다시 m1으로 실행시킴. = 재귀method
		}
	}
	
}