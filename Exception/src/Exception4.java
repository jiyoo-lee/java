import java.io.IOException;

public class Exception4 {

	public static void main(String[] args)  {
		
		
		//SQLException : sql 접속시 사용하는 exception

		try {
		Ex e = new Ex();
		e.Exloader("34");
		
		//Exception aaa = new Exception(); 자기자신을 바로 예외사항으로 넘김  
		}
		catch(IOException bb) {
			
		}
		catch(Exception e) {
			System.out.println("입력값을 잘못줬는데?");
		}
		
	}
}

class Ex {
	Exception ep = null; // 필드에 선언해놓고 기다리기 
	IOException ep2 = null;
	
	public void Exloader(String a) throws Exception, IOException  { //throws try~catch를 받기 위한 class를 로드 
		
		/*잘못된 문법 사항 자신의 오류를 상위 메인 클래스에 모두 전달했기때문.(자기 클래스 안에서 해결해야함)*/
//		if(a.equals("hi")) {
//			System.out.println("정답입니다~~");
//		}
//		else {
//			int keycode = Integer.valueOf(0); // 값을 보낸건 정상적이지만 Exloader 메소드 자체적인 오류가 발생(?)
//			
//			//해당 문법은 자신의 오류사항에 대한 예외처리가 잘못된 경우.
//		this.ep2 = new IOException();
//		this.ep = new Exception(); // 선언해주기
//		//문제가 생기면 throw 하기 
//		throw this.ep;
//		
//		//throw : 자신을 호출하여 예외가 발생하면 자신을 호출한 class로 예외 사항을 return 해줌 
//		}
		
		try {
			if(a.equals("34")) {
				int keycode = Integer.valueOf(a);
				System.out.println(keycode);
			}
			else {
				System.out.println("정답과 다른 숫자입니다.");
			}
		}
		catch(Exception bc) { // 만약 값을 받는데에서 문제가 있다면 catch해라 
			
			//자신의 오류사항을 리턴 받아서 확인함
			System.out.println(ep.getMessage());
			this.ep = new Exception();  
			throw this.ep;
		}
	}
}
