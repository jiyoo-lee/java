import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

	public static void main(String[] args) {
		
		int port = 8009;
		Scanner sr = null;
		Socket sc = null;
		
		try {
			
			ServerSocket ss = new ServerSocket(port);
			System.out.println("Server Connecting..");
			
			for(;;) {
			sc = ss.accept();
			//System.out.println(sc.getInetAddress());
			InputStream is = sc.getInputStream();
			OutputStream os = sc.getOutputStream();
			
			byte[] data = new byte[1024];
			int n = is.read(data);
			String message = new String(data,0,n);
			System.out.println(message);
			
			sr = new Scanner(System.in);
			System.out.println("�Է��Ͻ� ������ �����ּ���:  "); // ������
			String msg = "�̼���: "+sr.nextLine();
			os.write(msg.getBytes());
			os.flush();
			
			}
		}
		catch(Exception e) {
			
		}
		
	}
}
