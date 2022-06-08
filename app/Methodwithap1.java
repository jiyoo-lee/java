package app;

import java.util.Scanner;

public class Methodwithap1 {
	
	private static String[][] scores = {
				{"박은경", "이경훈", "장운", "조기현", "김진수"},
				{"80", "78", "92", "67", "40"},
				{"40", "80", "88", "92", "100"},
				{"95", "30", "55", "90", "65"},
				{"20", "80", "100", "95", "30"}
				};

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 할 학생명을 입력하세요.>");
		String studentName = sc.nextLine();
		
		Methodwithap2 mtd = new Methodwithap2(scores);
		//true 아니면 false로 받아오게 함
		boolean isName = mtd.checkName(studentName);
		//B에 있는 method에 사용자이름 (String 입력) -> 사용자 이름유무(boolean 출력)
		
		// 사용자 이름이 배열에 존재하면
		if(isName) {
			System.out.print("과목명을 입력해주세요. (전체 검색은 전체라고 입력하시오.)>");
			String subjectName = sc.nextLine();
			
			//과목명, 이름 입력 -> String[] 점수를 출력
			String[] searchScore = mtd.checkSubject(studentName,subjectName);
			if(subjectName.equals("전체")) {
				System.out.println(subjectName +": "+ "국어 :"+searchScore[0] + "수학 :"+ searchScore[1] + "과학 :"+ searchScore[2] + "역사 : " + searchScore[3]);
			}
			else {
				System.out.println(subjectName+ ")" +searchScore[0]);
			}
		}
		else {
			System.out.println("사용자 데이터가 존재하지 않습니다.");
		}
	}

}
