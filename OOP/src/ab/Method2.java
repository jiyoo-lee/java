package ab;
/*abstract�� interface�� ������ �� ������
 * 
 * */
public class Method2 {
	//Interface Mehtod2Inter & Mehtod2Inter2 �����.
	public static void main(String[] args) {
		LoadInter ld = new LoadInter();
		ld.setbox("ȫ�浿");
	}

}

//�߿� : abstract�� interface�� ��� static�� ��� �� �� ����. default �Ƚᵵ static�� �� �ø��� ����.

abstract class Test { //public�� �Ƚᵵ �ȴ�.
	// �ʵ忡 �ڷ����� ���� �� �� ����.
	public String mm;
	//abstract default�� ��������ʴ´�. (public���� ����)
	public abstract void box();
	public void box2(String n) {
		this.mm = n;
		System.out.println("test");
	}
}



class LoadInter implements Method2re, Method2Inter2 { // ���߻�� 
	
	@Override
	public String names() {
		
		return null;
	}
	
}