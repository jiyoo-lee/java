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
	String msg2 = null; //client 입장메세지
	String smsg = null; //server
	String check = null;
	
	public void chat() {
		//※ 각종 Stream을 close 하지 않습니다. 왜냐하면 모든 Stream이 소켓과 연결이 되어 있으므로 close시 소켓도 함께 종료가 됩니다.
		// socket은 데이터가 본데이터가 변경이 이루어지면 접속이 끊어지는 현상이 발생 할 수 있다.
		try {
			this.sc = new Scanner(System.in);
			System.out.println("아이디를 생성해주세요. : ");
			this.mid = this.sc.next();
			
			int c = 0;
			
			while(true) {
				this.sk = new Socket(this.ip,this.port);
				this.is = this.sk.getInputStream();
				this.os = this.sk.getOutputStream();
				
				if(c==0) {
				this.msg = "["+this.mid+"] :"+"님 입장하였습니다.";
				//c++;
				}
				
				else {
					this.sc = new Scanner(System.in);
					System.out.println("내용을 입력해주세요 : ");
					this.msg =	"["+this.mid+"] :"+ this.sc.nextLine().intern(); // intern을 쓰면 equals 안쓰고 ==로 가능
				}
				
				if(msg.contains("exit")) {
					System.out.println("채팅이 종료됩니다.");
					String msg1 = "["+this.mid+"] 님이 퇴장하셨습니다.";
					this.os.write(msg1.getBytes()); // 전송
					
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
				System.out.println("서버 접속장애가 발생해서 강제 종료합니다.");
			}
		}
	}	
}