import java.util.Arrays;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*응용문제 : 
		 * 다음 사용자가 복권 관련 프로그램을 요청하였습니다. math.random
		 * 사용자가 총 다섯개의 숫자를 입력하게 됩니다. 
		 * "1~46번 사이의 숫자를 입력해주세요" : 
		 * 사용자가 입력한 다섯개 숫자를 배열로 셍성합니다 (main에서 처리)
		 * 
		 *  외부 클래스를 이용하여 pc가 직접 당첨번호 다섯개를 랜덤으로 뽑아냅니다.
		 *  pc가 뽑은 5개의 숫자를 배열로 생성합니다. (외부 클래스 method로)
		 *  
		 *  별도의 결과 method를 하나 더 생성하여 사용자가 입력한 5개의 배열 데이터와 pc가 뽑은 배열 데이터를
		 *  해당 method로 전달하여 출력하시면 됩니다.
		 *  단, 모든 사용하는 반복문은 무조건 do while문으로 작성하시오. 하나의 클래스에 두개의 메소드를 만들어야함(pc가 뽑는거, 사용자와 pc비교 메소드)
		 *  사용자가 한건 a 메소드로 먼저 던진다. -> a에서 b로 던진다.
		 * */
		int [] selected_nums = new int [5];
		int i = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1~46번사이의 숫자를 입력해주세요.");
			selected_nums[i] = sc.nextInt();
			lottos.pc(selected_nums,i);
			i++;
		}while(i<=4);
		
	}
}


class lottos {
	public static void pc (int sn[],int j) {
		
		int [] pcnums = new int [5];
		int f = 0;
		do {
			 pcnums[f] = (int)(Math.random()*46)+1;
			 f++;
		}while(f<=4);
		
		 
		 if(j == 4) {
		 lottos lt = new lottos();
		 lt.compare(sn,pcnums);
		 }
		
	}
	public void compare(int lastsn[], int last_pcnums[] ) {
		System.out.println(Arrays.toString(lastsn));
		System.out.println(Arrays.toString(last_pcnums));
	}
	
}
