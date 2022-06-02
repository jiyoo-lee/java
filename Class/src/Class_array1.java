import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		
		/* class + method + array */
		
		/*String users[] = {"홍길동","이순신","김유신"};
		arrays.lists(users); //static은 객체생성 및 인스턴스 선언 안하고 바로 쓸 수 있음.

		/* 응용문제 
		 * 사용자가 자신의 이름을 입력합니다. 사용자 이름을 해당 클래스로 보내서 
		 * 등록된 사용자인지 미가입자 사용자인지를 확인하는 코드를 작성하시오
		 * 등록시 = 가입이 되어 있습니다.
		 * 확인이 되지않음 = 미가입자입니다.*/
		String members[] = {"홍길동","이순신","김유신","이지유"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성함을 입력해주세요.");
		String users = sc.next();
		
		arrays ar = new arrays();
		//ar.usersList(users,users);
		
		sc.close();
		
		/* 궁금한거 스트링으로 썼는데 어떻게 배열로 값을 받는지?*/
		
		
	}

}


class arrays{
	public static void lists(String a[]) { //배열값을 받을때 [] 써주기. 1차: [] 2차: [][]
		//System.out.println(Arrays.toString(a));
	}
	
	public void usersList(String name[]) {
		String members[] = {"홍길동","이순신","김유신","이지유"};
		boolean exist = false;
		String msg =""; // 초기화가 되어 있어야한다. 메소드로 해당 값을 전달 할때는 비어있는 값을 명확하게 설정해두어야 한다.
		// String ="" || null이 비어있다는 뜻. int = 0으로 표현. boolean = false 
		for(int i =0; i<members.length; i++) {
			if(name.equals(members[i])) {
				msg = "등록된 가입자입니다.";
				exist = true;
			}
		}	
		if(!exist)  {
			msg = "미가입자입니다.";
		}
		 //arrays.message(msg);
		arrays ar = new arrays();
		ar.message(msg); //메세지 메소드 부르기.
		}
	
	public void message (String m) { //별도로 메세지 메소드를 빼서 쓰는 방식
		System.out.println(m);
	}
		
	}
