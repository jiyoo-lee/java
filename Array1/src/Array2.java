
public class Array2 {

	public static void main(String[] args) {
		/*응용문제 : 배열 : hong kim park lee jang jung*/
		
		//String name [] = {"hong","kim","park","lee","jang","jung"};
		//System.out.println(name[4]);
		//int word = name[1].length(); //단어 갯수를 파악할때도 length를 쓴다. 배열길이가 아니라, 문자단어를 쓸땐 ();가 들어간다.
		//System.out.println(word);
		
		/* 응용문제 : 해당 사용자 리스트 배열이 있습니다.
		 * 해당 배열값 중 사용자 아이디 3단어 이상만 출력하시오.*/
		
		/*String name [] = {"hong","kim","park","lee","jang","jung"};
	    int word; //각각의 배열 데이터의 문자 갯수파악.
		int i;
		int member  = name.length; // 전체 회원수를 파악하기 위함. (반복횟수를 알수 있음)
		
		for(i = 0; i<member; i++) {	
			word = name[i].length(); //문자 갯수파악
			if(word > 3) //세단어 이상(불포함, 포함으로 뜻이 때에 따라 다름)의 데이터만 출력
			System.out.println(name[i]);
		}*/
		
		
		/* 응용문제 2 :
		 * 배열 데이터는 다음과 같습니다. 
		 * {15, 60, 11, 14, 27}
		 * 다음 데이터를 모두 더해서 최종 결과값을 출력하라.
		 * */
		
		int nums [] = {15,60,11,14,27}; 
		int j = nums.length;
		int i;		
		int sum = 0;
		for(i=0; i<j; i++) {
			sum += nums[i]; 
		}
		System.out.println(sum); //결제창, 팝업창에 많이 쓴다.
		
		int datas [] = {10,20,30,40,50};
		int dw = 0;
		int len = datas.length;
		int total = 0;
		
		do {
			total += datas[dw];
			dw++;
		}while(dw < len);
		
		System.out.println(total); //do-while문 버전.
		/*	int nums[]  = {5,10,15,20,25,30,35};
		/*
		 * foreach문을 사용할때는 인덱스 번호가 필요없이 사용할 경우
		 * for~dowhile문 사용할땐 인덱스 번호가 필요할 때 사용
		
		 * [0] [1] [2] : 인덱스 번호
		 * */
	/*	for(int f : nums) { //배열값을 그대로 불러와서 순차적으로 보여준다. for each문. int f가 순차적으로 data배열값을 받아서 저장시킨다.
			if(f%2 == 0) {
				//System.out.println(f); 
			}
		} //단순한 배열에 쓴다.
		
		
	//	String pay[] = {"무통장입금","신용카드","휴대폰결제","상품권결제","쿠폰사용"};
		Scanner sc = new Scanner(System.in);
		System.out.println("결제하고자하는 형태를 선택해주세요:");
		String pm = sc.next();
		for(String i : pay)  {  //foreach에서는 문자가 str이니까 for 변수도 str으로 맞춰야한다. /배열데이터가 문자이므로 받는 변수 형태 또한 문자형을 사용해야한다.
			if(pm.equals(i)) {
				if(i.equals("휴대폰결제")) {
					System.out.println("현재 시스템 점검으로 해당 결제는 사용이 어렵습니다.");
				}
				else {
					System.out.println(pm+"로 결제 진행됩니다.");
				}
			}
		} */
	}

}
