import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner를 이용한 파일 로드 사용법 (output)
public class File5 {

	public static void main(String[] args) throws IOException{
		//SYSTEM.IN : INPUT 
		//SYSTEM.OUT : OUTPUT
		try {
		FileReader fr = new FileReader("C:\\java4\\java5\\FileStream\\src\\db.txt",Charset.forName("UTF-8")); //인코딩
		Scanner sc = new Scanner(fr); //system.in (사용자가 직접 입력), fileReader: 파일을 로드
		
		int count = 0;
		while(sc.hasNext()) { //hasNext() : true, false 
			sc.nextLine();
			count++;
		}
		System.out.println(count);
		
		sc.close();
		fr.close();
		//String result = sc.next();
//		
//		for(;;) { //loop시 예외처리로 빠질 수 있음.
//			String result = sc.nextLine(); //파일 로드 된 입력값을 result한테 전달, //**next보다는 nextLine으로 불러오는게 좋다.
//			if(result != null) {
//			System.out.println(result); // 출력
//			}
//			else {
//				sc.close(); break; }
//			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
