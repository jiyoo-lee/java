import java.util.ArrayList;
import java.util.Arrays;

// �ߺ� ���̵� üũ �ý��� : Awt5Abstract�� �c�� ���        
// ȸ�� ������ : hong,lee,park

/* �Է°� : 200 *25 �ߺ�üũ : 80*25 �� : 290*25 ����: 80*25*/
public class Awt5 {

	public static void main(String[] args) {
		
		Handle hd = new Handle();	
		hd.design();
		
		
	}
}

class Handle extends Awt5Abstract {
	private String aid; // awt���� �Ѿ�� �μ����� class���� Ȱ�� 
	private String return_id; //awt�� �ٽ� ���� �����ϴ� ��������, null�ϰ�� ���̵� ��밡��, ���̵��� ���� : �ش� ���̵�»���Ҽ� ����
	String[] data;
	ArrayList<String> db = null;
	
	//�ߺ� üũ�ϴ� �޼ҵ�
	@Override
	public  void dataload() {
		this.data = new String[] {"hong","lee","park","jeong","kim","java"};
		this.db = new ArrayList<>(Arrays.asList(data));
	}
	// setter 
	@Override
	public void idcheck(String id) {
		this.return_id = null; // Awt���� �ߺ���ư�� Ŭ���� �ش� ������ ���������� �ʱ�ȭ�ϴ� �κ�, �ʵ忡 �����ϸ� �ٸ� ������ ��� �ٲ� ���׳�. 
		this.aid = id;
		dataload(); 
		// ���������� �����Ͱ� �Ѿ������� �ش� �޼ҵ带 �ε��Ͽ� Ȯ���ϰ� �� 
		
		int ea = this.db.size();
		int w = 0;
		
		while(w < ea) {
			if(this.aid.equals(this.db.get(w))) {
				this.return_id = this.db.get(w);
				break;
			}
			w++;
		}
	}
	
	// 
	@Override
	public String signok() { // getter
		
		return this.return_id;
	}
	
	
	
}