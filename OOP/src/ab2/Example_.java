package ab2;

public class Example_ {

	public static void main(String[] args) {
		
		Home h[] = { new Computer(), new Monitor() }; //interface ���� 
		Home2 h2[] = { new Phone() }; //extends�� Home�� �ε��Ͽ���.
		h[0].broken(0);
		h2[0].broken(0);
		
		/*
		Phone ph = new Phone(); //�������̽� �߰��ÿ��� ��ü ���� �����ؾ���
		ph.broken(30);
		*/
		
		
		//h[0].broken(40);
		//h[1].broken(0);
		//h[2].broken(9);

	}

}

class Computer implements Home {
	
	@Override
	public void powerOn() {
		System.out.println("��ǻ�� ���� ���� ��...");
		
	}
	
	@Override
	public void powerOff() {
		System.out.println("���� �ߴ�!");
		
	}
	
	@Override
	public void broken(int a) {
		if(this.bk <= a ) {
			System.out.println("��ǻ�� ����!");
		}
		else if(this.bk > a && a > 0) {
			this.powerOn();
		}
		else {
			this.powerOff();
		}
	}
	
}


class Monitor implements Home {
	@Override
	public void powerOn() {
		System.out.println("����� ���� ���� ��...");
	}
	@Override
	public void powerOff() {
		System.out.println("���� �ߴ�!");
	}
	@Override
	public void broken(int a) {
		if(this.bk <= a ) {
			System.out.println("����� ����!");
		}
		else if(this.bk > a && a > 0) {
			this.powerOn();
		}
		else {
			this.powerOff();
		}
	}
}


//���빮�� �޴����� �߰� ����� �ʿ��մϴ�.
// �޴��� ����� �ּ�����(20)�� �־����� -> �����۵��� 40�̻�
//1.ȭ�� ������ ���޵����� ȭ���� ���峯 ��� (������������ �۵��� �ȵǴ� ���) 20 �̸�
//2. ������ ���޽�Ű���� ������ �ȵɰ�� (������ �ȵǴ� ���) 20 ~39���� 

class Phone implements Home, Home2 { 
	
	@Override
	public void powerOn() {
		System.out.println("�޴��� ���� ���� ��...");
	}
	
	@Override
	public void powerOff() {
		System.out.println("���� �ߴ�!");
	
	}
	@Override
	public void phoneNotCharge() { // 20�̸�
		System.out.println("������ �����ʽ��ϴ�.");
	}
	
	@Override
	public void phoneMonitorBroken() { // 20~39����
		System.out.println("ȭ���� ���峵���ϴ�.");
	}
	
	
	
	@Override
	public void broken(int a) {
		if(this.bk <= a ) { 		// 80�̻��϶�
			System.out.println("�޴��� ����!");
		}
		else if(this.bk > a && a >= 40) { 	// 80���� ������ 40 �̻��϶� (���� �۵�)
			this.powerOn();
		}
		
		else if(a <= 39 && a >= 20) { // 20 �̻� 39 ���� (������ ��������)
				this.phoneMonitorBroken();
			}
		
		else if(a < 20 && a > 0) { // 0���� ũ�� 20���� ������ (ȭ���� ���峵��)
				this.phoneNotCharge();
			}
		
		else {
				this.powerOff(); // 0�϶� (������ ����)
			}
	}
	
}
