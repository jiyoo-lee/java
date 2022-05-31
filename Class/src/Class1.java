
public class Class1 { //현재 메인 클래스 이름

	public static void main(String[] args) { //일반 main 함수
		
		Adata a = new Adata(); //Adata class 먼저 로드. 먼저 선언.
		Bdata b = new Bdata();//Bdata class 먼저 로드
		// 로드가 됨
		
		System.out.println(a.aa); //Adata 클래스 안에 문자 자료형 객체값을 가져옴.해당되는 데이터를 찍고 그 후에 변수명을 적어야 실행된다.
		System.out.println(b.aa); //Bdata class 안에 문자 자료형 객체값을 가져옴.
		
		Cdata c = new Cdata();
		/* Cdata안에 변수 자료형을 선언함 => 현재 기본함수에 값만 입력한 뒤 객체 값을 받아 산술식으로 계산(인스턴스 변수)*/
		c.aa = 10;
		c.bb = 30;
		c.cc = c.aa+c.bb; // 계산식을 쓸때는 main안에서
		System.out.println(c.cc); 
	}

}

//aa는 각각의 다른 클래스에 있기 때문에 중복되지않습니다. final 선언해도 다른 클래스간에는 상관없음.
class Adata{ //a조 / 메인클래스에서 따로 뺀다. -> 메인 작동후 부수적으로 작동되는 클래스들
	String aa = "홍길동";
}

class Bdata{
	String aa = "이순신"; //Adata 클래스와 다른 변수로 봐야함. 다른 의미.
}

class Cdata {
	// 함수가 없어서 sysout 못 씀.
	int aa;
	int bb;
	int cc;
	// 해당 Cdata에 있는 클래스에는 자료형에 대한 변수만 선언을 합니다.
	// 단, 계산수식은 함수가 없는 상황이므로 수식 또는 sysout을 사용하지 못함.
	//class 안에 함수를 만들면 sysout 등등도 사용 가능함.
}


