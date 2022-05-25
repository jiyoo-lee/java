import java.util.Scanner;

public class academy {
	public static void main(String args[]) {
	
	/*응용문제
	 * */
		
	Scanner sc = new Scanner(System.in);
	System.out.print("첫번째 숫자값을 입력하세요.>");
	int num1 = sc.nextInt();
	
	Scanner sc2 = new Scanner(System.in);
	System.out.print("두번째 숫자값을 입력하세요.>");
	int num2 = sc2.nextInt();
	
	if(num1 * num2 <=100) {
		System.out.println("100이하의 결과값입니다.");
	}
	else {
		System.out.println("해당 값은 100 이상 결과값입니다.");
	}
	
	sc.close();
	sc2.close();
		
	} // main
}