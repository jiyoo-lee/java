public class Method7 {

	public static void main(String[] args) {
		/* ���빮�� : */
		
		apink ap = new apink("ȫ�浿",25,"test@gmail.com",-1000);
		//ap.names();
		//System.out.println(ap.nm2);
		System.out.println(ap.data());
		System.out.println(ap.data2());
	}

}

class apink {
	//private ������ class �ʵ忡���� ���������մϴ�.
	//String nm2;
	private String nm;
	private int age;
	private String email;
	private String emailCp;
	private int point;
	
	public void names() {
		if(this.nm == "ȫ�浿") {
			this.nm = "hong";
			String[] e = this.email.split("@"); //�̸��� �߿� �̸��� �� �ּҸ� ������������ �迭�� ������ �۾�.
			//System.out.println(Arrays.toString(e));
			this.emailCp =e[1]; 
		}
	}
	
	public apink (String nm1, int age2, String email3, int point4) { //private�� �ȿ��� ������� ����.
		//setter ���� : �μ����� �޾Ƽ� �ѱ�� �۾�.
		this.nm = nm1; 
		this.email = email3;
		/*
		this.age = age2;
		this.email = email3;
		this.point = point4;*/
		
		if(point4 < 0) {
			//this.point = 0;
		}
		else {
			this.point = point4;
		}
		names();
				
	}
	public String data() {
		
		//return this.nm; //return �����δ� �� �̻� �ٸ� �ڵ带 �����ʱ�.
		//return �ؿ� �ڵ�� ��� ������ �߻��ϰ� �˴ϴ�. 
		return this.emailCp;
	}
	
	public int data2() {
		//getter ���� return
		return this.point;
	}
	
}

// ���� : private, getter setter, private ���ǹ�, �޼ҵ� �������, this ��Ȯ�� ����
