package box; //pckg�� ���� java�� �����Ű�� �Բ� ����Ǵ� java file load type.

public class Class1 {

	public static void main(String[] args) {  
		// public static ��¼��� main pck�߿��� ����Ǵ� ������ java file���� �����մϴ�.
		
		Class2 c2 = new Class2();
		System.out.println(c2.names);
		
		Adata a = new Adata(); //�⺻ �ƴ� �⺻ Ŭ���� ���� �ٸ� Ŭ���� �ҷ�����
		//Class2.java�� Adata��� ������ Adata class�� �ε���.
		System.out.println(a.names);

	}

}
