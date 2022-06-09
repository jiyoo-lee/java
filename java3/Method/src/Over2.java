
public class Over2 extends main2{ //두개 상속을 못받는다. main2에 main3을 상속 받게 한 뒤 메인으로 로드

	public static void main(String[] args) {
	//상속방식
		Over2 ov = new Over2();
		ov.abc();
		ov.abc2();

	}
}

class main2 extends main3 {
	public void abc() {
		System.out.println("외부 메소드 클래스");
	}
}

class main3 {
	public void abc2() {
		System.out.println("외부 메소드 클래스2");
	}
}