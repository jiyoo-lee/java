package app;

import java.util.Scanner;

public class Methodwithap1 {
	
	private static String[][] scores = {
				{"������", "�̰���", "���", "������", "������"},
				{"80", "78", "92", "67", "40"},
				{"40", "80", "88", "92", "100"},
				{"95", "30", "55", "90", "65"},
				{"20", "80", "100", "95", "30"}
				};

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻� �� �л����� �Է��ϼ���.>");
		String studentName = sc.nextLine();
		
		Methodwithap2 mtd = new Methodwithap2(scores);
		//true �ƴϸ� false�� �޾ƿ��� ��
		boolean isName = mtd.checkName(studentName);
		//B�� �ִ� method�� ������̸� (String �Է�) -> ����� �̸�����(boolean ���)
		
		// ����� �̸��� �迭�� �����ϸ�
		if(isName) {
			System.out.print("������� �Է����ּ���. (��ü �˻��� ��ü��� �Է��Ͻÿ�.)>");
			String subjectName = sc.nextLine();
			
			//�����, �̸� �Է� -> String[] ������ ���
			String[] searchScore = mtd.checkSubject(studentName,subjectName);
			if(subjectName.equals("��ü")) {
				System.out.println(subjectName +": "+ "���� :"+searchScore[0] + "���� :"+ searchScore[1] + "���� :"+ searchScore[2] + "���� : " + searchScore[3]);
			}
			else {
				System.out.println(subjectName+ ")" +searchScore[0]);
			}
		}
		else {
			System.out.println("����� �����Ͱ� �������� �ʽ��ϴ�.");
		}
	}

}
