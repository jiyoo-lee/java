import java.util.Scanner;
//import : java�� �ִ� ������ �ε��Ҷ� ����ϴ� ���
//export : java�� �ִ� ������ ������ ������ �� �ִ� ��� ����

// java.util ��Ű�� Scanner Ŭ���� �κ��� �ε� �ϰ� �˴ϴ�.
// java.util ��Ű���� �׳� ������� ���ϸ�  new�� �Ҵ��Ͽ� �����ڸ� ����ؾ� �մϴ�.
// ��, �ش� �ڵ� ��ġ�� �ۼ� �ڵ庸�� �Ʒ��� ������ �ȵ˴ϴ�. 

public class If_4 {

	public static void main(String[] args) {

		// new : ��ü�� �����ϴ� ���� ���մϴ�.
		Scanner a = new Scanner(System.in);
		// System.in(�Է�) ! = System.out(���)
		
		System.out.print("���̵� �Է��ϼ���.>");
		String mid = a.next();
		//next : ����ڰ� �Է��ϴ� ���¸� ���մϴ�. (���� �Ǵ� ���ڸ� �Է� �޴� ����)
		//next -> ���� nextInt -> ���� ���ڷ� �ν� nextDouble -> �Ǽ������ �ν� 
		
		System.out.println(mid);
	
		
		a.close();
	}
}
