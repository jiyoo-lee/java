package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class List6 {

	public static void main(String[] args) {
		
		/*���ڿ� ���� �迭 ��� ��� �ǹ� �ڵ�..��*/
		
		Scanner sc = new Scanner(System.in);
		int w = 0;
		
		ArrayList list = new ArrayList(); //�ڷ����� ���� ���� 
		
		while(w < 5) {
			System.out.print("�����͸� �Է����ֽñ� �ٶ��ϴ�. >>");
			String data = sc.next();
			list.add(data);
			w++;
			}
		
		System.out.println(list);
		
		/* ���� �Է»��׸� ��� ���� */
		int ww = 0;
		int total = 0;
		do {
			try {
				Object k = list.get(ww); 
				//�迭�ڷᰡ ����+���� ���·� ������ �Ǿ� ���� ���� Object �Ű� Ÿ������ �����մϴ�. 
				int numbers = Integer.parseInt(k.toString()); //String���� �ٲ㼭 �� int�� �ٲ㼭 �Ѱ���..
				// �ش� �Ű�Ÿ���� ����ȭ�Ͽ� ParseInt�� ������� 
				total += numbers;
				}
			catch(Exception b){ //�迭�� �Ű�Ÿ���� ���ڰ� �ƴ� ��� (���� ��Ȳ �߻�) 
				}
			ww++;
		}while(ww < list.size());
		
		//Object a = list.get(1);
		System.out.println("�Է��� ��� �迭�� ���� �� :"+total);
		
		sc.close();
	}

}
