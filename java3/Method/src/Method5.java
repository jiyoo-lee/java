
public class Method5 {

	public static void main(String[] args) {
		
		/*private this */
		
		cdb c = new cdb();
		
		/*c.d1 = "ȫ�浿";
		c.data2();
		c.d3= "�̼���";
		cdb.data1();
		c.d3= "������";
		System.out.println(c.data3()); */
		
		
		//c.d2 = "������"; /*private���� ������ ��ü�̹Ƿ� main class���� �ε� ����*/
		c.data2("������");
		String result = c.data3();
		System.out.println(result);

	}

}
//���� ���ͼ���...........?��°� ���

class cdb {
	String d1; /* void, �ڷ��� �޼ҵ� �ε� ���� */
	private String d2 = null; //�� Ŭ���������� ��밡���ϸ� static���� ��� �Ұ�
	//
	public static String d3; // �Ѵ� static���� �޸𸮿� �ö������� sysout���� ����. // �� ��� ����
	// this ��� �Ұ���
	public static void data1() { /* static �ڷ��� �ܿ��� �ε尡 �Ұ����� this�� �ȵ�.*/
	//	System.out.println(d3);
		
	}
	public void data2(String user) {
		this.d2 = user;
		System.out.println(d2);
	}

	public String data3() {
		String a = this.d2;
		return a;
	}
	
}