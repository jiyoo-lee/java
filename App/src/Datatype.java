
public class Datatype {

	public static void main(String[] args) {
		//String : ���� "" ������ ���
		String a = "1234"; 
		System.out.println(a);
		/* ������ */
		byte b = 127; //java���� byte�� ���� ���� ���� *����: -128~127
		System.out.println(b);
		
		short c = 32767; // short: -32,768 ~ 32,767
		System.out.println(c);
		
		int d = 100000; // int : -2,147,483,648 ~ 2,147,486,647
		System.out.println(d);
		
		long f = 9999L; // long : 9,000,... 18�� / �޸� �Ҵ緮�� ���� ũ��. / �⺻�޸� �Ҵ翡�� �߰��� ����� ���ɹ����� �þ��.
		                // long���� ū �� ���� ���� L ����ؾ���(�޸� �Ҵ� ����Ʈ Ǯ��)
		System.out.println(f);
		/* ������ �� */
		
		/* �Ǽ��� */
		float z = 3.5f; // (f �����Ұ�) float : 3.4024800000+38
		System.out.println(z);
		
		double k = 44.5178; // (d ��������) double : 1.784+308
		System.out.println(k);
		/* �Ǽ��� �� */
		
	}

}
