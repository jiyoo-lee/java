package app;

public class Methodwithap2 {
	//B�� �ִ� method�� ������̸� (String �Է�) -> ����� �̸�����(boolean ���) checkName
	
	private String[][] scores;
	
	public Methodwithap2(String[][] scores) {
		this.scores = scores;
		
		
	}
	
	// score�� 0��°�� �̸��̴�.
	public boolean checkName(String name) {
		boolean exist = false;
		for(int i = 0; i < scores[0].length; i++) {
			if(name.equals(scores[0][i])) {
				exist = true;
			}
		}
		return exist;
	}
	
	// 1.�л��̸����� �л��ε����� ���°���� ã�ƺ���.
	// 2.���࿡ subjectName�� ��ü�� -> ��ü���
	// 3.���࿡ subjectName�� �� �����̸� -> �� ���� ���
	public String[] checkSubject(String studentName, String subjectName) {
		int studentIndex = -1;
		for(int i =0; i < scores[0].length; i++) {
			if(studentName.equals(scores[0][i])) {
				studentIndex = i;
			}
		}
		//1�� ��.(�л� �ε����� ã�Ҵ�.)
		// ��ü return�϶�
		if(subjectName.equals("��ü")) {
			String[] allSubjects = new String[4];
			for(int i = 1; i < scores.length; i++) {
			allSubjects[i-1] = scores[i][studentIndex]; 
			}
			
			return allSubjects;
		}
		// �Ѱ��� return�϶�
		else {
			String[] oneSubject = new String[1];
			if(subjectName.equals("����")) {
				oneSubject[0] = scores[1][studentIndex];
			}
			else if(subjectName.equals("����")) {
				oneSubject[0] = scores[2][studentIndex];
			}
			else if(subjectName.equals("����")) {
				oneSubject[0] = scores[3][studentIndex];
			}
			else if(subjectName.equals("����")) {
				oneSubject[0] = scores[4][studentIndex];
			}
		
			return oneSubject;
		}
			
	}
	
	
	

	}


