
public class Example1 {

	public static void main(String[] args) {
		
		/*���빮�� : (�迭���� + �޼ҵ�) Ŭ���� ���� x
		 *1�� �迭�� ���������� ���� �ֽ��ϴ�.
		 *�迭 ����Ʈ : 22,33,44,55,66,77,88,99
		 *�ش� ��ü ���� ��� ���� �հ� ���� ������ �޼ҵ�� 
		 *ó���ǵ��� �մϴ�. ��, �ݺ����� ������ do while������ �ۼ��մϴ�. 
		 * */
		
		int nums[] = {22,33,44,55,66,77,88,99};
		
		Example1 ex = new Example1(); //��ü���� + �ν��Ͻ�(�޸�) ���
		ex.add(nums);
		
	}
	
	
	public void add(int numbers[]) {
		int w = 0;
		int total = 0;
		do {
			total += numbers[w];
			w++;
		}while(w<numbers.length);
		
		
		System.out.println("�� �հ�: "+total);
	} //end of add method

}
