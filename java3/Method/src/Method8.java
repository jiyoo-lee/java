
public class Method8 {

	public static void main(String[] args) {
		/* ���빮�� 
		 * ���� �迭�� ����� main�� �ǰ� �Ͻÿ�.
		 * ���� ���α׷��Ӱ� �ش� DB�� �� �� Ȧ�� ���� ���� �� ������ �ް��� �մϴ�.
		 * �ش� ������ ��� �� �� �ֵ��� �ڵ带 �ۼ��Ͻÿ�. 
		 * */
		
		odbc od = new odbc();
		System.out.println(od.numbers());

	}

}

class odbc {
	
	private int[] od; 
	private int ct;
	
	public odbc() {
		int[] odata = {15,22,17,14,32,35,19,33};
		this.od = odata;
		for(int i = 0; i < od.length; i++) {
			if(this.od[i]%2 == 1) {
				this.ct++;
			}
		}
	}
	
	public int numbers() {
		
		return this.ct;
	}
}