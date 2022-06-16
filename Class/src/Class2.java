
public class Class2 {

	public static void main(String[] args) {
		/* 응용문제 중첩 클래스를 이용하여 자식 클래스의 결과값을 출력하는 프로세서를 제작하시오.
		 * 클래스는 2가지가 있습니다. 
		 * 부모 클래스명 : mother 
		 * 자식 클래스명 : child
		 * 메인에서 mother 클래스로 값을 전달
		 * 값은 30, 50을 전달
		 * child에서 부모 클래스를 받아 두개의 숫자값을 곱해서 결과값을 출력하삼 
		 *  */

		Mother m = new Mother();
		m.numbers(30, 50);
		Mother.Child c = m.new Child();
		System.out.println("결과값 :" + c.results());
		
	}
}

class Mother {
	int a;
	int b;
	
	public void numbers (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	class Child {
		int sum = 1;
		
		public int results( ) {
			sum = Mother.this.b * Mother.this.a;
			
			return sum;
		}
	}
}