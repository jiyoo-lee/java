package ab2;

import ab.Method1; //public�̶�� ����� ��Ű���� �ٸ� Ŭ������ �޼ҵ带 ������ �� �ִ�
//package ab���� main Ŭ������ �ε��� 

public class Ab2Method extends ab.Method1 { //public class�� �� ȭ�鿡 �ѹ��� ���� �� �ִ�.
											// package ab2���� import�Ҽ� �ֵ��� �ϸ�, �ܺ�Ŭ�������� �����ϰ� �������� ��.

	public static void main(String[] args) {
		//main class�� �������̵� �ߴ�.
		
		ab.Method1 at = new ab.Method1();
		at.main(args); // main method ����
		at.recall();	// public �޼ҵ� ����
		at.name();
	}

}
