import java.text.SimpleDateFormat;
import java.util.Date;

public class Double_loop1 {

	public static void main(String[] args) {
		/*Date */
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YY년MM월dd일");
		SimpleDateFormat time = new SimpleDateFormat("H:m:s"); //대문자는 17시 21시 이런식
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		
		//format : 규격화된 형태로 값을 표현 할때 사용하게됩니다.
		// import 문 안쓰면 지우기
		
		// 공부할거 BigInteger, SimpleDateFormat date time + 예습하기로 한거(직전파일example 10에 있음)
		
		// int f;
		//for(f=1; f<=10; f=f+2){ }  -> 2씩증가 (실무에서 잘 쓰진 않음)
		
		/*응용문제
		 * 바코드로 상품을 입력시켜주세요라고 하고 금액을 입력하고(3번반복)
		 * "할인 %를 입력해주세요"라는 문구와 함께 해당 할인 숫자를 입력하면 최종 금액이 변경되어 출력되도록 합니다.
		 * 스캐너, if문,sysout
		 * 힌트: int money = 10000 ;
		 * int coupon = 20;
		 * double discount = coupon * 0.01 -> 0.2
		 * 
		 * system.out.println(discount) 
		 * double a = money * discount
		 * system.out.println(discount)
		 * int c = money -(int)( a ) //double c로 써도 됨 
		 * system.out.println(c)*/

		
	}

}
