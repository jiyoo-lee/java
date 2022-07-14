package test8;

public class InputandOutput extends FruitsMenu {
	
	int fruit;
	int count;
	
	public InputandOutput (int fruit, int count) {
		
		this.fruit = fruit;
		this.count = count;
	}
	
	public void modifyArr () {
		
		for(int i  = 0; i < fruitsArr.length; i++) {
			String[] temp = fruitsArr[i].split("=");
			prices.add(Integer.parseInt(temp[1]));
		}
	}

	@Override
	public int sum () {
		int sum = 0;	
		int num = prices.get(fruit-1);
		sum = num * this.count;
		return sum;
	}	
}
