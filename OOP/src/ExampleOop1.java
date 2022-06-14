import java.util.Arrays;

public class ExampleOop1 {

	public static void main(String[] args) { //외부 클래스 호출만 합니다.
		//abstract 응용문제
		/*
		 1차 배열 값이 있습니다. 해당 배열 값을 모두 더한 값을 출력합니다.
		 단, abstract 기본 void method 이름은 sender 입니다. 
		  최종값 출력은 sender에서 출력되도록 합니다.
		  배열은 abstract에서 사용합니다. 메인은 호출만 합니당.
		 * */
		
		AddArrays ad = new AddArrays();
		
	}
}

abstract class SendArrays {

	public abstract void sender(); // 데이터를 가져오게 하는 추상화 메소드 
}


class AddArrays extends SendArrays {
	
	private int[] numbers;
	
	public AddArrays() {
		this.numbers = new int[] {6,13,22,9,12,64,32,47,39};
		this.sender();
		}
	
	@Override
	public void sender() {
		int sum = 0;
		for(int i = 0; i<numbers.length; i++) {
			sum += numbers[i];
			}
		System.out.println("총합계: "+sum);
	}
}