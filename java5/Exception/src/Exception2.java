
public class Exception2 {

	public static void main(String[] args) {
		
		
	try {
		//test(); : �޼ҵ� ȣ�� ��ü ����(static���� �ҷ����ؼ�..error exception�� ���� ����)
		
		Exception2 ex = new Exception2();
		String a = "ȫ�浿2";
		ex.test(a);
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void test(String b) throws Exception { //throws exception : ����ó�� -> try&catch
		//throws�� main�޼ҵ忡�� ����ó�� ���� �ش� �޼ҵ带 ȣ�� �� ��츦 �������ؼ� ���
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c =new Exception();
		throw c; // �ڵ� ���� �ؿ� ����� �ϸ� throw = return�� ����� ������ ������ �ִ�.
		//����ó�� ����� ���� ���� main method�� �ٽ� ���Ͻ�Ŵ 
		//throw : �����ڰ� ���� �Է�, ���� �ؿ� ����Ѵ�. 
	}
}
