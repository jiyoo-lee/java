package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List3 {

	public static void main(String[] args) {
		/* ���빮�� : �迭 ���� 
		 * �ѹ� ������1: 3,6,9,12,15
		 * �ѹ� ������2: 2,4
		 * 
		 * ���: 3,6,9,12,15,2,4
		 *  */
		
		Integer[] num1 = {3,6,9,12,15};
		Integer[] num2 = {2,4};
		
		ArrayList<Integer> nm1 = new ArrayList<>(Arrays.asList(num1));
		ArrayList<Integer> nm2 = new ArrayList<>(Arrays.asList(num2));

		int ea = nm2.size(); 
		
		for(int i = 0; i <ea; i++ ) {
			nm1.add(nm2.get(i)); // �����ͼ� �߰� 
		}
		Collections.sort(nm1); //ArrayList �������� �����ϴ� �� //ArryaList, LinkedList sort �������� ���� 
		System.out.println(nm1);
		
		int ea2 = nm1.size();
		System.out.println(ea2); //����Ȯ�� 
		
		Integer c[] = num1;
		Arrays.sort(c); //������ �迭�ϋ��� sort�� ���� ������ ArrayList�� ����ϸ� sort�� ����Ҽ� ����.
		//System.out.println(Arrays.toString(c));
		
		
	
	}
}
