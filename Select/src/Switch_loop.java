
public class Switch_loop {

	public static void main(String[] args) {
		
	    String sign = "*";
	    int total; //출력문을 밖에 쓰고싶으면 처음부터 변수 초기화를 하고 넣어야한다.
	    /*case안에 각각의 반복문을 사용할 수 있습니다.
	     * 또한 동일한 변수명을 사용해도 가능하며, case 각각의 다르게 작동하기때문에 문제가 되지 않습니다.
	     * 단, case는 하나의 조건이 맞을 경우 나머지 case는 절대 작동하지 않습니다.*/
	    
	    switch(sign) {
	    case "+" -> {
	    	int f;
	    	total = 0;
	    	for(f=1; f<=5; f++) {
	    		total += f;
	    	}
	    	System.out.println("총 1~5까지 계산된 값: "+total); //출력값은 반복문 밖, case문 안에 넣어야한다.
	    }
	    case "-" -> {
	    	total = 0;
	    	System.out.println("음수값은 출력 되지 않습니다.");
	    	
	    }
	    case "*" -> {
	    	int dw = 1; //int f(중복)으로 써도 별도의 for문이므로 중복이 되지 않아서 사용해도 된다.
	    	total = 1;
	    	do { 
	    		total *= dw;
	    		dw++;
	    	}while(dw<=5);
	    	System.out.println("총 1~5까지 곱한 값: "+total);
	    	
	    }
	    case "/" -> {
	    	total = 0;
	    	
	    }
	      
	    } //꼭 default가 있어야하는것은 아니다(else의 개념)
	    

	}

}
