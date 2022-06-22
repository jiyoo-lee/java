import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Scanner를 이용한 파일 쓰기 사용법 (input)
public class File6 {

	public static void main(String[] args) throws IOException {
		
		try {
		FileWriter fw = new FileWriter("C:\\java4\\java5\\FileStream\\src\\db.txt");
		Scanner sc = new Scanner(System.in);
		System.out.print("내용을 입력해주세요.:");
		
		for(int i =0; i<=2; i++) { //3번 반복
		String notice = sc.nextLine() +"\n";
		fw.write(notice); // 해당 입력사항을 db.txt에 저장
		} // 반복을 통한 입력하기
		sc.close();
		fw.close();
		}
		catch(Exception a) {
			System.out.println(a);
		}
		//이따가 응용문제 낼거임~
	}
}
