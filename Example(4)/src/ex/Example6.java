package ex;

public class Example6 {

	public static void main(String[] args) {
	
		/*Ư������
		 * abstract�� �̿��Ͽ� ������ 8�� ����� ��� ���� ������� return�� �޾�
		 * main���� ����ϼ���*/

		calculate cal = new calculate();
		cal.setGugu(8);
		System.out.println("��� ��: "+cal.getGugu());
	}

}

abstract class gugu {
	
	public abstract void multi();
	public abstract void setGugu(int a);
	public abstract int getGugu();
}


class calculate extends gugu {
	
	private int number;
	private int sum;
	
	@Override
	public void setGugu(int number) {
		this.number = number;
		multi();
	}
	
	@Override
	public void multi() {
		
		for(int i =1; i<=9; i++) {
			sum += this.number * i;
		}
	}
	
	@Override
	public int getGugu() {
		
		return this.sum;
	}
}