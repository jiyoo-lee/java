import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String[] args) {
		//for문 + Scanner
		
		Scanner sc = new Scanner(System.in); // 입력엔진 로드
		System.out.print("원하시는 구구단 숫자를 입력하세요.>");
		int bb = sc.nextInt(); //사용자가 입력한 내용
		
		int f; // 반복문에 사용하는 변수
		int zz; // 반복문에 산술연산 결과 값
		
		for(f=1; f<=9; f++) {
			zz = bb * f; // 산술연산
			System.out.printf("%d ", zz); //출력
		}
		
		
		sc.close();
	}

}
