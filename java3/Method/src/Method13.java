
public class Method13 {

	public static void main(String[] args) {
		//extends : inherit (���)
		/*���� �θ� Ŭ������ construct �κп� �μ����� �����ϸ� �ڽ� Ŭ������ �ε带 ���ϴ� ��Ȳ�� �߻��Ѵ�.
		 * ��, �ڽ� Ŭ�������� �μ����� �����Ͽ� construct�� ����� ���� ����.
		 * */
		
		Mth1 m1 = new Mth1();
		Mth2 m2 = new Mth2(50);
		
	}

}



class Mth1 {
	public int no;
	public Mth1() { //������ַ��� �μ����� ����־���Ѵ�.
		this.no = 20;
		System.out.println("mth1");
	}
}



class Mth2 extends Mth1 {
	public Mth2(int z) { // ��� �޴� class�� �μ����� ����־ ������ �ȴ�.
		this.no = z;
		System.out.println("mth2");
		System.out.println(this.no);
	}
}