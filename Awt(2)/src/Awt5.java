import java.util.ArrayList;
import java.util.Arrays;

// 중복 아이디 체크 시스템 : Awt5Abstract과 홤께 사용        
// 회원 데이터 : hong,lee,park

/* 입력값 : 200 *25 중복체크 : 80*25 라벨 : 290*25 종료: 80*25*/
public class Awt5 {

	public static void main(String[] args) {
		
		Handle hd = new Handle();	
		hd.design();
		
		
	}
}

class Handle extends Awt5Abstract {
	private String aid; // awt에서 넘어온 인수값을 class에서 활용 
	private String return_id; //awt로 다시 값을 전달하는 전역변수, null일경우 아이디 사용가능, 아이디값이 전달 : 해당 아이디는사용할수 없음
	String[] data;
	ArrayList<String> db = null;
	
	//중복 체크하는 메소드
	@Override
	public  void dataload() {
		this.data = new String[] {"hong","lee","park","jeong","kim","java"};
		this.db = new ArrayList<>(Arrays.asList(data));
	}
	// setter 
	@Override
	public void idcheck(String id) {
		this.return_id = null; // Awt에서 중복버튼을 클릭시 해당 변수를 지속적으로 초기화하는 부분, 필드에 선언하면 다른 값으로 계속 바뀌어서 버그남. 
		this.aid = id;
		dataload(); 
		// 정상적으로 데이터가 넘어왔을경우 해당 메소드를 로드하여 확인하게 됨 
		
		int ea = this.db.size();
		int w = 0;
		
		while(w < ea) {
			if(this.aid.equals(this.db.get(w))) {
				this.return_id = this.db.get(w);
				break;
			}
			w++;
		}
	}
	
	// 
	@Override
	public String signok() { // getter
		
		return this.return_id;
	}
	
	
	
}