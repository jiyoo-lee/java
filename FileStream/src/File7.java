import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;

/* 공통명령어 사항: read(); 글자를 하나만 읽음, readLine(): 줄을 읽음, next();, nextLine(); */

public class File7 {

	public static void main(String[] args) throws IOException {
		/*BufferReader - OUTPUT 
		 *BufferWriter - input */
		
		try {
			FileReader fr2 = new FileReader("C:\\java4\\java5\\FileStream\\src\\buffer.txt",Charset.forName("UTF-8"));
			//System.out.println((char)fr.read()); -> FileReader는 반복문으로 글자 하나하나 로드할수 밖에 없다. readLine 없음
			
			//BufferedReader : Temp(임시저장소) - 효율적으로 파일을 보다 빠르게 가져올 수 있음.
			//BufferedReader bf = new BufferedReader(fr); //readLine()으로 해당 값을 확인
			
			//System.out.println(bf.readLine()); // 해당 임시저장소에서 저장된 내용 중 한개의 라인으로 로드하게 됩니다.
			//System.out.println(bf.readLine()); //반복하면 다음 줄을 계속 읽어내린다.

		/*	if(bf.readLine() !=null) { // readLine은 조건문같은 곳에 쓰기만해도 한번 쓴거로 간주한다.
				int w = 0;
				while(w<=1) {
					String data = bf.readLine();
					System.out.println(data);
					w++;
				}
			}*/
			
			/*String line ="";
			while((line = bf.readLine())!= null) {
				System.out.println(line); // 받는걸 출력할 수있게 자료형에 받아서 출력하게 한다.
			}
			//buffer는 속도가 빠른 대신 사용 부분에 무조건 변수 또는 배열로 받은 후 사용하는것을 권장합니다.
			
			System.out.println(bf.readLine()); // 가장 마지막 readLine();을 기억한다. 해당 데이터가 두줄이라서 여기는 null이 나온다.
			/*buffer는 최초 값을 출력하였을경우 무조건 다음 라인의 값을 출력합니다.*/
			//처음부터 다시 읽게하고싶으면 파일리더부터 다시 로드를해서 버퍼 불러야한다.
			
			
			/*데이터 문서의 라인갯수를 확인*/
			/*LineNumberReader : 파일 전체 라인 갯수를 확인하는 클래스입니다.*/
			LineNumberReader li = new LineNumberReader(fr2);
			int ea = 0;
			while(li.readLine() !=null) {
			 ea =li.getLineNumber();
			}
			System.out.println(ea);
			fr2.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
