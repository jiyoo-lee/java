
public class Method1 {

	public static void main(String[] args) {
	
		tests t = new tests();
		t.a1++; // = 2
		t.a2++; // = 2
		t.name1();		
		
		t.b1 += "������"; // = �̼���������
		t.b2 += "������"; // = ȫ�浿������
		t.name2();
		
		tests tt = new tests();
		tt.a1++; // = 1
		tt.a2++; // = 3
		tt.name1();
		
		tt.b1 += "������"; // = �̼��Ű����� (default �̼����� �����ְ� �������� �������� ���� ���������� �ٲ��.)
		tt.b2 += "������"; // = ȫ�浿������������ (���� ���� ������)
		tt.name2();
				
	}
}


class tests {
	
	int a1 = 1; //(���� ����) 
	// ���ο� ��ü ���� �� Ŭ������ ȣ�� �� 1�̶�� ���ڸ� �ٽ� �����Ե˴ϴ�.
	public static int a2 = 1; //(���� ����)
	//���ο� ��ü ���� �� Ŭ������ ȣ���ϴ��� 1�̶�� ���ڰ� �ƴ� �޸𸮿� ��ϵ� ���� ���� ���������� ������ �˴ϴ�.
	//String�� ���� ex. public static String = "��"; 
	// ������ �޸𸮰� ��� �����ϱ⶧���� ��������� �ʿ��� ��Ȳ���� ���δ�.
	
	String b1 = "�̼���";
	public static String b2 = "ȫ�浿";
	
	public void name1() {
//		System.out.println(a1);
//		System.out.println(a2);
		
	}
	public void name2() { 
		System.out.println(b1);
		System.out.println(b2);
		
	}
	
	
}