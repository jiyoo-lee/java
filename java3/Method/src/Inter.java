//���� ������Ʈ���� ����.

/*
 * extends : �ڽ� class���� �ϳ��� �θ� �ε�
 * implements : �ڽ� class���� �������� �θ� �ε��� �� ����. ��, �������̼�(@Override) ������ ����ؾ���.
 * */

public class Inter implements ime1,ime2 {
	//�������̽��� ������ ������ �ؾ��Ѵ�.
	
	@Override
	public void c1() {
		System.out.println(names); //�μ����� �������� ȣ�⸸ �Ѵ�.
		System.out.println("interface_1");	
	}
	@Override
	public void c2() {
		System.out.println("interface_2");	
	}
	public static void main(String[] args) {
		//�������̽�
		Inter it = new Inter();
		it.c1();
		it.c2();
	}
}
