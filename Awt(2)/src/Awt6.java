import java.util.ArrayList;
import java.util.Arrays;

//������ȣ �߼� �ý��� : ��ư�� ������ �װ� ������ 4���� ����(math.random) 0~9����.. ������ȣ�� �ùٸ��� �ƴ��� Ȯ�����ִ� �ý���
// pc�� �̴°� �ܼ�â�� �� ������ �����
//awt6abstract�� ����Ǿ� �ֽ��ϴ�.....

public class Awt6 {

	public static void main(String[] args) {
		
		checkNums ch = new checkNums();
		ch.form();
		
		
	}

}

class checkNums extends Awt6Abstract {
	
	ArrayList<Integer> db = null;
	String message;
	protected String match;
	private String nums;
	
	//������ȣ �߼�
	@Override
	public void randomNums() {
		
		this.db = new ArrayList<>();
		for(int i = 0; i <= 3; i++) {
			this.db.add((int)(Math.random()*9));
			}
		this.match = db.toString().replaceAll("\\[|\\]", "").replaceAll(", ","");
		System.out.println(this.match);
		}
	
	@Override // ������ȣ Ȯ��
	public void compareNums(String nums) {
		this.nums = nums;
		
		if(this.nums.equals(this.match)) {
			this.message = "������ �Ϸ�Ǿ����ϴ�.";
		}
		else {
			this.message = "������ȣ�� �ٽ� Ȯ���Ͻñ� �ٶ��ϴ�.";
		}
	}
	
	public String sender() {
		
		return this.message;
	}

	
}
	

