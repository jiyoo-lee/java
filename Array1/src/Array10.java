import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {

		/*���빮�� : �ش� �ΰ��� �迭 �����Ͱ� �ֽ��ϴ�. �� �迭 ���� �ε����� ���� ��ȣ�� ���ؼ� 
		 * ¦��, Ȧ�� ������ �迭 ��� �����ͷ� �缳�� �Ͻʽÿ�.
		 * ��� : Adata = 5 17 19 22  33
		 *       Bdata = 1  2  3   4   5*
		 *       result= {"¦��","Ȧ��","¦��","¦��","¦��"} */
		
		int data[][] = {
				{5,7,19,22,33},
				 {1,2,3,4,5}
		       };
		int arr = data[0].length;
		int newdata[] = new int[arr];
		String result[] = new String[arr];
		int i;
		
		for(i =0; i<arr; i++) {
			newdata[i] = data[0][i] + data[1][i];				
			if(newdata[i]%2 == 0) {
				result[i] = "¦��"; 
			}
			else {
				result[i] = "Ȧ��";
			}
		}
		System.out.println(Arrays.toString(result));

		
		/* while(f<data.ea) {
		 * total = a1[0][f] + a1[1][f];
		 * if(total%2 ==0) {
		 * result = "¦��";
		 * else {
		 * result = "Ȧ��";
		 * }
		 * result_data[f] = result;
		 * f++;
		 */
		
		
		
		
	}
}

