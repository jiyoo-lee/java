import java.util.Scanner;

public class For_scan1 {

	public static void main(String[] args) {
		/* int a = 5;
		System.out.println(a++);
		System.out.println(++a); -++의 위치에 따라 값이 달라진다 

		int b = 10;
		int c = 10;
		int d = b + ++c; // 21로 증가하고 계산 
		// d = b + c++; // 20 계산하고 1 더해서 변수에 더해져 있어 다음 계산때 21로 시작 되어짐.
		System.out.println(d);*/
		
		Scanner sc = new Scanner(System.in); //입력 엔진
		int f; //반복문
		int sum = 0; // 사용자가 입력한 값에 대한 합계
		int score; // 사용자 입력
		
		for (f =1; f<4; f++) {
			System.out.print("점수를 입력해주세요.>");
			score = sc.nextInt(); //사용자가 입력한 값
			sum += score; //사용자가 입력한 값을 합계 변수로 이관
		}
		System.out.println("총 점수의 합은: "+sum); //합계 출력
		
		sc.close(); //엔진 종료.
	}

}
