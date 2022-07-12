package test6;

public class Exam1 {

	public static void main(String[] args) {
		
		/*[응용문제 1]

	다음 제시한 사항을 JAVA에 다형성을 기반으로 프로그램을 제작하시오.
	해당 추상 클래스명은 login 입니다.
	
	결과]
	홍길동님 환영합니다.
	이순신님 주문하신 내역이 없습니다.
	힌트) 자식 클래스는 2개 입니다.  extends*/
	
		Login l1 = new Exam2();
		Login l2 = new Exam3();
		String message1 = l1.receive("홍길동");
		String message2 = l2.receive("이순신");
		System.out.println(message1);
		System.out.println(message2);
		
	}
}
