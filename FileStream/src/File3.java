import java.io.FileReader;
import java.io.IOException;

//IOException + Exception
public class File3 {

	public static void main(String[] args) throws Exception {

		Filein f = new Filein();
		
		
	}

}

class Filein {
	
	FileReader fr = null;
	
	public Filein() throws IOException , Exception{ //constructor 
		
		try {
			this.fr = new FileReader("C:\\java4\\java5\\FileStream\\src\\data.dat");
			this.word();
			}
		catch(IOException k) {
			if(k.getMessage() != null) {
				System.out.println(k);
				}
			}
		catch(Exception j) {
			if(j.getMessage() != null) {
				System.out.println(j);
			}
		} //아주 퍼펙트한 상태..zzzzzz
	}
	
	
	public void word() throws IOException { //파일을 열었는데 데이터가 없으면 닫을 수 있게 예외처리
		try {
			int w;
			while(true) {
				w = this.fr.read();
				if(w == -1) {
					break;
				}
				System.out.print((char)w);
			}
			this.fr.close(); //FileReader 종료 
		}
		catch(Exception z) { // 메소드 값을 넘겨줄때 같은 throw로 넘기고 catch안에는 exception 으로 적용 
			if(z.getMessage() != null) {
				System.exit(0);
			}
		}
	}
	
}
