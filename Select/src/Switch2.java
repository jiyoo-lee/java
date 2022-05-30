import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/* 응용문제: 1~5번까지 숫자를 하나 입력해주세요 라고 질문을 받습니다.
		 * 
		 * 결과내용: 1: 5% 2: 10% 3~4: 택배비 무료 5 : 다음기회에..
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5번까지 숫자를 하나 입력해주세요.");
		int user = sc.nextInt();
		String msg;
		/*		
       switch (user) {
       case 1 :
    	   msg = "5%할인쿠폰";
    	   break;
       case 2 :
    	   msg = "10%할인쿠폰";
    	   break;
       case 3 : case 4:
    	   msg = "택배비무료입니다.";
    	   break;
    	   default:
    	   msg = "다음기회에..";
           break;
       }*/
		
		/* switch version up 형태(java 14이상부터 쓸 수 있다 */
		
		switch(user) {
		case 1 ->  {
		 msg = "5%할인쿠폰";
		} //-> 화살표, break가 {}로 바뀜.
		case 2 -> {
		 msg = "10%할인쿠폰";
		}
		case 3,4 -> {
		msg = "택배비무료입니다.";	
		}
		default -> {
	    msg = "다음기회에..";	
		}
		
	}
		
		
		
       System.out.println(msg);
       
       sc.close();

	}

}
