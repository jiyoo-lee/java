package javatest;

import java.util.Arrays;

public class testjava3 {

	public static void main(String[] args) {

		
	}

}

class Basket extends Testjava3_data {
	static int total = 0;
	
	public void basket_data() {
		String user[] = {"사과=2","양파=1","마늘=1","파=1","참치캔=6","라면=8"};
		System.out.println(Arrays.toString(user));
	}
}
