//�迭�� �̿��� ����
public class Thread2 {
	//Thread�� ���������� ������� ���� �ȳ���
	
	public static void main(String[] args) {
		
		/*���빮�� Thread�� �̿��Ͽ� �� �迭�� ���� ������������ ��� ���Ͽ� ����� ����ϴ� �������α׷��� �����Ͻÿ�.*/
		
		/*hint 6�̶�� �迭���� �μ������� Thread�� ����
		 * 5+5+4+3+2+1 ���� ������� ���*/
		
		int[] data = {6,9,10,15,3,17};
		calculator cal = null;
		
		for(int i =0; i < data.length; i++) {
			cal = new calculator(data[i]);
			cal.start();
		}
	}
}

class calculator extends Thread {
	
	int number = 0;
	int sum = 0;
	
	public calculator(int i) { //Thread���� ���� (����)����ϱ� ���� constructor 
		this.number = i;
	}
	
	@Override
	public void run() { //�Ķ���͸� �������Ѵ�.
		//�ݺ���
		for(int j = this.number; j >= 0; j--) {
			sum += j;
		}
		System.out.println(sum);
	}
}

