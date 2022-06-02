import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~10까지 숫자를 하나 선택하세요");
	    int no = sc.nextInt();
	/*	memories m = null; //메모리를 정리하면서 코드 정하는 방법 
		memories m = new memories();
		m.ms(no);
	    m = null; //(초기화)		//해당 인스턴스를 비움
		
		memories ms = new memories();
		ms.rd(); */
		
		// 코드는 클래스안에서만 이루어지게 해야한다. 메인에는 입력 받고 넘기는것만.
	}

}

class memories {
	public void ms(int user) {
	//Math.random() 랜덤 메소드 사용법 : 기본 자료형은 double입니다.
		// 많이 쓰는 곳 : 인증번호, 임시비밀번호, 추첨,룰렛 같은 곳에 많이 쓰인다. 
	//double a = Math.random(); //0.0 ~ 1.0까지 출력 더블로 쓸때는 괄호 x
	for(int i =0; i<=10; i++) {
    int b =(int)(Math.random()*10);// 괄호 주의. double -> int로 형변환 // *9)-1 -> 1~10으로 나오게하는 법  *10만 하면 0~9까지 나오게 됨. 
	System.out.printf("%d ",b);
	}
	
	
    /*
	if (user == b) {
		System.out.println("당첨");
	}
	else {
		System.out.println("다음기회에...");
	}*/
		
	}
	
	public void rd() {  //randaom util 사용법
		Random r = new Random(); // Random 객체 생성 및 인스턴스 적용
		int w = 0;
		
		while(w<=6) {
		System.out.println(r.nextInt(45)+1); //0~9까지 r.nextInt를 사용
		w++;
		}
		
		//r = null; //메모리 원래대로 돌리는것. 정리.
	}
}
