import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Net6 {
	//client ����
	public static void main(String[] args) throws Exception{

		System.out.println("Ŭ���̾�Ʈ");
		String ip = "192.168.1.142"; 	// Localhost
		int port = 8080;
		try {
			
			Socket sc = new Socket(ip,port); //���� �� ���� IP,���� �� ���� port�� �Է�
			System.out.println("������ ����Ǿ����ϴ�.");
			String cmsg = "�ȳ��ϼ���!";
			/* Ŭ���̾�Ʈ���� ������ ������ ���*/
			OutputStream os = sc.getOutputStream();
			
			/* �������� Ŭ���̾�Ʈ�� ������  ���� �޴� ���*/
			//Ŭ���̾�Ʈ���� ������ �޼����� �޸𸮿� ���� �� getbytes�� ���� 
			InputStream is = sc.getInputStream();
			os.write(cmsg.getBytes());
			os.flush();
			
			//�������� ȸ�� �� ������ byte�迭�� ���� �� ���
			byte[] data = new byte[1024];
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			
			sc.close();
			os.close();
		}
		
		catch(Exception a) {
			System.out.println("���� ���ῡ �����Ͽ����ϴ�.");
		}
	}
}
