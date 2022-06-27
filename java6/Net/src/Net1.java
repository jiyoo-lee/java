import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net1 {
	/* ��Ʈ��ũ */
	// UnknownHostException : Host ������ Ȯ�� ���� ���� ���
	// host : �����θ��� ���ϴ� ��.
	public static void main(String[] args) throws UnknownHostException {
		
		/*InetAdress : IP network Address */
		// getByName : ���� �� ������ �ּҸ��� �˷���
		InetAddress ia = InetAddress.getByName("localhost"); //naver.com/223.130.200.104
		System.out.println(ia);
//		System.out.println(ia.getHostName()); // naver.com
//		System.out.println(ia.getHostAddress()); // 23.130.200.104 //DNS�� ����� ������
//		System.out.println(ia.getHostAddress()); // 23.130.200.104
		System.out.println(ia.getHostAddress());

		
		//getallbyname ���� �迭�� ���� ������ �� ���� (�迭�� ����)
		InetAddress[] ia2 = InetAddress.getAllByName("naver.com"); 
		System.out.println(ia2.length); // �ش� DNS�� ip ����
		int w = 0;
		while( w < ia2.length) {
			System.out.println(ia2[w].getHostAddress());
		w++;
		}
	}
}
