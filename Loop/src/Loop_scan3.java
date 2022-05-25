import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		/* 스캐너를 이용한 do-while문으로 구구단 작성 */
		
	Scanner sc = new Scanner(System.in);
	System.out.print("원하시는 구구단의 값을 입력하세요.>");
	int gugu = sc.nextInt();
	
	int i = 1;
	int j;
	
	do { 
		j = i*gugu;
		System.out.printf("%d ",j);
		i++;
	}while(i<=9);
	
	sc.close();
	
	}

}
