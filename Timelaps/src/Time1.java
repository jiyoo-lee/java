
public class Time1 {

	public static void main(String[] args) {
		/* 1���� 10���� */
		/* try - catch�� : ����ó����� ����  */
		
		for(int i =1; i <=10; i++) {
			
			try { // ���ܹ߻� �� �ڵ带 ���� 
				Thread.sleep(1000); // 1000�� 1�� 500�� 0.5�� 
				//Thread.sleep : �Ͻ����� ���¸� ���մϴ�. 
			}catch(InterruptedException a){
				/* InterruptedException : �ش� ���� �߻��� �Ǿ��� ��� ó���ϱ� ���� ���� */
			}catch(Exception b){
				
			}
			System.out.println(i);
		}
		
	}

}
