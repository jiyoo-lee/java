package app;

public class App1 {
	/*App1�̶�� �⺻ ���� class�̸� abox�� main�� ������ ����*/

	public static void main(String[] args) {
		//method11���� �ε��� ��� �ش� �ܺ� blue Ŭ������ �ε��Ͽ� 
		// ��½��� method11�� �ε��� �� �ֵ��� ��.
		Blue b = new Blue();
		System.out.println(b.box());
	}
	
	public void abox() {
		System.out.println("Test import");
	}

}

//Blue�� ������ �ܺ� Ŭ�����̸� method11���� �������� �ڵ鸵�� �Ұ�����
class Blue {
	private String msg;
	
	public String box(){
		this.msg = "ȯ���մϴ�";
		
		return this.msg;
	}
}