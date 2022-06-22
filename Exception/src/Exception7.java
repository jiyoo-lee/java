import java.util.ArrayList;
import java.util.Arrays;

public class Exception7 {

	public static void main(String[] args) {
		
		/*응용문제 
		 * 데이터파일 {홍길동, 55, 유관순, 강감찬,48,이순신,세종,34,88}
		 * 해당 데이터 값 중 문자값만 출력되도록 재배열 하시길 바랍니다.
		 * 단 메인에서는 해당 배열을 외부 클래스(setter)로 전송합니다.
		 * 해당 setter에서 배열값을 확인하여 이름만 재배열로 생성합니다.
		 * getter에서 해당 배열을 return으로 보내도록 합니다. 
		 * 단, 외부 클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
		 * add
		 * 
		 * */
		
		String name[] = {"홍길동","55","유관순","강감찬","48","이순신","세종대왕","34","88"};
		
		//리스트로 배열 넣기
		ArrayList<String> firstData = new ArrayList<>(Arrays.asList(name)); 
		
		Extractor extractor = new Extractor();
		extractor.setData(firstData);

	}
}

class Extractor {
	protected ArrayList<String> secondData = null;
	ArrayList<String> nameData = new ArrayList<>();
	
	public void setData (ArrayList<String> secondData)  {
		this.secondData = secondData;
		String name ="";
		
		//숫자로 바꾸어서 안될 경우를 예외처리하여 새로운 배열에 넣기
		for(int i =0; i <this.secondData.size(); i++) {
			
			try {
				name = secondData.get(i); 
				Integer.parseInt(name);
			}
			catch(Exception a) {
				nameData.add(name);
			}
		}
		
		System.out.println(nameData); //이름만 출력
	}
	
}
