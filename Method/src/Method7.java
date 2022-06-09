public class Method7 {

	public static void main(String[] args) {
		/* 응용문제 : */
		
		apink ap = new apink("홍길동",25,"test@gmail.com",-1000);
		//ap.names();
		//System.out.println(ap.nm2);
		System.out.println(ap.data());
		System.out.println(ap.data2());
	}

}

class apink {
	//private 선언은 class 필드에서만 생성가능합니다.
	//String nm2;
	private String nm;
	private int age;
	private String email;
	private String emailCp;
	private int point;
	
	public void names() {
		if(this.nm == "홍길동") {
			this.nm = "hong";
			String[] e = this.email.split("@"); //이메일 중에 이메일 뒷 주소만 가져오기위한 배열로 나누는 작업.
			//System.out.println(Arrays.toString(e));
			this.emailCp =e[1]; 
		}
	}
	
	public apink (String nm1, int age2, String email3, int point4) { //private를 안에서 사용하지 못함.
		//setter 형태 : 인수값을 받아서 넘기는 작업.
		this.nm = nm1; 
		this.email = email3;
		/*
		this.age = age2;
		this.email = email3;
		this.point = point4;*/
		
		if(point4 < 0) {
			//this.point = 0;
		}
		else {
			this.point = point4;
		}
		names();
				
	}
	public String data() {
		
		//return this.nm; //return 밑으로는 더 이상 다른 코드를 적지않기.
		//return 밑에 코드는 모두 오류가 발생하게 됩니다. 
		return this.emailCp;
	}
	
	public int data2() {
		//getter 형태 return
		return this.point;
	}
	
}

// 공부 : private, getter setter, private 조건문, 메소드 실행순서, this 정확한 사용법
