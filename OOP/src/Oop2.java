import java.util.Arrays;

public class Oop2 {

	public static void main(String[] args) {
		/* �迭 �űԻ��� ���� ��Ȯ�ϰ� �����Ͽ� �űԹ迭�� �����ϴ� Object */
	
		Array1 arr = new Array1();
	}
}

class Array1 {
	private int ar1[];
	private int ea;
	
	public Array1(){
		//�迭�� �ʵ忡 �ִ� ���� �������� ó���ϴ� ���(this)
		 this.ar1 = new int[] {1,2,3,4,5,6,7,10,19,8,4,7,0,2}; // ���� �̷��� �ص� �ȴ�
		 this.ea = this.ar1.length; // �迭 ���� �ľ�
		 
		//5�̻� �迭���� ��������//
		int w = 0;
		String newData = ""; 
		
		while(w < ea) {
			
			if(this.ar1[w] >= 5) {
				//System.out.println(this.ar1[w]);
				newData += this.ar1[w] + ",";  //�ش� ���ǿ� �´� ���� ���ڿ��� ��ȯ�Ͽ� �迭���� ������ ����+ ","�� �����ֱ�
				}
			w++;
		}
		
	// ���ο� �迭�� ���̸� ���ϴ� �ڵ�	
	String ar2[] = newData.split(","); //String�� ���� �͵��� ,�� �������� �迭�� �ӽ÷� �ִ´�.
	// split�� ���� ���ڴ� �ȵ�. 
	int ar2Ea = ar2.length; // �迭�� ���̸� ���ϴ� ��������
	int oridata[] = new int[ar2Ea]; // ���� �迭 ���̸�ŭ�� �迭 ������ ���� �߰��ϰ� �˴ϴ�. 
	
	int ww = 0;
		while(ww <ar2Ea) {
			oridata[ww] = Integer.parseInt(ar2[ww]); 
			// ���ڸ� ���ڷ� ��ȯ�Ͽ� �ű� �迭 �����ڿ� ���� ����
			ww++;
			}
		
		System.out.println(Arrays.toString(oridata)); //��� �迭 ���
	}
	
}