import java.util.Scanner;

public class Switchforexam {

	public static void main(String[] args) {
		/*���ڸ� �Է� ������ ����ġ������ �˷��ִ� ����*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ��� 1~5����");
		int a = sc.nextInt();
		String msg ="";
		
		switch(a){
		case 1: case 2: case 3: {
			msg = "����";
			break;
		}
		case 4: case 5:{
			msg = "�� ����";
			break;
			}
		default :
			msg = "���ڸ� �߸��Է��߽��ϴ�.";
		}
		System.out.println(msg);	
		
		sc.close();

	}

}
