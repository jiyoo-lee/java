import java.util.LinkedList;

//exception7�� ���� ������ Ǯ��
public class Exception9 {

	public static void main(String[] args) {

		try {
			aedata rd = new aedata();
			Object[] data = { "ȫ�浿", 55, "������", "������", 48, "�̼���", "�������", 34, 88 }; // ���ڶ� ���ڶ� �������� object
			rd.setter(data);
			System.out.println(rd.getter()); 
			//return�޴� ���� �迭 �޼ҵ��̹Ƿ� �ش� �޼ҵ���� �迭���� ���� �� �޾ƾ���. 
		} 
			catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class aedata {

	LinkedList<String> rdata = new LinkedList<>();

	// ���� �ǹ� ���ͼ��ʹ� �ʵ忡 �ִ°� ����°ǵ� �� �ڲ� �̷������� �������..����

	public void setter(Object[] call) throws Exception {
		int ea = call.length;

		for (int i = 0; i < ea; i++) {
			try {
				//�ش� �迭�� �ε�� (�ڷ���) ��ȯ�� �ϴ� ������ Object �迭�̹Ƿ� �����Ͽ���.
				String checked = String.valueOf((String) call[i]);
				this.rdata.add(checked);
				} 
				catch (Exception ex) { 
				//�ڽ� Ŭ�������� ���� �߻��� ��µǴ� catch�� ��,throw�� ����ϴ� ���ÿ� ����ϸ� �������� ���޵� 
				//�߿��� ������ throw�� ���޽� �ش� �ݺ����� �����ϰ� �˴ϴ�.(����ٴ� ���) 

			}
		}
	}

	public LinkedList<String> getter() { // ����Ʈ�� �������� �ڷ����� �����ش�. �翬��.
		//�迭 Ŭ���� �̸����� getter�� ���� �� ����. 

		return this.rdata;
	}

}