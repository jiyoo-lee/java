package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Example1 {

	public static void main(String[] args) {
		
		/*�ܺ� class�� ����Ͽ� ������ Ǫ�ÿ�.
		 * Arraylist, LinkedList �ڱ⸶��
		 * ���� 2���� �迭 �����Ͱ� �ֽ��ϴ�. ��, 2���m �迭�� �ϳ��� �迭�� ��ġ�����մϴ�.
		 * �� ��� �ߺ� �� ���� �ϳ��� ó���� �ϼž��մϴ�.
		 * 1�� db : 11,22,33,44,55
		 * 2�� db : 8,10,11,19,44
		 * 
		 * ��� : 8,10,11,19,22,33,44,55
		 * 
		 * 1. 1��db 2��db �� �� �ߺ��� ����
		 * 2. 2��db�� 1�� db�� �߰� 
		 * 3. 1�� db�� sort�� �̿��ؼ� ����  
		 * */
		
		Arrays a = new Arrays();
		a.numbers();
		
	}
}

class Arrays {
	
	ArrayList<Integer> list1 = null;
	ArrayList<Integer> list2 = null;
	private Integer[] c = new Integer[] {11,22,33,44,55};
	private Integer[] d = new Integer[] {8,10,11,19,44};
	
	public void numbers () {
		
		this.list1 = new ArrayList<>(java.util.Arrays.asList(this.c));
		this.list2 = new ArrayList<>(java.util.Arrays.asList(this.d));
		
		// �� ��ġ��
		list1.addAll(list2);
		
		//�ߺ�����
		HashSet<Integer> f = new HashSet<Integer>(list1);
		list1 = new ArrayList<Integer>(f);
		
	
		//����
		Collections.sort(list1);
		System.out.println(list1);
		
	}
}