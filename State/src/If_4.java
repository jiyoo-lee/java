import java.util.Scanner;
//import : java에 있는 파일을 로드할때 사용하는 언어
//export : java에 있는 파일을 별도로 내보낼 수 있는 언어 파일

// java.util 패키지 Scanner 클래스 부분을 로드 하게 됩니다.
// java.util 패키지는 그냥 사용하지 못하며  new를 할당하여 구분자를 사용해야 합니다.
// 단, 해당 코드 위치가 작성 코드보다 아래에 있으면 안됩니다. 

public class If_4 {

	public static void main(String[] args) {

		// new : 객체를 선언하는 것을 말합니다.
		Scanner a = new Scanner(System.in);
		// System.in(입력) ! = System.out(출력)
		
		System.out.print("아이디를 입력하세요.>");
		String mid = a.next();
		//next : 사용자가 입력하는 형태를 말합니다. (숫자 또는 문자를 입력 받는 형태)
		//next -> 문자 nextInt -> 정수 숫자로 인식 nextDouble -> 실수더블로 인식 
		
		System.out.println(mid);
	
		
		a.close();
	}
}
