import java.util.Arrays;

public class Array10_1 {

	public static void main(String[] args) {
		
		int data[][] = {
				{5,7,19,22,33,27,11},
				 {1,2,3,4,5,6,7}
		       };
		
		//Double loop
		//data[0][0] + data[1][0]
		//data[0][1] + data[1][1] -> �ټ������� ũ�� ������. 
		int ea = data[0].length; // �迭�� �ִ� ������ ��ü ��
		int ea2 = data.length; // �迭�׷� ��
		int total1 = 0; 
		int total2 = 0; // ������ ���� �̰� �޴� ����
		int newdata[] = new int[ea]; //���ο� �迭 ��ü����
		
		int w=0; // ū �ݺ��� �ε�����
		while(w<ea) { // ū �ݺ��� 7���� (�迭������ ��ü��)
			
			int ww = 0;
			while(ww<ea2) { // ���� �ݺ��� 2���� (�迭�׷�)
				if(ww==0) {
					total1 = data[ww][w];
				}
				else {
					total2 = data[ww][w];
				}
				ww++;
			    }
			//���� �ݺ��� ������ ���ͼ� ù��° �迭�� + �ι�° �迭��
			newdata[w] = total1 + total2; //���ο� �迭 ��ü�� ���
			
		w++;
		}
		
	}

}
