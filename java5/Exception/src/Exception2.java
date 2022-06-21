
public class Exception2 {

	public static void main(String[] args) {
		
		
	try {
		//test(); : 메소드 호출 자체 에러(static으로 불러야해서..error exception과 관련 없음)
		
		Exception2 ex = new Exception2();
		String a = "홍길동2";
		ex.test(a);
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void test(String b) throws Exception { //throws exception : 예외처리 -> try&catch
		//throws는 main메소드에서 예외처리 없이 해당 메소드를 호출 할 경우를 막기위해서 사용
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c =new Exception();
		throw c; // 코드 가장 밑에 사용을 하며 throw = return과 비슷한 성격을 가지고 있다.
		//예외처리 결과에 대한 값을 main method로 다시 리턴시킴 
		//throw : 제작자가 직접 입력, 가장 밑에 써야한다. 
	}
}
