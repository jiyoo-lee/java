import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		
		
		/* String vs new String(); 차이
		 * String은 heap 영역에 String Pool에 저장되어지며 같은 값을 경우 같은 주소를 가리킨다. (== equals 사용가능)
		 * new String은 객체가 따로 만들어지기때문에 변수명이 다른 조건을 가리키더라도 heap 영역에 남아있다.(따라서 메모리 관리 비효율적)
		 * (equals밖에 쓰지못한다.) 같은주소를 가리키는게 아닌 직접 객체가 생성되기때문에 같은 값이여도 다른 값으로 인식한다.
		 * 자바의 문자열은 java.lang 패키지의 String 클래스 인스턴스로 관리된다.
		 * intern()을 쓰면 pool 영역과 heap 영역에 둘다 사용 할 수 있게 사용하는 메소드(pool 영역에 가상으로 만들어줌)*/
		
		//intern() : equals를 사용하지 않고 == (부등기호로 사용가능) 
		String data[] = {"홍길동","이순신"}; 

		String a = "홍길동";
		String b = "홍길동";
		String c = new String("홍길동").intern().indent(0); //위의 String과 값이 다름
		String d = new String("홍길동"); //위의 String과 값이 다름
		String e = data[0]; //위의 String과 값이 같음
		String e2 = data[1]; //위의 String과 값이 같음
		Scanner sc = new Scanner(System.in);
		String f = sc.next().intern();
		String h = new String(data[0]); 
		
		System.out.println(c==h); // 스캐너 결과: a==f 결과다름 c==f 결과다름 .intern() 붙이면 == 쓰면 값이 같아짐
		
		//equals는 데이터가 많아지면 속도가 줄어듦 따라서 ==를 쓰는 것을 추천함.
		
		
		if(c.equals(a)) {
			System.out.println("값이 같습니다.");
		}
		
		//new String : 소속이 없는 자유분방한 자료형(문자,배열값)
	}

}
