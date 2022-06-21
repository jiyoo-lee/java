import java.io.FileReader;
import java.io.IOException;

public class File1 {

	/*InputStream : 입력 스트림 : 프로그램으로 들어오는 스트림, 키보드 마우스 hdd
	 * OutputStream : 출력 스트림 : 프로그램에서 밖으로 나가는 부분 모니터, hdd, printer
	 * Stream : input output 사용자 처리 
	 * JAVA.io (Api)
	 * File, FileReader (일반) 속도가 느리다 - StreamAPI 거치면 속도가 빠르다 (FileInputStream) 
	 * FileWriter ->StreamAPI (FileOutPutStream)
	 * */
	
	public static void main(String[] args) throws Exception {
		
		/*FileReader :
		 * 1.문자 데이터를 파일로부터 읽는 클래스 
		 * 2. 파일 이름을 생성자 인수값(parameter)로 사용해서 FileReader 객체를 생성합니다.
		 * public abc(인수값)
		 */
		try {
		FileReader fr = new FileReader("C:\\java4\\java5\\FileStream\\src\\list.txt"); 
		String a = "a1";
		tests(a);
		}
		catch(IOException z1) { //IOexception에 대한 예외처리 
			System.out.println(z1.getMessage());
		}
		catch(Exception z) { //일반 Exception에 대한 예외처리 방식 
			System.out.println(z.getMessage());
		}
		
	}												
	public static void tests (String b) throws IOException { // MAIN과 같게 쓰거나 EXCEPTION MAIN에 쓰고 메소드 IOEXCEPTION은 ㄱㅊ
		int k = Integer.parseInt(b);
		
		IOException ex = new IOException();
		throw ex;
	}
}
