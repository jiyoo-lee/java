
public class Exception5 {

	// 값을 전달하고 출력만 함
	public static void main(String[] args){ 
		Words w = new Words();
		
		try {
			String result = w.files("");
			System.out.println(result);
		}
		
		catch(Exception a) {
			//System.out.println("빈 값이 문제가 되어 올바른 값을 전달받지 못함");
			
			if(a.getMessage() !=null) {
			System.out.println(a);
			}
		}
		finally {
			try {
			String result = w.files("홍길동");
			System.out.println(result);
			}
			catch(Exception e) {
				System.exit(0);
			}
		}
	}
}

class Words {
	
	//값을 받고 연산 후 return
	public String files(String a) throws Exception {
		
		if(a == null || a.equals("")) {
			throw new Exception("값이 비어 있음"); // 값을 보낼 수도 있음 어떤 오류인지 나타낼 수 있음 
		}
		else {
			String msg = a +"님 환영합니다.";
			return msg;
		}
		
	}
}
