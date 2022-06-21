
public class ExceptionExercise1 {

	public static void main(String[] args) {
		
		/* 응용문제 
		 * 사용자가 45*3+16+5+22*8 해당 연산 값의 최종값을
		 * 외부 클래스 객체에 저장합니다. 해당 외부 클래스에서는 해당 값이 짝수일 경우 예외오류를 발생하며
		 * 홀수일경우 정상처리*/
		
	
		int num = 45*3+16+5+22*8; 
		Data d = new Data();
		d.setNumber(num);
		d.calculate();
		
	}
}

class Data {
	
	int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void calculate () {
		
		try {
			
			if (this.number%2== 0) {
				throw new Exception("짝수입니다.");
			}
			else {
				System.out.println(this.number);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
