package javatest;

public class Testjava2 {

	public static void main(String[] args) {
		
		/*���� ���� ������ �ֽ��ϴ�.
		 * �ش� ��ٱ��ϴ� ������ŭ ��ü ���� ����Ͽ� �� ������ �ݾ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
	
		
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
		System.out.println("����:"+sum+"��");
	}
	
	
}