package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class List6 {

	public static void main(String[] args) {
		
		/*문자와 숫자 배열 섞어서 출력 실무 코드..ㅋ*/
		
		Scanner sc = new Scanner(System.in);
		int w = 0;
		
		ArrayList list = new ArrayList(); //자료형이 없는 상태 
		
		while(w < 5) {
			System.out.print("데이터를 입력해주시길 바랍니다. >>");
			String data = sc.next();
			list.add(data);
			w++;
			}
		
		System.out.println(list);
		
		/* 숫자 입력사항만 모두 더함 */
		int ww = 0;
		int total = 0;
		do {
			try {
				Object k = list.get(ww); 
				//배열자료가 숫자+문자 형태로 구성이 되어 있을 경우는 Object 매개 타입으로 설정합니다. 
				int numbers = Integer.parseInt(k.toString()); //String으로 바꿔서 또 int로 바꿔서 넘겨줌..
				// 해당 매개타입을 문자화하여 ParseInt로 재검증함 
				total += numbers;
				}
			catch(Exception b){ //배열의 매개타입이 숫자가 아닐 경우 (예외 상황 발생) 
				}
			ww++;
		}while(ww < list.size());
		
		//Object a = list.get(1);
		System.out.println("입력한 모든 배열의 숫자 합 :"+total);
		
		sc.close();
	}

}
