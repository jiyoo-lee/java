
public class Method3 {

	public static void main(String[] args) {
		/* 응용문제 
		 * 인수값 두개의 숫자를 적용하여 계산되도록 합니다.
		 * 최종 계산값을 받아서 결과를 main에서 출력하시오.
		 * 숫자 : 157, 45
		 * 157*45
		 * 최종결과 값 출력 : 7065*/
		
		Method3 mt = new Method3();
		int result = mt.nums(157,45);
		System.out.println("최종 결과 값: "+result);
		
		mt.nums2();
		mt.nums();
		
		/*응용문제 자료형 메소드
		 * 다음 숫자 하나를 해당 메소드로 전달하게 됩니다.
		 * 해당 메소드에서는 다음과같이 처리합니다.
		 * 숫자 3을 전달하면 3*1~3*9까지의 모든 결과값을 더하여 sysout으로 출력하세요.*/
		int add = mt.gugudan(3);
		System.out.println(add);
		
	}
	
	public int nums(int first, int second) {
		int rs = first * second;
		return rs; //여기서 sysout 안됨.
	}

	public void nums2() { 
		int z = nums(100,200);
		System.out.println(z);
	}
	
	public void nums() { //같은 변수명이라도 인수값으로 구분하여 사용을 할 수는 있으나 혼돈이 있을수 있기때문에 지양한다.
		System.out.println("연습입니다.");
	}
	
	public int gugudan(int i) {
		int total = 0;
		for(int j = 1; j <= 9; j++) {
			total += (i * j);
			} 
		//반복문 안에는 return을 절대 못 쓴다. 조건문을 걸거면 break로 나와서 반복문 밖에 써야한다.
		// 조건문이라도 더블로 return 사용 안됨. 아래와 같이 쓰는 것을 추천.
		/* public String mb(String mid) {
		 * String msg = "";
		 * String msg2 = "홍길동";
		 * if(mid.equals("hong")) {
		 * msg  ="ok";
		 * else {
		 * msg = "cancel";
		 *  }
		 *  return msg; // 해당 메소드에 변수를 생성 후 조건에 맞는 값을 적용하여 최종적인 값을 return시킴.
		 * }*/
		return total;
	}
	
	 public String mb(String mid) {
	  String msg = "";
	 String msg2 = "홍길동";
	 if(mid.equals("hong")) {
	 msg  ="ok"; }
	 else {
	 msg = "cancel";
	   }
	   return msg; // 해당 메소드에 변수를 생성 후 조건에 맞는 값을 적용하여 최종적인 값을 return시킴.
	 }
	
}

