package test8;

import java.util.ArrayList;
import java.util.List;

public abstract class FruitsMenu {

	
		 /*{"사과=2000","딸기=1500","키위=2500"}
	
	[출력순서]
	"해당 상품을 선택해 주세요? [1.사과, 2.딸기, 3.키위]" 2
	"해당 상품 갯수를 입력해 주세요? " 5
	"구매한 하신 총 가격은 7500원 입니다."
	
	* abstract 을 무조건 사용합니다.
	*/
	
	String[] fruitsArr = {"사과=2000","딸기=1500","키위=2500"};
	List<Integer> prices = new ArrayList<>();
	
	public abstract int sum();
		
}
