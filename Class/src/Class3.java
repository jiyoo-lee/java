public class Class3 {

	public static void main(String[] args) {
		
		Apink m = new Apink();
		m.f_method("이보미");
		
		Apink.Cafe LA = m. new Cafe();
		LA.call();

	}
}
//추상 class (abstract을 사용하면 추상)
abstract class Father {
	
	public String u_name; //abstract 없으므로 전역변수 선언
	public abstract void f_method(String name); //추상 메소드
	
}

class Apink extends Father {
	
	@Override
	public void f_method(String name) { //추상 메소드를 실제 메소드로 전환 
		this.u_name = name; //추상메소드에 있는 전역변수로 값을 이관함
	}
	
	class Cafe {
		String msg = Apink.this.u_name; // 부모 클래스에 있는 전역변수를 자식 클래스 전역변수로 이관 
		
		public void call() {
			String msg2 = this.msg + "님 짱!";
			System.out.println(msg2);
		}
		
	}
	
}
