//배열을 이용한 퀴즈
public class Thread2 {
	//Thread는 순차적으로 결과값이 절대 안나옴
	
	public static void main(String[] args) {
		
		/*응용문제 Thread를 이용하여 각 배열의 값을 내림차순으로 모두 더하여 결과를 출력하는 응용프로그램을 제작하시오.*/
		
		/*hint 6이라는 배열값이 인수값으로 Thread로 전달
		 * 5+5+4+3+2+1 최종 결과값만 출력*/
		
		int[] data = {6,9,10,15,3,17};
		calculator cal = null;
		
		for(int i =0; i < data.length; i++) {
			cal = new calculator(data[i]);
			cal.start();
		}
	}
}

class calculator extends Thread {
	
	int number = 0;
	int sum = 0;
	
	public calculator(int i) { //Thread에서 값을 (전달)사용하기 위한 constructor 
		this.number = i;
	}
	
	@Override
	public void run() { //파라미터를 받지못한다.
		//반복문
		for(int j = this.number; j >= 0; j--) {
			sum += j;
		}
		System.out.println(sum);
	}
}

