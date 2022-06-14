
public class Time1 {

	public static void main(String[] args) {
		/* 1부터 10까지 */
		/* try - catch문 : 예외처리기능 문법  */
		
		for(int i =1; i <=10; i++) {
			
			try { // 예외발생 할 코드를 적용 
				Thread.sleep(1000); // 1000에 1초 500에 0.5초 
				//Thread.sleep : 일시정지 상태를 말합니다. 
			}catch(InterruptedException a){
				/* InterruptedException : 해당 예외 발생이 되었을 경우 처리하기 위한 문법 */
			}catch(Exception b){
				
			}
			System.out.println(i);
		}
		
	}

}
