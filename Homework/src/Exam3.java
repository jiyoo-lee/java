package test6;

public class Exam3 extends Login{
	
	String message = "님 주문하신 내역이 없습니다.";
	private String name;
	
	@Override
	public String receive(String name) {
		
		this.name = name;
		return this.name + message;
	}
	
}
