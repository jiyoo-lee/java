
public class Array2 {

	public static void main(String[] args) {
		/*���빮�� : �迭 : hong kim park lee jang jung*/
		
		//String name [] = {"hong","kim","park","lee","jang","jung"};
		//System.out.println(name[4]);
		//int word = name[1].length(); //�ܾ� ������ �ľ��Ҷ��� length�� ����. �迭���̰� �ƴ϶�, ���ڴܾ ���� ();�� ����.
		//System.out.println(word);
		
		/* ���빮�� : �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�.
		 * �ش� �迭�� �� ����� ���̵� 3�ܾ� �̻� ����Ͻÿ�.*/
		
		/*String name [] = {"hong","kim","park","lee","jang","jung"};
	    int word; //������ �迭 �������� ���� �����ľ�.
		int i;
		int member  = name.length; // ��ü ȸ������ �ľ��ϱ� ����. (�ݺ�Ƚ���� �˼� ����)
		
		for(i = 0; i<member; i++) {	
			word = name[i].length(); //���� �����ľ�
			if(word > 3) //���ܾ� �̻�(������, �������� ���� ���� ���� �ٸ�)�� �����͸� ���
			System.out.println(name[i]);
		}*/
		
		
		/* ���빮�� 2 :
		 * �迭 �����ʹ� ������ �����ϴ�. 
		 * {15, 60, 11, 14, 27}
		 * ���� �����͸� ��� ���ؼ� ���� ������� ����϶�.
		 * */
		
		int nums [] = {15,60,11,14,27}; 
		int j = nums.length;
		int i;		
		int sum = 0;
		for(i=0; i<j; i++) {
			sum += nums[i]; 
		}
		System.out.println(sum); //����â, �˾�â�� ���� ����.
		
		int datas [] = {10,20,30,40,50};
		int dw = 0;
		int len = datas.length;
		int total = 0;
		
		do {
			total += datas[dw];
			dw++;
		}while(dw < len);
		
		System.out.println(total); //do-while�� ����.
		/*	int nums[]  = {5,10,15,20,25,30,35};
		/*
		 * foreach���� ����Ҷ��� �ε��� ��ȣ�� �ʿ���� ����� ���
		 * for~dowhile�� ����Ҷ� �ε��� ��ȣ�� �ʿ��� �� ���
		
		 * [0] [1] [2] : �ε��� ��ȣ
		 * */
	/*	for(int f : nums) { //�迭���� �״�� �ҷ��ͼ� ���������� �����ش�. for each��. int f�� ���������� data�迭���� �޾Ƽ� �����Ų��.
			if(f%2 == 0) {
				//System.out.println(f); 
			}
		} //�ܼ��� �迭�� ����.
		
		
	//	String pay[] = {"�������Ա�","�ſ�ī��","�޴�������","��ǰ�ǰ���","�������"};
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϰ����ϴ� ���¸� �������ּ���:");
		String pm = sc.next();
		for(String i : pay)  {  //foreach������ ���ڰ� str�̴ϱ� for ������ str���� ������Ѵ�. /�迭�����Ͱ� �����̹Ƿ� �޴� ���� ���� ���� �������� ����ؾ��Ѵ�.
			if(pm.equals(i)) {
				if(i.equals("�޴�������")) {
					System.out.println("���� �ý��� �������� �ش� ������ ����� ��ƽ��ϴ�.");
				}
				else {
					System.out.println(pm+"�� ���� ����˴ϴ�.");
				}
			}
		} */
	}

}
