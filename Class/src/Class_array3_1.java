import java.util.Arrays;
import java.util.Scanner;

public class Class_array3_1 {

	public static void main(String[] args) {
		
		String a1 [] = {"홍길동","이순신","강감찬","김유신"}; //a1배열
		String a2[] = {"100", "80","39","60","55"};    //a2배열
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요.");
		String usernm = sc.next(); //사용자가 입력한 데이터 usernm
		
		jumsu jm = new jumsu();
		jm.ck(a1,a2,usernm);
		
		sc.close();

	}

}

class jumsu {
	
	public void ck(String data1[], String data2[], String user) { //배열은 main에 먼저 써주고 시작한다.
		for(int i = 0; i<data1.length; i++) {
			if(user.equals(data1)) {
				System.out.println(data1[i]+"님의 "+data2[i]+"점 입니다.");
			}
		}
		 {
			System.out.println("사용자 이름을 다시 확인해주세요.");
		}
	}
	
	
}