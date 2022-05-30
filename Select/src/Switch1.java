
public class Switch1 {

	public static void main(String[] args) {
		
		
		/*switch~case : 선택문 
		 입력된 값 기준으로 case가 발동하여 출력값을 선택하게 됩니다.
		 default는 case에 내용 중 같은 내용이 존재하지 않을 경우 
		 작동되는 문법입니다.
		 switch(인자값) : 변수에서 받은 값을 어떤 결과값이 나올지를 판단하는 값
		 권고사항은 10개 이상 넘어가지 않기 (결과값이 많지않을 경우 사용)
		 */

		int n = 10;
		switch (n) {
		case 1:
			System.out.println("옵션 1을 선택하셨습니다.");

			break;

		case 2:
			System.out.println("옵션 2을 선택하셨습니다.");

			break;

		case 3:
			System.out.println("옵션 3을 선택하셨습니다.");

			break;
		default:
			System.out.println("선택한 값이 없습니다.");

			break;
		}
		
		
		String user = "leesunsin"; //문자로 switch문에 인자값 전달, 달력도 만들 수 있다.
		switch(user) { //복합 case 형태입니다. 
		case "이순신": case "leesunsin": case "이 순신":
			System.out.println("A조입니다.");
			break;
		case "홍길동":
			System.out.println("B조입니다.");
			break;
		case "유관순":
			System.out.println("C조입니다.");
			break;
			default: //default에는 케이스 조건을 걸지않는다.
			System.out.println("나머지는 D조입니다.");
			break;
		}
		

	}

}
