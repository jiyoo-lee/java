
public class Example2 {

	// pc�� ����ڰ� ���ϴ� �޼ҵ�
	public String matchs(int pc, int user) {
		String msg;
		if(pc > user) {
			msg = "DOWN";
		}
		else if (pc < user) {
			msg = "UP";
		}
		else {
			msg = "�����Դϴ�!";
		}
		return msg;
	}
}
