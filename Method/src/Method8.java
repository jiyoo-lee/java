
public class Method8 {

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

class odbc {
	
	private int[] od; 
	private int ct;
	
	public odbc() {
		int[] odata = {15,22,17,14,32,35,19,33};
		this.od = odata;
		for(int i = 0; i < od.length; i++) {
			if(this.od[i]%2 == 1) {
				this.ct++;
			}
		}
	}
	
	public int numbers() {
		
		return this.ct;
	}
}