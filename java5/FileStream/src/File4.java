import java.io.FileWriter;

//File write
public class File4 {

	public static void main(String[] args) throws Exception {
		
		try {
			//FileWriter : ���� �����͸� ���Ͽ� ���� Class
			String user[] = {"ȫ�浿40","������20","������60","���缮100"};
			
			
//			FileWriter fw = new FileWriter("C:\\java4\\java5\\FileStream\\src\\array.txt"); // ���������� �ʱ�ȭ �� ���� 
			FileWriter fw = new FileWriter("C:\\java4\\java5\\FileStream\\src\\array.txt",true); // ���� �����Ϳ� ���ٿ�����
			
			//FileWriter�� ���ϸ��� Ʋ���� �ҷ�������.
			
			for(int i = 0; i<user.length; i++) {
				fw.write(user[i]); //write : ����,�迭 �����Ͱ��� ���Ͽ� ������
			}
			
			fw.close(); // ���� ���� ������ �ݾ��� ->������ ���Ͽ� ������ ��  
			
		}
		catch(Exception e) {
			System.out.println("test");
		}
		
		
	}
}
