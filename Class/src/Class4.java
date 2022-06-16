import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		/*
		 * 배열 데이터 : 홍길동 , 이순신 , 유관순
		 * 세개의 데이터가 있습니다. 
		 * 메인 클래스에서 문자를 하나 전송합니다. 
		 * 단, 문자가 null로 보낼 수도 있으며 배열 데이터와 관계 없는 강감찬 이라고 보낼 수도 있습니다.
		 * 외부 클래스명 : data_list
		 * 추상 클래스명 : v_constructor
		 * 외부 클래스 안 내부 클래스 명: check입니다.
		 * 
		 * [결과형태]
		 * 메인 클래스에서 강감찬을 적용 할 경우 
		 * 내부 클래스에서 "해당사용자는 가입자가 아닙니다"라고 출력
		 * 메인 클래스에서 이순신 적용
		 * 내부 : 해당 사용자가 검색되었습니다.
		 * 단, Arraylist로 배열을 로드 하세요.
		 * */
		
		data_list dl = new data_list();
		dl.array(null);	
	}
}

abstract class v_constructor {
	
	public abstract void array(String name);
	
	}

class data_list extends v_constructor { //추상 클래스 extends
	
	String name;

	@Override
	public void array(String name) {
		
		if(name == null) {
			System.out.println("사용자 이름을 입력하셔야합니다.");
		}
		else {
			this.name = name;  //이름에 숫자를 적을수도 있으니 그럴때 try catch로 이용해서 써보기 	
			check ck = new check();	// 외부에서 내부로 바로 보내기 
			ck.db();
		}
	}
	
	class check{	// 부모 클래스에서 받은 값을 자식 클래스로 이관 
		String data_list[]; // 필드에 배열을 받는 객체 생성
		ArrayList<String> ar = null;  // arraylist util을 필드에 객체 생성
		String name = data_list.this.name;
		
		public void db() {
			//해당 필드에 있는 Arryalist를 인스턴스로 적용함 
			this.data_list = new String[] {"홍길동","이순신","유관순"};
			this.ar = new ArrayList<>(Arrays.asList(data_list)); //this로 값 넘겨줌 
			this.compare(); // 최종 DB와 사용자 정보를 비교하는 메소드 
			}
		public void compare () { 
			boolean ak = false; // 결과 확인작업 
			
			for(int i = 0; i < this.ar.size(); i++) {
				if(this.name.equals(ar.get(i))) {
					System.out.println("해당 사용자가 있습니다.");
					ak = true;
				}
			}
			if(!ak) {
				System.out.println("가입된 사용자가 아닙니다.");
			}
		}
	}
}
