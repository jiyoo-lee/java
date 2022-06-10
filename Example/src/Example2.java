
public class Example2 {

	// pc와 사용자가 비교하는 메소드
	public String match(int pc, int user) { //getter (인수값x) return 사용
		String msg;
		if(pc > user) {
			msg = "Down";
		}
		else if (pc < user) {
			msg = "Up";
		}
		else {
			msg = "정답입니다!";
		}
		return msg;
	}
}

//setter(매개변수,(인수값)) return 사용 x void로 사용

//setter를 사용 할 시, 코드

//private int val1;
//private int val2;
//private String msg; -> 결과메세지

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
//			this.msg = "정답입니다."; 				
//		}
//	}


//public String result() {
// 		return this.msg; 
//	}
