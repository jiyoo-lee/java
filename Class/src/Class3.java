
public class Class3 {
		// package�� �����������(default��)
	public static void main(String[] args) {
		//�ڷ��� (��������) 
		//double -> int�� ��ȯ
		double a = 137.5; 
		int b = (int)a; //����ȯ 
		
		//int���� double�� ��ȯ
		int c = 35;
		double d = (double) c;
		System.out.println(d);
		//�ൿ�ϴ� ������ Ʋ (Ŭ���� = c,vue,angular ��� �Լ��� ��������� ����ϴ� ����)
	
       //String -> int�� ����ȯ
		String x = "35";
		String x2 = "156";
			
		int z = Integer.parseInt(x); // ���ڸ� ���ڷ� �ƿ� ���¸� �ٲܶ� ���� �޼ҵ� int���� ����ϴ� ������� �����)
	   //-> can't convert from String to int *** char <-> String�� ������.
		//int z = Integer.valueOf(x); // ->�ӵ��� ������. int���� Ȯ���ϰ� ��ȯ, valueOf -> parseint
		//vauleOf Ŭ���� �޼ҵ�(�޼ҵ��Լ�)
		// valueOf(parseInt(s, 10))
		int total = Integer.parseInt(x)+Integer.parseInt(x2); //�������� ���ڷ� ��ȯ�Ͽ� �������� ó����.
	   System.out.println(total); 
		
	   //Long ���� Long.parseLong �����.
	   String j = "923456789";
	   String j2 = "9234567892";
	   //int total2= Integer.parseInt(j) +Integer.parseInt(j2);
	   long total2 = Long.parseLong(j)+Long.parseLong(j2); //long ���� Double.parseDouble(); �� ����.
	   double total3 = (double)total2;
	   System.out.println(total3);
	   
	   //����(char) -> ����(String) : �⺻ ���ĸ� �˾� �� ��.
	   char part = '��'; // ->���� ����ǥ�� ����ؾ���
	   String f = String.valueOf(part); // ����->���ڷ� ��ȯ. valueOF�� ��� parse�� ����.
	   System.out.println(part);

	   
	   
	   
	}

}
