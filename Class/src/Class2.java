
public class Class2 {

	public static void main(String[] args) {
		/* ���빮�� ��ø Ŭ������ �̿��Ͽ� �ڽ� Ŭ������ ������� ����ϴ� ���μ����� �����Ͻÿ�.
		 * Ŭ������ 2������ �ֽ��ϴ�. 
		 * �θ� Ŭ������ : mother 
		 * �ڽ� Ŭ������ : child
		 * ���ο��� mother Ŭ������ ���� ����
		 * ���� 30, 50�� ����
		 * child���� �θ� Ŭ������ �޾� �ΰ��� ���ڰ��� ���ؼ� ������� ����ϻ� 
		 *  */

		Mother m = new Mother();
		m.numbers(30, 50);
		Mother.Child c = m.new Child();
		System.out.println("����� :" + c.results());
		
	}
}

class Mother {
	int a;
	int b;
	
	public void numbers (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	class Child {
		int sum = 1;
		
		public int results( ) {
			sum = Mother.this.b * Mother.this.a;
			
			return sum;
		}
	}
}