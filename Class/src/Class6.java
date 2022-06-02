import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		
	int num = 3;
	dataList da = new dataList(); //선언은 한번만 하면 됨.
	da.array_data(num);
	
	//dataList da = ""; -> 메모리에 할당되었던 메소드를 초기화  
	
	//String pay = "신용카드";
	String pay = "계좌이체";
	if(pay.equals("신용카드")) {
		da.pay1(); //해당 조건에 맞는 메소드를 호출
	}
	else {
		da.pay2(pay); // 메소드에 객체값을 태워서 전달 (객체값은 무한대) (pay,payment)이런식으로 증가해서 태우기도 가능.
	}
	
	/*응용문제 (boolean 사용)
	 * 해당 로드 할 클래스명은 agrees라는 이름을 가지고 있습니다.
	 * main 메소드에서 사용자가 동의함, 안함을 입력하게 됩니다.(스캐너)
	 * 동의함으로 입력되었을 경우엔 "회원가입이 진행됩니다."라는 메세지를 출력하고
	 * 동의안함을 입력시 동의를 하셔야 진행이 됩니다."라고 출력되도록 하세요.
	 * 단 agrees 클래스 안에 void 메소드 한개 또는 두개를 선택하여 코드를 제작하시오.  */
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("동의하시겠습니까? 동의함 or 동의안함으로 대답해주세요.");
	String aw = sc.next();
	
	agrees ag = new agrees();
	ag.agreement(aw);
	
	sc.close();

	}

}

class dataList {
	/* 조건에 따라서 메소드가 다르게 작동하기 */
	
	/* static 메소드를 활용하는 형태 : 여러 pck에서 해당 메소드를 자주 사용해야하는 부분에서는 static을 이용하여 사용합니다.
	 static(정적 메소드) : 오버라이딩을 사용 할 수 없음.
	 void만 사용(동적 메소드) : 오버라이딩을 사용 할 수 있음.
	 오버라이딩 ? 내 함수도 호출하면서 다른 함수도 호출해서 결합시키는 형태.
	 예시 : class a {
	 void 메소드
	 } 
	 class b extend a {
	 void 메소드
	 } */
	
	public void array_data (int a) { //static이 없는 메소드		
		int  w = 1;
		while(w<=9) {
			//System.out.println(a*w);
			w++;
		}
	}
	
	public void pay1() {
		//System.out.println("신용카드로 결제 진행합니다.");
	}
	
	public void pay2(String pm) {
		//System.out.println(pm+"으로 결제됩니다.");
	}
	
	 
}

class agrees {
	public void agreement (String user) {
		
		if(user.equals("동의함")) {
		System.out.println("회원가입이 진행됩니다.");
		}
		else {
			System.out.println("동의를 하셔야만 진행됩니다.");
		}
	}
	
}