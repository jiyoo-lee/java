import java.util.Arrays;
import java.util.Scanner;

public class Class_array3_1 {

	public static void main(String[] args) {
		
		String a1 [] = {"ȫ�浿","�̼���","������","������"}; //a1�迭
		String a2[] = {"100", "80","39","60","55"};    //a2�迭
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���.");
		String usernm = sc.next(); //����ڰ� �Է��� ������ usernm
		
		jumsu jm = new jumsu();
		jm.ck(a1,a2,usernm);
		
		sc.close();

	}

}

class jumsu {
	
	public void ck(String data1[], String data2[], String user) { //�迭�� main�� ���� ���ְ� �����Ѵ�.
		for(int i = 0; i<data1.length; i++) {
			if(user.equals(data1)) {
				System.out.println(data1[i]+"���� "+data2[i]+"�� �Դϴ�.");
			}
		}
		 {
			System.out.println("����� �̸��� �ٽ� Ȯ�����ּ���.");
		}
	}
	
	
}