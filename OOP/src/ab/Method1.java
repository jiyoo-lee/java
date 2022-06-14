package ab;

//Method1A와 결합해서 공부함
public class Method1 {

	 public void recall() { 
		 //ab2 pck와 공유 설정 메소드
		 System.out.println("test");
	}
	
	 protected static void name() { 
		 //protected는 다른 pck로 쓰려고 할땐 static 사용해야 작동한다.
		 System.out.println("홍길동");
	 }
	public static void main(String[] args) {
		
		
		
		
		// Arrays.sort : 배열 오름차순 정렬(숫자,한글,영문 다 가능) 
		// 단, 영문일경우 대문자가 제일 먼저 오름차순으로 정렬됩니다. ex)APPLE apple 가 있으면 APPLE가 우선
		
		/*int numberdata[] = {5,7,1,4,9,2};
		Arrays.sort(numberdata); //sort 숫자 오름차순 정렬
		System.out.println(Arrays.toString(numberdata));*/
		
		
	/*	String[] userdata = {"홍길동","이순신","김유신","장보고"}; // 한글 순서도 정렬 가능 
		Arrays.sort(userdata);
		System.out.println(Arrays.toString(userdata)); */
		
		
		/* 응용문제 
		 * 변수를 2개 생성해서 하나는 문자로 하나는 숫자로 해라
		 * 현재 가입된 사용자에 아이디를 확인 후 해당 포인트가 적립되도록 합니다.
		 * 단, 기존 포인트 + 적립금 포인트에 대한 결과를 출력하셔야 합니다.
		 * 출력은 메인 클래스에서 합니다. sysout
		 * 
		 * 배열 데이터 : {
		 * 				{"kim","park",seo","oh","lee","jang","jeong","cho","ha","hwang"}	
		 * 				{"1500","800","2000","1000","4200","2200","3000","500","1000","1800}
		 * 				};
		 * 스트링 배열이라서 숫자로 더하려면 숫자로 바꿔야할듯..*/
		
		//static은 단독적으로 값을 넘길 수 있을때 사용한다.
		
		
		
		String name = "park";
		int p = 2000;
		
		IdeMth1 imt = new IdeMth1();
		imt.setter(name,p);
		System.out.println(imt.getter());
	}
}

class IdeMth1 extends Mth1 {
	
	private String[][] membership = {
			{"kim","park","seo","oh","lee","jang","jeong","cho","ha","hwang"},
			{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
		};
	
	private String nowPoint;
	protected int sumPoint;
	protected String resultPoint;
	private String data1;
	private String msg;

	@Override
	public void setter(String data1, int data2) { // 받아서 값 설정만 해주는 역할만 하고 직접적인 계산은 따로 메소드로 해주는게 좋다.
		
		this.data1 = data1;
		
		for(int i = 0; i < this.membership[0].length; i++) {
		
			if(data1.equals(membership[0][i])) {
				nowPoint = this.membership[1][i];
				this.sumPoint = data2 + Integer.parseInt(nowPoint);
				}
			}
		resultPoint = Integer.toString(this.sumPoint); //getter 값으로 넘기기위해 형변환
		this.msg = "증가";
		};
	
	@Override
	public String getter() {
		String print = this.data1 + "님 포인트가 " + this.resultPoint + msg+ "되었습니다.";
		
		return print;
	};
	
	@Override
	public void setter(int[] data3) {};
	
}
