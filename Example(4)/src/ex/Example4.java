package ex;

public class Example4 {

	public static void main(String[] args) {
		
		/*응용문제 가입된 회원의 모든 포인트 총 합을 구하시오.
		 * 단, abstract을 무조건 사용해야합니다.
		 * 결과: 34390*/
		Search sh = new Search();
		sh.add();
		System.out.println("회원 전체의 포인트 합계 : "+sh.Point());
		
	}

}

abstract class users {
	
	public abstract void db();
	public abstract void add();
	public abstract int Point();
	String[][] inform;
}


class Search extends users {
	private int sum;
	
	public void db() {
		this.inform = new String[][] { 
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
	public void add() {
		db();
		
		for(int i =0; i<this.inform.length; i++) {
			this.sum += (Integer.parseInt(this.inform[i][6])); //valueOf 써도 됨.
		}
	}
	
	public int Point() {
		
		return this.sum;
	}
	
}