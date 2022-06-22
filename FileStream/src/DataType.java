import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		
		
		/* String vs new String(); ����
		 * String�� heap ������ String Pool�� ����Ǿ����� ���� ���� ��� ���� �ּҸ� ����Ų��. (== equals ��밡��)
		 * new String�� ��ü�� ���� ��������⶧���� �������� �ٸ� ������ ����Ű���� heap ������ �����ִ�.(���� �޸� ���� ��ȿ����)
		 * (equals�ۿ� �������Ѵ�.) �����ּҸ� ����Ű�°� �ƴ� ���� ��ü�� �����Ǳ⶧���� ���� ���̿��� �ٸ� ������ �ν��Ѵ�.
		 * �ڹ��� ���ڿ��� java.lang ��Ű���� String Ŭ���� �ν��Ͻ��� �����ȴ�.
		 * intern()�� ���� pool ������ heap ������ �Ѵ� ��� �� �� �ְ� ����ϴ� �޼ҵ�(pool ������ �������� �������)*/
		
		//intern() : equals�� ������� �ʰ� == (�ε��ȣ�� ��밡��) 
		String data[] = {"ȫ�浿","�̼���"}; 

		String a = "ȫ�浿";
		String b = "ȫ�浿";
		String c = new String("ȫ�浿").intern().indent(0); //���� String�� ���� �ٸ�
		String d = new String("ȫ�浿"); //���� String�� ���� �ٸ�
		String e = data[0]; //���� String�� ���� ����
		String e2 = data[1]; //���� String�� ���� ����
		Scanner sc = new Scanner(System.in);
		String f = sc.next().intern();
		String h = new String(data[0]); 
		
		System.out.println(c==h); // ��ĳ�� ���: a==f ����ٸ� c==f ����ٸ� .intern() ���̸� == ���� ���� ������
		
		//equals�� �����Ͱ� �������� �ӵ��� �پ�� ���� ==�� ���� ���� ��õ��.
		
		
		if(c.equals(a)) {
			System.out.println("���� �����ϴ�.");
		}
		
		//new String : �Ҽ��� ���� �����й��� �ڷ���(����,�迭��)
	}

}
