package swing1;

import java.util.HashMap;
import java.util.Map;

public class Swing3 {
	//반복문 이용하여 키생성 및 배열값을 split으로 분리 

	public static void main(String[] args) {
		String[] data = { "홍길동","강감찬","이순신","유관순" };
		Map<String, String> m = new HashMap<>(); //배열을 map m 안에 넣고싶을때는 키 값을 배열 형태로 표시해야한다.
		//m.put("names", data);
		
		// 키를 반복문으로 만들어서 값을 넣을 수 있다..
		// 중복되지않는 키값 생성 + 해당 배열에 있는 Index 배열 번호 생성 
		int w = 0;
		do {
			m.put(String.valueOf(w), data[w]); //키 값을 번호로 
			w++;
		}while(w<data.length);
		
		System.out.println(m); // 결과: {0=홍길동, 1=강감찬, 2=이순신, 3=유관순}
		
		
		Map<String, String> m2 = new HashMap<>();
		for(String names : data) {
			m2.put(names, names);	//foreach로 키, 값이 동일하게 적용 
		}
		
		System.out.println(m2);
		
		String[] alldata  = { "names = 홍길동", "age = 25", "email = hong@naver.com" };
		Map<String, String> m3 = new HashMap<>();
		
		for(int f = 0; f < alldata.length; f++) {
			String key[] = alldata[f].split("=");
			m3.put(key[0], key[1]);
		}
		System.out.println(m3);
		
	}
}
