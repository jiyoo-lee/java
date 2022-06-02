
public class Class3 {
		// package를 사용하지못함(default라서)
	public static void main(String[] args) {
		//자료형 (데이터형) 
		//double -> int로 변환
		double a = 137.5; 
		int b = (int)a; //형변환 
		
		//int에서 double로 변환
		int c = 35;
		double d = (double) c;
		System.out.println(d);
		//행동하는 패턴의 틀 (클래스 = c,vue,angular 등에서 함수로 통상적으로 사용하는 느낌)
	
       //String -> int로 형변환
		String x = "35";
		String x2 = "156";
			
		int z = Integer.parseInt(x); // 문자를 숫자로 아예 형태를 바꿀때 쓰는 메소드 int형에 사용하는 산술연산 언어임)
	   //-> can't convert from String to int *** char <-> String은 가능함.
		//int z = Integer.valueOf(x); // ->속도가 느리다. int인지 확인하고 변환, valueOf -> parseint
		//vauleOf 클래스 메소드(메소드함수)
		// valueOf(parseInt(s, 10))
		int total = Integer.parseInt(x)+Integer.parseInt(x2); //문자형을 숫자로 변환하여 산술계산을 처리함.
	   System.out.println(total); 
		
	   //Long 사용시 Long.parseLong 사용함.
	   String j = "923456789";
	   String j2 = "9234567892";
	   //int total2= Integer.parseInt(j) +Integer.parseInt(j2);
	   long total2 = Long.parseLong(j)+Long.parseLong(j2); //long 사용법 Double.parseDouble(); 도 있음.
	   double total3 = (double)total2;
	   System.out.println(total3);
	   
	   //문자(char) -> 문자(String) : 기본 지식만 알아 둘 것.
	   char part = '남'; // ->작은 따옴표를 사용해야함
	   String f = String.valueOf(part); // 문자->문자로 변환. valueOF만 사용 parse는 없다.
	   System.out.println(part);

	   
	   
	   
	}

}
