
public class Method12 {

	public static void main(String[] args) {
		// extends�� ����� �ڽ� class�� �ε��ϰ� �Ǹ� �ڵ����� �θ� class�� �Բ� ����� �����մϴ�.
		
	Bbox2 b = new Bbox2();
	b.b2("�̼���");
	System.out.println(b.abc());

	}

}
class Bbox { //�⺻ �ܺ� Ŭ����1 : main���� �ʿ��� ������ üũ
	protected String userInfo;
	private String userPw; //class �ȿ����� ����Ҷ� ���
	public String userRpw;
	public Bbox() {
		this.userPw = "abcd";
		this.userRpw = this.userPw.replace("abcd","ade5dde");
	}
	
	public String abc() {
		String email = "hong@naver.com";
		return email;
	}
	
}

class Bbox2 extends Bbox { //extends -> �ڵ带 �״�� ������´�.  //Bbox�� ���� ��� ������ ����, �� private ���� ���� ������������
	public void b2(String nm){ //main Ŭ�������� bbox2�� �ε� �� �ش� ���� �μ����� �����Ͽ� bbox class�� �ִ� �ʵ�� �� userInfo��
								// �����ϰ� �Ǵ� ����
		this.userInfo = nm;
		System.out.println(this.userInfo);
		System.out.println(this.userRpw);	
		//System.out.println(this.userPw); ->private�� Bbox Ŭ������ ������⶧���� �ε� �Ұ���.
	}
}