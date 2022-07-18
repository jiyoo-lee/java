import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class exam_client {

	public static void main(String[] args) {

		/*Ŭ���̾�Ʈ
		 * ������ ip��ȣ�� �Է����ּ���.
		 * ���� �� ��Ʈ ��ȣ�� �Է����ּ���
		 * "****
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� IP��ȣ�� �Էinsert.");
		String ip = sc.nextLine();
		System.out.println("���� �� port��ȣ�� �Է����ּ���.");
		try {
			int port = sc.nextInt();
			clientchat cl = new clientchat(ip, port);
			cl.access();
			
		}catch(Exception e) {
			System.out.println("���ڸ� �Է°����մϴ�.");
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
				this.message = "Ŭ���̾�Ʈ" + this.port + "����";
				this.os.write(this.message.getBytes());
				this.os.flush();
				c++;
				}
				
				System.out.println("Ŭ���̾�Ʈ >>");
				Scanner sc = new Scanner(System.in);
				String outputmessage = sc.nextLine();
				this.os.write(outputmessage.getBytes());
				this.os.flush();
				
				byte[] data = new byte[1024];
				int n = is.read(data);
				String inputMessage = new String(data,0,n);
				System.out.println("����>>"+inputMessage);
			}
		}catch(Exception e) {
			
		}
	}
	
}
