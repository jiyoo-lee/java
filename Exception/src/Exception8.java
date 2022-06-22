import java.util.LinkedList;

//exception7번 문제 생선님 풀이
public class Exception8 {

	public static void main(String[] args) {

		try {
			
		Redata rd = new Redata();
		Object[] data = {"홍길동",55,"유관순","강감찬",48,"이순신","세종대왕",34,88}; //문자랑 숫자랑 합쳐져서 object
		rd.setter(data);
		System.out.println(rd.getter());
		}
		catch(Exception e ) {
			if(e.getMessage() != null) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}
}


class Redata{
	
	LinkedList<String> rdata = new LinkedList<>();
	
	//존나 의문 게터세터는 필드에 있는거 만드는건데 왜 자꾸 이런식으로 만드는지..ㅅㅂ
	
	public void setter(Object[] call) throws Exception{
		int ea = call.length;
		int check =0;
		for(int i = 0; i < ea; i++) {
			try {
				check += (int)call[i]; //오브젝트는 조상클래스라서 형변환만해도 적용된다.
				
				//String check = new String((String)call[0]); 라는 선언방식도 있음.
			}
			catch(Exception a) {
				String ab = call[i].toString();
				rdata.add(ab);
			}
		}
	}
	
	public LinkedList<String> getter() { //리스트를 보낼때는 자료형을 적어준다. 당연함.
		
		return this.rdata;
	}
	
}