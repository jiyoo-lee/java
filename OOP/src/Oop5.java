
public class Oop5 {
	//abstract 응용 기본형태 인수값으로 추상 메소드로 값을 넘김
	public static void main(String[] args) {
		
		load1 lo = new load1();
		lo.datain(20,30);
		lo.call();
		load2 lo2 = new load2();
		lo2.datain(20, 30);
		lo2.call();
	}

}

abstract class abclass {
	int data1,data2;
	public void datain(int d1, int d2) { //기본 추상 메소드이며 모든 데이터를 인수값 받아서 this로 처리
	//단, 외부 클래스에는 선언하지 않음 ex)사용자 정보
		this.data1 = d1;
		this.data2 = d2;
	}
	
	public abstract void plus(); //무조건 써야함 abstract method를 쓰면 무조건 똑같이 써야하고 무조건 같은 명으로 써야한다.
	//각각의 class 기본으로 plus 메소드는 무조건 들어가야함 
	
	public void call () { //오버라이딩 한것만 실행 abstract void ㅇㅇㅇ썼으면 call해서 실행 시켜야한다.
		this.plus();
	}
	
	
}

class load1 extends abclass {
	
	@Override
	public void plus() {
		int sum = this.data1 + this.data2;
		System.out.println(sum);
	}
}

class load2 extends abclass {

	
	@Override
	public void plus() {
		int sum = this.data1 * this.data2;
		System.out.println(sum);
		this.avg(); // 다른메소드도 같이 출력시키고싶으면 오버라이드 한 곳에 avg를 불러온다. 재귀함수..?
	}
	
	public void avg() {
		System.out.println("홍길동");
	}
}