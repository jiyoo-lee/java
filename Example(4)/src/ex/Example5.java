package ex;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example5 {
	
	
	public static void main(String[] args) {
		/*응용문제
		 * 사용자가 직접 숫자를 입력받습니다.
		 * scanner 쓰삼 사용자가 문자를 입력할 경우 예외처리가 진행되어야 합니다.
		 * 총 숫자 입력은 7번이며 사용자가 입력한 숫자를 오름차순으로 정렬합니다. 
		 * 추가옵션 : 짝수와 홀수값을 별도로 배열을 관리하도록 합니다.*/
	
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> oddnums = new LinkedList<>(); //홀수
		LinkedList<Integer> evennums = new LinkedList<>(); // 짝수 
		
			for(int i =7; i>0; i--) {  //무조건 7개를 받으라고 하면 루프 돌리기 
				System.out.println("숫자를 입력하세요");
				try {
					Integer num = Integer.valueOf(sc.next());
					if(num%2== 1) {
					oddnums.add(num);
					}
					else {
						evennums.add(num);
						}
					}
				catch(Exception ab) {
					System.out.println("숫자를 입력하셔야합니다.");
					i++;
				};
			}
	
		Collections.sort(oddnums);
		Collections.sort(evennums);
		System.out.println(oddnums);
		System.out.println(evennums);
		
	
		sc.close();
	
	}	
}
