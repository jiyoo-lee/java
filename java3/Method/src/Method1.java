
public class Method1 {

	public static void main(String[] args) {
	
		tests t = new tests();
		t.a1++; // = 2
		t.a2++; // = 2
		t.name1();		
		
		t.b1 += "유관순"; // = 이순신유관순
		t.b2 += "유관순"; // = 홍길동유관순
		t.name2();
		
		tests tt = new tests();
		tt.a1++; // = 1
		tt.a2++; // = 3
		tt.name1();
		
		tt.b1 += "강감찬"; // = 이순신강감찬 (default 이순신은 남아있고 유관순은 지워지고 새로 강감찬으로 바뀐다.)
		tt.b2 += "강감찬"; // = 홍길동유관순강감찬 (기존 값에 더해짐)
		tt.name2();
				
	}
}


class tests {
	
	int a1 = 1; //(동적 변수) 
	// 새로운 객체 생성 및 클래스를 호출 시 1이라는 숫자를 다시 가지게됩니다.
	public static int a2 = 1; //(정적 변수)
	//새로운 객체 생성 및 클래스를 호출하더라도 1이라는 숫자가 아닌 메모리에 등록된 최종 값을 지속적으로 가지게 됩니다.
	//String도 같음 ex. public static String = "가"; 
	// 단점은 메모리가 계속 증가하기때문에 계속적으로 필요한 상황에만 쓰인다.
	
	String b1 = "이순신";
	public static String b2 = "홍길동";
	
	public void name1() {
//		System.out.println(a1);
//		System.out.println(a2);
		
	}
	public void name2() { 
		System.out.println(b1);
		System.out.println(b2);
		
	}
	
	
}