
public class Method2 {

	public static void main(String[] args) {
		/*  //default package ���� �ش� class���� ȣ�� �ϸ� ��.
		 * ��, pck�� �������� ��� ���� ��ܿ� pck�� �����ؾ� ��.
		tests ts = new tests(); 
		// default�� �ٷ� �ҷ��� �� �ְ� �ٸ� ��Ű���� ���������� ���� �� �ε� �� �� �ִ�.
		// 
		ts.a2++;
		System.out.println(ts.a2); */
		
		info i = new info();
		//System.out.println(i.data1(20));
		//System.out.println(i.data2(20));
		
		/*success
		i.data3(20); */
		
		System.out.println(i.data3(20));
		
		String result = i.data4("ȫ�浿"); 
		/*data4 method return ���� result ������ �޾Ƽ� ó�� */
		System.out.println(result);
	}

}

class info {
	// static �Ǵ� void method���� return�̶�� ��ɾ ������� ����.

	public static int data1(int abc) {
		int z = abc + 20;
		//System.out.println(z);
		return z;
		
	}	
	public static int data2(int abc) {
		int z = abc + 20;
		//System.out.println(z);
		return z;
	}
	
	public int data3(int abc) {  
		/*�ڷ��� �޼ҵ��� ���ϸ� ������ return�� ����ؾ��մϴ�.  
		��, sysout�� ������� ���մϴ�.*/
		int z = abc + 20;
		return z; //�ڷ������� return method
	}
	
	public String data4(String abc) {
		String z = abc + "�� ȯ���մϴ�.";
		return z;
	}
	
	
}