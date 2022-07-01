//Thread는 메인 class에서 사용하지 않음 class(extends), interface(implements) 
// main에서 사용하고싶으면 내부 클래스를 만들면된다.
public class Thread1 {

	public static void main(String[] args) {
		
		//순차적 결과, 단독처리시
		classBox cb = new classBox();
		for(int i = 0; i < 10; i++) {
			//cb.run("클래스 처리현황 : " + i);
		}
		
		
		// 다형성, 한번에 처리 할시
		cpuBox cp = null; 
		
		for(int i = 0; i < 10; i++) {
			cp =	new cpuBox("Thread 처리현황 : "+i);
			//cp.start(); //run 대신 start
		}
		
		/*Thread를 이용하여 강제 예외처리 방식 문제가 발생하더라도 해당 문제가 발생한 쓰레드만 예외처리 그외 사항은 모두 처리하는 예시*/
		callBox bb = null;
		
		String msg = "";
		String msg2 = "";
		for(int i = 0; i < 10; i++ ) {
			if(i == 5) {
				 msg2 = "5";
			}
			else {
				 msg2 = "";
			}
			bb = new callBox(msg+msg2); //nullnull
			bb.start();
		}
	}
}


class callBox extends Thread {
	
	String callname = null;
	
	public callBox(String z) {
		this.callname = z;
	}
	
	@Override
	public void run() {
		
		try {
			
			if(this.callname.length() > 0) {
				throw new Exception();
			}
			else {
				System.out.println(this.callname.length());
			}
			
		}catch(Exception e) {
			System.out.println("해당 값중 잘못된 값이 발생하였습니다.");
		}
	}
	
}

class cpuBox extends Thread {
	String name = null;
	
	public cpuBox (String a) {
		this.name = a;
	}

	@Override
	public void run() { //파라미터를 받을 수 없다.
		System.out.println(this.name);
	}
	
	//Thread의 오버라이드 method run은 파라미터 값을 가질 수 없고 생성자를 통해서 this로 넘겨서만 구현해야한다. 
	
}

class classBox {
	
	public void run (String name) {
		System.out.println(name);
	}
	
	
}