
public class Time3 {

	public static void main(String[] args) {
		
		/*응용문제 : 외부 클래스가 있습니다. 단, 메인 클래스에서 해당 외부 클래스를 로드하면 해당 메소드에서 즉각적으로
		 * 8초동안 로딩이 발생합니다. 8초 이후에 return으로 입금이 모두 처리되었습니다.라는 문자를 받도록 하십시오.   */
		
	/*	try {
			System.out.println("수업 시작");
			Thread.sleep(5000);
			System.out.println("수업 종료");
			
		}catch(InterruptedException c){
			System.out.println(c);
		} */
		
		Time time = new Time();
		System.out.println(time.msg());
	}

}

class Time  {
	public Time() {
		try {
		System.out.println("처리 중입니다. 잠시만 기다려주세요...");
		Thread.sleep(8000);
		//msg();
		}catch(InterruptedException b){
			System.out.println(b);
		}
	}
	
	public String msg () {
		String msg = "입금이 모두 처리되었습니다.";
		return msg;
	}
}