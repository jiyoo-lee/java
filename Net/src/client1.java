import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class client1 {

	
	private ServerSocket ssk = null;
	
	BufferedWriter bw = null;
	BufferedReader br = null;
	BufferedReader  br1 = null;
	
	public client1 () {
		try {
			InetAddress ia = InetAddress.getLocalHost();
			System.out.println("IP :"+ ia.getHostAddress()+"���� �����Ǿ����ϴ�.");
			
		}
		catch(Exception a) {
			
		}
		try {
			ssk = new ServerSocket(8009);
			System.out.println("���� �����..");
			Socket client = ssk.accept();
		
			InputStream is = client.getInputStream();
			OutputStream os = client.getOutputStream();
			System.out.println( client.getInetAddress()+"���� �����ϼ̽��ϴ�.");
			
			while(true) {
				String msg = "";
				String msg1 = "";
				
				br = new BufferedReader(new InputStreamReader(is));
				br1 = new BufferedReader(new InputStreamReader(System.in));
				bw = new BufferedWriter(new OutputStreamWriter(os));
				
				msg = br.readLine();
				
				if(msg.equals("exit")) {
					System.out.println(client.getInetAddress()+"�� ���� �������ϴ�.");
				}
				else {
					System.out.println(client.getInetAddress()+"���� ��"+ msg + "\n");
					System.out.println("������ �޽���:");
					msg1 = br.readLine();
					bw.write(msg1 + "\n");
					bw.flush();
				}
				
			}
			
		}
		catch(Exception a) {
			System.out.println("���� ���� ����");
		}
		try {
			bw.close();
			br.close();
			ssk.close();	
		}
		catch(Exception b) {
			System.out.println("������ ����");
		}
	}
	
	public static void main(String[] args) {
		client1 c = new client1();
	}
}
