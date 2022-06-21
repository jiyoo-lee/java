/**
 *Exception : Try,catch와 함께 사용을 함 (예외처리사항)
 *배열, 통신, 파일에서 많이 생겨나는 오류
 *크게 두가지로 exception을 나눈다. 
 *Runtime Exception : error 발생시 예외처리 체크를 안함 - null,class,arraysize
 *ex) int a;
 *a += 1;  
 *OtherException : 예외처리 모두 체크 함 (중요한 파트에 씀) 
 *Exception[종류] 
 *Arithmetic : 0으로 나눌때 발생하는
 *Nullpointer : null 객체를 참조 할때
 *ClassCast : 클래스형 변환
 *NumberFormat : 숫자형으로 변환
 *ArrayIndexOutOfBound : 배열 참조시 인덱스 번호 오류 
 *IOException : 입출력 문제 오류  v
 *Exception : 전체 예외 처리 현황  v
 * v 표시 된 것을 많이 쓴다. 
 */

public class Exception1 {
	

	public static void main(String[] args) {
		
		String b = "A1";
		try {  //해당값을 int로 변경 
			int a = Integer.valueOf(b); //error 발생 : a1이라는 문자를 숫자로 변경 할 수 없어서 
			System.out.println(a);
			
		}catch(NumberFormatException e) { //exception을 조상클래스로 implements 하고 있어서 exception만 적어도 오류를 잡아줌 
			System.out.println(e); //어떤 부분에서 문제가 발생했는지를 출력
		}
		finally { //catch에서 해결이 안되면(안적어도 관계는 없음)
			b = b.replaceAll("[A-Z]", ""); //데이터 재처리 
			int a = Integer.valueOf(b); // 다시 문법을 재작성해서 사용 
			System.out.println(a); // 최종 결과 값 출력
		}
	}
}
