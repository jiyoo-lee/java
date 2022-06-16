import java.util.ArrayList;
import java.util.Arrays;

//인증번호 발송 시스템 : 버튼이 있으면 그걸 누르면 4개의 난수(math.random) 0~9까지.. 인증번호가 올바른지 아닌지 확인해주는 시스템
// pc가 뽑는건 콘솔창이 찍어서 보도록 만들기
//awt6abstract과 연결되어 있습니다.....

public class Awt6 {

	public static void main(String[] args) {
		
		checkNums ch = new checkNums();
		ch.form();
		
		
	}

}

class checkNums extends Awt6Abstract {
	
	ArrayList<Integer> db = null;
	String message;
	protected String match;
	private String nums;
	
	//인증번호 발송
	@Override
	public void randomNums() {
		
		this.db = new ArrayList<>();
		for(int i = 0; i <= 3; i++) {
			this.db.add((int)(Math.random()*9));
			}
		this.match = db.toString().replaceAll("\\[|\\]", "").replaceAll(", ","");
		System.out.println(this.match);
		}
	
	@Override // 인증번호 확인
	public void compareNums(String nums) {
		this.nums = nums;
		
		if(this.nums.equals(this.match)) {
			this.message = "인증이 완료되었습니다.";
		}
		else {
			this.message = "인증번호를 다시 확인하시길 바랍니다.";
		}
	}
	
	public String sender() {
		
		return this.message;
	}

	
}
	

