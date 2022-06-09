//대형 프로젝트에서 쓴다.

/*
 * extends : 자식 class에서 하나의 부모만 로드
 * implements : 자식 class에서 여러개의 부모를 로드할 수 있음. 단, 에노테이션(@Override) 무조건 사용해야함.
 * */

public class Inter implements ime1,ime2 {
	//인터페이스는 선언을 무조건 해야한다.
	
	@Override
	public void c1() {
		System.out.println(names); //인수값을 넣지말고 호출만 한다.
		System.out.println("interface_1");	
	}
	@Override
	public void c2() {
		System.out.println("interface_2");	
	}
	public static void main(String[] args) {
		//인터페이스
		Inter it = new Inter();
		it.c1();
		it.c2();
	}
}
