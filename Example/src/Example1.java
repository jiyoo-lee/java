import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/*���빮�� : 1���� 2���� ����� ���μ���
		 * ���شٿ� ����
		 * ��ȸ�� �� �ټ����� �־����ϴ�.
		 * pc�� ���ڸ� �ϳ� ����(math.random) ->���ڴ� 1~10���� (�ٷ� ù��° �ε�) // 2��
		 * 2. �� ��ȸ�� x�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է� 1��
		 * ���࿡ pc�� 7�� ������ ���ؿ��� ����� ���ڿ� �񱳸� �Ѵ�. //2�� 1���� �޾Ƽ� ��
		 * ��: pc:7 �����: 2 -> ���: up  
		 * 4. �� ��ȸ 4�� ���Ҵٰ� ��
		 * 5. pc: 7 �����: 4 ->���: up
		 * 6. �� ��ȸ�� 3�� ���ҽ��ϴ�. pc: 7 �����: 7 ���: �����Դϴ�! ��� ���μ��� ���� System.exit()
		 * a��Ʈ : pc����, ��ĳ��5�� 
		 * b��Ʈ: pc���� �������ڿ� ����ڰ� ���� ���ڸ� �� �� ���ó��*/
		//���� �ΰ��� �����ؾ� �Ҷ��� ������ �� �Ǵ������� Ȯ���ϰ� �����ϱ�.
		
		/* Math.random -> �ڷ����� double
		 * util.random -> Random r = new Random();
		 * int pc = r.nextInt(10)+1; -> 1~10���� �̴� ��ƿ ���� */
		 
		int luckyNum = (int)(Math.random()*10)+1;
		System.out.println(luckyNum); //PC�ѹ� Ȯ�ο�
		
		Scanner sc = new Scanner(System.in);
		
		// ����� ���� Up&Down ����
		for(int i = 5; i > 0 ; i--) {
			System.out.print("1~10���� ��ȣ �� �ϳ��� �Է��ϼ���."+i+"�� ��ȸ�� �ֽ��ϴ�.>");
			int userNum = sc.nextInt();
			
		// ���ڰ� ������ ��������
			if(userNum < 0 || userNum > 10) {
				System.out.print("���� �Է��� �߸��Ǿ����ϴ�.1~10���� ���ڸ� �Է��ϼ���.>");
				i++;
				}
		// ���ڸ� ������ �°� �Է�������	
			else {
			Example2 ex = new Example2();
			String upAndDown = ex.match(userNum,luckyNum);
			System.out.println(upAndDown);
			
			//�����̸� system ����
			//int check = upAndDown.indexOf("����"); // -1 :���� 0 : �ִ�. indexOf(�ܾ �˻��Ҷ� ���� ��)
			//System.out.println(check);
			
			if(upAndDown.equals("�����Դϴ�!")) {
				System.exit(0);
				}
			}
		}
		sc.close();
	}
}
