import java.util.LinkedList;

//exception7번 문제 생선님 풀이
public class Exception9 {

	public static void main(String[] args) {

		try {
			aedata rd = new aedata();
			Object[] data = { "홍길동", 55, "유관순", "강감찬", 48, "이순신", "세종대왕", 34, 88 }; // 문자랑 숫자랑 합쳐져서 object
			rd.setter(data);
			System.out.println(rd.getter()); 
			//return받는 값이 배열 메소드이므로 해당 메소드명을 배열으로 선언 후 받아야함. 
		} 
			catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class aedata {

	LinkedList<String> rdata = new LinkedList<>();

	// 존나 의문 게터세터는 필드에 있는거 만드는건데 왜 자꾸 이런식으로 만드는지..ㅅㅂ

	public void setter(Object[] call) throws Exception {
		int ea = call.length;

		for (int i = 0; i < ea; i++) {
			try {
				//해당 배열을 로드시 (자료형) 변환을 하는 이유는 Object 배열이므로 선언하였음.
				String checked = String.valueOf((String) call[i]);
				this.rdata.add(checked);
				} 
				catch (Exception ex) { 
				//자신 클래스에서 문제 발생시 출력되는 catch문 단,throw를 사용하는 동시에 사용하면 메인으로 전달됨 
				//중요한 사항은 throw로 전달시 해당 반복문은 종료하게 됩니다.(끊긴다는 얘기) 

			}
		}
	}

	public LinkedList<String> getter() { // 리스트를 보낼때는 자료형을 적어준다. 당연함.
		//배열 클래스 이름으로 getter를 만들 수 있음. 

		return this.rdata;
	}

}