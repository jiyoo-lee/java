package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class List4 {

	public static void main(String[] args) {
//		Integer[] num1 = { 3,6,9,12,15 };
//		
//		LinkedList<Integer> in = new LinkedList<>(Arrays.asList(num1)); 
//		//ArraysList랑 비슷하지만 linked가 수정 및 추가 사항이 많다면 더 용이하다.  -> 순차적으로 검색하므로 속도는 더 느리다.
//		System.out.println(in);
//		
//		in.add(33);
//		in.add(43);
//		in.add(23);
//		//System.out.println(in);
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();  //비어있는 int 배열 
		String user;
		// fo(;;) 무한 루프 
		while(true) { //sysout을 while문 밖에 못씀.
			System.out.println("숫자를 입력하세요.");
			user = sc.next();
			try { //사용자가 입력한 값이 오류가 있는지 확인하는 파트 
				int number = Integer.parseInt(user);
				list.add(number);
				int ea = list.size();
				if(ea > 5) {
					System.out.println("배열의 공간이 꽉차 종료합니다.");
					break; //5개까지만 배열을 만들어 무한루프를 빠져나오기 위해서 
				}
			}
			catch (Exception e) { // 오류가 발생하였을 경우 작동되는 파트 
				System.out.println("해당 입력사항은 문자입니다. 숫자만 입력하세요.");
				
			}
		}
			System.out.println(list); // 무한루프에 break 추가하면 밖에서 sysout 쓸수 있음.
			
			sc.close();
	}
}
