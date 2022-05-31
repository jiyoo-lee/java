import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		/* 응용문제 :
		 * 2개의 데이터 배열이 있습니다.
		 * 해당 데이터 배열을 다음 결과처럼 값을 출력하시오.
		 * 1.더블로 안해도 사용가능하긴 함 2.사용해도 됨 do while / for/ while
		 * 결과값 : ["대한민국(40)","일본(35)", "중국(70","베트남(55)","태국(32)"] -> 5번만 돌려도 된다.
		 * ["대한민국(40)","일본(35)"] ["중국(70)",베트남(55)","태국(32)"] -> 더블 반복문으로 써야함.
		 * */
		
		String data [][] = {
							{"대한민국","일본","중국","베트남","태국"},
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
