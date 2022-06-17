package ex;

public class Example6 {

	public static void main(String[] args) {
	
		/*특강문제
		 * abstract을 이용하여 구구단 8단 결과를 모두 더한 결과값을 return을 받아
		 * main에서 출력하세요*/

		calculate cal = new calculate();
		cal.setGugu(8);
		System.out.println("결과 값: "+cal.getGugu());
	}

}

abstract class gugu {
	
	public abstract void multi();
	public abstract void setGugu(int a);
	public abstract int getGugu();
}


class calculate extends gugu {
	
	private int number;
	private int sum;
	
	@Override
	public void setGugu(int number) {
		this.number = number;
		multi();
	}
	
	@Override
	public void multi() {
		
		for(int i =1; i<=9; i++) {
			sum += this.number * i;
		}
	}
	
	@Override
	public int getGugu() {
		
		return this.sum;
	}
}