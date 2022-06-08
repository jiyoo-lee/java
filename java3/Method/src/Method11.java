import app.App1; 		
//앞이 pck 뒤가 java 파일명, 다른 pck를 로드시 import하여 사용함
//외부 클래스를 가져올 수 있는데 main 클래스만 가져올 수 있고 다른 파일의 class는 불러올 수 없다.
//외부 package에서 App1.java 파일을 로드 및 기본 파일을 로드하여 사용합니다.  

public class Method11 {

	public static void main(String[] args) {

		App1 b = new App1();	// main method를 로드하게 됩니다. 
		
		//b.main(args); //가져오려는 파일이 static 이기때문에 sysout 못씀
		b.abox(); // 안에 있는 메소드는 불러 올 수 있음
		//main method 안에서 abox라는 void method를 로드하는 부분
	}

}
