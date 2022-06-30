package test2;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {

		/*검색할 사용자 이름을 검색하게 됩니다. (메인 메소드에서 실행)

사용자 리스트는 다음과 같습니다.  (외부 클래스 및 외부 메소드에서 제작)
강보경, 권용환, 금새록, 김동주, 김민재, 성유리, 손진호, 안희성

해당 리스트 정보는 별도의 메소드 에서 생성해야 합니다.
사용자가 입력된 이름이 있을 경우 "해당 사용자가 있습니다." 라고 출력하고
없을 경우 "해당 사용자는 가입 되지 않았습니다." 라고 출력합니다.

힌트 : 메인메소드에서 Scanner 작동 하며, 데이터 검색은 외부 Class 및 외부 메소드에서 처리*/
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("검색 할 사용자 이름을 작성해주세요. [나가기: 0]>> ");
			String searching = scanner.next();
			if(searching.equals("0")) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			usersDB db = new usersDB();
			db.compare(searching);
		}
	}
}

class usersDB {
	
	private String[] userlist = null;
	private String[] message = {"해당 사용자가 존재합니다.", "해당 사용자는 미가입자입니다."};

	public void datalist () {
		this.userlist = new String[] {"강보경","권용환","금새록","김동주","김민재","성유리","손진호","안희성"};
	}
	
	public void compare(String searching) {
		datalist();
		
		String name = searching;
		boolean ischecked = false;
		
		for(String ourUser : this.userlist) {
			if(name.equals(ourUser)) {
				System.out.println(this.message[0]);
				ischecked = true;
				break;
			}
		}
		if(!ischecked) {
			System.out.println(this.message[1]);
		}
	}
}
