package ab;
//interface�� ���� ����� �޼��常 ����, �߰��� ������ ó���ϴ� ������ default�� �߰� ��. (java 14���� �߰���)
public interface Method2Inter {
	
	// interface���� �ʵ带 �ٷ� ���ø��� ���� : abstract�� Ŭ������ interface�� method�� �ʵ� ������ ����
	public String names(); //String names() return �޼��� ����
	
	default void  setbox(String a) { //setter 
		System.out.println(a);
	}
	default String box3() { //getter 
		//interface���� default�� �����ϸ� ���� �޼ҵ带 �����.
		
		return null;
	}
}

interface Method2re extends Method2Inter { 
	//interface�� extends�� ���� interface�� �ε��� �� �ִ�.
	
}

interface Meothod2rere extends Method2re {
	// interface ���� Ȯ�� 
}
