package ab2;

public interface AppData1 {
	String a = null;		// �ʵ忡 �ڷ����� ����ִ� ���� ��� �� ��� ���� ��ü�� �ȵ� (������ �� ����)
	int b = 0;
	
	public void user_join();	//���������� �޼ҵ�� this ��� ����
	default void aaa() { //default���� this ����� ����  (���� ���� ���)
		System.out.println(this.a);
	}
}
