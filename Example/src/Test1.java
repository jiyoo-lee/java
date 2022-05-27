import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		/*excise 3 풀이*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자값을 입력하세요.");
		int user1 = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("두번째 숫자값을 입력하세요.");
		int user2 = sc2.nextInt();
		
		int user3 = user1 * user2;
		
		if(user3<100) {
			System.out.println("100이하의 결과값입니다.");
		}
		else {
			System.out.println("100이상의 결과값입니다.");
		}
		
		sc.close();
		sc2.close();
	}

}
