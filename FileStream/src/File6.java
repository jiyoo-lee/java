import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Scanner�� �̿��� ���� ���� ���� (input)
public class File6 {

	public static void main(String[] args) throws IOException {
		
		try {
		FileWriter fw = new FileWriter("C:\\java4\\java5\\FileStream\\src\\db.txt");
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���.:");
		
		for(int i =0; i<=2; i++) { //3�� �ݺ�
		String notice = sc.nextLine() +"\n";
		fw.write(notice); // �ش� �Է»����� db.txt�� ����
		} // �ݺ��� ���� �Է��ϱ�
		sc.close();
		fw.close();
		}
		catch(Exception a) {
			System.out.println(a);
		}
		//�̵��� ���빮�� ������~
	}
}
