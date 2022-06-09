
public class Method14 { //필드의 다형성

	public static void main(String[] args) {
		Mbc m = new Mbc();
		Mbc m2 = new Mbc("이순신");
		
		

	}

}

class Mbc {
	public Mbc() { //인수값 없이 실행시킴, 일반 constructor
		System.out.println("구조1");
		test();
	}
	
	public Mbc(String user) { //인수값 있는 실행 , 인수 값이 있는 constructor 인수값은 자료형으로 구분되어집니다.
		System.out.println(user);
		test(user);
	}
	public void test() { //인수값이 없는 method
		System.out.println("메소드");
		total();
	}
	public void test(String user) { //인수값이 있는 method
		System.out.println(user);
		total();
	}
	public static void total() {
		System.out.println("시스템 종료");
	}
	
	
}
