import app.App1; 		
//���� pck �ڰ� java ���ϸ�, �ٸ� pck�� �ε�� import�Ͽ� �����
//�ܺ� Ŭ������ ������ �� �ִµ� main Ŭ������ ������ �� �ְ� �ٸ� ������ class�� �ҷ��� �� ����.
//�ܺ� package���� App1.java ������ �ε� �� �⺻ ������ �ε��Ͽ� ����մϴ�.  

public class Method11 {

	public static void main(String[] args) {

		App1 b = new App1();	// main method�� �ε��ϰ� �˴ϴ�. 
		
		//b.main(args); //���������� ������ static �̱⶧���� sysout ����
		b.abox(); // �ȿ� �ִ� �޼ҵ�� �ҷ� �� �� ����
		//main method �ȿ��� abox��� void method�� �ε��ϴ� �κ�
	}

}
