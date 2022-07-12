package test6;

public class Exam2 extends Login{

	String message = "님 환영합니다.";
	private String name;
	
	@Override
	public String receive(String name) {
		
		this.name = name;
		return this.name+message;
	}
	
}
