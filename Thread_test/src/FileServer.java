import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//file �ε� ÷������
public class FileServer {

	public static void main(String[] args) {

		f_server fs = new f_server();
		fs.data();
	}
}

class f_server {
	ServerSocket server = null;
	Socket sk = null;
	int port = 8005;
	
	InputStream is = null;
	OutputStream os = null;
	
	
	public void data() {
		try {
			this.server = new ServerSocket(this.port);
			this.sk = this.server.accept();
			System.out.println("***���� ������***");
			
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			
			byte[] data = new byte[1024*16];
			int n = this.is.read(data);
			//String f = new String(data,0,n); : ä�ÿ����� ����
			
			String url = "C:\\java6\\Thread_test\\src\\copy1.jpg";
			/*
			 *  ���Ϸ� Ŭ���̾�Ʈ�� ������ ������ �������� byte�� ���� �ް� �˴ϴ�.
			 * getInputStream(); -> FileOutputStream
			 * 
			 * */
			FileOutputStream fs = new FileOutputStream(url);
			
			fs.write(data,0,n); //�ش� url �ڷ������� ����ǵ��� ��
			fs.flush();
			//System.out.println(f);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
