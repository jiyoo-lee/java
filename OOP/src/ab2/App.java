package ab2;

public class App {

	public static void main(String[] args) {
		
		//�ڽ�		=	//�ڽ�
		/*members mb = new members();
		mb.oop();
		mb.oop2();
		mb.opp();*/
		
		
		// ���� �ڽ� �θ��� �θ� ��������� AppData2 ap = mb; ������ ���� �� �ٽ� �θ� -> �ڽ����� ������
		// members mb2 = (members)ap;
	
		
		
		//�θ�		= 		//�ڽ�
		//members mb = new members(); // �ڽ� Ŭ���� ����
		//AppData2 ap = mb; //�������̽� ����(Ŭ���� -> �������̽� ����)
		//ap.oop();
		//ap.oop2();
		/* ap.opp(); �θ� ȣ�� �������� �ڽĸ���� �ҷ��ü� ����. ���� ��: �θ� ����� �޼ҵ帻��� �ڼ��� ����� �θ� �� ����. */
		// �������̽� �������� ����� �������̵常 ȣ�� �� (����ȯ) ����ȯ�� �ѹ����� �̷������ 
		// ��������� �θ�κ��� ���� �޼ҵ忡 this.opp();������ �ҷ��;���
		
		AppData2 ap = new members();
		members mb2 = (members)ap; // �������̽� -> Ŭ������ �纯ȯ ������ : new �ѹ��� ���� ��  
		ap.oop();
		mb2.opp();
		
	}

}
//class members implements AppData1 {
	//app data1�� ������ �ڷ��� �����ϴ� ���
	
//}



class members implements AppData2 {
	
	@Override
	public void oop() {
		System.out.println("test");

	}
	
	@Override
	public void oop2() {
		System.out.println("test2");
	}
	
	public void opp() {
		System.out.println("test3");

	}
	
	
	
}