import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException { // ������ �������⶧���� �װſ� ���� ������ �������Ѵ�.

		/* ���빮��
		 * �ش� ����ڰ� ��ȭ ������ �˻��մϴ�.
		 * �ش� ��ȭ ���� �´� �����Ͱ��� ���� ��� ��ȭ ��ü�� ���� ������ ����ϰ� �˴ϴ�.
		 * ��Ʈ : ��ĳ�ʷ� ��ȭ ���� �Է� ����
		 * �˻� �� ��ȭ������ �Է��ϼ��� -> ���˵���2 
		 * [���˵���] - ��õ5 - 2022�� 4�� ���� contains ����  ����Ƿ���..
		 * ������ �˻��� ��ȭ�� Ȯ�� �����ʽ��ϴٷ� ��� �ǰ� �ϱ�. try and catch�� ����..? 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("�˻� �� ��ȭ������ �Է��ϼ���.>");
			String search = sc.nextLine();
			List<String> list = Files.readAllLines(Paths.get("C:\\java4\\java5\\FileStream\\src\\movie.txt"));
		
			boolean moviecheck = false;
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i).contains(search)){
					System.out.println(list.get(i));
					moviecheck = true;
				}
			}
			if(!moviecheck) {
				System.out.println("�˻��� ��ȭ�� ��µ��� �ʽ��ϴ�.");
				}
			}
		catch(Exception a) {
			
		}
		sc.close();
	}
}

