
public class Example3 {

	public static void main(String[] args) {
		
		Inherit2 ih2 = new Inherit2(); // �ڽ� Ŭ������ �θ��� �ڵ����� �θ� Ŭ������ �ҷ�����.
		ih2.it("ȫ�浿", "aaa5");
		ih2.print();
	}

}

// Ŭ���� -> �ʵ� -> �޼ҵ� ������ ����ȴ�.

class Inherit1 { //�����͸� �޴� ����
	private String nm; //Inherit1 Ŭ���������� �� �� �ִ� �޼ҵ�
	protected String pw; //�ܺο��� ���� ���� �� ���� ������ ��ӵǾ��� �޼ҵ峢���� ���� �Ѱ��ְ� ���� �� ����.
	public String aa; 
	//�� private���� ���� �κ��� Inherit2������ ����� �� �ֵ��� �ϱ� ����
	
	public void it(String d1, String d2) {
		this.nm = d1;
		this.pw = d2;
		this.aa = this.nm; //private ���� �Ѱ��ְ������ public�� ��Ҵٰ� ����ؾ��Ѵ�.
	}
}

class Inherit2 extends Inherit1 { //������ ��� �ϴ� ����
	
	public void print() {
		System.out.println(this.aa +" "+ this.pw);		
	}
}
