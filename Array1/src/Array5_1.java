import java.util.Arrays;

public class Array5_1 {

	public static void main(String[] args) {
		
		//�� �迭 ������ �����Ͱ� �ִ� �迭�� Ŀ���� ���
		
		int a[] = new int[2];// ������ ������ ������.
		int b[] = {1,2,3,4,5,6,7}; //7���� ��ü�� �ִ� ��Ȳ.
		int ea = b.length; //b�迭�ȿ� ��� ������ ��ü�� ����ִ��� Ȯ���Ѵ�.
		int a_ea = a.length;
		int ct = 0;
		
		for(int i = 0; i<ea; i++) { // �迭�� 0���� ���� ����.������ Ƚ���� ea���� �ϳ� �۰� �Ѵ�.
			if(b[i]%2 == 0 && ct < a_ea) { // if(b�迭�� ���� ¦���� && ���ο� a�迭�� ��ü ��üũ�⸸ŭ��)
				a[ct] = b[i];
				ct++; // ���Ǹ� ���� ��, �ε��� ��ȣ�� +1�� ������Ŵ.
			}
		}
		
		System.out.println(Arrays.toString(a)); //�迭 ����ϴ� ���� (int,String �� ����)
		
		/*�� ������ �ִ� ����, ���� �迭 ������ �˾ƾ��Ѵ�. 
		 * ū for������ ���� �迭 ���� �ľ� -> */

	}

}
