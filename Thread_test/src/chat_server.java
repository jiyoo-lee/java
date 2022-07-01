import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//server�� �������� ��Ʈ�� ����
//bind Exception (Port �浹)
public class chat_server {

	public static void main(String[] args) {

		//server�� ��Ʈ�� �ΰ� ����
		// server 8001,8002
		// client 8001, client 8002�� ���� �ϳ���
		// server port1 ���� 8003 client 8003 ��� ����
		// �� ������: 192.168.1.157
		// ���� ������ �Ѵ� ��Ʈ ���� 
		
		int[] port = {8001,8002};
		
		openchat oc = null;
		
		for(int i = 0; i<port.length; i++) {
			oc = new openchat(port[i]); //��Ʈ����
			oc.start();
		}
		
		/*
		int port = 8003;
		openchat oc = null;
		oc = new openchat(port); //��Ʈ����
		oc.start();*/
	}
}

class openchat extends Thread {
	String ip = "127.0.0.1";
	int pt = 0;
	ServerSocket server = null;
	InputStream is = null;
	OutputStream os = null;
	
	public openchat(int p) {
		this.pt = p;
	}
	
	
	@Override
	public void run() {
		try {
						
			this.server = new ServerSocket(this.pt);
			
			while(true) {
				System.out.println(this.pt+"�������� ������Դϴ�.");
				Socket socket = this.server.accept(); // �ش� ��Ʈ ��� ����
				System.out.println("������ ����Ǿ����ϴ�.");
			
				this.is = socket.getInputStream(); // ������ client���� ����
				this.os = socket.getOutputStream(); // client�� �������� ����
			
				//client �޼��� �ޱ� 
				byte[] data = new byte[1024];
				int n = is.read(data);
				String inputMessage = new String(data,0,n);
				System.out.println(inputMessage);
			}	
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}