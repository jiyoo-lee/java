import java.util.Scanner;

public class Switchforexam {

	public static void main(String[] args) {
		/*숫자를 입력 받으면 스위치문으로 알려주는 문제*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 1~5까지");
		int a = sc.nextInt();
		String msg ="";
		
		switch(a){
		case 1: case 2: case 3: {
			msg = "하이";
			break;
		}
		case 4: case 5:{
			msg = "응 하이";
			break;
			}
		default :
			msg = "숫자를 잘못입력했습니다.";
		}
		System.out.println(msg);	
		
		sc.close();

	}

}
