package ab;

//추상화를 먼저 만들어야함
abstract class Mth1 {
	
	public String userId;
	public int userPoint;
	public abstract void setter(String data1, int data2); 	//setter
	public abstract void setter(int[] data3); //setter for arrays
	public abstract String getter(); 	//getter
	
}
