public class Method_1 {

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

class odbc{
	
	private int[] oda;
	private int count;
	
	// ������
	public odbc() {
		int[] odata = {15,22,17,14,32,35,19,33};
		this.oda = odata;
	}
	
	public int numbers() {
		int ea = this.oda.length;
		
		for(int i = 0; i < ea; i++) {
			if(this.oda[i]%2 == 1) {
				this.count++;
			}
		}		
		return this.count;
	}
	
	
}


//  �ñ��Ѱ� : this ��� ���°���, private ��� �� ������, �޼ҵ� �������