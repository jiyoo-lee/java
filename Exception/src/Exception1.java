/**
 *Exception : Try,catch�� �Բ� ����� �� (����ó������)
 *�迭, ���, ���Ͽ��� ���� ���ܳ��� ����
 *ũ�� �ΰ����� exception�� ������. 
 *Runtime Exception : error �߻��� ����ó�� üũ�� ���� - null,class,arraysize
 *ex) int a;
 *a += 1;  
 *OtherException : ����ó�� ��� üũ �� (�߿��� ��Ʈ�� ��) 
 *Exception[����] 
 *Arithmetic : 0���� ������ �߻��ϴ�
 *Nullpointer : null ��ü�� ���� �Ҷ�
 *ClassCast : Ŭ������ ��ȯ
 *NumberFormat : ���������� ��ȯ
 *ArrayIndexOutOfBound : �迭 ������ �ε��� ��ȣ ���� 
 *IOException : ����� ���� ����  v
 *Exception : ��ü ���� ó�� ��Ȳ  v
 * v ǥ�� �� ���� ���� ����. 
 */

public class Exception1 {
	

	public static void main(String[] args) {
		
		String b = "A1";
		try {  //�ش簪�� int�� ���� 
			int a = Integer.valueOf(b); //error �߻� : a1�̶�� ���ڸ� ���ڷ� ���� �� �� ��� 
			System.out.println(a);
			
		}catch(NumberFormatException e) { //exception�� ����Ŭ������ implements �ϰ� �־ exception�� ��� ������ ����� 
			System.out.println(e); //� �κп��� ������ �߻��ߴ����� ���
		}
		finally { //catch���� �ذ��� �ȵǸ�(����� ����� ����)
			b = b.replaceAll("[A-Z]", ""); //������ ��ó�� 
			int a = Integer.valueOf(b); // �ٽ� ������ ���ۼ��ؼ� ��� 
			System.out.println(a); // ���� ��� �� ���
		}
	}
}
