
public class Exception5 {

	// ���� �����ϰ� ��¸� ��
	public static void main(String[] args){ 
		Words w = new Words();
		
		try {
			String result = w.files("");
			System.out.println(result);
		}
		
		catch(Exception a) {
			//System.out.println("�� ���� ������ �Ǿ� �ùٸ� ���� ���޹��� ����");
			
			if(a.getMessage() !=null) {
			System.out.println(a);
			}
		}
		finally {
			try {
			String result = w.files("ȫ�浿");
			System.out.println(result);
			}
			catch(Exception e) {
				System.exit(0);
			}
		}
	}
}

class Words {
	
	//���� �ް� ���� �� return
	public String files(String a) throws Exception {
		
		if(a == null || a.equals("")) {
			throw new Exception("���� ��� ����"); // ���� ���� ���� ���� � �������� ��Ÿ�� �� ���� 
		}
		else {
			String msg = a +"�� ȯ���մϴ�.";
			return msg;
		}
		
	}
}
