
public class Method3 {

	public static void main(String[] args) {
		/* ���빮�� 
		 * �μ��� �ΰ��� ���ڸ� �����Ͽ� ���ǵ��� �մϴ�.
		 * ���� ��갪�� �޾Ƽ� ����� main���� ����Ͻÿ�.
		 * ���� : 157, 45
		 * 157*45
		 * ������� �� ��� : 7065*/
		
		Method3 mt = new Method3();
		int result = mt.nums(157,45);
		System.out.println("���� ��� ��: "+result);
		
		mt.nums2();
		mt.nums();
		
		/*���빮�� �ڷ��� �޼ҵ�
		 * ���� ���� �ϳ��� �ش� �޼ҵ�� �����ϰ� �˴ϴ�.
		 * �ش� �޼ҵ忡���� ���������� ó���մϴ�.
		 * ���� 3�� �����ϸ� 3*1~3*9������ ��� ������� ���Ͽ� sysout���� ����ϼ���.*/
		int add = mt.gugudan(3);
		System.out.println(add);
		
	}
	
	public int nums(int first, int second) {
		int rs = first * second;
		return rs; //���⼭ sysout �ȵ�.
	}

	public void nums2() { 
		int z = nums(100,200);
		System.out.println(z);
	}
	
	public void nums() { //���� �������̶� �μ������� �����Ͽ� ����� �� ���� ������ ȥ���� ������ �ֱ⶧���� �����Ѵ�.
		System.out.println("�����Դϴ�.");
	}
	
	public int gugudan(int i) {
		int total = 0;
		for(int j = 1; j <= 9; j++) {
			total += (i * j);
			} 
		//�ݺ��� �ȿ��� return�� ���� �� ����. ���ǹ��� �ɰŸ� break�� ���ͼ� �ݺ��� �ۿ� ����Ѵ�.
		// ���ǹ��̶� ����� return ��� �ȵ�. �Ʒ��� ���� ���� ���� ��õ.
		/* public String mb(String mid) {
		 * String msg = "";
		 * String msg2 = "ȫ�浿";
		 * if(mid.equals("hong")) {
		 * msg  ="ok";
		 * else {
		 * msg = "cancel";
		 *  }
		 *  return msg; // �ش� �޼ҵ忡 ������ ���� �� ���ǿ� �´� ���� �����Ͽ� �������� ���� return��Ŵ.
		 * }*/
		return total;
	}
	
	 public String mb(String mid) {
	  String msg = "";
	 String msg2 = "ȫ�浿";
	 if(mid.equals("hong")) {
	 msg  ="ok"; }
	 else {
	 msg = "cancel";
	   }
	   return msg; // �ش� �޼ҵ忡 ������ ���� �� ���ǿ� �´� ���� �����Ͽ� �������� ���� return��Ŵ.
	 }
	
}

