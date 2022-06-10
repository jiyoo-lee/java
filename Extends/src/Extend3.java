
public class Extend3 {

	public static void main(String[] args) {
		/*응용문제 두개의 값을 외부 클래스로 보냅니다.
		 * 해당 클래스에서 두개의 값을 계산하게 됩니다.
		 * 계산형식은 다음과 같습니다.
		 * 3,10을 보내면 두개의 값을 합을 구합니다.
		 * 나머지 클래스에서 외부 클래스에서 해당 결과 값을 출력합니다. 클래스 2개?
		 * 두개의 합 값이 짝수, 홀수인지를 출력하는 extends를 구현하세요/*/
		
		int a = 3;
		int b = 10;
		OddOrEven oe = new OddOrEven();
		oe.add(a,b);
		oe.ooe();
	}
}

class Numbers {
	protected int adder;
	
	public void add (int first, int second) {
		this.adder = first + second;
	}
}
class OddOrEven extends Numbers { //자식의 Method가 하나는 가지고 있어야한다.
	
	private String[] msg = {"짝수입니다.", "홀수입니다."}; //의문 : 어떻게 private인데 static으로 넘어가는지?
	
	public void ooe() {
		if(this.adder % 2 == 0) {
			System.out.println(this.msg[0]);
		}
		else {
			System.out.println(this.msg[1]);
		}
	}
}