import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client2 {

	public static void main(String[] args) {

		/*1:1 ä�� ���α׷� ���μ��� 
		 * ���� : ��Ʈ : 9090
		 * "�������� ����Ͻ� ���̵� �Է����ּ���."
		 * "�����.."
		 * ȫ�浿: �ݰ����ϴ�.
		 * "������ �Է����ּ���." -> ������� ����
		 * "������ �����ϼ̽��ϴ�."
		 * "������ �Է����ּ���: "
		 * 
		 * Ŭ���̾�Ʈ :
		 * "ä�ÿ� ����Ͻ� ���̵� �Է����ּ��� : "
		 * ����
		 * ex) ȫ�浿 "������ �Է����ּ���: " -> �ݰ����ϴ� ����
		 * ������ : �������
		 *  " ������ �Է����ּ��� : " exit��� �Է�
		 *  "ä���� ����Ǿ����ϴ�."
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
			System.out.println("���ӿϷ�");
			sn = new Scanner(System.in);
			System.out.println("�Է��Ͻ� ���̵� �Է����ּ���.");
			id = sn.next();
			
			for(;;) {
			
			System.out.println("�Է��Ͻ� ������ �����ּ���  :");
			String chat = id + " : "+ sn.nextLine();
			os.write(chat.getBytes());
			os.flush();
			
			byte[] data = new byte[1024];
			int n = is.read(data);
			String cmsg = new String(data,0,n);
			System.out.println(cmsg);
			
			if(chat.contains("exit")) {
				System.out.println(id+"�����մϴ�.");
				System.exit(0);
				}
			else if(cmsg.contains("exit")) {
				System.out.println("������ �����߽��ϴ�.");
				}
			}
		}
		catch(Exception e) {
			if(e.getMessage() != null) {
			System.out.println("���� ��ְ� ������ϴ�.");
			System.out.println(e.getMessage());
			}
		}
	}
}
