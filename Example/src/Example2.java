import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		/* ���빮�� 
		 * �迭 + �⺻(Ŭ����) �޼ҵ� ����
		 * product : ���� ���� ��� �� ���� Ű�� �ٳ��� ����
		 * �� ����, ��,Ű���� �����߽��ϴ�.
		 * �ش� ���� �� �迭�� �ٽ� �縮��Ʈ �ϴ� �ڵ带 �ۼ�
		 * �ش� ó�������� ������ �޼ҵ忡�� ó���� �Ǿ�� �ϸ� �ݺ����� free�Դϴ�.
		 * */
		
		String product [] = {"����","����","���","��","����","Ű��","�ٳ���","����"};
		
		mins(product);
		

	}
	
	
	public static void mins (String store[]) {
		int no = 5;
		String [] newProduct = new String [no];
		int idx = 0;
		for(String p : store) {
			if(!p.equals("����") && !p.equals("��") && !p.equals("Ű��")) {
				newProduct[idx] = p; 
				idx++;
			}
			
		}
			System.out.println(Arrays.toString(newProduct));
		
		
	}

}
