package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class List1 {

	public static void main(String[] args) {
		
		//add(�߰�), get(������ �ε�), remove(����), size(�ε��� ����) : ArrayList ��� utility �޼ҵ忡�� ����ϴ� �κ�
		String[] member = {"�̼���","ȫ�浿","������","������"};
		// �߿�: add�� �Ϲ������� ������ ���� �ڿ� �����Ͱ� �߰���. ��, index ��ȣ�� ���� �� ���� �����ϸ� �ش� �ε����κп� �߰��� �˴ϴ�.
		
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member)); //ArrayasList : ���� �ε��� �迭 ������ ����
		//System.out.println(mb);
		int ea = mb.size(); //�迭 ���� �ε��� ����
		//System.out.println(ea+"��");
		mb.add("������"); //�迭�� �߰��ϴ� �� 
		//System.out.println(mb);
		mb.remove(1); // �迭 �ε��� 1�� �� ���� && ������ ���� �ε��� ��ȣ�� �ٲ� 
		//System.out.println(mb);
		mb.add(3,"�������"); //�迭 �ε��� ��ġ ���� && �迭�� �߰� 
		//System.out.println(mb);
		String checks = mb.get(2); //���ϴ� �ε��� ��ȣ �������� 
		//System.out.println(checks);
	
		/* ���빮�� 
		 * �� �迭: int[] numbers = {15,22,37,8,11,19,41};
		 * �� �迭: int[] numbers = {7,15,22,8,11,39,41};
		 * */
		
		/*ArraysList���� int�� ������� �ʰ� Integer�� �����.*/
		Integer[] numbers = {15,22,37,8,11,19,41};
		
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(numbers));
		num.remove(2);
		num.remove(4); //�ε��� ��ȣ�� �����Ҷ����� �ٲ�ϱ� Ȯ�� �ϸ鼭 Ǯ�� 
		num.add(0,7);
		num.add(5,39);
		System.out.println(num);
		
	}
}