
public class Method6 {

	public static void main(String[] args) {
		// private에 대한 객체 선언 형태 2
		
		
		
		insert i = new insert();
		i.userid = "hong";
		String skey = "a1234567";
		
		String result = i.checks(skey);
		System.out.println(result);
	}

}

class insert{ 
	String userid = null;
	private String key = "a1234567"; //해당 클래스에서 적용되는 key값
	//공용개발할때 많이 쓰임. 보안키. api에 많이 쓰임.
	//static에서는 private 사용 못함. 중요
	
	public String checks(String bb) {
		this.key = bb;
		String msg = null;
		if(key.equals("a1234567")) { //해당 key값(private), 외부 클래스에서 넘어오는 인수값과 비교
			
			if(userid.equals("hong")) { // 인수값과 같으면 아이디 확인
				msg = "데이터가 일치합니다.";	
			}
			else {
				msg = "해당 데이터값은 확인하지 못했습니다.";
			}			
			
		}
		else { // 외부 class에서 올바른 키값이 전달되지 않을 경우 
			msg = "error";
		}
		return msg; //최종 결과에 대한 return으로 회신함.
	}
	
}
