
public class Class1 { //���� ���� Ŭ���� �̸�

	public static void main(String[] args) { //�Ϲ� main �Լ�
		
		Adata a = new Adata(); //Adata class ���� �ε�. ���� ����.
		Bdata b = new Bdata();//Bdata class ���� �ε�
		// �ε尡 ��
		
		System.out.println(a.aa); //Adata Ŭ���� �ȿ� ���� �ڷ��� ��ü���� ������.�ش�Ǵ� �����͸� ��� �� �Ŀ� �������� ����� ����ȴ�.
		System.out.println(b.aa); //Bdata class �ȿ� ���� �ڷ��� ��ü���� ������.
		
		Cdata c = new Cdata();
		/* Cdata�ȿ� ���� �ڷ����� ������ => ���� �⺻�Լ��� ���� �Է��� �� ��ü ���� �޾� ��������� ���(�ν��Ͻ� ����)*/
		c.aa = 10;
		c.bb = 30;
		c.cc = c.aa+c.bb; // ������ ������ main�ȿ���
		System.out.println(c.cc); 
	}

}

//aa�� ������ �ٸ� Ŭ������ �ֱ� ������ �ߺ������ʽ��ϴ�. final �����ص� �ٸ� Ŭ���������� �������.
class Adata{ //a�� / ����Ŭ�������� ���� ����. -> ���� �۵��� �μ������� �۵��Ǵ� Ŭ������
	String aa = "ȫ�浿";
}

class Bdata{
	String aa = "�̼���"; //Adata Ŭ������ �ٸ� ������ ������. �ٸ� �ǹ�.
}

class Cdata {
	// �Լ��� ��� sysout �� ��.
	int aa;
	int bb;
	int cc;
	// �ش� Cdata�� �ִ� Ŭ�������� �ڷ����� ���� ������ ������ �մϴ�.
	// ��, �������� �Լ��� ���� ��Ȳ�̹Ƿ� ���� �Ǵ� sysout�� ������� ����.
	//class �ȿ� �Լ��� ����� sysout �� ��� ������.
}


