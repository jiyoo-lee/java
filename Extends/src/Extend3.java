
public class Extend3 {

	public static void main(String[] args) {
		/*���빮�� �ΰ��� ���� �ܺ� Ŭ������ �����ϴ�.
		 * �ش� Ŭ�������� �ΰ��� ���� ����ϰ� �˴ϴ�.
		 * ��������� ������ �����ϴ�.
		 * 3,10�� ������ �ΰ��� ���� ���� ���մϴ�.
		 * ������ Ŭ�������� �ܺ� Ŭ�������� �ش� ��� ���� ����մϴ�. Ŭ���� 2��?
		 * �ΰ��� �� ���� ¦��, Ȧ�������� ����ϴ� extends�� �����ϼ���/*/
		
		int a = 3;
		int b = 10;
		OddOrEven oe = new OddOrEven();
		oe.add(a,b);
		oe.ooe();
	}
}

class Numbers {
	protected int adder;
	
	public void add (int first, int second) {
		this.adder = first + second;
	}
}
class OddOrEven extends Numbers { //�ڽ��� Method�� �ϳ��� ������ �־���Ѵ�.
	
	private String[] msg = {"¦���Դϴ�.", "Ȧ���Դϴ�."}; //�ǹ� : ��� private�ε� static���� �Ѿ����?
	
	public void ooe() {
		if(this.adder % 2 == 0) {
			System.out.println(this.msg[0]);
		}
		else {
			System.out.println(this.msg[1]);
		}
	}
}