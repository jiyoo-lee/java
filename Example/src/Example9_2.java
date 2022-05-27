import java.util.Scanner;

public class Example9_2 {

	public static void main(String[] args) {
		/* 응용문제 9 : 
		 * a학생에 대한 성적을 입력 받고 평균점수가 나오는 프로그램을 제작합니다.
		 *  
		 *  "점수를 입력하세요"라는 문구는 총 5번이 나오게 되면
		 *  모든 점수를 합산한 후 5개의 점수에 대한 평균값을 출력하셔야 합니다.
		 *  출력 메시지 "해당 점수의 평점은:"
		 *  단, 평점 점수가 40점 이하일 경우 "재시험입니다."라고 메시지를 출력 후 프로세서를 종료합니다.
		 *  40점 이상일 경우 "합격"이라고 메세지를 출력하세요.
		 *  do-while문으로 작성하시오.
		 *  
		 *  [추가기획]
		 *  "입력하실 과목 수를 적어주세요:"라고 제일 먼저 출력 후 해당 과목 수 만큼 반복문이 적용이 되며,
		 *  과목 수 만큼 평균값이 적용되어야 합니다.
		 *  
		 *  */
		
		Scanner sc = new Scanner(System.in);
		
		int i =0;
		int sum = 0;
		int count; // 반복 횟수 
		int score;
		String msg = "성적을 입력하세요."; 
	
		System.out.println("입력하실 과목 수를 적어주세요");
		count = sc.nextInt();
		
		do {
			System.out.println(msg);
			score = sc.nextInt();
			sum += score;
			i++;
		}while(i<count);
		
		int average = sum/count; // 평균값
		
		if(average>40) {
			System.out.printf("과목수:%d, 평균점수:%d //"+"합격입니다",count,average);
		}
		else {
			System.out.printf("과목수:%d, 평균점수:%d //"+"재시험입니다",count,average);
		}
		
		sc.close();

	}
}
