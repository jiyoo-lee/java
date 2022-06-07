
public class Method2 {

	public static void main(String[] args) {
		/*  //default package 사용시 해당 class명을 호출 하면 됨.
		 * 단, pck로 묶여있을 경우 제일 상단에 pck를 선언해야 함.
		tests ts = new tests(); 
		// default는 바로 불러올 수 있고 다른 패키지로 묶여있으면 선언 후 로드 할 수 있다.
		// 
		ts.a2++;
		System.out.println(ts.a2); */
		
		info i = new info();
		//System.out.println(i.data1(20));
		//System.out.println(i.data2(20));
		
		/*success
		i.data3(20); */
		
		System.out.println(i.data3(20));
		
		String result = i.data4("홍길동"); 
		/*data4 method return 값을 result 변수로 받아서 처리 */
		System.out.println(result);
	}

}

class info {
	// static 또는 void method에는 return이라는 명령어를 사용하지 못함.

	public static int data1(int abc) {
		int z = abc + 20;
		//System.out.println(z);
		return z;
		
	}	
	public static int data2(int abc) {
		int z = abc + 20;
		//System.out.println(z);
		return z;
	}
	
	public int data3(int abc) {  
		/*자료형 메소드라고 말하면 무조건 return을 사용해야합니다.  
		단, sysout을 사용하지 못합니다.*/
		int z = abc + 20;
		return z; //자료형태의 return method
	}
	
	public String data4(String abc) {
		String z = abc + "님 환영합니다.";
		return z;
	}
	
	
}