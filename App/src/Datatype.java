
public class Datatype {

	public static void main(String[] args) {
		//String : 문자 "" 무조건 사용
		String a = "1234"; 
		System.out.println(a);
		/* 정수형 */
		byte b = 127; //java에서 byte가 가장 작은 단위 *범위: -128~127
		System.out.println(b);
		
		short c = 32767; // short: -32,768 ~ 32,767
		System.out.println(c);
		
		int d = 100000; // int : -2,147,483,648 ~ 2,147,486,647
		System.out.println(d);
		
		long f = 9999L; // long : 9,000,... 18개 / 메모리 할당량이 제일 크다. / 기본메모리 할당에서 추가로 적용시 가능범위가 늘어난다.
		                // long으로 큰 수 사용시 끝에 L 사용해야함(메모리 할당 리미트 풀림)
		System.out.println(f);
		/* 정수형 끝 */
		
		/* 실수형 */
		float z = 3.5f; // (f 생략불가) float : 3.4024800000+38
		System.out.println(z);
		
		double k = 44.5178; // (d 생략가능) double : 1.784+308
		System.out.println(k);
		/* 실수형 끝 */
		
	}

}
