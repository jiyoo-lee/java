import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		/*
		 * �迭 ������ : ȫ�浿 , �̼��� , ������
		 * ������ �����Ͱ� �ֽ��ϴ�. 
		 * ���� Ŭ�������� ���ڸ� �ϳ� �����մϴ�. 
		 * ��, ���ڰ� null�� ���� ���� ������ �迭 �����Ϳ� ���� ���� ������ �̶�� ���� ���� �ֽ��ϴ�.
		 * �ܺ� Ŭ������ : data_list
		 * �߻� Ŭ������ : v_constructor
		 * �ܺ� Ŭ���� �� ���� Ŭ���� ��: check�Դϴ�.
		 * 
		 * [�������]
		 * ���� Ŭ�������� �������� ���� �� ��� 
		 * ���� Ŭ�������� "�ش����ڴ� �����ڰ� �ƴմϴ�"��� ���
		 * ���� Ŭ�������� �̼��� ����
		 * ���� : �ش� ����ڰ� �˻��Ǿ����ϴ�.
		 * ��, Arraylist�� �迭�� �ε� �ϼ���.
		 * */
		
		data_list dl = new data_list();
		dl.array(null);	
	}
}

abstract class v_constructor {
	
	public abstract void array(String name);
	
	}

class data_list extends v_constructor { //�߻� Ŭ���� extends
	
	String name;

	@Override
	public void array(String name) {
		
		if(name == null) {
			System.out.println("����� �̸��� �Է��ϼž��մϴ�.");
		}
		else {
			this.name = name;  //�̸��� ���ڸ� �������� ������ �׷��� try catch�� �̿��ؼ� �Ẹ�� 	
			check ck = new check();	// �ܺο��� ���η� �ٷ� ������ 
			ck.db();
		}
	}
	
	class check{	// �θ� Ŭ�������� ���� ���� �ڽ� Ŭ������ �̰� 
		String data_list[]; // �ʵ忡 �迭�� �޴� ��ü ����
		ArrayList<String> ar = null;  // arraylist util�� �ʵ忡 ��ü ����
		String name = data_list.this.name;
		
		public void db() {
			//�ش� �ʵ忡 �ִ� Arryalist�� �ν��Ͻ��� ������ 
			this.data_list = new String[] {"ȫ�浿","�̼���","������"};
			this.ar = new ArrayList<>(Arrays.asList(data_list)); //this�� �� �Ѱ��� 
			this.compare(); // ���� DB�� ����� ������ ���ϴ� �޼ҵ� 
			}
		public void compare () { 
			boolean ak = false; // ��� Ȯ���۾� 
			
			for(int i = 0; i < this.ar.size(); i++) {
				if(this.name.equals(ar.get(i))) {
					System.out.println("�ش� ����ڰ� �ֽ��ϴ�.");
					ak = true;
				}
			}
			if(!ak) {
				System.out.println("���Ե� ����ڰ� �ƴմϴ�.");
			}
		}
	}
}
