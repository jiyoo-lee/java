public class People {
	public int age;
	
	public String sex;
	
	public String name;
	
	
	public void smile() {
		System.out.println("다 같이 웃자!");
	}
	
	public void fight(People another) {
		if (this.age > another.age) {
			System.out.println("내가 이겼다.");
		}
		else if (this.age == another.age) {
			System.out.println("비겼다.");
		}
		else {
			System.out.println("내가 졌소.");
		}
		
	}
}
