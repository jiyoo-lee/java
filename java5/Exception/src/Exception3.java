public class Exception3 {

	public static void main(String[] args) throws Exception {

		/* ���빮�� replaceAll ����� 
		 * ������ = 
		 * �ش� ������ �迭 ���� main2��� �޼ҵ�� ���� �����ϴ�.
		 * ������ ����ó���� ������ �߻����Ѿ��ϸ� ���� ���� �������� �������� ������ �˴ϴ�.
		 * main2������ �ش� �迭 ���� ���� �� �ش� ������ ��� �ջ��� ����� ���;��մϴ�.
		 * ���� ��ȯ�� ������ �߻� �� ��� finally�� üũ �� ������ �޼ҵ�� �ٽ� ȣ���Ͽ� ���������� �����Ͱ� �������� �Ͻʽÿ�.
		 * */
		
		//printStackTrace : ������
		
		String[] data = {"hong45","lee90","kang100","park70","kim72"};
		Exception3 ex = new Exception3();
		
		try {
			ex.main2(data);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				for(int i =0; i<data.length; i++) {
					
				  data[i].replaceAll("[a-zA-Z]", "");
				}
				ex.main2(data);
			}
		}
	
	public void main2(String[] data) throws Exception {
		int sum = 0;
		
		for(int i =0; i<data.length; i++) {
			sum += Integer.valueOf(data[i].replaceAll("[a-zA-Z]", ""));
		}
		System.out.println(sum);
		
	}

}
