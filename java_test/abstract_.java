package java_test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class abstract_ {

	FileReader fr = null;
	ArrayList<String> em_name = null;
	protected final int money = 87_000_000; //회사 총 잔고 금액
	protected String security = ""; // key가 없으면 확인이 되지않게 하는 그런..^^...ㅋ..
	public abstract void start(); 
	abstract void db() throws IOException; //abstract예외처리는 public쓰면 안된다..?
	public abstract int[] check(); //getter return 두개이상일때
	public void start(String a) {
		//오버로딩....도 할 수 있게 만들어준다..한 파트에만 필요한거는...
	}
	
	
}
