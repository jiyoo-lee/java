package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {

	public static void main(String[] args) throws IOException {
		
		/* 응용문제 
		 * 회원 정보 DB가 있는 상황입니다. 해당정보 중에서 NAVER.COM 메일 주소를 사용하는 고객 총 인원수를 출력 (빅데이터 분석)
		 * 단, db를 로드시 추상 클래스에서 로드가 되도록 합니다.
		 * { 이름, 통신사, 전화번호, 나이, 주소, 이메일, 포인트 } 
		 *  데이터 배열 : http://mekeyace.dothome.co.kr/example2_db.txt
		 *  */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("찾고자하는 메일회사를 입력하세요.");
		String company = br.readLine();
		
		Listup lu = new Listup();
		lu.find(company);
		System.out.println(company+ "메일을 이용하는 고객수는 "+lu.value()+"명 입니다.");

	}
}

abstract class DB {
	String[][] userInform;
	
	public abstract void db(); // 데이터 로드 
	
	public abstract void find(String company); //특정 이메일 주소를 가진 고객만 찾는 메소드
	
	public abstract void add(); // 몇명인지 더해주는 메소드 
	
	public abstract int value(); // 값 보내주는 메소드
	
	}



class Listup extends DB {
	private int count;
	private String c;
	
	@Override
	public void db() {
		
		this.userInform = new String[][] {
			{"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
			{"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
			{"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
			{"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
			{"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
			{"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
			{"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
			{"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
			{"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
			{"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
			{"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
										};
								}
	
	@Override
	public void find(String com) {	
		db();
		this.c = com;
		
		if(this.c.equals("")) {
			System.out.println("공백은 검색하실 수 없습니다.");
			System.exit(0);
		}
		else {
			add();
		}
	}
	
	@Override
	public void add() {
		
		/* 원시형태의 배열사항으로 카운팅을 하게 됨. indexOf : -1 없음 -1외의 정수는 값이 있는 것. */
		for(int i = 0; i < this.userInform.length; i++) {
				if(this.userInform[i][5].contains(this.c)) {
					this.count++;
			}
		}	
	}
	
	/* ArrayList로 생성시 메모리 할등을 너무 많이 하는 발생할 수 있음.*/
	
	@Override
	public int value() {
		
		return this.count;
	}
	
	
}