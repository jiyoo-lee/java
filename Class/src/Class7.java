
public class Class7 {

	public static void main(String[] args) {

		/*
		 * Ŭ������ �⺻ �޼ҵ� ��ü �ʵ尪 ����
		 * 
		 * 
		 */
		String mid = "hong";
	    String mname = "ȫ�浿";
				
		java1 jv1 = new java1(mid,mname); // ��ü���� �� �ν��Ͻ��� �����ϸ� ���ο� �ٷ� �۵���.
		
	}

}

class java1 {
	//java1 class�� main���� ��ü���� �� �ν��Ͻ��� �����ϸ� �ٷ� �۵��ϴ� Ŭ���� �⺻ �޼ҵ��Դϴ�.
	public java1(String a, String b) { // �⺻ �޼ҵ常 ������ Ŭ������� ���� ������Ѵ�. class�� �⺻���� ����ϴ� �޼ҵ�. �ѹ��ۿ� ������� ���Ѵ�.
		//�⺻�� �Ǵ� ���������� ó���Ҷ� ���� ���� �⺻ �޼ҵ�.
		System.out.println(a+b);
		java2(); // ���� Ŭ���� �ȿ��� �⺻ �޼ҵ�ȿ��� �ٷ� �����ų �� ����.
		// void method�� �ٷ� ȣ�� �� �� �ֽ��ϴ�.
	}

	public void java2() {
		System.out.println("test");
	}
	
	
}