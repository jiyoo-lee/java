
public class Class7 {

	public static void main(String[] args) {

		/*
		 * 클래스의 기본 메소드 객체 필드값 전달
		 * 
		 * 
		 */
		String mid = "hong";
	    String mname = "홍길동";
				
		java1 jv1 = new java1(mid,mname); // 객체생성 및 인스턴스만 실행하면 메인에 바로 작동함.
		
	}

}

class java1 {
	//java1 class를 main에서 객체생성 및 인스턴스를 실행하면 바로 작동하는 클래스 기본 메소드입니다.
	public java1(String a, String b) { // 기본 메소드만 적으면 클래스명과 같게 적어야한다. class에 기본으로 사용하는 메소드. 한번밖에 사용하지 못한다.
		//기본이 되는 정보같은거 처리할때 많이 쓰는 기본 메소드.
		System.out.println(a+b);
		java2(); // 같은 클래스 안에서 기본 메소드안에서 바로 실행시킬 수 있음.
		// void method를 바로 호출 할 수 있습니다.
	}

	public void java2() {
		System.out.println("test");
	}
	
	
}