import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*사용자가 주소 및 전화번호를 입력합니다. 첫번째는 주소 두번째는 전화번호*/

		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력해주세요.");
		String a = sc.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String b = sc.nextLine();
		System.out.println("주소: "+a+" 전화번호: "+b);
		
		sc.close();
	}

}
