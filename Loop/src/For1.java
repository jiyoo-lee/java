
public class For1 {

	public static void main(String[] args) {
		// �ݺ��� : �����͸� �ϰ������� �Է�, ��� �� �� �ֵ��� �ϴ� ����		
		//for(�ʱⰪ; ������; ������) a++ -> 1�� ��� �� ���� / ++a -> ������ �� ���

		//int z = 1;
		//++z;
		
		//z++; ��� �� +1 ���� 
		//z--; 
		
		//++z; +1 ���� �� ���
		//--z;
		
		//System.out.println(z);
		
		for(int a = 0; a < 10; ++a) {
			//System.out.println(a);
		}
		
		int b; //���� DB�� �����ϱ� ���ؼ� ���� ����.
		for(b=5; b<=10; b++) {
			//System.out.println(b);
		}
		
		int c;
		for(c=10; c>3; c--) { //���ǻ��� c<3 ���� ������ ������ 0~�������� ���� ���������� ��Ȳ�� �߻���. ���ǽ� ��ȣ �����Ұ�
			//System.out.println(c);
		}
		
		/* ���빮�� 
		 20����~27���� ����ϼ���
		 */	
		int num;
		for(num=20; num<28; num++) {
		//System.out.println(num);
		}
		
		
		/* ���빮��
		 39~21���� ����ϼ��� */
		int d;
		for(d=39; d>20; d--) {
			//System.out.print(d+","); 
		}
		
		
		// �������� ������ �����ϴ� ��� 
		//1~10���� ���ڸ� ��� 
		int aa;
		int bb = 10; //���ᰪ ������
		
		for(aa=1; aa<=bb; aa++) {
			//System.out.print(aa);
		}
		
		//���빮�� ���� 2���� �̿��Ͽ� ���� �����͸� ����Ͻÿ� //
		// 55~4���� ����մϴ�.
		int cc;
		int dd= 3;
		
		for(cc=55; cc>dd; cc--) {
		   //System.out.print(cc+",");
		}
		
		
		
		
		
		
		
		
	} // end of main

}
