
public class Method8_1 {

	public static void main(String[] args) {
		
		
		abcd ab = new abcd();
		System.out.println(ab.aaa());
	}

}

class abcd {
	
	private int ori[];   // �迭���� ������� �ʵ��� ���
	private int count = 0; // Ȧ���� ��� +1�� ���� �ϱ� ���� �ʵ� ���� �� 
	
	public abcd( ) { //class�� public�� Ŭ�������� ����
		int[] odata2 = {15,22,17,14,32,35,19,33};
		this.ori = odata2;
		//aaa();
	}
	
	public int aaa() {
		int w = 0;
		int ea = this.ori.length;
		while(w<ea) {
			if(this.ori[w] % 2 == 1) {
				this.count++; //Ȧ���̸� +1�� ���� 
				}
			w++;
		}
		return this.count; //���� ���� return ��Ŵ.
		// �ڷ��� �����϶��� return ������
		
		/* ���� �ϴ°� : int ���� ������ String���� ��ȯ �ϴ� ��, getter setter */
	}
}
