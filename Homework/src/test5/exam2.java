package test5;

import java.util.ArrayList;
import java.util.Scanner;

class exam2 {
	
	ArrayList<Integer> numberList = new ArrayList<>();
	Integer number;
	boolean overlap;
	
	public void inputNumber() {
		Scanner scanner = new Scanner(System.in);
		
		try {
			for(int i = 0; i < 5; i++) {
				this.overlap = false;
				System.out.println("1~9까지 숫자를 입력하세요");
				Integer number = scanner.nextInt();
			
				if(number > 0 && number <= 9) {
					checkoverlap(number);
					if(!overlap) {
						this.numberList.add(number);
						}
					else {
						System.out.println("중복된 값이 존재합니다. 다시 입력해주세요.");
						i--;
						}
					}
				else {
					System.out.println("1~9사이의 숫자만 입력가능합니다.");
					i--;
				}
			}
		}catch(Exception e) {
			System.out.println("문자는 입력하실 수 없습니다.");
			System.exit(0);
		}
		
		System.out.println("입력값 >> " + this.numberList);
		scanner.close();
	}
	
	
	public boolean checkoverlap (Integer number) {
		
		this.number = number;
		
		if(this.numberList.contains(this.number)) {
			return this.overlap = true;
		}
		
		return this.overlap;
	}
}
