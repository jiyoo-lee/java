import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// Socket ��� : server, client : �޼���, ���� ���� �ۼ������
// ����� (�뷮�� ũ�� �ӵ��� ������ �پ����)
public class Net5 {
	//server ����
	//HTTP ��� : JSON, Image, video, music �����(��ûrequest )�� ����(���� response)�� �ۼ������ // �ܹ���
	public static void main(String[] args) { // ioexception�� �����ʱ�(Ŭ���̾�Ʈ�� �����Ҷ� ���ŷο��� ����)

		//control + f11 ������ �ܼ�â�� �����Ű���ʱ� (�ߺ��Ǿ� ��Ʈ �浹��)
		//control + c : ����
		//taskkill /f /pid ��Ʈ��ȣ (������Ʈ �����Ű��)
		System.out.println("Server Connect");
		int port = 8080; // ���� �� ��Ʈ��ȣ�� ������(��, ���� �ߺ��� ��Ʈ�� ����ϸ� �ȵ�)
		String msg = "Connect Suceess!";
		
		try {
				ServerSocket ss = new ServerSocket(port); //ServerSocket :open ��ų ��Ʈ�� ����
				//�١١١ٿ����� ���������ϱ� ���ؼ��� serversocket�� ���� ��ε带 �ؼ��� �ȵ˴ϴ�.
				
			while(true) { //���� �ݺ� : ������ �������ʰ� 
				
				System.out.println("���� ��� ��..");
				Socket sc = ss.accept();  //accept(); : Ŭ���̾�Ʈ�� ������ ���� ����ϴ� ������ �ϰ� ��
				System.out.println("host: ��� ���� ����");
				
				/* Server���� Client�� �ޱ� ���� ��� */
				InputStream is = sc.getInputStream(); //client���� ������ ���� �о����
				
				/* Client�� ������ ��� */
				OutputStream os = sc.getOutputStream(); // client�� ���� ���� 
				byte[] data = new byte[1024]; // client���� �޴� ���� byte�� ���� 
				int n = is.read(data);	//�ش� ���� �о����
				String msgclient = new String(data,0,n); // �ش� ���� �迭�� Ȯ���Ͽ� ������ �̰� 
				System.out.println(msgclient); // �� ���
				
				String aws = "�ݰ����ϴ�."; //�������� ������ message
				os.write(aws.getBytes()); // Ŭ���̾�Ʈ�� ���������� �޸� ���� 
				os.flush();
			
				is.close();
				os.close();
				sc.close();
			}
		}
		catch(Exception e) {
			System.out.println("���� ���� ��Ʈ�� �ߺ��Ǿ� ������ ���� �����մϴ�.");
		}
	}
}
