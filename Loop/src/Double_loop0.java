
public class Double_loop0 {

	public static void main(String[] args) {
		
		int f,ff;
		int total;
		
		for(f=1; f<=3; f++) {
			for(ff=1; ff<=4; ff++) {
				total = f+ff; //더하는거는 작은 for문 안에서 하는것
				System.out.println(f + " + "+ff+" = "+total);
			   }
			}

	}

}
