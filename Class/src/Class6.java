import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		
	int num = 3;
	dataList da = new dataList(); //������ �ѹ��� �ϸ� ��.
	da.array_data(num);
	
	//dataList da = ""; -> �޸𸮿� �Ҵ�Ǿ��� �޼ҵ带 �ʱ�ȭ  
	
	//String pay = "�ſ�ī��";
	String pay = "������ü";
	if(pay.equals("�ſ�ī��")) {
		da.pay1(); //�ش� ���ǿ� �´� �޼ҵ带 ȣ��
	}
	else {
		da.pay2(pay); // �޼ҵ忡 ��ü���� �¿��� ���� (��ü���� ���Ѵ�) (pay,payment)�̷������� �����ؼ� �¿�⵵ ����.
	}
	
	/*���빮�� (boolean ���)
	 * �ش� �ε� �� Ŭ�������� agrees��� �̸��� ������ �ֽ��ϴ�.
	 * main �޼ҵ忡�� ����ڰ� ������, ������ �Է��ϰ� �˴ϴ�.(��ĳ��)
	 * ���������� �ԷµǾ��� ��쿣 "ȸ�������� ����˴ϴ�."��� �޼����� ����ϰ�
	 * ���Ǿ����� �Է½� ���Ǹ� �ϼž� ������ �˴ϴ�."��� ��µǵ��� �ϼ���.
	 * �� agrees Ŭ���� �ȿ� void �޼ҵ� �Ѱ� �Ǵ� �ΰ��� �����Ͽ� �ڵ带 �����Ͻÿ�.  */
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("�����Ͻðڽ��ϱ�? ������ or ���Ǿ������� ������ּ���.");
	String aw = sc.next();
	
	agrees ag = new agrees();
	ag.agreement(aw);
	
	sc.close();

	}

}

class dataList {
	/* ���ǿ� ���� �޼ҵ尡 �ٸ��� �۵��ϱ� */
	
	/* static �޼ҵ带 Ȱ���ϴ� ���� : ���� pck���� �ش� �޼ҵ带 ���� ����ؾ��ϴ� �κп����� static�� �̿��Ͽ� ����մϴ�.
	 static(���� �޼ҵ�) : �������̵��� ��� �� �� ����.
	 void�� ���(���� �޼ҵ�) : �������̵��� ��� �� �� ����.
	 �������̵� ? �� �Լ��� ȣ���ϸ鼭 �ٸ� �Լ��� ȣ���ؼ� ���ս�Ű�� ����.
	 ���� : class a {
	 void �޼ҵ�
	 } 
	 class b extend a {
	 void �޼ҵ�
	 } */
	
	public void array_data (int a) { //static�� ���� �޼ҵ�		
		int  w = 1;
		while(w<=9) {
			//System.out.println(a*w);
			w++;
		}
	}
	
	public void pay1() {
		//System.out.println("�ſ�ī��� ���� �����մϴ�.");
	}
	
	public void pay2(String pm) {
		//System.out.println(pm+"���� �����˴ϴ�.");
	}
	
	 
}

class agrees {
	public void agreement (String user) {
		
		if(user.equals("������")) {
		System.out.println("ȸ�������� ����˴ϴ�.");
		}
		else {
			System.out.println("���Ǹ� �ϼž߸� ����˴ϴ�.");
		}
	}
	
}