import java.util.Arrays;

public class Method9_1 {

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

		coupang c = new coupang();
		System.out.println(Arrays.toString(c.get()));
		
	}

}

class coupang{
	
	private String[][] menuData; // -field 선언시 static에서는 실행이 안된다. (필드,this 사용 다 안됨)
	private String[] rdata;
	
	public coupang() {
		String[][] ms = {
						{"로켓배송","로켓프레시","쿠팡비즈","골드박스","이벤트","설날","추석"},
						{"Y","Y","N","Y","Y","N","Y"}
						};	
		this.menuData = ms;	
		yData();
	}
	
	public void yData() {
		
		int w  = 0;
		int ea = this.menuData[0].length;
		String ww[] = new String[ea];
		int ct = 0;
		do{
			if(this.menuData[1][w].equals("Y")) {
				ww[ct] = menuData[0][w];
				ct++;
			}
			w++;
		}while(w < ea);
		this.rdata = ww;
	}
	
	public String[] get() {
		
		return this.rdata;
	}
}

 /*   
  * class aa{
  * int a;      -> field 
  * String b;
  * 	public aa() { -> constructor 생성자 
  * 	}  
  * 	
  * 	-- method -- 
  *  	public void
  *  	public static void
  *  	public String abc
  *  	-- 
  * */
