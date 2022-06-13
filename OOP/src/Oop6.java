
public class Oop6 {

	public static void main(String[] args) {
		// 배열 형태의 생성자 객체 추상 클래스 만들기
		
		box[] b = { new abox(), new abox2(), new abox3() }; //배열형태의 생성자
		/*b[0].dataload();
		b[1].dataload();*/
		
		/*for(box z : b) { //foreach 문 단점: 특정 클래스를 중지하지는 못함.
			z.dataload();
			}*/
		
		//일반 클래스에서도 배열로 사용가능하다.
		for(int i =0; i <b.length; i++) { //배열 1번만빼고 출력하기 
			if(i != 1) { //인덱스 1번 클래스는 사용하지않음
				b[i].dataload();
				}
			} //end of for
		}
	}


abstract class box {
	public abstract void dataload(); //데이터를 한번에 다 가져오는 메소드
	
}

class abox extends box {
	
	@Override
	public void dataload() { //배열 1
		System.out.println("test1");
	}
}

class abox2 extends box {
	
	@Override
	public void dataload() { //배열 2
		System.out.println("Test2");
	}
}

class abox3 extends box {
	
	@Override
	public void dataload() { //배열 3
		System.out.println("Test3");
	}
}