package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class List2 {

	public static void main(String[] args) {
		
		/*���빮�� : �ش� �����Ͱ� �� �޸�� �����ʹ� ��� �����ؾ��Ѵ�.
		 ������ : "�����","������","�ڵ���","�̰���","�����","������"
		 ��� : �����, �������� ������ �ض�
		 
		 *  */

		String[] users = {"�����","������","��â��","�ڵ���","�̰���","�����","������"};
		ArrayList<String> us = new ArrayList<>(Arrays.asList(users));
		int ea = us.size();
		
//		for(int i = 0; i < ea ; i++) {
//			int ea2 = us.size(); //node�� ������ �ٽ� �ľ��� 
//			for(int j = 0; j < ea2;) {
//			if(!us.get(j).equals("�����") && !us.get(j).equals("������") ) {
//				us.remove(0);
//				System.out.println(us);
//				}
//			}
//		}
		
	
		 /* ���빮�� ¦���� ���ڸ� ��� ������. 
		  * */
		
		Integer[] nums = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> ns = new ArrayList<>(Arrays.asList(nums));
		
		int no = ns.size(); //���ʻ�����
		int z = 0;
		do {
			int no2 = ns.size();
			int zz = 0;
			do {
				if(ns.get(zz)%2 == 0) {
					ns.remove(zz);
					break;
				}
				zz++;
			}while(zz < no2);
			//ns.remove(0);
			z++;
		}while(z <no);
		
		System.out.println(ns);
	}
}
