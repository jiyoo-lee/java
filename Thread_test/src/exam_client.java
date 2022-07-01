import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class exam_client {

	public static void main(String[] args) {

		/*클라이언트
		 * 접속할 ip번호를 입력해주세요.
		 * 접속 할 포트 번호를 입력해주세요
		 * "****
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("접속 할 IP번호를 입력해주세요.");
		String ip = sc.nextLine();
		System.out.println("접속 할 port번호를 입력해주세요.");
		try {
			int port = sc.nextInt();
			clientchat cl = new clientchat(ip, port);
			cl.access();
			
		}catch(Exception e) {
			System.out.println("숫자만 입력가능합니다.");
		}
		
	}
}

class clientchat {
	
	String ip = null;
	int port = 0;
	InputStream is = null;
	OutputStream os = null;
	Socket socket = null;
	String message = null;
	int c = 0;
	
	public clientchat(String a, int b) {
		this.ip = a;
		this.port = b;
	}
	
	public void access () {
		
		try {
			this.socket = new Socket(this.ip,this.port);
			this.is = this.socket.getInputStream();
			this.os = this.socket.getOutputStream();
			while(true) {
				
				if(c == 0) {
				this.message = "클라이언트" + this.port + "입장";
				this.os.write(this.message.getBytes());
				this.os.flush();
				c++;
				}
				
				System.out.println("클라이언트 >>");
				Scanner sc = new Scanner(System.in);
				String outputmessage = sc.nextLine();
				this.os.write(outputmessage.getBytes());
				this.os.flush();
				
				byte[] data = new byte[1024];
				int n = is.read(data);
				String inputMessage = new String(data,0,n);
				System.out.println("서버>>"+inputMessage);
			}
		}catch(Exception e) {
			
		}
	}
	
}
