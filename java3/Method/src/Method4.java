import java.util.Arrays;

public class Method4 {

	public static void main(String[] args) {
		//return에 값 두개 사용하기 (split 값 사용)

		per p = new per();
		String info = p.userinfo();
		String[] info2 = info.split("'");
		System.out.println(Arrays.toString(info2));
		System.out.println(info2[1]);
		
		
		/* return에 값 2개 사용하기 배열로 이용*/
		String[] myinfo = p.userinfo2();
		System.out.println(myinfo[0] + myinfo[1]);
		
	}

}

class per {
	
	public String userinfo() {
		String user_name  = "홍길동";
		String user_id = "hong";
		String user_info = user_name + "'" + user_id;
		return user_info;
	}
	
	public String[] userinfo2() {
		String user_name  = "홍길동";
		String user_id = "hong";
		//String[] userArray = {user_name, user_id};
		//return userArray; 라고 써도 된다. 
		// 해당 두개 이상의 값을 return으로 보낼 경우 
		return new String[] {user_name,user_id};
	}
}