
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
		
		
		int data = 45*3+16+5+22*8;
		Numbers nm = new Numbers();
		nm.setSumData(data);
		nm.oddOrEven();
		
	}

}

class Numbers {
	
	int sumData;

	public int getSumData() {
		return sumData;
	}

	public void setSumData(int sumData) {
		this.sumData = sumData;
	}
	
	public void oddOrEven() { // ���� throws Exception �����ʴ� ������ �̹� ������ �ȿ��� �ذ� �����ϱ� ����.
		
		//�ڷ��� method���� return���� ���ڳ� ����,�Ҽ�,object�� ���� �ڷ����� ����Ǿ� ����
		try {
			if(this.sumData%2 == 0) {
				throw new Exception("����ó�� �߻����� ��Ȯ���� �ʿ��մϴ�."); // ������ ������.
			}
			else {
				System.out.println(this.sumData);
			}
			
		}
		catch(Exception e) { // �갡 ����
			System.out.println(e.getMessage());
		}
		
	}
	
	
}


