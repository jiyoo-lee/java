import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Net3 {
//ũ�Ѹ�crawling : ������ �ҽ��ڵ带 �ܾ�´�.
	public static void main(String[] args) throws Exception {
		String url = "https://webmail.lh.or.kr:443/login";
		URL urls = new URL(url);
		URLConnection con = urls.openConnection();
		int size = con.getContentLength();
		System.out.println(urls.getProtocol()); //protocol http https
		System.out.println(urls.getPort()); //port ��ȣ
		System.out.println(urls.getFile()); // ���� ���ϸ�
		InputStream is = urls.openStream();
		InputStreamReader isr = new InputStreamReader(is,"UTF8");
		BufferedReader br = new BufferedReader(isr);
		FileOutputStream fs = new FileOutputStream("login.html");
		byte[] html = new byte[1024];
		String str = "";

		while((str=br.readLine())!=null) {
			System.out.println(str);
			//fs.write(html,0,size);
		}
		br.close();
		fs.flush();
		fs.close();
	}
}
