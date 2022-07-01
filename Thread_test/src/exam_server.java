import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class exam_server {

	public static void main(String[] args) {
		
		/* 최종 응용 문제(port번호는 무조건 숫자만 입력받도록 합니다.)
		 * 서버 프로그램을 실행합니다. 실행 시 가장 먼저 해당질문을 하게됩니다.
		 * 사용하실 port 번호를 입력하세요. scanner
		 * "***채팅서버오픈***[9009]" -> 대기
		 *
		 * 클라이언트 연결시 : ****guest가 참여하였습니다. ****
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용하실 port번호를 입력하세요.");
		try {
			int port = sc.nextInt();
			serverchat sv = new serverchat(port);
			sv.open();
		}
		catch(Exception e) {
			System.out.println("port번호는 숫자만 입력가능합니다.");
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
			System.out.println("***채팅서버오픈***");
			this.server = new ServerSocket(this.port);
			System.out.println("연결대기중..");
			Socket socket = this.server.accept();
			System.out.println("son the guest가 입장하였습니다.");
			this.is = socket.getInputStream();
			this.os = socket.getOutputStream();
			
			while(true) {	
				
				byte[] data = new byte[1024];
				int n = is.read(data);
				String inputMessage = new String(data,0,n);
				System.out.println("클라이언트>>"+inputMessage);
				
				Scanner sc = new Scanner(System.in);
				System.out.println("서버>>");
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