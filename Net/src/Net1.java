import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net1 {
	/* 네트워크 */
	// UnknownHostException : Host 정보가 확인 되지 않을 경우
	// host : 도메인명만을 말하는 것.
	public static void main(String[] args) throws UnknownHostException {
		
		/*InetAdress : IP network Address */
		// getByName : 접속 할 도메인 주소명을 알려줌
		InetAddress ia = InetAddress.getByName("localhost"); //naver.com/223.130.200.104
		System.out.println(ia);
//		System.out.println(ia.getHostName()); // naver.com
//		System.out.println(ia.getHostAddress()); // 23.130.200.104 //DNS에 연결된 아이피
//		System.out.println(ia.getHostAddress()); // 23.130.200.104
		System.out.println(ia.getHostAddress());

		
		//getallbyname 쓸땐 배열로 만들어서 가져올 수 있음 (배열로 구성)
		InetAddress[] ia2 = InetAddress.getAllByName("naver.com"); 
		System.out.println(ia2.length); // 해당 DNS의 ip 갯수
		int w = 0;
		while( w < ia2.length) {
			System.out.println(ia2[w].getHostAddress());
		w++;
		}
	}
}
