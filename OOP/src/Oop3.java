
public class Oop3 {

	/* 멀티 쓰레드 : start, run, sleep(잠시대기), setStop(정지), cache try ..etc */
	// 멀티쓰레드 : CPU core와 관계가 있습니다.
	
	
	public static void main(String[] args) {
		/*THREAD : 프로세스 내부에서 독립적으로 실행되는 작업을 말함
		 * 멀티 쓰레드(Multi-thread) : 프로세서 내부에서 두가지 이상의 작업을 동시사용 할때*/
		// 쓰레드 -> 음악을 듣는다
		// 멀티 쓰레드 -> 음악을 들으면서 유튜브를 보며 문서를 만든다. (멀티태스킹)
		
		
		Thread my = new MyThread(); //부모 메소드 = 자식 메소드
		//기존 사용형태 : 자식메소드 = 자식메소드(일반 쓰레드 방식)
		// 자식이 포함되어있다고 재로드만 한것. 부모를 자식에 집어넣은것 부모를 부르면 자식도 오는 상황
		 // 부모class     //자식 class
		//부모를 호출 = 자식을 호출
		
		
		my.start(); //Thread 안에 들어가있는 메소드 
		//my.b(); 는 에러
		//my.run();
		Thread my2 = new Test2();
		my2.start(); //Thread method에 기본 run을 작동하기 위한 start 메소드(명령어)
		
		for(int j = 1; j <= 10; j++) {
			System.out.println("내부클래스 : "+ j);
		}
		
	}
}

class Test2 extends Thread {
	
	@Override
	public void run() { //private, protected 사용하는 경우 거의 없음
		int a;
		for(a = 1; a <= 10; a++) {
			System.out.println("외부 클래스2 : " + a);
		}
	}
}

class MyThread extends Thread { 
	//Thread는 jvm안에 기본으로 탑재 되어 있는 method(thread는 단독으로 사용하지 않음 class thread 이런식으로 안쓰고 무조건extends 통해서만). 
	
	@Override // 에노테이션을 통해서 쓰레드 사용을 알려야한다.
	public void run () { // 부모한테 있는 애가 아님. // method b -> run으로 바꿈 
		//run이란 Multi메소드 기본 실행 메소드
		//thread를 쓰려면 메소드 단어가 고정되어있음
		int a;
		for(a = 1; a <= 10; a++) {
			System.out.println("외부 클래스 : " + a);
		}
		
	}	
	
}
