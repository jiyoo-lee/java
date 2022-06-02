
public class Class4 {

	public static void main(String[] args) {
	
		Member mb = new Member(); 
		// 객체 : Member mb : 인스턴스 new Member(); : 메모리에 인스턴스명을 생성하여 사용 할 수 있도록 함.
		
		mb.user_age = 33;
		System.out.println(mb.user_age);
		int total = 25 * mb.user_agree; //user_agree는 class밖에서는 고정되어있으나 해당 class안에서 변경 가능
		System.out.println(total);
		
		final int agree = mb.user_agree; //Member인스턴스를 필드값을 로드함 ->agree라는 필드 상수값을 전달시킨다.
		mb.user_agree = 80; //메모리에 등록된 필드명에 해당되는 값을 변경함.
		System.out.println(mb.user_agree); // 다른 클래스에서 변화하는대로 필드값이 보여진다.
		System.out.println(agree); // 값은 변경해도 상수선언을 했기때문에 고정값으로 있다.
		
		
		/* 일반 클래스 메소드 부분
		 * 일반 클래스 메소드 사용시 별도의 객체 및 인스턴스를 만들 필요가 없습니다.
		 * 왜? static 자체가 메모리 인스턴스를 사용한다는 뜻이기때문입니다. (메인뿐만 아니라 다른 클래스에도 쓸수있음)
		 */
		
		/* 응용예시 
		 * 클래스 25000 -> 메인 final 25000 등록
		 * 10% 할인쿠폰 적용하는 상황 -> 메모리에 필드값으로 전달
		 * 변경된 값을 메모리에 전달해서 다음페이지엔 적용된 값을 적용할수있게 한다.
		 * */
		
		//Member.member_event();
		//mb.meber_event();    //위에 선언을 해서 필드선언 과 필드값 등이 있어야 
	}

}

class Member {    //클래스
	 String user_name;
	 int user_age;
	 int user_level; 	// 변수 필드명(user_level)을 생성 
	 int user_agree = 6;	//변수 필드명에 필드값(1)을 선언.
	 public static void member_event() { 
	 coupon.events(); //클래스에 대한 메소드를 바로 호출가능 단, events라는 메소드에 변수 필드 및 변수 필드값을 class에 선언하게 되면 
	 				// 그때는 객체+인스턴스를 생성해야만 로드가 됩니다.
	 }
}

/* 하나의 Project 중 서로 다른 pck라도 한번 사용한 Class명은 다른 곳에서 
 * 사용하실 수 없습니다.
 * */


class coupon {
	public static void events( ) {
		int cp = 30;
		System.out.println(cp);
		
	}
}