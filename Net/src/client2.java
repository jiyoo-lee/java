import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client2 {

	public static void main(String[] args) {

		/*1:1 채팅 프로그램 프로세서 
		 * 서버 : 포트 : 9090
		 * "서버에서 사용하실 아이디를 입력해주세요."
		 * "대기중.."
		 * 홍길동: 반갑습니다.
		 * "내용을 입력해주세요." -> 어서오세요 엔터
		 * "상대방이 퇴장하셨습니다."
		 * "내용을 입력해주세요: "
		 * 
		 * 클라이언트 :
		 * "채팅에 사용하실 아이디를 입력해주세요 : "
		 * 접속
		 * ex) 홍길동 "내용을 입력해주세요: " -> 반갑습니다 엔터
		 * 유관순 : 어서오세요
		 *  " 내용을 입력해주세요 : " exit라고 입력
		 *  "채팅이 종료되었습니다."
		 *  */
		
		String ip = "192.168.1.142";
		int port = 8009;
		Scanner sn = null;
		InputStream is = null;
		OutputStream os = null;
		Socket sc = null;
		String id = null;
		
		
		try {
			
			sc = new Socket(ip,port);
			os = sc.getOutputStream();
			is = sc.getInputStream();
			System.out.println("접속완료");
			sn = new Scanner(System.in);
			System.out.println("입력하실 아이디를 입력해주세요.");
			id = sn.next();
			
			for(;;) {
			
			System.out.println("입력하실 내용을 적어주세요  :");
			String chat = id + " : "+ sn.nextLine();
			os.write(chat.getBytes());
			os.flush();
			
			byte[] data = new byte[1024];
			int n = is.read(data);
			String cmsg = new String(data,0,n);
			System.out.println(cmsg);
			
			if(chat.contains("exit")) {
				System.out.println(id+"퇴장합니다.");
				System.exit(0);
				}
			else if(cmsg.contains("exit")) {
				System.out.println("상대방이 퇴장했습니다.");
				}
			}
		}
		catch(Exception e) {
			if(e.getMessage() != null) {
			System.out.println("서버 장애가 생겼습니다.");
			System.out.println(e.getMessage());
			}
		}
	}
}
