package swing1;

public class Swing1 {

	public static void main(String[] args) {
		//래퍼클래스(wrapper class) : box상태 
		//float, char, byte, long , short (기본type) 
		//Byte, Integer, Long, Double, Char etc... -> 래퍼 클래스의 하나의 형태
		// Integer b = new Integer(20) -> 박스상태(==과 같은 연산자로 계산불가) 
		//int a = new Integer(20) : 언박싱상태(계산이 가능)
		
		Integer a = 20;
		Integer b = new Integer(20); // : 래퍼클래스로 생성해서 값을 더할땐 equals 써서 조건을 주어야한다.
		if(a.equals(b)) { //
			System.out.println(a + b);
		}
		
		Integer no1 = 10; //unboxing 
		Integer no = new Integer(99); //boxing
		int aa = no; //unboxing(자동)
		Integer bb = no.intValue(); //박싱상태에 있는 숫자값을 가져와라 하는 문법 
		System.out.println(bb);
	
		/*박싱(Integer)과 박싱을 비교할때는 equals를 사용해야만 이루어짐 */
	}

}
