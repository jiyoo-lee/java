import java.util.Scanner;

public class Oop1 {

	public static void main(String[] args) {
		
		/* Object oriented program ������
		 * ��͸޼ҵ� ���� (��뿹: �α���) */
		// main�� ���� �����ʰ� ��κ� Ŭ���� ȣ���� ����ؼ� ����.
		//extends ������ ����Լ��� �� �����ʰ� class�ȿ��� ���� �ϱ� ���ؼ� ����Լ��� ���� ����.
		
		OpMethod om = new OpMethod();

	}

}

/*��� Method : �޼ҵ带 ���� �Ǵ� �������� ȣ���ϴ� ���μ����� ���մϴ�.
 �ݺ���, �ܺ� Ŭ������ ����� �� ������ ������ ���� �ذ� �ϱ� ���ؼ� �����ϴ� �޼ҵ� ���¸� ����. */

class OpMethod {  
	//Ŭ���� �ȿ��� ���� �ѱ涩 �μ����� �����ʰ� ȣ�⸸ �ص� ���ƴٴѴ�. �߰��� ���� �޾Ƽ� ó���ϴ� ��쵵 ����
	
	Scanner sc = new Scanner(System.in); // �ʵ忡 �̸� �����ϸ� �ݺ������� �޸𸮿� �������ʰ� �ּ�ȭ �� �� �ִ�. (awt�Ҷ��� �ʵ忡 panel�̳� ����� ����� ����.)
	private String name;
	
	public OpMethod() { //������
		this.m1();
	}
	
	public void m1() { // ��ĳ�ʸ� �ʵ忡 �÷������� �� �޼ҵ忡 ����� �����ϴ�. /�޼ҵ� m1�۵�
		System.out.println("ã�� �̸��� �Է��ϼ���.");
		this.name = sc.next();
		this.m2(); //���� ȣ�������ʰ� m2�� �ѱ� �� ����.
	}
	
	public void m2() { //m1�� ���� ������� m2�� Ȯ��
		
		if(this.name.equals("ȫ�浿")) {
			System.out.println("�ý����� �����մϴ�.");
			sc.close();
			System.exit(0);
			}
		else {
			System.out.println("�ش� �̸��� �����ϴ�.");
			this.m1(); //������ ���������� �ٽ� m1���� �����Ŵ. = ���method
		}
	}
	
}