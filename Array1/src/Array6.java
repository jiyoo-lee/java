import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/*응용문제 다음중 장바구니에 여러개의 상품이 담겨져 있습니다. 그 중, 택배비가 별도로 측정되는 금액만 추출하시오.
		 * 택배비는 30000원 이상(포함)부터 추출하면 됩니다.*/
		
		/*1. 반복문 먼저 돌리고 찍히는지 확인하고 
		 *2. 그 후에 조건 입력후(새로 돌릴 변수 만들어주는 것 반드시!!!! 필요) 
		 *3. 다른 배열로 옮기는건지 확인 -> 옮겨줄때 변수명 지정 잘 할것.*/
		
		int num [] = new int[4]; // 새로운 배열 생성
		int price [] = {15000,48000,67000,8000,118200,49800,6000,18700};
		int price_ea = price.length; // 변수로 배열의 길이값 초기화
		int ct = 0; //순차적으로 들어가게 하기위해 선언한 변수.
		
		for(int i = 0; i<price_ea; i++) { //price 길이만큼 돌려야함(쉽게 생각하면 price_ea - 1이라고 생각하면 됨 따라서 <
			if(price[i] >= 30000) { // 조건문 작성
				num[ct] = price[i]; //i는 조건과 상관없이 돌아가는거고 ct는 조건에 맞을때만 돌아가서 새로운 배열[]안에 ct를 적어준다.
				ct++; //조건에 맞을때만 증가시키는것.
			}
		}
		System.out.println(Arrays.toString(num)); //배열을 재구성해서 나타나게 한것.

	}

}
