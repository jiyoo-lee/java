package box; //pckg는 메인 java를 실행시키면 함께 실행되는 java file load type.

public class Class1 {

	public static void main(String[] args) {  
		// public static 어쩌고는 main pck중에서 실행되는 최초의 java file에만 적용합니다.
		
		Class2 c2 = new Class2();
		System.out.println(c2.names);
		
		Adata a = new Adata(); //기본 아닌 기본 클래스 안의 다른 클래스 불러오기
		//Class2.java에 Adata라는 별도의 Adata class를 로드함.
		System.out.println(a.names);

	}

}
