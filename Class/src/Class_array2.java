import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~10���� ���ڸ� �ϳ� �����ϼ���");
	    int no = sc.nextInt();
	/*	memories m = null; //�޸𸮸� �����ϸ鼭 �ڵ� ���ϴ� ��� 
		memories m = new memories();
		m.ms(no);
	    m = null; //(�ʱ�ȭ)		//�ش� �ν��Ͻ��� ���
		
		memories ms = new memories();
		ms.rd(); */
		
		// �ڵ�� Ŭ�����ȿ����� �̷������ �ؾ��Ѵ�. ���ο��� �Է� �ް� �ѱ�°͸�.
	}

}

class memories {
	public void ms(int user) {
	//Math.random() ���� �޼ҵ� ���� : �⺻ �ڷ����� double�Դϴ�.
		// ���� ���� �� : ������ȣ, �ӽú�й�ȣ, ��÷,�귿 ���� ���� ���� ���δ�. 
	//double a = Math.random(); //0.0 ~ 1.0���� ��� ����� ������ ��ȣ x
	for(int i =0; i<=10; i++) {
    int b =(int)(Math.random()*10);// ��ȣ ����. double -> int�� ����ȯ // *9)-1 -> 1~10���� �������ϴ� ��  *10�� �ϸ� 0~9���� ������ ��. 
	System.out.printf("%d ",b);
	}
	
	
    /*
	if (user == b) {
		System.out.println("��÷");
	}
	else {
		System.out.println("������ȸ��...");
	}*/
		
	}
	
	public void rd() {  //randaom util ����
		Random r = new Random(); // Random ��ü ���� �� �ν��Ͻ� ����
		int w = 0;
		
		while(w<=6) {
		System.out.println(r.nextInt(45)+1); //0~9���� r.nextInt�� ���
		w++;
		}
		
		//r = null; //�޸� ������� �����°�. ����.
	}
}
