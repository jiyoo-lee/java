import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		/* ���빮�� : ����ڰ� ��ٱ��Ͽ� ������ �����ϰ� �˴ϴ�.
		 * ��, �ش� �ݾ� ����Ʈ�� ����������� ���� ��ü ���� �ݾ׸� ��µǵ��� �մϴ�.*/
		
		int price[] = {1500, 22000, 13000, 14500, 113800, 45000}; 
		
		Scanner sc = new Scanner(System.in);
		int arrLength = price.length;
		int i = 0;
		int sum = 0;
		
		while(i<arrLength) {
			System.out.println("�ݾ��� �Է����ּ���.");
			int user = sc.nextInt();
			for(int j =0; j<arrLength; j++) {
				if(user == price[j]) {
					sum += user;
				}
				
			}
			i++;	
		}
		System.out.printf("�����ݾ��� %d���Դϴ�",sum);


	}

}
