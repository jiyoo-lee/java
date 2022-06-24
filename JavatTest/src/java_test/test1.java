package java_test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("과목추가[1], 과목삭제[2], 과목리스트 확인[3] 종료[4]를 선택해주세요.>>");
		int subject = sc.nextInt();
		
		grade g = new grade();
		
		switch(subject) {
		
		case 1 :
			g.adder(subject);
			break;
			
		case 2 :
			g.deleter(subject);
			break;
			
		case 3 :
			g.printer(subject);
			break;
			
		case 4 :
			System.out.println("종료합니다.");
			System.exit(0);
		
			}
		}
			
	}
}

class grade extends test1_abstract{
	
	static List<String> subjectlist =new LinkedList<>();
	String subjects;
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void adder(int a) {
		System.out.print("추가할 과목명을 입력하세요>>");
		this.subjects = sc.nextLine();
		if(!this.subjectlist.contains(subjects)) {
			this.subjectlist.add(subjects);
		}
		else {
			System.out.println("등록된 과목이 존재합니다.");
		}
	
	}
	
	@Override
	public void deleter(int b) {
		System.out.print("삭제 할 과목명을 입력해주세요.>>");
		this.subjects = sc.nextLine();
		if(this.subjectlist.contains(subjects)) {
			this.subjectlist.remove(subjects);
		}
		else {
			System.out.println("해당 과목이 없습니다.");
		}
	}
	
	@Override
	public void printer(int c) {
		System.out.println(this.subjectlist);
	}
}
