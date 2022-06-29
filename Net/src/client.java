import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		
		String ip = "192.168.1.142";
		int port = 8009;
		Scanner sn  = null;
		InputStream is = null;
		OutputStream os = null;
		Socket sc = null;
		
		
		try {
			
			sc = new Socket(ip,port);
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			os = sc.getOutputStream();
			is = sc.getInputStream();
			sn = new Scanner(System.in);
			
			for(;;) { //���������� ���Ͽ� ��� ���ӵǵ��� �ϴ� ����
			System.out.println("�Է��Ͻ� ������ �����ּ��� :  ");
			String msg = "ȫ�浿: "+sn.nextLine();
			os.write(msg.getBytes());
			os.flush();
			byte[] data = new byte[1024];
			int n = is.read(data);
			String cmsg = new String(data,0,n);
			System.out.println(cmsg);
			
			}
			
		}catch(Exception a) {
			System.out.println(a.getMessage());
			if(a.getMessage() != null) {
			System.out.println("���� ���� ��ְ� �߻��Ͽ����ϴ�.");
			}
		}
		finally { //client�� ���� ����� �ش� ���� �� ���� Stream, Scanner ���� 
				try {
					os.close();
					is.close();
					sn.close(); // ��������� üũ
					System.out.println("����");
				}
				catch(Exception b) {
				
			}
		}
	}
}
