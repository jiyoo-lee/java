import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/* 응용문제
		 * 배열을 생성하는 문제
		 * 관리자에서 메뉴를 활성화 하는 프로세서입니다. 
		 * 해당 메뉴 활성화는 2차 배열이며 메뉴명과 활성화하는 Y 또는 N 구분합니다.
		 * 해당 활성화 값을 대입하여 y로 적용되는 인덱스 번호에 맞는 메뉴명을 일차배열로 재구성후
		 * main에 출력하시오
		 * 결과: [ 로켓배송, 로켓프레시, 골드박스, 이벤트, 추석 ]
		 * 단, private 및 return을 활용하여 프로그램을 작성하시오.
		 *  */

		menus mn = new menus();
		String[] yesMenu = mn.coupangY();
		System.out.println(Arrays.toString(yesMenu));
		
	}
}

class menus{
	
	private String[][] coupang;
	private String[] yes;
	
	public menus() {
		String[][] ms = {
						{"로켓배송","로켓프레시","쿠팡비즈","골드박스","이벤트","설날","추석"},
						{"Y","Y","N","Y","Y","N","Y"}
						};
			
		this.coupang = ms;		
	}
		
	public String[] coupangY() {
		int count = 0; 
		int arrayCount = 0;
		int ea = this.coupang[0].length;
			
		for(int i = 0; i < ea; i++ ) {
			if(this.coupang[1][i].equals("Y")) {
				count ++;
			}	
		}
			
		this.yes = new String[count]; 
		for(int j = 0; j < ea; j++ ) {
			if(this.coupang[1][j].equals("Y")) {
				this.yes[arrayCount] = coupang[0][j];
				arrayCount++;
				}
			}
		return this.yes;
	}
}