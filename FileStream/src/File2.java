import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class File2 {

	public static void main(String[] args) throws IOException {
		try {
	//	FileReader fr = new FileReader("C:\\java4\\java5\\FileStream\\src\\list.txt"); JAVA 8버전 방식
			
	//Charset.forName : java12 -> EUC-KR(ANSI), utf8, utf16		
	FileReader fr = new FileReader("C:\\java4\\java5\\FileStream\\src\\list.txt",Charset.forName("EUCKR"));	
	// EUC-KR ? 2BYTE로 한글을 표현한 것
			
		//System.out.println(fr.getEncoding()); //인코더 형식을 확인 FileReader
		//System.out.println(fr.read()); // 파일 크기를 알 수 있음 
			
			while(true) { //while문 loop 활용하여 해당 문서 문자를 모두 가져옴 
				int number = fr.read(); // -1은 내용이 없음 or 더 이상 문자가 없을 경우
				System.out.print((char)number); // 한글자씩밖에 못가져 옴 stream이 아니라서 
				if(number == -1) { //(더 이상 가져올 문자가 없을 경우 루프에서 빠져나감)
					break;
				}
			}
			fr.close(); //FileReader를 종료함 
		}
		catch(IOException e) {
			if(e.getMessage() != null) {
				System.out.println(e);
			}
		}
		
		
		}

}
