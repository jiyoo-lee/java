import java.util.Arrays;

public class test3 {

	public static void main(String[] args) {

		
		 /* [TEST1]
		다음 해당 값이 있습니다. 해당 값에 대해 배열로 각각 저장 되도록 합니다.
			honggildong

		결과 h,o,n,g,g,i,d,o,n,g 로 배열이 저장 되어야 합니다. 해당 처리는 외부 class에서ß 처리가 되도록 합니다.*/
		
		Separater separater = new Separater();
		separater.separate();
		
	}

}

class Separater {
	
	String name = "honggildong";
	char[] nameArr = new char[name.length()];
	
	public void separate () {
		
		for(int i = 0; i < nameArr.length; i++) {
			nameArr[i] = name.charAt(i);
		}
		
		System.out.println(Arrays.toString(nameArr));
	}
	
}
