import java.util.Timer;
import java.util.TimerTask;

public class Time2 {

	
	public static void main(String[] args) {
		
		Timer timer = new Timer(); //Timer utility 이용하여 시간 메소드를 사용합니다.
		//timer.scheduleAtFixedRate(new gogo(), 0, 5000);
		//(시작 할 메소드&클래스, 몇초뒤에 시작, 반복시간)
		//scheduleAtFixedRate : 지속적으로 반복 작업을 할 경우 사용
	
		TimerTask tk = new TimerTask() {
		int a = 0;
		String adata[] = {"홍길동","이순신","강감찬","유관순"};
		
			@Override
			public void run() {
				if(a>=4) {
					System.exit(0);
					a = 0;
				}
				System.out.println(adata[a]);
				a++;
			}
		};
		timer.scheduleAtFixedRate(tk, 0, 5000);
	}
	
}

class gogo extends TimerTask { //TimerTask : 시간작업 
	
public void run() { //강제 실행 //Task에서 실행하는 메소드
	System.out.println("시간 함수 잘 작동이 될까요?");
	}
}