
public class Method8_1 {

	public static void main(String[] args) {
		
		
		abcd ab = new abcd();
		System.out.println(ab.aaa());
	}

}

class abcd {
	
	private int ori[];   // 배열값이 변경되지 않도록 사용
	private int count = 0; // 홀수일 경우 +1씩 증가 하기 위한 필드 변수 값 
	
	public abcd( ) { //class와 public은 클래스명이 같음
		int[] odata2 = {15,22,17,14,32,35,19,33};
		this.ori = odata2;
		//aaa();
	}
	
	public int aaa() {
		int w = 0;
		int ea = this.ori.length;
		while(w<ea) {
			if(this.ori[w] % 2 == 1) {
				this.count++; //홀수이면 +1씩 증가 
				}
			w++;
		}
		return this.count; //최종 값을 return 시킴.
		// 자료형 형태일때만 return 가능함
		
		/* 내일 하는거 : int 값을 받은걸 String으로 변환 하는 법, getter setter */
	}
}
