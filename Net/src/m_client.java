import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class m_client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ���̵� �Է����ּ��� : ");
		String user = sc.nextLine();
		chatting cr = new chatting(user);	
		
	}
}

class chatting {
	static final String ip = "192.168.100.128";
	static final int port = 9009;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	
	public chatting(String mid) {
		try {
			System.out.println(mid +"�� �����ϼ̽��ϴ�.");
			this.sk = new Socket(this.ip,this.port);
			this.os = this.sk.getOutputStream();
			this.is = this.sk.getInputStream();
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("������ �Է����ּ��� :");
				
				this.message = mid + " :" + sc.nextLine();
				this.os.write(this.message.getBytes());
				this.os.flush();
				
				byte[] data = new byte[4096]; //4kb
				int n = this.is.read(data);
				this.result = new String(data,0,n);
				System.out.println(this.result);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
