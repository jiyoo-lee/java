import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//8001
public class chat_client1 {

	public static void main(String[] args) {

		port_chat pc = new port_chat();
		pc.connect();
		
	}
}

class port_chat {
	
	String ip = "127.0.0.1";
	int port = 8001;
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
			
			//������ �ش� �޼����� ���� 
			this.message = "Ŭ���̾�Ʈ" + this.port;
			this.os.write(this.message.getBytes());
			this.os.flush();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("�����Է� : ");
			String say = sc.nextLine();
			
			this.os.write(say.getBytes());
			this.os.flush();
			
			}
		}catch(Exception e) {
		}
		
	}
	
}