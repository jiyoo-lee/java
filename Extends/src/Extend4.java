import java.util.Scanner;

public class Extend4 {

	public static void main(String[] args) {
		/*응용문제
		 * extends : 부모는 처리 자식은 결과처리 
		 * 숫자 두개를 입력합니다.
		 * 두개의 숫자를 확인하여 다음과 같이 체크합니다. 
		 * 첫번째 숫자가 두번째 숫자보다 작을 경우 : 해당 두개의 값을 합친 결과값 출력
		 * 첫번째 숫자가 두번째 숫자보다 클 경우 : 해당 범위만큼 숫자를 모두 더한 결과 값을 출력
		 * 같을경우 : 해당 값이 같습니다.
		 * int a = 10;
		 * int b = 6;*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "숫자를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Print p = new Print();
		p.Numbers(a,b);
		p.comparisonResult();

		sc.close();
		System.exit(0);
	}
}

//숫자 계산하는 부모 클래스
class Compare {
	protected int sum = 0;
	
	public void Numbers(int first, int second) {
		// 첫번째가 두번째보다 작을때 ex. 첫번째-> 2 두번째 -> 4
		if(first < second) {
			this.sum = first + second;
			}
		// 첫번째가 두번째보다 클때 ex. 첫번째 -> 5 두번째 -> 1
		else if(first > second) {
			for(int i = second; i <= first; i++) {
				this.sum += i;
			}
		}
	}
}

//숫자 결과를 출력하는 자식 클래스
class Print extends Compare {
	
	public void comparisonResult () {
		// 결과 값이 같을때
		if(this.sum == 0) {
			System.out.print("두 숫자가 같습니다.");
			}
		// 그 외
		else {
			System.out.printf("결과값은 %d입니다.",this.sum);
		}
	}	
}
