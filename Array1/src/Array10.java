import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {

		/*응용문제 : 해당 두개의 배열 데이터가 있습니다. 각 배열 별로 인덱스가 같은 번호를 더해서 
		 * 짝수, 홀수 인지를 배열 결과 데이터로 재설정 하십시오.
		 * 결과 : Adata = 5 17 19 22  33
		 *       Bdata = 1  2  3   4   5*
		 *       result= {"짝수","홀수","짝수","짝수","짝수"} */
		
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
				result[i] = "짝수"; 
			}
			else {
				result[i] = "홀수";
			}
		}
		System.out.println(Arrays.toString(result));

		
		/* while(f<data.ea) {
		 * total = a1[0][f] + a1[1][f];
		 * if(total%2 ==0) {
		 * result = "짝수";
		 * else {
		 * result = "홀수";
		 * }
		 * result_data[f] = result;
		 * f++;
		 */
		
		
		
		
	}
}

