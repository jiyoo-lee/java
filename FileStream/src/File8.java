import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//Files로 해당 모든 내용을 배열로 전송 시키는 방법
public class File8 {

	public static void main(String[] args) throws IOException{
		/*List는 모든 리스트들의 조상 클래스*/
		// Files : 신규 IO class readAllLine (전체 내용을 한번에 모두 읽음)
		// Files + Paths.get("경로"); 
		
		List<String> data = Files.readAllLines(Paths.get("C:\\java4\\java5\\FileStream\\src\\buffer.txt"));
		
		System.out.println(data);
		
		//단점 : 메모리 할당이 많아짐, 한글 언어 패킷을 조정해야함 
		byte[] data2 = Files.readAllBytes(Paths.get("C:\\java4\\java5\\FileStream\\src\\buffer.txt"));
		
		System.out.println(new String(data2));
	}
}