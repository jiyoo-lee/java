
public class Example3 {

	public static void main(String[] args) {
		
		Inherit2 ih2 = new Inherit2(); // 자식 클래스를 부르면 자동으로 부모 클래스도 불러진다.
		ih2.it("홍길동", "aaa5");
		ih2.print();
	}

}

// 클래스 -> 필드 -> 메소드 순서로 실행된다.

class Inherit1 { //데이터를 받는 역할
	private String nm; //Inherit1 클래스에서만 쓸 수 있는 메소드
	protected String pw; //외부에서 값을 조종 할 수는 없지만 상속되어진 메소드끼리는 값을 넘겨주고 받을 수 있음.
	public String aa; 
	//↑ private으로 받은 부분을 Inherit2에서도 사용할 수 있도록 하기 위함
	
	public void it(String d1, String d2) {
		this.nm = d1;
		this.pw = d2;
		this.aa = this.nm; //private 값을 넘겨주고싶으면 public에 담았다가 출력해야한다.
	}
}

class Inherit2 extends Inherit1 { //데이터 출력 하는 역할
	
	public void print() {
		System.out.println(this.aa +" "+ this.pw);		
	}
}
