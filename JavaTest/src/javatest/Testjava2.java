package javatest;

public class Testjava2 {

	public static void main(String[] args) {
		
		/*각각 개당 가격이 있습니다.
		 * 해당 장바구니는 갯수만큼 전체 값을 계산하여 총 결제할 금액을 출력하는 프로그램을 작성하시오.*/
	
		
		Calculator c = new Calculator();
		c.food();
		c.calculate();
			
	}
}

class Calculator extends Testjava2_data {
	Object[][] foodList2;
	String[] foodget;
	int sum;
	
	public void food() {
		this.foodList2 = foodList;
		this.foodget = selectedFood;
	}
	
	public void calculate() {
		
		int w = 0;
		while(w<this.foodList2[0].length) {
			int a = Integer.parseInt(foodList[1][w]);
			String add = this.foodget[w];
			String result = add.substring(add.lastIndexOf("=")+1);
			//System.out.println(result);
			
			sum += Integer.parseInt(result) * a;
			w++;
		}
		System.out.println("총합:"+sum+"원");
	}
	
	
}