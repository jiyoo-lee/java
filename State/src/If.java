
public class If {

	public static void main(String[] args) {
		
		byte a = 100, b = 100;
		
		
		// 조건문(if~else)  if와 else문은 한번밖에 못쓰나 else if는 계속 쓸 수 있다.
		
		if(a > b) { //if문
			System.out.println("a값이 더 큽니다.");
		}//조건문 (id나 패스워드,이메일 등에 사용)
		else if (b > a) { //else if문
			System.out.println("b값이 더 큽니다.");
		}
		else { //else문
			System.out.println("두 값이 같습니다.");
		} //a=b가 같을 경우, else의 경우 비교하는 조건()이 없다.
		
		/* else문이 없는경우 */
		if(a > b) {
			System.out.println("a값이 더 큽니다.");}
		else if(a < b) {
			System.out.println("b값이 더 큽니다.");
		}
		else if ( a ==b ) {
			System.out.println("두 값이 같습니다.");
		}
		
		/* 부등호기호: < , >, <= , >= , == */
		/* =표시가 항상 뒤에 온다는 것 알기 */
		
		
 }
}
