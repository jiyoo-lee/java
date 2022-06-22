public class Exception3 {

	public static void main(String[] args) throws Exception {

		/* 응용문제 replaceAll 써야함 
		 * 데이터 = 
		 * 해당 데이터 배열 값을 main2라는 메소드로 값을 던집니다.
		 * 던질때 예외처리를 무조건 발생시켜야하며 최초 값을 던질때는 가공없이 던지게 됩니다.
		 * main2에서는 해당 배열 값을 받은 후 해당 점수를 모두 합산한 결과가 나와야합니다.
		 * 숫자 변환시 문제가 발생 할 경우 finally로 체크 후 메인투 메소드로 다시 호출하여 정상적으로 데이터가 나오도록 하십시오.
		 * */
		
		//printStackTrace : 사용금지
		
		String[] data = {"hong45","lee90","kang100","park70","kim72"};
		Exception3 ex = new Exception3();
		
		try {
			ex.main2(data);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				for(int i =0; i<data.length; i++) {
					
				  data[i].replaceAll("[a-zA-Z]", "");
				}
				ex.main2(data);
			}
		}
	
	public void main2(String[] data) throws Exception {
		int sum = 0;
		
		for(int i =0; i<data.length; i++) {
			sum += Integer.valueOf(data[i].replaceAll("[a-zA-Z]", ""));
		}
		System.out.println(sum);
		
	}

}
