public class Awt4 {

	public static void main(String[] args) {
		//Awt4_class�� ����
	
		Decorate d = new Decorate();
		d.view();	
	}
}

class Decorate extends Awt4_class {
	public String aws = "";
	private int gugu;
	
	public void btnPush(int c) {
		/*����ڰ� �Է��� ���ڸ� �������� �������� �ۼ�*/
		for(int i = 1; i <= 9; i++) {
			gugu = c*i;
			//System.out.println(c + " * " + i + " = "+ gugu);
			this.aws += Integer.toString(c) + " * "+ Integer.toString(i) + " = "+Integer.toString(gugu) + " ".replaceAll("\\s+","\n");
		}
		
	}
	
	
	public String calls() {
			
		return this.aws;
	}
}
