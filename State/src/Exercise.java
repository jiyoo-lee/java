import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    String c = "*";

		    if(n >= 1 && n <= 100) {
		      for(int i = 0; i < n; i++) {
		        System.out.println(c);
		        c += "*";
		  
		      }
		    }
		    
		    sc.close();
	}

}
