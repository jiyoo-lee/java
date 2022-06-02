import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/* 응용문제 
		 * 
		 * 다음 문자 배열데이터 값이 있습니다.
		 * a1 : 홍길동 이순신 강감찬 유관순 김유신 
		 * a2 : 100 80 39 60 55
		 /* 감섹하고자 하는 이름을 적어주세요 출력하게 됩니다.
		 * 검색어에 이순신이라고 검색을 하게 되면 "이순신님은 80점입니다."라고 출력이 되어야합니다.*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자하는 이름을 적어주세요.");
		String search = sc.next();
		
		member_1 m = new member_1();
		m.listOfmembers(search);
		
		sc.close();
		
		

	}

}


class member_1 {
	public void listOfmembers (String a) {
		String users [] = {"홍길동","이순신","강감찬","유관순","김유신"};
		int score [] = {100,80,39,60,55};
		boolean exist = false;
		for(int i = 0; i <users.length; i++) {
			if(a.equals(users[i])) {
				System.out.println(users[i]+"님은 "+score[i]+"점 입니다.");
				exist = true;
			}
		
		}
		if(!exist) {
			System.out.println("사용자 이름을 다시 확인해주세요.");
		}
		
		
	}
	
}
