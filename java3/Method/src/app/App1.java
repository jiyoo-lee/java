package app;

public class App1 {
	/*App1이라는 기본 메인 class이며 abox와 main이 공존해 있음*/

	public static void main(String[] args) {
		//method11에서 로드할 경우 해당 외부 blue 클래스를 로드하여 
		// 출력시켜 method11에 로드할 수 있도록 함.
		Blue b = new Blue();
		System.out.println(b.box());
	}
	
	public void abox() {
		System.out.println("Test import");
	}

}

//Blue는 별도의 외부 클래스이며 method11에서 직접적인 핸들링을 불가능함
class Blue {
	private String msg;
	
	public String box(){
		this.msg = "환영합니다";
		
		return this.msg;
	}
}