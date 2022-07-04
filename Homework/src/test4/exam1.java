package test4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class exam1 {

	public static void main(String[] args) {
		/*[TEST1]
영어단어장 프로그램을 제작해야 합니다.
다음과 같은 예제를 활용합니다.

1.입력  2.검색  3.가장 긴 단어찾기
> 1
> 영어단어 : apple
> 한국어 : 사과

1.입력  2.검색  3.가장 긴 단어찾기
> 1
> 영어단어 : banana
> 한국어 : 바나나

1.입력  2.검색  3.가장 긴 단어찾기
> 1
> 영어단어 : kiwi
> 한국어 : 키위

1.입력  2.검색  3.가장 긴 단어찾기 
> 2
> kiwi
> 키위

1.입력  2.검색  3.가장 긴 단어찾기 
> 2
> 키위
> kiwi

1.입력  2.검색  3.가장 긴 단어찾기
> 3
> banana

다음과 같이 작동되는 프로세서를 제작하시오.
* 2. 검색은 한글, 영문 모두 검색이 되어야 합니다.
* 3. 가장 긴 단어찾기는 무조건 영어로만 검색이 됩니다.
* 해당 각 파트별(1,2,3) 선택에 따른 메소드는 별도로 분리하여 코드를 제작되도록 합니다.*/
		
		vocabulary voca = new vocabulary();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("[1]입력 [2]검색 [3]가장 긴 단어 찾기 [4]종료");
		try {
			int isSelected = Integer.parseInt(br.readLine());
			
			switch(isSelected) {
			case 1 :
				voca.inputvoca();
				break;
			case 2 :
				voca.searchvoca();
				break;
			case 3 :
				voca.thelongestvoca();
				break;
			case 4 :
				System.out.println("단어장을 종료합니다.");
				System.exit(0);
			}
		}catch(Exception e) {
			System.out.println("숫자만 입력가능합니다.");
			}
		}
	}
}

class vocabulary {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static List<String> vocaenglish = new LinkedList<String>();
	static List<String> vocakorean = new LinkedList<String>();
	
	
	public void inputvoca () throws Exception {
		
		System.out.print("영어 >> ");
		String input= this.br.readLine();
		
		if(vocaenglish.contains(input)) {
			System.out.print("이미 단어장에 있는 단어입니다. 재입력해주세요.>>");
			input = this.br.readLine();
		}
		
		boolean onlyEnglish = Pattern.matches("^[a-zA-Z]*$", input);
		if(onlyEnglish) {
			vocaenglish.add(input);
			}
		else {
			System.out.println("영어만 입력가능합니다.");
			return;
		}
		
		System.out.print("한국어 >> ");
		input = this.br.readLine();
		
		if(vocakorean.contains(input)) {
			System.out.print("이미 단어장에 있는 단어입니다. 재입력해주세요 >>");
			input = this.br.readLine();
		}
		
		boolean onlyKorean = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", input);
		if(onlyKorean) {
			vocakorean.add(input);
		}
		else {
			System.out.println("한국어만 입력가능합니다.");
		}
}
	
	public void searchvoca () throws Exception {
		
		System.out.print("검색하고자 하는 단어를 입력해주세요. >> ");
		String search = this.br.readLine();
		
		boolean isChecked = false;
		for(int i =0; i < vocaenglish.size(); i++) {
			if(search.equals(vocaenglish.get(i))) {
				System.out.println(vocakorean.get(i));
				isChecked = true;
			}
			else if(search.equals(vocakorean.get(i))) {
				System.out.println(vocaenglish.get(i));
				isChecked = true;
			}
		}
		if(!isChecked) {
			System.out.println("해당 단어는 단어장에 없습니다.");
		}
	}
	
	public void thelongestvoca () {
		int max = 0;
		String thelongest = "";
		for(int i = 0; i<vocaenglish.size(); i++) {
			String compare = vocaenglish.get(i);
			if(compare.length() > max) {
				max = compare.length();
				thelongest = compare;
			}
			else if(compare.length() == max) {
				thelongest += ","+compare;
			}
		}
		System.out.println("단어장 중 가장 긴 영단어 : " + thelongest);
	}
}

