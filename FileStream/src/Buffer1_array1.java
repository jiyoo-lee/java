import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

//File7에 대한 추가 설명 BufferedReader + Array (output -> input -> output)
public class Buffer1_array1 {

	public static void main(String[] args) throws IOException{
		
		// 버퍼에 있는 값을 리스트에 넣는 법 
		FileReader fr = new FileReader("C:\\java4\\java5\\FileStream\\src\\buffer.txt",Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<String> ar = new ArrayList<>(Arrays.asList()); //빈 배열 클래스 
		
		String str = "";
		int w = 0;
		while((str=br.readLine()) != null) { // 버터에 있는 값을 스트링 자료형으로 이전 후 
			ar.add(str); // ar리스트에 추가시킴
			w++;
		}
		br.close();
		
		System.out.println(ar);
		System.out.println(ar.size());
	}
}
