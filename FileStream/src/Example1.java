import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException { // 파일을 가져오기때문에 그거에 대한 오류를 잡아줘야한다.

		/* 응용문제
		 * 해당 사용자가 영화 제목을 검색합니다.
		 * 해당 영화 제목에 맞는 데이터값이 있을 경우 영화 전체에 대한 정보를 출력하게 됩니다.
		 * 힌트 : 스캐너로 영화 제목 입력 받음
		 * 검색 할 영화제목을 입력하세요 -> 범죄도시2 
		 * [범죄도시] - 추천5 - 2022년 4월 개봉 contains 으로  쓰면되려나..
		 * 없으면 검색한 영화는 확인 되지않습니다로 출력 되게 하기. try and catch로 오류..? 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("검색 할 영화제목을 입력하세요.>");
			String search = sc.nextLine();
			List<String> list = Files.readAllLines(Paths.get("C:\\java4\\java5\\FileStream\\src\\movie.txt"));
		
			boolean moviecheck = false;
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i).contains(search)){
					System.out.println(list.get(i));
					moviecheck = true;
				}
			}
			if(!moviecheck) {
				System.out.println("검색한 영화는 출력되지 않습니다.");
				}
			}
		catch(Exception a) {
			
		}
		sc.close();
	}
}

