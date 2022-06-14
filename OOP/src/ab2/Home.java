package ab2;

public interface Home {
	
	int bk = 80; // 80이상되면 고장으로 처리(정지) 고장기준.

	public void powerOn();  //가동
	public void powerOff(); // 꺼짐
	public void broken(int n); // 고장 
}
