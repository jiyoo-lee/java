
public class Method14 { //�ʵ��� ������

	public static void main(String[] args) {
		Mbc m = new Mbc();
		Mbc m2 = new Mbc("�̼���");
		
		

	}

}

class Mbc {
	public Mbc() { //�μ��� ���� �����Ŵ, �Ϲ� constructor
		System.out.println("����1");
		test();
	}
	
	public Mbc(String user) { //�μ��� �ִ� ���� , �μ� ���� �ִ� constructor �μ����� �ڷ������� ���еǾ����ϴ�.
		System.out.println(user);
		test(user);
	}
	public void test() { //�μ����� ���� method
		System.out.println("�޼ҵ�");
		total();
	}
	public void test(String user) { //�μ����� �ִ� method
		System.out.println(user);
		total();
	}
	public static void total() {
		System.out.println("�ý��� ����");
	}
	
	
}
