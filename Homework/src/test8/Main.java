package test8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("해당 상품을 선택해주세요 [1] 사과 [2] 딸기 [3] 키위 >> ");
		int userFruit = scanner.nextInt(); 
		System.out.print("구매하실 수량을 입력해주세요 >> ");
		int userCount = scanner.nextInt();
		
		
		InputandOutput io = new InputandOutput(userFruit, userCount);
		io.modifyArr();
		int receipt = io.sum();
		System.out.println(receipt + "원 입니다.");
		
		scanner.close();
	}

}
