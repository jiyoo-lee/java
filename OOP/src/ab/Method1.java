package ab;

//Method1A�� �����ؼ� ������
public class Method1 {

	 public void recall() { 
		 //ab2 pck�� ���� ���� �޼ҵ�
		 System.out.println("test");
	}
	
	 protected static void name() { 
		 //protected�� �ٸ� pck�� ������ �Ҷ� static ����ؾ� �۵��Ѵ�.
		 System.out.println("ȫ�浿");
	 }
	public static void main(String[] args) {
		
		
		
		
		// Arrays.sort : �迭 �������� ����(����,�ѱ�,���� �� ����) 
		// ��, �����ϰ�� �빮�ڰ� ���� ���� ������������ ���ĵ˴ϴ�. ex)APPLE apple �� ������ APPLE�� �켱
		
		/*int numberdata[] = {5,7,1,4,9,2};
		Arrays.sort(numberdata); //sort ���� �������� ����
		System.out.println(Arrays.toString(numberdata));*/
		
		
	/*	String[] userdata = {"ȫ�浿","�̼���","������","�庸��"}; // �ѱ� ������ ���� ���� 
		Arrays.sort(userdata);
		System.out.println(Arrays.toString(userdata)); */
		
		
		/* ���빮�� 
		 * ������ 2�� �����ؼ� �ϳ��� ���ڷ� �ϳ��� ���ڷ� �ض�
		 * ���� ���Ե� ����ڿ� ���̵� Ȯ�� �� �ش� ����Ʈ�� �����ǵ��� �մϴ�.
		 * ��, ���� ����Ʈ + ������ ����Ʈ�� ���� ����� ����ϼž� �մϴ�.
		 * ����� ���� Ŭ�������� �մϴ�. sysout
		 * 
		 * �迭 ������ : {
		 * 				{"kim","park",seo","oh","lee","jang","jeong","cho","ha","hwang"}	
		 * 				{"1500","800","2000","1000","4200","2200","3000","500","1000","1800}
		 * 				};
		 * ��Ʈ�� �迭�̶� ���ڷ� ���Ϸ��� ���ڷ� �ٲ���ҵ�..*/
		
		//static�� �ܵ������� ���� �ѱ� �� ������ ����Ѵ�.
		
		
		
		String name = "park";
		int p = 2000;
		
		IdeMth1 imt = new IdeMth1();
		imt.setter(name,p);
		System.out.println(imt.getter());
	}
}

class IdeMth1 extends Mth1 {
	
	private String[][] membership = {
			{"kim","park","seo","oh","lee","jang","jeong","cho","ha","hwang"},
			{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
		};
	
	private String nowPoint;
	protected int sumPoint;
	protected String resultPoint;
	private String data1;
	private String msg;

	@Override
	public void setter(String data1, int data2) { // �޾Ƽ� �� ������ ���ִ� ���Ҹ� �ϰ� �������� ����� ���� �޼ҵ�� ���ִ°� ����.
		
		this.data1 = data1;
		
		for(int i = 0; i < this.membership[0].length; i++) {
		
			if(data1.equals(membership[0][i])) {
				nowPoint = this.membership[1][i];
				this.sumPoint = data2 + Integer.parseInt(nowPoint);
				}
			}
		resultPoint = Integer.toString(this.sumPoint); //getter ������ �ѱ������ ����ȯ
		this.msg = "����";
		};
	
	@Override
	public String getter() {
		String print = this.data1 + "�� ����Ʈ�� " + this.resultPoint + msg+ "�Ǿ����ϴ�.";
		
		return print;
	};
	
	@Override
	public void setter(int[] data3) {};
	
}
