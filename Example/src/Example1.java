
public class Example1 {

	public static void main(String[] args) {
		
		/*응용문제 : (배열문제 + 메소드) 클래스 생성 x
		 *1차 배열에 다음과같이 값이 있습니다.
		 *배열 리스트 : 22,33,44,55,66,77,88,99
		 *해당 전체 값을 모두 더한 합계 값을 별도의 메소드로 
		 *처리되도록 합니다. 단, 반복문은 무조건 do while문으로 작성합니다. 
		 * */
		
		int nums[] = {22,33,44,55,66,77,88,99};
		
		Example1 ex = new Example1(); //객체생성 + 인스턴스(메모리) 등록
		ex.add(nums);
		
	}
	
	
	public void add(int numbers[]) {
		int w = 0;
		int total = 0;
		do {
			total += numbers[w];
			w++;
		}while(w<numbers.length);
		
		
		System.out.println("총 합계: "+total);
	} //end of add method

}
