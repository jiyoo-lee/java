import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chatclient {
	final static String ip = "192.168.1.142";
	final static int port = 9090;
	static Scanner sc = null;
	static String myid = null;
	
	public static void main(String[] args) {

		
		try {
			Socket sk = new Socket(ip,port);
			sc = new Scanner(System.in);
			System.out.println("ä�ÿ� ����Ͻ� ���̵� �Է����ּ���.");
			myid = sc.next();
			OutputStream os = sk.getOutputStream();
			InputStream is = sk.getInputStream();
						
			while(true) {
				
				sc = new Scanner(System.in);
				System.out.println("������ �Է����ּ���.");
				String message = myid + " : " +sc.nextLine();
				os.write(message.getBytes());
				os.flush();
				
				byte data[] = new byte[1024];
				int no = is.read(data);
				String msg = new String(data,0,no);
				System.out.println(msg);
			}
		}
		catch(Exception a) {
			
		}
		
	}
}
