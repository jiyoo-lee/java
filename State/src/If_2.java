
public class If_2 {

	public static void main(String[] args) {

		String mid1 = "hong"; // ����� ��ҹ��ڵ� �ν���
		String mid2 = "kim";
		String mpass = "a123456"; 
		
		/* �ش����ǹ��� ���ڷ� Ȯ���ϴ� ���� �����̸� else�� �����ϴ� �κ� =else if�� ����. */

		// ������ �������¸� ���ǵ� �������·�
		if (mid1 == "hong") {
			System.out.println("ȯ���մϴ�.");
		} else if (mid1 == "park") { // �߰��� �񱳴���� ���� ���
			System.out.println("ȯ���մϴ�.");
		} else {
			System.out.println("���Ե��� ���� ������Դϴ�.");
		}
		
		/*���̵� �� �н����带 ��� �����ϴ� ���� ���ǹ�*/
		
		if(mid2=="kim") { //ū if��
			
			
			if(mpass=="a123456") { //���� if��
				System.out.println("�α����ϼ̽��ϴ�.");
			}
			else {
				System.out.println("�н����尡 Ʋ���ϴ�.");
			} //����if�� ��
			
		}
		else {
			System.out.println("���Ե��� ���� ����� �Դϴ�.");
		} //ū if�� ��
		
		
		

	}
}