package javatest;

public class Testjava1 {

	public static void main(String[] args) {

		/* ���迡 ���� �Ƿ��� �ߴ� �������� */
		
		winner w = new winner();
		w.setData();
		w.getData();	
	}
}

abstract class userData {
	
	String[][] data = null;
	public abstract void db();
	
}

class winner extends userData {
	private String[][] datas;
	private int check = 0;
	private String winner;
	
	@Override
	public void db() {
		this.datas = new String[][] {
			{ "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
			{"65","74","23","75","68","96","88","98","54"}
		};
	}
	
	public void setData () {		
		this.data = datas;
	}
	
	public void getData () {
		db();
		for(int j = 0; j < this.datas[0].length; j++) {
			int a = Integer.parseInt(datas[1][j]);
				if(a > check) {
					check = a;
					winner = datas[0][j];
				}
			}
		System.out.printf("1�� : %s ���� : %d��", winner, check);
	}
				
}