import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

//File7�� ���� �߰� ���� BufferedReader + Array (output -> input -> output)
public class Buffer1_array1 {

	public static void main(String[] args) throws IOException{
		
		// ���ۿ� �ִ� ���� ����Ʈ�� �ִ� �� 
		FileReader fr = new FileReader("C:\\java4\\java5\\FileStream\\src\\buffer.txt",Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<String> ar = new ArrayList<>(Arrays.asList()); //�� �迭 Ŭ���� 
		
		String str = "";
		int w = 0;
		while((str=br.readLine()) != null) { // ���Ϳ� �ִ� ���� ��Ʈ�� �ڷ������� ���� �� 
			ar.add(str); // ar����Ʈ�� �߰���Ŵ
			w++;
		}
		br.close();
		
		System.out.println(ar);
		System.out.println(ar.size());
	}
}
