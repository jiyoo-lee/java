package swing1;

import java.util.HashMap;
import java.util.Map;

public class Swing4 {

	public static void main(String[] args)  {
		
		String[][] data = {
							{"d1","123456"}, // 앞: key 뒤: data
							{"d1","456789"},
							{"d2","홍길동"},
							{"d2","이순신"},
							{"d3","hong@naver.com"},
							};
		
		Map<String,String> m = new HashMap<>();
		//HashMap m2 = new HashMap<>(); // 데이터 자료형과 관계 없이 쓸수 있음
		//Map m2 = new HashMap<>();
		
		System.out.println(data[0][0]); // key
		System.out.println(data[0][1]); //data
		
		for(int i = 0; i<data.length; i++) {
			if(!m.containsKey(data[i][0])) {
				
				m.put(data[i][0], data[i][1]);
			}
			else {
				m.put(data[i][0]+i, data[i][1]);
			}
		}
		System.out.println(m);
	}
}
