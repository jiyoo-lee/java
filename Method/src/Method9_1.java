import java.util.Arrays;

public class Method9_1 {

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

		coupang c = new coupang();
		System.out.println(Arrays.toString(c.get()));
		
	}

}

class coupang{
	
	private String[][] menuData; // -field ����� static������ ������ �ȵȴ�. (�ʵ�,this ��� �� �ȵ�)
	private String[] rdata;
	
	public coupang() {
		String[][] ms = {
						{"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"},
						{"Y","Y","N","Y","Y","N","Y"}
						};	
		this.menuData = ms;	
		yData();
	}
	
	public void yData() {
		
		int w  = 0;
		int ea = this.menuData[0].length;
		String ww[] = new String[ea];
		int ct = 0;
		do{
			if(this.menuData[1][w].equals("Y")) {
				ww[ct] = menuData[0][w];
				ct++;
			}
			w++;
		}while(w < ea);
		this.rdata = ww;
	}
	
	public String[] get() {
		
		return this.rdata;
	}
}

 /*   
  * class aa{
  * int a;      -> field 
  * String b;
  * 	public aa() { -> constructor ������ 
  * 	}  
  * 	
  * 	-- method -- 
  *  	public void
  *  	public static void
  *  	public String abc
  *  	-- 
  * */
