import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

// ���������� ��������
//TCP, UDP 
/*PORT(tcp) : 
 80 : �� web (http://) 
 21 : FTP //�������۽� ���
 22 : SSH Share port -Linux, Unix //��������, �����ܺ�����
 23 : TELNET  - Window �����ܺ�����
 443 : web (https://)
 25 : SMTP - MAIL SERVER - ���� ������ 
 110 : POP3 (���� �ޱ�) - ����,���� �ޱ� PC�� �ٿ�ޱ� (���� : �Ǿ����� ����� �� �����) (������ �񵿱�ȭ)
 143 : IMAP (���� �ޱ�) - ����, ���� �ޱ� (�Ǿ����� ������ ������ �����־ �ٽ� ��밡��)(������ ����ȭ)
 
  */


/*SNMP : UDP (���� �߼� �ý���) VPN (���� IP) - UDP */
public class Net2 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �̹��� �ּҸ� �Է����ּ���.");
		String url = sc.next();
		URL u = new URL(url); // URL(Ŭ����) ��Ʈ��ũ ��θ� ���մϴ�.
		URLConnection con = u.openConnection(); // �߿� �ش�url(���)�� �����Ҷ� ����. URL������ ���
	
		//System.out.println(con); ����Ȯ��
		int imgsize = con.getContentLength();//indexOf �������  -1�� ���� �׿ܿ��� ����Ȯ�� 
		//System.out.println(imgsize);
		
		String imgtype = con.getContentType(); //���� �Ӽ��� Ȯ�� �ϴ� �κ�
		//System.out.println(imgtype);
		
		long date = con.getDate(); // ���� �ε� ��¥�� �˷��� 
		//System.out.println(date);
		
		InputStream is = u.openStream(); // �ش� URL���� ������ �о�ö� �����
		BufferedInputStream bi = new BufferedInputStream(is); //URL���� ���� ���Ϥ��� �ӽ�����
		FileOutputStream fo = new FileOutputStream("copy.mp4"); //��������
		byte[] data = new byte[1024]; // 1024=1KB �ش� ������ ������ 
		
		int cnt = 0; // �ݺ����� üũ 
		int imgdata = 0; 
		
		while ((imgdata=bi.read(data))!= -1) {
			fo.write(data,0,imgdata); //������ ������ �ٿ��ֱ� �ϴ� ���� 
			cnt += imgdata; //1024 ++
			System.out.println("�ٿ�ε� ��..."+ (cnt*100)/imgsize + "%");
		}
		fo.flush();
		fo.close();
		System.out.println("�ٿ�ε尡 �Ϸ�Ǿ����ϴ�.");
	}
}
