package ex;

public class Example4 {

	public static void main(String[] args) {
		
		/*���빮�� ���Ե� ȸ���� ��� ����Ʈ �� ���� ���Ͻÿ�.
		 * ��, abstract�� ������ ����ؾ��մϴ�.
		 * ���: 34390*/
		Search sh = new Search();
		sh.add();
		System.out.println("ȸ�� ��ü�� ����Ʈ �հ� : "+sh.Point());
		
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
										{"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
										{"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
										{"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
										{"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
										{"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
										{"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
										{"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
										{"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
										{"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
										{"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
										{"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
			
									};
	}
	public void add() {
		db();
		
		for(int i =0; i<this.inform.length; i++) {
			this.sum += (Integer.parseInt(this.inform[i][6])); //valueOf �ᵵ ��.
		}
	}
	
	public int Point() {
		
		return this.sum;
	}
	
}