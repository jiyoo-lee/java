import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chatserver {

	static InputStream is = null;
	static OutputStream os = null;
	static byte[] data = null;
	static String mid = null;
	static Scanner sc = null;
	
	public static void main(String[] args) {

		int port = 8009;
		Socket sc = null;
		Scanner sr = null;
		
		try {
			ServerSocket ss = new ServerSocket(port);
			sr = new Scanner(System.in);
			System.out.println("�������� ����� ���̵� �Է����ּ���.");
			mid = sr.next(); //���� ����� ���̵�
			
			
			System.out.println("ä�� ������Դϴ�...");
			
			for(;;) {
				sc = ss.accept();
				is = sc.getInputStream();
				os = sc.getOutputStream();
				
				data = new byte[1024];
				int arr = is.read(data);
				// Ŭ���̾�Ʈ���� �޴� �޼���
				String message = new String(data,0,arr);
				System.out.println(message);
				
				System.out.println("������ �Է����ּ���.");
				String msg = mid + " : " +sr.nextLine();
				os.write(msg.getBytes());
				os.flush();
				
			}
		}
		catch(Exception a) {
			
		}
	}
}
