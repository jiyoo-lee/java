
public class Array1 {

	public static void main(String[] args) {
		/* ���빮�� : �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�.
		 * �ش� �迭�� �� ����� ���̵� 3�ܾ� �̻� ����Ͻÿ�.*/
		/*���빮�� : �迭 : hong kim park lee jang jung*/
		
		String id [] = {"hong","kim","park","lee","jang","jung"};
		
		int word;
		int arrayLength = id.length;
		for(int i =0; i<arrayLength; i++) {
			word = id[i].length();
			if(word > 3) {
				System.out.println(id[i]);
			}
		}
		

	}

}
