
public class Arrays4 {

	public static void main(String[] args) {
		
		String[] names = new String[3]; //���� ���� �迭 (������ ��������)
		String m[] = {"ȫ�浿","�̼���","������"}; //���� �ִ� �迭 (�迭���� �����Ͱ� �ִ� ����)
		
		int ct = 0; //foreach���� �ε��� ��ȣ�� �����Ƿ� ���Ӱ� �ε��� ��ȣ�� �������ֱ����� �����Դϴ�.
		for(String a : m) {
			//System.out.println(ct);
			if(a.equals("ȫ�浿") || a.equals("������")) { //�ش� (����)�迭�� �� ���ǿ� �´� ���� �߷��� ���ο� �迭���� �߰���.
			names[ct] = a;
			ct++; //������ ������ ī���� �Ǵ°�. �ε��� ��ȣ�� ���������� �����ϱ� ���� ������
			}
		}
		int name_ea = names.length;
		System.out.println(name_ea);
	}

}
