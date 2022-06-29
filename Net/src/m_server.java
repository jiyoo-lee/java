import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class m_server {

	public static void main(String[] args) {

		chatroom cr = new chatroom();
		
	}
}

class chatroom  { //기본 사항 -> 각 접속자마다 thread를 분할 
	ServerSocket server = null;
	static final int port = 9009; //thread에서 공용으로 사용하기 위해서 
	Socket sk = null;
	
	public chatroom() {
		
		try {
			
		this.server =new ServerSocket(this.port);
		
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("****멀티 채팅 시작!!****");
		
		while(true) {
			
			try {
				
				this.sk = this.server.accept(); //socket open (client 접속 허가)
				chat_thread ct = new chat_thread(this.sk); // accept 정보 보냅니다.
				Thread t = new Thread(ct); //접속 할때마다 쓰레드 호출
				t.start();
				
			}catch(Exception e) {	 }
		}
	}
}

class chat_thread implements Runnable{
	
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	Scanner sc = null;
	//배열을 메모리에 기억시킴 이유 : 누적시켜야함
	//접속자 발생시 thread가 새롭게 생성되므로 static에 올리지않으면 누적 없이 계속 초기화되어버림.
	static ArrayList<Socket> user = new ArrayList<Socket>(); // 접속자
	
	public chat_thread(Socket s) {
		this.sk = s;
		this.user.add(this.sk);
		try {
			System.out.println("채팅에 참여하셨습니다.");
			System.out.println(this.sk);
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
		}
		catch(Exception e) {
			System.out.println("클라이언트 접속 정보가 올바르지 않습니다.");
		}
	}
	
	@Override
	public void run() {
		try {
			byte[] data = new byte[1024];
			int n = this.is.read(data);
			this.message = new String(data,0,n);
			System.out.println(this.message);
			
			while(true) {
				System.out.println("현재 채팅 참여자 : "+this.user.size()); //접속한 인원수				
				this.sc = new Scanner(System.in);
				System.out.println("보낼 메세지를 입력하세요.");
				this.result = "server : " + this.sc.nextLine();
				
				/*배열에 있는 vport에 대한 정보를 담은 수만큼 반복을 합니다.*/
				for(int j = 0; j < this.user.size(); j++) {
					//배열에 있는 사용자 vport로 전송을 하게됩니다. 
				OutputStream all = this.user.get(j).getOutputStream();
				//사용자별로 Stream을 생성 
				all.write(this.result.getBytes());
				all.flush(); // 해당 전송 메세지를 비움(메모리)
//				this.os.write(this.result.getBytes());
//				this.os.flush(); 
				}
				
				/*
				this.os.write(this.message.getBytes()); // 다시 회신
				this.os.flush();
				Thread.sleep(10000);
				String m = "관리자 메세지 출력";
				this.os.write(m.getBytes());
				this.os.flush();*/
			}
		}catch(Exception e) {
			System.out.println("클라이언트가 채팅창을 나갔습니다.");
		}
		finally {
			try {
				this.os.close();
				this.is.close();
				this.sk.close();
			}catch(Exception e) { }
		}
	}
}