public class People {
	public int age;
	
	public String sex;
	
	public String name;
	
	
	public void smile() {
		System.out.println("�� ���� ����!");
	}
	
	public void fight(People another) {
		if (this.age > another.age) {
			System.out.println("���� �̰��.");
		}
		else if (this.age == another.age) {
			System.out.println("����.");
		}
		else {
			System.out.println("���� ����.");
		}
		
	}
}
