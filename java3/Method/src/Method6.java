
public class Method6 {

	public static void main(String[] args) {
		// private�� ���� ��ü ���� ���� 2
		
		
		
		insert i = new insert();
		i.userid = "hong";
		String skey = "a1234567";
		
		String result = i.checks(skey);
		System.out.println(result);
	}

}

class insert{ 
	String userid = null;
	private String key = "a1234567"; //�ش� Ŭ�������� ����Ǵ� key��
	//���밳���Ҷ� ���� ����. ����Ű. api�� ���� ����.
	//static������ private ��� ����. �߿�
	
	public String checks(String bb) {
		this.key = bb;
		String msg = null;
		if(key.equals("a1234567")) { //�ش� key��(private), �ܺ� Ŭ�������� �Ѿ���� �μ����� ��
			
			if(userid.equals("hong")) { // �μ����� ������ ���̵� Ȯ��
				msg = "�����Ͱ� ��ġ�մϴ�.";	
			}
			else {
				msg = "�ش� �����Ͱ��� Ȯ������ ���߽��ϴ�.";
			}			
			
		}
		else { // �ܺ� class���� �ùٸ� Ű���� ���޵��� ���� ��� 
			msg = "error";
		}
		return msg; //���� ����� ���� return���� ȸ����.
	}
	
}
