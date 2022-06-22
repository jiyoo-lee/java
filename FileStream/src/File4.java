import java.io.FileWriter;

//File write
public class File4 {

	public static void main(String[] args) throws Exception {
		
		try {
			//FileWriter : 문자 데이터를 파일에 쓰는 Class
			String user[] = {"홍길동40","이지유20","김유신60","고재석100"};
			
			
//			FileWriter fw = new FileWriter("C:\\java4\\java5\\FileStream\\src\\array.txt"); // 기존데이터 초기화 후 쓰기 
			FileWriter fw = new FileWriter("C:\\java4\\java5\\FileStream\\src\\array.txt",true); // 기존 데이터에 덧붙여쓰기
			
			//FileWriter는 파일명이 틀려도 불러와진다.
			
			for(int i = 0; i<user.length; i++) {
				fw.write(user[i]); //write : 문자,배열 데이터값을 파일에 적용함
			}
			
			fw.close(); // 파일 오픈 사항을 닫아줌 ->끝내야 파일에 내용이 들어감  
			
		}
		catch(Exception e) {
			System.out.println("test");
		}
		
		
	}
}
