import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client {

	public static void main(String[] args) {
		try {
			client_chat cc = new client_chat();
			cc.chat();
			
		}catch(Exception e) {
			if(e.getMessage() != null) {
				System.out.println(e);
			}
		}
	}
}

class client_chat {
	
	Socket sk = null;
	private final String ip = "192.168.100.128";
	//private final String ip = "192.168.100.60";
	final int port = 9009;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	OutputStream os2 = null;
	private String mid = null;
	String msg = null; //client
	String msg2 = null; //client ����޼���
	String smsg = null; //server
	String check = null;
	
	public void chat() {
		//�� ���� Stream�� close ���� �ʽ��ϴ�. �ֳ��ϸ� ��� Stream�� ���ϰ� ������ �Ǿ� �����Ƿ� close�� ���ϵ� �Բ� ���ᰡ �˴ϴ�.
		// socket�� �����Ͱ� �������Ͱ� ������ �̷������ ������ �������� ������ �߻� �� �� �ִ�.
		try {
			this.sc = new Scanner(System.in);
			System.out.println("���̵� �������ּ���. : ");
			this.mid = this.sc.next();
			
			int c = 0;
			
			while(true) {
				this.sk = new Socket(this.ip,this.port);
				this.is = this.sk.getInputStream();
				this.os = this.sk.getOutputStream();
				
				if(c==0) {
				this.msg = "["+this.mid+"] :"+"�� �����Ͽ����ϴ�.";
				//c++;
				}
				
				else {
					this.sc = new Scanner(System.in);
					System.out.println("������ �Է����ּ��� : ");
					this.msg =	"["+this.mid+"] :"+ this.sc.nextLine().intern(); // intern�� ���� equals �Ⱦ��� ==�� ����
				}
				
				if(msg.contains("exit")) {
					System.out.println("ä���� ����˴ϴ�.");
					String msg1 = "["+this.mid+"] ���� �����ϼ̽��ϴ�.";
					this.os.write(msg1.getBytes()); // ����
					
					this.os.flush();
					this.sk.close();
					break;
				}
				
				this.os.write(this.msg.getBytes());
				this.os.flush();
				
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.smsg = new String(data,0,n);
				System.out.println(this.smsg);
				
				c++;	
			}
			
		}catch(Exception e) {
			String error = e.getMessage();
			if(error.indexOf("StringIndexOutOfBoundsException") != -1) {
				System.out.println("���� ������ְ� �߻��ؼ� ���� �����մϴ�.");
			}
		}
	}	
}