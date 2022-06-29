import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Net6 {
	//client 역할
	public static void main(String[] args) throws Exception{

		System.out.println("클라이언트");
		String ip = "192.168.1.142"; 	// Localhost
		int port = 8080;
		try {
			
			Socket sc = new Socket(ip,port); //접속 할 서버 IP,접속 할 서버 port를 입력
			System.out.println("서버에 연결되었습니다.");
			String cmsg = "안녕하세요!";
			/* 클라이언트에서 서버로 보내는 통로*/
			OutputStream os = sc.getOutputStream();
			
			/* 서버에서 클라이언트로 보내는  값을 받는 통로*/
			//클라이언트에서 적용한 메세지를 메모리에 적용 후 getbytes로 전송 
			InputStream is = sc.getInputStream();
			os.write(cmsg.getBytes());
			os.flush();
			
			//서버에서 회신 된 내용을 byte배열로 받은 후 출력
			byte[] data = new byte[1024];
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			
			sc.close();
			os.close();
		}
		
		catch(Exception a) {
			System.out.println("서버 연결에 실패하였습니다.");
		}
	}
}
