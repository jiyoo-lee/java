import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//server에 여러개의 포트를 오픈
//bind Exception (Port 충돌)
public class chat_server {

	public static void main(String[] args) {

		//server가 포트를 두개 열기
		// server 8001,8002
		// client 8001, client 8002로 접속 하나씩
		// server port1 서버 8003 client 8003 모두 접속
		// 내 아이피: 192.168.1.157
		// 내가 끊으면 둘다 포트 끊김 
		
		int[] port = {8001,8002};
		
		openchat oc = null;
		
		for(int i = 0; i<port.length; i++) {
			oc = new openchat(port[i]); //포트열기
			oc.start();
		}
		
		/*
		int port = 8003;
		openchat oc = null;
		oc = new openchat(port); //포트열기
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
				System.out.println(this.pt+"서버연결 대기중입니다.");
				Socket socket = this.server.accept(); // 해당 포트 모두 오픈
				System.out.println("서버가 연결되었습니다.");
			
				this.is = socket.getInputStream(); // 서버가 client에게 받음
				this.os = socket.getOutputStream(); // client가 서버에게 받음
			
				//client 메세지 받기 
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