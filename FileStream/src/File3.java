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
		} //���� ����Ʈ�� ����..zzzzzz
	}
	
	
	public void word() throws IOException { //������ �����µ� �����Ͱ� ������ ���� �� �ְ� ����ó��
		try {
			int w;
			while(true) {
				w = this.fr.read();
				if(w == -1) {
					break;
				}
				System.out.print((char)w);
			}
			this.fr.close(); //FileReader ���� 
		}
		catch(Exception z) { // �޼ҵ� ���� �Ѱ��ٶ� ���� throw�� �ѱ�� catch�ȿ��� exception ���� ���� 
			if(z.getMessage() != null) {
				System.exit(0);
			}
		}
	}
	
}
