import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//8002
public class chat_client2 {

	public static void main(String[] args) {
		
		port_chat2 pc2 = new port_chat2();
		pc2.connect();

	}

}

class port_chat2 {
	
	String ip = "192.168.1.157";
	int port = 8002; //서버에서 오픈한 포트
	InputStream is = null;
	OutputStream os = null;
	String message = "";
	Socket socket = null;
	
	public void connect () {
		
		try {
			while(true) {
				this.socket = new Socket(this.ip, this.port);
				this.is = this.socket.getInputStream();
				this.os = this.socket.getOutputStream();
				this.message = "클라이언트" + this.port;
				this.os.write(this.message.getBytes());
				this.os.flush();
			
				Scanner sc = new Scanner(System.in);
				System.out.println("내용입력 : ");
				String say = sc.nextLine();
				this.os.write(say.getBytes());
				this.os.flush();
			}
		}catch(Exception e) {
			
		}	
	}
}