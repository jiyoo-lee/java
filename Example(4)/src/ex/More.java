package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class More {

	public static void main(String[] args) {
		/* ArrayList 2�� �迭����, �������� ����*/

		String members [][] = new String [][] {
			{"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
			{"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"}
		};
		
		//2���� �迭 ArrayList�� ��ȯ�� 
		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(members));
		//ArrayList ��ȭ��ȣ�� ����ϴ� �� 
		int w = 0;
		
		while(w<list.size()) {
		System.out.println(list.get(w)[2]);
		w++;
		}
	}

}
