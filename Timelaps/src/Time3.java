
public class Time3 {

	public static void main(String[] args) {
		
		/*���빮�� : �ܺ� Ŭ������ �ֽ��ϴ�. ��, ���� Ŭ�������� �ش� �ܺ� Ŭ������ �ε��ϸ� �ش� �޼ҵ忡�� �ﰢ������
		 * 8�ʵ��� �ε��� �߻��մϴ�. 8�� ���Ŀ� return���� �Ա��� ��� ó���Ǿ����ϴ�.��� ���ڸ� �޵��� �Ͻʽÿ�.   */
		
	/*	try {
			System.out.println("���� ����");
			Thread.sleep(5000);
			System.out.println("���� ����");
			
		}catch(InterruptedException c){
			System.out.println(c);
		} */
		
		Time time = new Time();
		System.out.println(time.msg());
	}

}

class Time  {
	public Time() {
		try {
		System.out.println("ó�� ���Դϴ�. ��ø� ��ٷ��ּ���...");
		Thread.sleep(8000);
		//msg();
		}catch(InterruptedException b){
			System.out.println(b);
		}
	}
	
	public String msg () {
		String msg = "�Ա��� ��� ó���Ǿ����ϴ�.";
		return msg;
	}
}