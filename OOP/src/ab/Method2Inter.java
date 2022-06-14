package ab;
//interface의 원래 기능은 메서드만 선언, 추가로 연산을 처리하는 형태의 default가 추가 됨. (java 14에서 추가됨)
public interface Method2Inter {
	
	// interface에는 필드를 바로 못올린다 이유 : abstract은 클래스고 interface는 method라서 필드 선언을 못함
	public String names(); //String names() return 메서드 선언
	
	default void  setbox(String a) { //setter 
		System.out.println(a);
	}
	default String box3() { //getter 
		//interface에는 default를 선언하면 연산 메소드를 사용함.
		
		return null;
	}
}

interface Method2re extends Method2Inter { 
	//interface에 extends로 조상 interface를 로드할 수 있다.
	
}

interface Meothod2rere extends Method2re {
	// interface 무한 확장 
}
