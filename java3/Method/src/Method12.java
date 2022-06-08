
public class Method12 {

	public static void main(String[] args) {
		// extends를 사용한 자식 class를 로드하게 되면 자동으로 부모 class도 함께 사용이 가능합니다.
		
	Bbox2 b = new Bbox2();
	b.b2("이순신");
	System.out.println(b.abc());

	}

}
class Bbox { //기본 외부 클래스1 : main에서 필요한 사항을 체크
	protected String userInfo;
	private String userPw; //class 안에서만 사용할때 사용
	public String userRpw;
	public Bbox() {
		this.userPw = "abcd";
		this.userRpw = this.userPw.replace("abcd","ade5dde");
	}
	
	public String abc() {
		String email = "hong@naver.com";
		return email;
	}
	
}

class Bbox2 extends Bbox { //extends -> 코드를 그대로 가지고온다.  //Bbox에 대한 모든 정보를 공유, 단 private 세팅 값은 공유하지않음
	public void b2(String nm){ //main 클래스에서 bbox2를 로드 후 해당 값에 인수값을 적용하여 bbox class에 있는 필드명 중 userInfo에
								// 적용하게 되는 형태
		this.userInfo = nm;
		System.out.println(this.userInfo);
		System.out.println(this.userRpw);	
		//System.out.println(this.userPw); ->private로 Bbox 클래스에 만들었기때문에 로드 불가능.
	}
}