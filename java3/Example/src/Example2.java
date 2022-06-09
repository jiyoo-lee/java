
public class Example2 {

	// pc와 사용자가 비교하는 메소드
	public String matchs(int pc, int user) {
		String msg;
		if(pc > user) {
			msg = "DOWN";
		}
		else if (pc < user) {
			msg = "UP";
		}
		else {
			msg = "정답입니다!";
		}
		return msg;
	}
}
