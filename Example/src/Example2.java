
public class Example2 {

	// pc�� ����ڰ� ���ϴ� �޼ҵ�
	public String match(int pc, int user) { //getter (�μ���x) return ���
		String msg;
		if(pc > user) {
			msg = "Down";
		}
		else if (pc < user) {
			msg = "Up";
		}
		else {
			msg = "�����Դϴ�!";
		}
		return msg;
	}
}

//setter(�Ű�����,(�μ���)) return ��� x void�� ���

//setter�� ��� �� ��, �ڵ�

//private int val1;
//private int val2;
//private String msg; -> ����޼���

//public void randomck (int pc, int user) {
//		this.val1 = pc;
//		this.val2 = user;
//		if(this.val1 > this.val2 ) {
//			this.msg = "Down";
// 		}
//		else if (this.val1 < this.val2) {
//			this.msg = "Up";
//			}
//		else {
//			this.msg = "�����Դϴ�."; 				
//		}
//	}


//public String result() {
// 		return this.msg; 
//	}
