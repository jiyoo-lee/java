import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		/* ���빮�� :
		 * 2���� ������ �迭�� �ֽ��ϴ�.
		 * �ش� ������ �迭�� ���� ���ó�� ���� ����Ͻÿ�.
		 * 1.����� ���ص� ��밡���ϱ� �� 2.����ص� �� do while / for/ while
		 * ����� : ["���ѹα�(40)","�Ϻ�(35)", "�߱�(70","��Ʈ��(55)","�±�(32)"] -> 5���� ������ �ȴ�.
		 * ["���ѹα�(40)","�Ϻ�(35)"] ["�߱�(70)",��Ʈ��(55)","�±�(32)"] -> ���� �ݺ������� �����.
		 * */
		
		String data [][] = {
							{"���ѹα�","�Ϻ�","�߱�","��Ʈ��","�±�"},
							{"40","35","70","55","32"}
							};
		
		int arr2 = data[0].length;
		String newdata[] = new String[arr2];
		
		
			int ww = 0;
			do {
				//System.out.println(data[w][ww]);
				newdata[ww] = data[0][ww] + "(" + data[1][ww] +")";
				ww++;
			}while(ww<arr2);
			
			
		
		System.out.println(Arrays.toString(newdata));
		
	}

}
