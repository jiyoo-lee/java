
public class Method13 {

	public static void main(String[] args) {
		//extends : inherit (상속)
		/*절대 부모 클래스에 construct 부분에 인수값을 적용하면 자식 클래스에 로드를 못하는 상황이 발생한다.
		 * 단, 자식 클래스에서 인수값을 적용하여 construct를 사용할 수는 있음.
		 * */
		
		Mth1 m1 = new Mth1();
		Mth2 m2 = new Mth2(50);
		
	}

}



class Mth1 {
	public int no;
	public Mth1() { //상속해주려면 인수값은 비어있어야한다.
		this.no = 20;
		System.out.println("mth1");
	}
}



class Mth2 extends Mth1 {
	public Mth2(int z) { // 상속 받는 class는 인수값은 들어있어도 실행은 된다.
		this.no = z;
		System.out.println("mth2");
		System.out.println(this.no);
	}
}