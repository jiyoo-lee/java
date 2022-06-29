
public class Thread1 {

	public static void main(String[] args) {
		
		/* extends Thread */
		int w = 0;
		
		while(w < 6) {
		box b = new box(w);
		Thread t = new Thread(b); // cpu가 먼저 해석하는거에 따라 콘솔에 결과 값이 달라진다.
		t.start(); // thread는 start를 쓴다
		w++;
		}
		
		/* interface Runnable Thread */
		
		for(int i = 0; i < 10; i++) {
			//쓰레드메소드를 호출하여 해당 클래스에 CPU 한개를 할당합니다.
		box2 b2 = new box2(i);
		Thread t2 = new Thread(b2); // 쓰레드 선언(쓰레드로 작동시킬 클래스명)
		
		t2.start(); //run메소드를 작동시키기 위한 메소드
		}
	}
}

//extends 방식
class box extends Thread{
	
	int no = 0;
	
	public box (int a) { //생성자
		this.no = a;
	}
	
	@Override
	public void run() { //Thread의 기본 메소드 
		
		try {
			
		Thread.sleep(1000);
		
		switch(this.no) {
		
		case 1 :
			System.out.println("하이");
			break;
		case 2 : 
			System.out.println("바이");
			break;
		}
		
		}catch(Exception e) {
			
		}
		System.out.println("box = "+this.no);
	}
}

//thread 쓰면 run 오버라이드 해야하고 작동하려면 메인에서 thread 호출해야함.

class box2 implements Runnable { //interface 의 thread
	int no = 0;
	public box2 (int b) {
			this.no = b;
	}
	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) { }
		System.out.println("box2 = "+this.no);
	}
}

class box3 implements Runnable { //interface 의 thread
	
	@Override
	public void run() {
		System.out.println("tests");
	}
	
}