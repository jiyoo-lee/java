
public class Switch_loop {

	public static void main(String[] args) {
		
	    String sign = "*";
	    int total; //��¹��� �ۿ� ��������� ó������ ���� �ʱ�ȭ�� �ϰ� �־���Ѵ�.
	    /*case�ȿ� ������ �ݺ����� ����� �� �ֽ��ϴ�.
	     * ���� ������ �������� ����ص� �����ϸ�, case ������ �ٸ��� �۵��ϱ⶧���� ������ ���� �ʽ��ϴ�.
	     * ��, case�� �ϳ��� ������ ���� ��� ������ case�� ���� �۵����� �ʽ��ϴ�.*/
	    
	    switch(sign) {
	    case "+" -> {
	    	int f;
	    	total = 0;
	    	for(f=1; f<=5; f++) {
	    		total += f;
	    	}
	    	System.out.println("�� 1~5���� ���� ��: "+total); //��°��� �ݺ��� ��, case�� �ȿ� �־���Ѵ�.
	    }
	    case "-" -> {
	    	total = 0;
	    	System.out.println("�������� ��� ���� �ʽ��ϴ�.");
	    	
	    }
	    case "*" -> {
	    	int dw = 1; //int f(�ߺ�)���� �ᵵ ������ for���̹Ƿ� �ߺ��� ���� �ʾƼ� ����ص� �ȴ�.
	    	total = 1;
	    	do { 
	    		total *= dw;
	    		dw++;
	    	}while(dw<=5);
	    	System.out.println("�� 1~5���� ���� ��: "+total);
	    	
	    }
	    case "/" -> {
	    	total = 0;
	    	
	    }
	      
	    } //�� default�� �־���ϴ°��� �ƴϴ�(else�� ����)
	    

	}

}
