import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		
/* 1���迭�ε� 2�� */
		
		/*���빮�� : �ش� ����� ���� ������ �� �� ���� �� �����͵� �Բ� �����˴ϴ�.
		 * �� �� ���� ������ ���� 3�̸�(������)�� ���� Ȯ���Ͽ� �迭 �����͸� �簡���մϴ�.
		 * �迭�� : ["������,"�������","������","������"]
		 */
		
		String users[] = {"ȫ�浿","�̼���","������","�������","������","������"};
		int levels[] = {4,3,1,1,2,2}; //���� ���� 
		String members[] = new String[4]; //�̸� �����ϰ� ��������
		int levels_ea = levels.length;
		int ct = 0; 
		
		for(int i =0; i<levels_ea; i++) {
			// System.out.println(levels[i]); -> �ݺ��� �����ϰ� �迭 �� �������� Ȯ��.
			if(levels[i] < 3) {
				members[ct] = users[i];
				ct++; //������ ������!!!!! �迭 �ε��� ��ȣ�� ���������ַ�
			}
		}
		System.out.println(Arrays.toString(members));

	}

}
