import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// Socket 통신 : server, client : 메세지, 파일 전달 송수신통신
// 양방향 (용량이 크면 속도가 현저히 줄어들음)
public class Net5 {
	//server 역할
	//HTTP 통신 : JSON, Image, video, music 사용자(요청request )랑 서버(응답 response)랑 송수신통신 // 단방향
	public static void main(String[] args) { // ioexception을 적지않기(클라이언트가 접속할때 번거로움이 생김)

		//control + f11 눌러서 콘솔창에 실행시키지않기 (중복되어 포트 충돌됨)
		//control + c : 끊기
		//taskkill /f /pid 포트번호 (서버포트 종료시키기)
		System.out.println("Server Connect");
		int port = 8080; // 오픈 할 포트번호를 세팅함(단, 절대 중복된 포트를 사용하면 안됨)
		String msg = "Connect Suceess!";
		
		try {
				ServerSocket ss = new ServerSocket(port); //ServerSocket :open 시킬 포트를 적용
				//☆☆☆☆연결을 지속유지하기 위해서는 serversocket은 절대 재로드를 해서는 안됩니다.
				
			while(true) { //무한 반복 : 서버거 끊기지않고 
				
				System.out.println("연결 대기 중..");
				Socket sc = ss.accept();  //accept(); : 클라이언트가 들어오는 것을 대기하는 역할을 하게 함
				System.out.println("host: 통신 연결 성공");
				
				/* Server에서 Client로 받기 위한 통로 */
				InputStream is = sc.getInputStream(); //client에서 보내는 값을 읽어들임
				
				/* Client로 보내는 통로 */
				OutputStream os = sc.getOutputStream(); // client로 값을 전송 
				byte[] data = new byte[1024]; // client에서 받는 값을 byte로 받음 
				int n = is.read(data);	//해당 값을 읽어들임
				String msgclient = new String(data,0,n); // 해당 값을 배열로 확인하여 변수로 이관 
				System.out.println(msgclient); // 값 출력
				
				String aws = "반갑습니다."; //서버에서 보내는 message
				os.write(aws.getBytes()); // 클라이언트로 보내기위한 메모리 저장 
				os.flush();
			
				is.close();
				os.close();
				sc.close();
			}
		}
		catch(Exception e) {
			System.out.println("현재 서버 포트가 중복되어 서버를 강제 종료합니다.");
		}
	}
}
