public class Example3 {

	public static void main(String[] args) {
		/*
		 * �迭 + �⺻(Ŭ����) �޼ҵ� ���� product : ���� ���� ��� �� ���� Ű�� �ٳ��� ���� moneys : 35000, 8000,
		 * 4000, 5500, 3800, 4400, 11000, 18900 ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��ҽ��ϴ�. ��, ���� ����� �ٳ�����
		 * �����ϰ� �� ���� �ݾ��� ����Ͻÿ�. ������� 75600
		 * 
		 */

		String product[] = { "����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����" };
		int moneys[] = { 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900 };

		mins(product, moneys);

	}

	public static void mins(String pd[], int cash[]) {
		int sum = 0;
		for (int i = 0; i < pd.length; i++) {
			if (!pd[i].equals("���") && !pd[i].equals("�ٳ���")) { // �迭���� ���� Ȯ���Ҷ� �ε��� �� �����ϱ�.
				sum = sum + cash[i];
			}
		}
		System.out.println("�����Ͻ� �ݾ�: " + sum);

	}

}
