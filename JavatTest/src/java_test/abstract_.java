package java_test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class abstract_ {

	FileReader fr = null;
	ArrayList<String> em_name = null;
	protected final int money = 87_000_000; //ȸ�� �� �ܰ� �ݾ�
	protected String security = ""; // key�� ������ Ȯ���� �����ʰ� �ϴ� �׷�..^^...��..
	public abstract void start(); 
	abstract void db() throws IOException; //abstract����ó���� public���� �ȵȴ�..?
	public abstract int[] check(); //getter return �ΰ��̻��϶�
	public void start(String a) {
		//�����ε�....�� �� �� �ְ� ������ش�..�� ��Ʈ���� �ʿ��ѰŴ�...
	}
	
	
}
