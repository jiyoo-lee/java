package java_test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("�����߰�[1], �������[2], ���񸮽�Ʈ Ȯ��[3] ����[4]�� �������ּ���.>>");
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
			System.out.println("�����մϴ�.");
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
		System.out.print("�߰��� ������� �Է��ϼ���>>");
		this.subjects = sc.nextLine();
		if(!this.subjectlist.contains(subjects)) {
			this.subjectlist.add(subjects);
		}
		else {
			System.out.println("��ϵ� ������ �����մϴ�.");
		}
	
	}
	
	@Override
	public void deleter(int b) {
		System.out.print("���� �� ������� �Է����ּ���.>>");
		this.subjects = sc.nextLine();
		if(this.subjectlist.contains(subjects)) {
			this.subjectlist.remove(subjects);
		}
		else {
			System.out.println("�ش� ������ �����ϴ�.");
		}
	}
	
	@Override
	public void printer(int c) {
		System.out.println(this.subjectlist);
	}
}
