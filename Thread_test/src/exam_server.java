import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class exam_server {

	public static void main(String[] args) {
		
		/* ���� ���� ����(port��ȣ�� ������ ���ڸ� �Է¹޵��� �մϴ�.)
		 * ���� ���α׷��� �����մϴ�. ���� �� ���� ���� �ش������� �ϰԵ˴ϴ�.
		 * ����Ͻ� port ��ȣ�� �Է��ϼ���. scanner
		 * "***ä�ü�������***[9009]" -> ���
		 *
		 * Ŭ���̾�Ʈ ����� : ****guest�� �����Ͽ����ϴ�. ****
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ͻ� port��ȣ�� �Է��ϼ���.");
		try {
			int port = sc.nextInt();
			serverchat sv = new serverchat(port);
			sv.open();
		}
		catch(Exception e) {
			System.out.println("port��ȣ�� ���ڸ� �Է°����մϴ�.");
		}

	}
}

class serverchat {
	
	int port = 0;
	ServerSocket server = null;
	InputStream is = null;
	OutputStream os = null;
	
	public serverchat(int a) {
		this.port = a;
	}
	
	public void open () {
		try {
			System.out.println("***ä�ü�������***");
			this.server = new ServerSocket(this.port);
			System.out.println("��������..");
			Socket socket = this.server.accept();
			System.out.println("son the guest�� �����Ͽ����ϴ�.");
			this.is = socket.getInputStream();
			this.os = socket.getOutputStream();
			
			while(true) {	
				
				byte[] data = new byte[1024];
				int n = is.read(data);
				String inputMessage = new String(data,0,n);
				System.out.println("Ŭ���̾�Ʈ>>"+inputMessage);
				
				Scanner sc = new Scanner(System.in);
				System.out.println("����>>");
				String outputmessage = sc.nextLine();
				this.os.write(outputmessage.getBytes());
				this.os.flush();
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}