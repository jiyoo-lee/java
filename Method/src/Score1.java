import java.util.Scanner;

public class Score1 {
	private static String[] msg = 	{"검색할 데이터 학생명을 입력해 주세요.>", "검색 할 과목명을 입력하세요.[전체,국어,수학,과학,역사]"};
	//gtdata() return 메소드
	
	public static void main(String[] args) {
		// 사용자 정보 정보 입력 및 결과정보 출력 파트
		
		// 학생명 검색
		Score2 sc2 = new Score2();
		Scanner sc = new Scanner(System.in);
		System.out.println(msg[0]);
		String name = sc.nextLine(); // 학생명
		sc2.Scores(name,null);
		
		String check = sc2.gtdata();
		
		if(check.equals("true")) {
			System.out.println(msg[1]);
			String subject = sc.nextLine(); // 과목입력.
			sc2.Scores(name,subject);
			String score = sc2.gtdata();
			//System.out.println(sc2.gtdata()); // 결과확인
			if(subject.equals("전체")) {
				String score2[] = score.split(",");
				System.out.printf("점수데이터: 국어 %s 점 수학 %s점 과학 %s점 역사 %s점", score2[0], score2[1], score2[3], score2[4] );
			}
			else {
				System.out.println("점수데이터: " + subject + " "+ score + "점");
			}
			
		}
		else {
			System.out.println("해당 사용자는 존재하지 않습니다.");
			System.exit(0); //0: 정상종료, 1: 비정상 종료
		}
		
		
		sc.close();
		System.gc();
	}
}
