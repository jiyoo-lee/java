
public class If {

	public static void main(String[] args) {
		
		byte a = 100, b = 100;
		
		
		// ���ǹ�(if~else)  if�� else���� �ѹ��ۿ� ������ else if�� ��� �� �� �ִ�.
		
		if(a > b) { //if��
			System.out.println("a���� �� Ů�ϴ�.");
		}//���ǹ� (id�� �н�����,�̸��� � ���)
		else if (b > a) { //else if��
			System.out.println("b���� �� Ů�ϴ�.");
		}
		else { //else��
			System.out.println("�� ���� �����ϴ�.");
		} //a=b�� ���� ���, else�� ��� ���ϴ� ����()�� ����.
		
		/* else���� ���°�� */
		if(a > b) {
			System.out.println("a���� �� Ů�ϴ�.");}
		else if(a < b) {
			System.out.println("b���� �� Ů�ϴ�.");
		}
		else if ( a ==b ) {
			System.out.println("�� ���� �����ϴ�.");
		}
		
		/* �ε�ȣ��ȣ: < , >, <= , >= , == */
		/* =ǥ�ð� �׻� �ڿ� �´ٴ� �� �˱� */
		
		
 }
}
