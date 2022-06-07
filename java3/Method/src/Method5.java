
public class Method5 {

	public static void main(String[] args) {
		
		/*private this */
		
		cdb c = new cdb();
		
		/*c.d1 = "홍길동";
		c.data2();
		c.d3= "이순신";
		cdb.data1();
		c.d3= "유관순";
		System.out.println(c.data3()); */
		
		
		//c.d2 = "강감찬"; /*private으로 선언한 객체이므로 main class에서 로드 못함*/
		c.data2("강감찬");
		String result = c.data3();
		System.out.println(result);

	}

}
//내일 게터세터...........?라는걸 배움

class cdb {
	String d1; /* void, 자료형 메소드 로드 가능 */
	private String d2 = null; //한 클래스에서만 사용가능하며 static에서 사용 불가
	//
	public static String d3; // 둘다 static으로 메모리에 올라가있으면 sysout으로 보임. // 다 사용 가능
	// this 사용 불가능
	public static void data1() { /* static 자료형 외에는 로드가 불가능함 this도 안됨.*/
	//	System.out.println(d3);
		
	}
	public void data2(String user) {
		this.d2 = user;
		System.out.println(d2);
	}

	public String data3() {
		String a = this.d2;
		return a;
	}
	
}