import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

// 전송형태의 프로토콜
//TCP, UDP 
/*PORT(tcp) : 
 80 : 웹 web (http://) 
 21 : FTP //파일전송시 사용
 22 : SSH Share port -Linux, Unix //파일전송, 서버외부접속
 23 : TELNET  - Window 서버외부접속
 443 : web (https://)
 25 : SMTP - MAIL SERVER - 메일 보내기 
 110 : POP3 (메일 받기) - 문자,파일 받기 PC에 다운받기 (단점 : 피씨에서 지우면 다 사라짐) (서버와 비동기화)
 143 : IMAP (메일 받기) - 문자, 파일 받기 (피씨에서 지워도 서버에 남아있어서 다시 사용가능)(서버와 동기화)
 
  */


/*SNMP : UDP (문자 발송 시스템) VPN (가상 IP) - UDP */
public class Net2 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("웹에서 가져올 이미지 주소를 입력해주세요.");
		String url = sc.next();
		URL u = new URL(url); // URL(클래스) 네트워크 경로를 말합니다.
		URLConnection con = u.openConnection(); // 중요 해당url(경로)를 오픈할때 쓴다. URL에서만 사용
	
		//System.out.println(con); 연결확인
		int imgsize = con.getContentLength();//indexOf 기능형태  -1은 없음 그외에는 파일확인 
		//System.out.println(imgsize);
		
		String imgtype = con.getContentType(); //파일 속성을 확인 하는 부분
		//System.out.println(imgtype);
		
		long date = con.getDate(); // 파일 로드 날짜를 알려줌 
		//System.out.println(date);
		
		InputStream is = u.openStream(); // 해당 URL에서 파일을 읽어올때 사용함
		BufferedInputStream bi = new BufferedInputStream(is); //URL에서 읽은 파일ㅇ르 임시저장
		FileOutputStream fo = new FileOutputStream("copy.mp4"); //저장형태
		byte[] data = new byte[1024]; // 1024=1KB 해당 파일을 조각냄 
		
		int cnt = 0; // 반복값을 체크 
		int imgdata = 0; 
		
		while ((imgdata=bi.read(data))!= -1) {
			fo.write(data,0,imgdata); //조각난 파일을 붙여넣기 하는 상태 
			cnt += imgdata; //1024 ++
			System.out.println("다운로드 중..."+ (cnt*100)/imgsize + "%");
		}
		fo.flush();
		fo.close();
		System.out.println("다운로드가 완료되었습니다.");
	}
}
