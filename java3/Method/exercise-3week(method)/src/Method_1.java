public class Method_1 {

	public static void main(String[] args) {
		/* 응용문제 
		 * 다음 배열을 출력은 main에 되게 하시오.
		 * 협업 프로그래머가 해당 DB에 값 중 홀수 값에 대한 총 갯수를 받고자 합니다.
		 * 해당 갯수를 출력 될 수 있도록 코드를 작성하시오. 
		 * */
		odbc od = new odbc();
		System.out.println(od.numbers());	
	}
}

class odbc{
	
	private int[] oda;
	private int count;
	
	// 생성자
	public odbc() {
		int[] odata = {15,22,17,14,32,35,19,33};
		this.oda = odata;
	}
	
	public int numbers() {
		int ea = this.oda.length;
		
		for(int i = 0; i < ea; i++) {
			if(this.oda[i]%2 == 1) {
				this.count++;
			}
		}		
		return this.count;
	}
	
	
}


//  궁금한거 : this 어떨때 쓰는건지, private 어떻게 잘 쓰는지, 메소드 실행순서