import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/* ���빮��
		 * �迭�� �����ϴ� ����
		 * �����ڿ��� �޴��� Ȱ��ȭ �ϴ� ���μ����Դϴ�. 
		 * �ش� �޴� Ȱ��ȭ�� 2�� �迭�̸� �޴���� Ȱ��ȭ�ϴ� Y �Ǵ� N �����մϴ�.
		 * �ش� Ȱ��ȭ ���� �����Ͽ� y�� ����Ǵ� �ε��� ��ȣ�� �´� �޴����� �����迭�� �籸����
		 * main�� ����Ͻÿ�
		 * ���: [ ���Ϲ��, ����������, ���ڽ�, �̺�Ʈ, �߼� ]
		 * ��, private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��Ͻÿ�.
		 *  */

		menus mn = new menus();
		String[] yesMenu = mn.coupangY();
		System.out.println(Arrays.toString(yesMenu));
		
	}
}

class menus{
	
	private String[][] coupang;
	private String[] yes;
	
	public menus() {
		String[][] ms = {
						{"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"},
						{"Y","Y","N","Y","Y","N","Y"}
						};
			
		this.coupang = ms;		
	}
		
	public String[] coupangY() {
		int count = 0; 
		int arrayCount = 0;
		int ea = this.coupang[0].length;
			
		for(int i = 0; i < ea; i++ ) {
			if(this.coupang[1][i].equals("Y")) {
				count ++;
			}	
		}
			
		this.yes = new String[count]; 
		for(int j = 0; j < ea; j++ ) {
			if(this.coupang[1][j].equals("Y")) {
				this.yes[arrayCount] = coupang[0][j];
				arrayCount++;
				}
			}
		return this.yes;
	}
}