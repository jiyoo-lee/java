
public class Exception6 {

	public static void main(String[] args) {

		/* ���빮�� 
		 * ����ڰ� 45*3+16+5+22*8 �ش� ���� ���� ��������
		 * �ܺ� Ŭ������ �����մϴ�. �ش� �ܺ� Ŭ���������� �ش� ���� ¦���� ��� ���ܿ����� �߻��ϸ�
		 * Ȧ���ϰ�� ����ó��*/
		
		
		/*���빮�� 
		 * ���������� {ȫ�浿, 55, ������, ������,48,�̼���,����,34,88}
		 * �ش� ������ �� �� ���ڰ��� ��µǵ��� ��迭 �Ͻñ� �ٶ��ϴ�.
		 * �� ���ο����� �ش� �迭�� �ܺ� Ŭ����(setter)�� �����մϴ�.
		 * �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� �����մϴ�.
		 * getter���� �ش� �迭�� return���� �������� �մϴ�. 
		 * ��, �ܺ� Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		 * add
		 * 
		 * */
		
		Numbers n = new Numbers();
		try {
		int sum = 45*3+16+5+22*8;
		n.send(sum);
		}
		catch(Exception e) {
			System.out.println("¦�� : ����");
		}
		
		
	}

}


class Numbers {
	
	 int cal;
	 String result;
	 
	public String send (int sum) throws Exception {
		cal = sum;
		
		if(cal % 2 == 0) {
			throw new Exception("����");
		}
		
		else {
			result = Integer.toString(cal);
		}
		return result;
	}
}
