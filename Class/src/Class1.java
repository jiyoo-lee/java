
/*부모클래스 및 자식(내부) 클래스 연동*/
public class Class1 {

	public static void main(String[] args) {
	
	// 부모가 인스턴스에 적용이 되지않으면 자식 class는 절대 호출하지 못한다.
	Parents p = new Parents();
	p.p_box();
	Parents.Child pc = p.new Child(); // 클래스 안에 클래스를 새로 로드하려면 이런식으로 해야한다.
	// 조상class.자식class 자식클래스이름생성 = 조상클래스명(사전에 조상클래스를 미리 불러야함). new . 자식클래스명(); (인스턴스에 적용)
	pc.c_box();
	
	}

}

class Parents { // 조상 클래스
	String a = "홍길동"; // 부모 필드에 있는 전역 변수 다른 메소드에서 사용할때는 this를 사용한다. 
	String bc;
	
	class Child { //자손 클래스 -> 숨길 수 있어서 보안에 좋다.
		int a = 20; //(멤버) // 자식 클래스의 전역변수 부모클래스 입장에서는 지역변수로 봄.
		
		public void c_box() { // 자식 method(멤버)
			double c = 10.5;
			//System.out.println(c);		
			
			//자식클래스 메소드에 서로 같은 명의 부모 클래스 멤버변수를 출력해보기
			//System.out.println(Parents.this.a); // 정확하게 조상 클래스의 변수라고 지정해주어야 출력이 가능하다 그냥 this로 입력시 자손 클래스 변수 출력됨 
			// 만약, child 클래스에 a가 없다면 그냥 a로 출력할 수 있다. 
			//System.out.println(this.a); // 자식 클래스 전용 전역변수 
			//System.out.println(c); // 자식 메소드 전용 지역변수
			//System.out.println(Parents.this.bc);
		}
		
		class Gchild {
			String ab = "홍길동";
			
			public void d_box() {
				System.out.println(Parents.this.a);
			}
		}
	}
	
	public void p_box() { // 부모 method
		String a = "이순신"; // 지역변수 (메소드에만 사용하는 것) p_box에 있는 지역변수 선언 
		System.out.println(this.a); // 그냥 a라고 치면 이순신이라고 나오고 this.a 는 홍길동이 나온다. 필드 -> 전역변수 메소드안 -> 지역변수 
		//여기 지역 변수는 자손 클래스로 값을 옮기고싶다면 조상 클래스에 전역변수를 만들고 this.num = a; 이런식으로 넘긴 후 자식메소드에서 Parents.this.num 이런식으로 구현 
		this.bc = a;
	}
	
}