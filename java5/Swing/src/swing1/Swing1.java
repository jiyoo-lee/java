package swing1;

public class Swing1 {

	public static void main(String[] args) {
		//����Ŭ����(wrapper class) : box���� 
		//float, char, byte, long , short (�⺻type) 
		//Byte, Integer, Long, Double, Char etc... -> ���� Ŭ������ �ϳ��� ����
		// Integer b = new Integer(20) -> �ڽ�����(==�� ���� �����ڷ� ���Ұ�) 
		//int a = new Integer(20) : ��ڽ̻���(����� ����)
		
		Integer a = 20;
		Integer b = new Integer(20); // : ����Ŭ������ �����ؼ� ���� ���Ҷ� equals �Ἥ ������ �־���Ѵ�.
		if(a.equals(b)) { //
			System.out.println(a + b);
		}
		
		Integer no1 = 10; //unboxing 
		Integer no = new Integer(99); //boxing
		int aa = no; //unboxing(�ڵ�)
		Integer bb = no.intValue(); //�ڽ̻��¿� �ִ� ���ڰ��� �����Ͷ� �ϴ� ���� 
		System.out.println(bb);
	
		/*�ڽ�(Integer)�� �ڽ��� ���Ҷ��� equals�� ����ؾ߸� �̷���� */
	}

}
