
public class Oop4 {
	//추상 클래스 및 메소드 abstract
	public static void main(String[] args) {
		
		ab_2 ab = new ab_2();
		System.out.println(ab.b());
		ab.ab_a();
		ab.ab_C();
	}

}

//추상 클래스(고스트) : 외부에서 로드가 절대 안됨, 자세 실행이 안됨, 쓰는 이유는 코드 수정에 용이하며 abstract만 봐도 코드 이해를 빨리 할수잇따.
abstract class Ab1{ //추상화 클래스는 메인에 직접 호출을 못함. ghost 실체가 없는것 쓰는이유: 코드를 정형화 / 사용시 클래스명이 같은 이름을 써야함.
	
	public int c;
	public void ab_a() {
		System.out.println("부모 클래스입니다.");//환경설정할때 미리 쓴다.
		this.c = 123456;
	}
	
	public abstract int b(); // {}가 안들어간다. 추상메소드 눈에 보이진x 존재는 함. 자체 실행 안됨 얘도 추상 메소드 free 구성, 무조건 자식 클래스에 사용
	
	public void ab_C() {
		// free용도로 사용 할 수도 있다. (오버라이딩해서 자식메소드에서 활동하는 방식) -> 사용해도 되고 안해도 되고 {}의 유무 차이
	}
	
	public void ab_C(int a) {
		//free인데 인수값을 받는 메소드
	} //abstract에 있는 메소드는 다 가져와서 써야한다.
	
}


class ab_2 extends Ab1{
	/* */
	
	@Override
	public int b() { //메소드 이름이 똑같음 but 실제 메소드(추상 메소드를 오버라이딩 한것)	
		return 55;
	}
	
	@Override
	public void ab_C(int a) {
	}
	
	@Override
	public void ab_a() {
		System.out.println(this.c);
	}

}