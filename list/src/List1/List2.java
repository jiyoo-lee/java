package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class List2 {

	public static void main(String[] args) {
		
		/*응용문제 : 해당 데이터값 중 휴면고객 데이터는 모두 삭제해야한다.
		 데이터 : "김수빈","김정현","박도현","이경훈","정재욱","하윤성"
		 결과 : 정재욱, 하윤성만 나오게 해라
		 
		 *  */

		String[] users = {"김수빈","김정현","김창수","박도현","이경훈","정재욱","하윤성"};
		ArrayList<String> us = new ArrayList<>(Arrays.asList(users));
		int ea = us.size();
		
//		for(int i = 0; i < ea ; i++) {
//			int ea2 = us.size(); //node의 갯수를 다시 파악함 
//			for(int j = 0; j < ea2;) {
//			if(!us.get(j).equals("정재욱") && !us.get(j).equals("하윤성") ) {
//				us.remove(0);
//				System.out.println(us);
//				}
//			}
//		}
		
	
		 /* 응용문제 짝수의 숫자를 모두 삭제함. 
		  * */
		
		Integer[] nums = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> ns = new ArrayList<>(Arrays.asList(nums));
		
		int no = ns.size(); //최초사이즈
		int z = 0;
		do {
			int no2 = ns.size();
			int zz = 0;
			do {
				if(ns.get(zz)%2 == 0) {
					ns.remove(zz);
					break;
				}
				zz++;
			}while(zz < no2);
			//ns.remove(0);
			z++;
		}while(z <no);
		
		System.out.println(ns);
	}
}
