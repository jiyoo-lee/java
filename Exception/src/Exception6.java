
public class Exception6 {

	public static void main(String[] args) {

		/* 응용문제 
		 * 사용자가 45*3+16+5+22*8 해당 연산 값의 최종값을
		 * 외부 클래스로 전송합니다. 해당 외부 클래스에서는 해당 값이 짝수일 경우 예외오류를 발생하며
		 * 홀수일경우 정상처리*/
		
		
		/*응용문제 
		 * 데이터파일 {홍길동, 55, 유관순, 강감찬,48,이순신,세종,34,88}
		 * 해당 데이터 값 중 문자값만 출력되도록 재배열 하시길 바랍니다.
		 * 단 메인에서는 해당 배열을 외부 클래스(setter)로 전송합니다.
		 * 해당 setter에서 배열값을 확인하여 이름만 재배열로 생성합니다.
		 * getter에서 해당 배열을 return으로 보내도록 합니다. 
		 * 단, 외부 클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
		 * add
		 * 
		 * */
		
		
		int data = 45*3+16+5+22*8;
		Numbers nm = new Numbers();
		nm.setSumData(data);
		nm.oddOrEven();
		
	}

}

class Numbers {
	
	int sumData;

	public int getSumData() {
		return sumData;
	}

	public void setSumData(int sumData) {
		this.sumData = sumData;
	}
	
	public void oddOrEven() { // 여기 throws Exception 적지않는 이유는 이미 오류를 안에서 해결 가능하기 떄문.
		
		//자료형 method에서 return값이 숫자냐 문자,소수,object에 따라 자료형이 선언되어 생성
		try {
			if(this.sumData%2 == 0) {
				throw new Exception("예외처리 발생으로 재확인이 필요합니다."); // 오류를 던진다.
			}
			else {
				System.out.println(this.sumData);
			}
			
		}
		catch(Exception e) { // 얘가 잡음
			System.out.println(e.getMessage());
		}
		
	}
	
	
}


