package swing1;

import java.util.HashMap;
import java.util.Map;

public class Swing2 {

	public static void main(String[] args) {
		//ArrayList, LinkedList (배열 값) -add, remove, get, size
		//Map (배열키, 배열값) 중요~~~ : add 대신 put, get,size
		//Map은 배열키가 기반이기때문에 키를 통해서 데이터를 확인합니다. (속도 최상급)
		//같은 키를 사용시 마지막에 적용된 값으로 갱신됩니다. 
		// ※키값을 절대 중복시키지 않음 
		
		Map<String, String> m = new HashMap<>(); // -> 간편회원 가입 같은 경우에 많이 쓰이는 코드 
		// 해쉬코드 hong -> Hash function(Hash map) -> 0 x 21949 CB (중복값이 발생하지않음) 
		// 키는 중복이 되지않지만 값은 중복이 될 수 있기때문에 사용한다. 
		// 키는 비어 있는데 값이 있는 상태도 인식 할 수 있음
		
		m.put("HONG","홍길동");
		m.put("KANG","강감찬");
		System.out.println(m); // 결과: {HONG=홍길동, KANG=강감찬}
		System.out.println(m.get("Hong")); // 결과: 홍길동
		// 키 값을 마지막것만 기억하기때문에 중복이 되면 중복된 키를 가져오면 마지막 값만 출력이 된다.
		
		m.put("park", ""); // 값이 비어있다. 
		if(m.get("park").equals("")) { // 키는 있지만 값은 없는 상태 
			m.put("park", "박");
		}
		System.out.println(m.get("park")); //결과: 박
		
		m.put("", "하이"); // 키 없고 값은 있는 상태 but Map에 원리에는 올바르지 않음 (차라리 ArrayList 등을 쓰는게 좋다)
		
		m.remove("Hong"); // 값은 그대로고 키만 사라짐 
		
		//Map: 여러개의 자료형을 사용 할 수 있음.
		Map<String,Integer> m2 = new HashMap<>(); // 키는 String으로 받고 값은 숫자로 받은 경우 
		Map<String,Object> m3 = new HashMap<>(); // 키는 String으로 받고 값은 여러가지로 받은경우 
		
		m2.put("age", 32);
		m2.put("level", 5);
		System.out.println(m2.get("level")); // 결과: 5
		System.out.println(m2.keySet()); //키만 출력 [level, age]
		System.out.println(m2.values()); //값만 출력 [5, 32]
		System.out.print(m2.containsKey("tel")); // 결과: false 해당키가 있는지 확인 (false : 없음 true : 있음)
		
		
	}

}
