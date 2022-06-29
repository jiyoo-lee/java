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
			System.out.println("IP :"+ ia.getHostAddress()+"에서 개설되었습니다.");
			
		}
		catch(Exception a) {
			
		}
		try {
			ssk = new ServerSocket(8009);
			System.out.println("접속 대기중..");
			Socket client = ssk.accept();
		
			InputStream is = client.getInputStream();
			OutputStream os = client.getOutputStream();
			System.out.println( client.getInetAddress()+"님이 접속하셨습니다.");
			
			while(true) {
				String msg = "";
				String msg1 = "";
				
				br = new BufferedReader(new InputStreamReader(is));
				br1 = new BufferedReader(new InputStreamReader(System.in));
				bw = new BufferedWriter(new OutputStreamWriter(os));
				
				msg = br.readLine();
				
				if(msg.equals("exit")) {
					System.out.println(client.getInetAddress()+"가 방을 나갔습니다.");
				}
				else {
					System.out.println(client.getInetAddress()+"님의 말"+ msg + "\n");
					System.out.println("서버측 메시지:");
					msg1 = br.readLine();
					bw.write(msg1 + "\n");
					bw.flush();
				}
				
			}
			
		}
		catch(Exception a) {
			System.out.println("소켓 생성 실패");
		}
		try {
			bw.close();
			br.close();
			ssk.close();	
		}
		catch(Exception b) {
			System.out.println("마지막 예외");
		}
	}
	
	public static void main(String[] args) {
		client1 c = new client1();
	}
}
