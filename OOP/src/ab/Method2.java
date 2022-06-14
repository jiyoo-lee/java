package ab;
/*abstract와 interface의 차이점 및 공통점
 * 
 * */
public class Method2 {
	//Interface Mehtod2Inter & Mehtod2Inter2 연결됨.
	public static void main(String[] args) {
		LoadInter ld = new LoadInter();
		ld.setbox("홍길동");
	}

}

//중요 : abstract와 interface는 모두 static은 사용 할 수 있음. default 안써도 static에 다 올릴수 있음.

abstract class Test { //public을 안써도 된다.
	// 필드에 자료형을 생성 할 수 있음.
	public String mm;
	//abstract default를 사용하지않는다. (public으로 설정)
	public abstract void box();
	public void box2(String n) {
		this.mm = n;
		System.out.println("test");
	}
}



class LoadInter implements Method2re, Method2Inter2 { // 다중상속 
	
	@Override
	public String names() {
		
		return null;
	}
	
}