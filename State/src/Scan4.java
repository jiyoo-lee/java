import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 할 내용을 적어주세요 !");
		
		//String memo = sc.next(); // next():스페이스바 입력까지만 적용
		String memo = sc.nextLine(); //nextLine(): 스페이스바 포함 모두 입력 적용
		System.out.println(memo); 

		/*응용문제 :  문자:park  숫자:25  */
		
		sc.close(); //scanner 종료를 기본으로 적용해주어야 한다.
		
		String name = "park";   
		/* String + int = %s   int = %d(정수)
		   추가 double, float = %f
		   date,time = %t 
		   boolean(true,false) = %b */
		
		
		int age = 25;
		
		//System.out.println(name+"님의 나이는"+age+"입니다.");
		System.out.printf("%s님의 나이는 %d입니다.",name, age); //print f-> print format의 약자
		
		
	}

}
