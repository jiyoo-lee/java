import java.util.Scanner;

public class Score1 {
	private static String[] msg = 	{"�˻��� ������ �л����� �Է��� �ּ���.>", "�˻� �� ������� �Է��ϼ���.[��ü,����,����,����,����]"};
	//gtdata() return �޼ҵ�
	
	public static void main(String[] args) {
		// ����� ���� ���� �Է� �� ������� ��� ��Ʈ
		
		// �л��� �˻�
		Score2 sc2 = new Score2();
		Scanner sc = new Scanner(System.in);
		System.out.println(msg[0]);
		String name = sc.nextLine(); // �л���
		sc2.Scores(name,null);
		
		String check = sc2.gtdata();
		
		if(check.equals("true")) {
			System.out.println(msg[1]);
			String subject = sc.nextLine(); // �����Է�.
			sc2.Scores(name,subject);
			String score = sc2.gtdata();
			//System.out.println(sc2.gtdata()); // ���Ȯ��
			if(subject.equals("��ü")) {
				String score2[] = score.split(",");
				System.out.printf("����������: ���� %s �� ���� %s�� ���� %s�� ���� %s��", score2[0], score2[1], score2[3], score2[4] );
			}
			else {
				System.out.println("����������: " + subject + " "+ score + "��");
			}
			
		}
		else {
			System.out.println("�ش� ����ڴ� �������� �ʽ��ϴ�.");
			System.exit(0); //0: ��������, 1: ������ ����
		}
		
		
		sc.close();
		System.gc();
	}
}
