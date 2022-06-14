package ab2;

public class App {

	public static void main(String[] args) {
		
		//자식		=	//자식
		/*members mb = new members();
		mb.oop();
		mb.oop2();
		mb.opp();*/
		
		
		// 먼저 자식 부르고 부모만 쓰고싶으면 AppData2 ap = mb; 식으로 선언 후 다시 부모 -> 자식으로 갈때는
		// members mb2 = (members)ap;
	
		
		
		//부모		= 		//자식
		//members mb = new members(); // 자식 클래스 전용
		//AppData2 ap = mb; //인터페이스 전용(클래스 -> 인터페이스 기준)
		//ap.oop();
		//ap.oop2();
		/* ap.opp(); 부모를 호출 했을때는 자식멤버는 불러올수 없다. 좋은 점: 부모가 허락한 메소드말고는 자손의 멤버는 부를 수 없다. */
		// 인터페이스 기준으로 적용된 오버라이드만 호출 함 (형변환) 형변환은 한번씩만 이루어진다 
		// 쓰고싶으면 부모로부터 받은 메소드에 this.opp();등으로 불러와야함
		
		AppData2 ap = new members();
		members mb2 = (members)ap; // 인터페이스 -> 클래스로 재변환 좋은점 : new 한번만 쓰면 됨  
		ap.oop();
		mb2.opp();
		
	}

}
//class members implements AppData1 {
	//app data1에 강제로 자료형 선언하는 방식
	
//}



class members implements AppData2 {
	
	@Override
	public void oop() {
		System.out.println("test");

	}
	
	@Override
	public void oop2() {
		System.out.println("test2");
	}
	
	public void opp() {
		System.out.println("test3");

	}
	
	
	
}