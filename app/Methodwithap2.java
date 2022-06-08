package app;

public class Methodwithap2 {
	//B에 있는 method에 사용자이름 (String 입력) -> 사용자 이름유무(boolean 출력) checkName
	
	private String[][] scores;
	
	public Methodwithap2(String[][] scores) {
		this.scores = scores;
		
		
	}
	
	// score의 0번째가 이름이다.
	public boolean checkName(String name) {
		boolean exist = false;
		for(int i = 0; i < scores[0].length; i++) {
			if(name.equals(scores[0][i])) {
				exist = true;
			}
		}
		return exist;
	}
	
	// 1.학생이름으로 학생인덱스가 몇번째인지 찾아보자.
	// 2.만약에 subjectName이 전체면 -> 전체출력
	// 3.만약에 subjectName이 한 과목이면 -> 그 과목만 출력
	public String[] checkSubject(String studentName, String subjectName) {
		int studentIndex = -1;
		for(int i =0; i < scores[0].length; i++) {
			if(studentName.equals(scores[0][i])) {
				studentIndex = i;
			}
		}
		//1번 끝.(학생 인덱스를 찾았다.)
		// 전체 return일때
		if(subjectName.equals("전체")) {
			String[] allSubjects = new String[4];
			for(int i = 1; i < scores.length; i++) {
			allSubjects[i-1] = scores[i][studentIndex]; 
			}
			
			return allSubjects;
		}
		// 한과목 return일때
		else {
			String[] oneSubject = new String[1];
			if(subjectName.equals("국어")) {
				oneSubject[0] = scores[1][studentIndex];
			}
			else if(subjectName.equals("수학")) {
				oneSubject[0] = scores[2][studentIndex];
			}
			else if(subjectName.equals("과학")) {
				oneSubject[0] = scores[3][studentIndex];
			}
			else if(subjectName.equals("역사")) {
				oneSubject[0] = scores[4][studentIndex];
			}
		
			return oneSubject;
		}
			
	}
	
	
	

	}


