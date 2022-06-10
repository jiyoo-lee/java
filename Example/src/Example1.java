import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/*응용문제 : 1번과 2번이 연결된 프로세서
		 * 업앤다운 게임
		 * 기회는 총 다섯번이 주어집니다.
		 * pc가 숫자를 하나 선택(math.random) ->숫자는 1~10까지 (바로 첫번째 로드) // 2에
		 * 2. 총 기회는 x번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력 1에
		 * 만약에 pc가 7을 선택한 기준에서 사용자 숫자와 비교를 한다. //2에 1값을 받아서 비교
		 * 예: pc:7 사용자: 2 -> 결과: up  
		 * 4. 총 기회 4번 남았다고 뜸
		 * 5. pc: 7 사용자: 4 ->결과: up
		 * 6. 총 기회가 3번 남았습니다. pc: 7 사용자: 7 결과: 정답입니다! 모든 프로세서 종료 System.exit()
		 * a파트 : pc랜덤, 스캐너5번 
		 * b파트: pc에서 랜덤숫자와 사용자가 뽑은 숫자를 비교 및 결과처리*/
		//파일 두개를 실행해야 할때는 연결이 잘 되는지부터 확인하고 시작하기.
		
		/* Math.random -> 자료형이 double
		 * util.random -> Random r = new Random();
		 * int pc = r.nextInt(10)+1; -> 1~10까지 뽑는 유틸 랜덤 */
		 
		int luckyNum = (int)(Math.random()*10)+1;
		System.out.println(luckyNum); //PC넘버 확인용
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자 숫자 Up&Down 게임
		for(int i = 5; i > 0 ; i--) {
			System.out.print("1~10까지 번호 중 하나를 입력하세요."+i+"번 기회가 있습니다.>");
			int userNum = sc.nextInt();
			
		// 숫자가 범위를 벗어났을경우
			if(userNum < 0 || userNum > 10) {
				System.out.print("숫자 입력이 잘못되었습니다.1~10까지 숫자를 입력하세요.>");
				i++;
				}
		// 숫자를 범위에 맞게 입력했을때	
			else {
			Example2 ex = new Example2();
			String upAndDown = ex.match(userNum,luckyNum);
			System.out.println(upAndDown);
			
			//정답이면 system 종료
			//int check = upAndDown.indexOf("정답"); // -1 :없다 0 : 있다. indexOf(단어를 검색할때 많이 씀)
			//System.out.println(check);
			
			if(upAndDown.equals("정답입니다!")) {
				System.exit(0);
				}
			}
		}
		sc.close();
	}
}
