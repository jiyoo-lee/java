
public class Over {

	public static void main(String[] args) {
		// 오버라이딩 오버로드
		
		//Pt p = new Pt(); // 객체생성
		//p.display();
		Cd c = new Cd();
		c.display("메인 내용 값 출력"); // 오버로딩이 되었다. 왜? Pt로 선언을 했는데 밑에 Cd로 다른 인수값으로 같은 메소드를 구분했으니까.
		c.display(); // 오버라이드
		
	}

}

/* 
 오버라이딩(override) : 부모 클래스에서 상속 받은 기존 메소드를 사용하는 것을 말합니다. 
 오버로딩(overloading) : 부모 클래스에서 없는 새로운 메소드를 정의하는 것을 말합니다.
  */
class Pt {
	public void display(){
		System.out.println("부모 외부 내용 값");
	}
	public void aaaa() { // 만들어주면 에러 해결 [2]
	}
}

// 오버로딩 설명
class Cd extends Pt { //상속
	// aaaa() method는 부모클래스에 선언하지않아 처음엔 에노테이션을 사용못함 [0]
	@Override // 부모 클래스에 없는 메소드는 오버라이드를 못함.[1]
	public void aaaa() {
		System.out.println("자식에 만들어진 메소드");
	}
	
	
	@Override //에노테이션 (표시) 문제 발생시 확인하는 작업에 필요(오버라이드에만 적용)
	public void display() { // 오버라이드
		System.out.println("자식 클래스값으로 변경?");
		super.display(); // 부모에 있는 고유 속성 method 값을 가져 올때 사용함. 부모에 그 속성이 있는지 없는지 확인.
	}
	
	public void display(String msg) { //오버로딩이 되는 것
		System.out.println(msg);
	}
}