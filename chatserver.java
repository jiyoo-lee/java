import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chatserver {

	static InputStream is = null;
	static OutputStream os = null;
	static byte[] data = null;
	static String mid = null;
	static Scanner sc = null;
	
	public static void main(String[] args) {

		int port = 8009;
		Socket sc = null;
		Scanner sr = null;
		
		try {
			ServerSocket ss = new ServerSocket(port);
			sr = new Scanner(System.in);
			System.out.println("서버에서 사용할 아이디를 입력해주세요.");
			mid = sr.next(); //서버 담당자 아이디
			
			
			System.out.println("채팅 대기중입니다...");
			
			for(;;) {
				sc = ss.accept();
				is = sc.getInputStream();
				os = sc.getOutputStream();
				
				data = new byte[1024];
				int arr = is.read(data);
				// 클라이언트에게 받는 메세지
				String message = new String(data,0,arr);
				System.out.println(message);
				
				System.out.println("내용을 입력해주세요.");
				String msg = mid + " : " +sr.nextLine();
				os.write(msg.getBytes());
				os.flush();
				
			}
		}
		catch(Exception a) {
			
		}
	}
}
