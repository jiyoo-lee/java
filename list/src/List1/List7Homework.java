package List1;

public class List7Homework {

	public static void main(String[] args) {
		/* 숙제 : 
		 * ArrayList 또는 LinkedList 둘 중에 원하는 메소드를 구현하시면 됩니다.
		 * 2차배열 형태입니다.
		 * 해당 데이터 값을 모두 더하여 짝수인지 홀수인지를 확인하시오.
		 * 결과 : 총 합은 361이고 홀수 입니다. 로 출력되게 하시오.
		 * */
		
		Integer[][] datas = {
								{10,20,30,40,50,60,70},
								{3,6,9,12,15,17,19}
							};
		
		
		ArrayList<Integer> odd = new ArrayList<>();

		for (int i = 0; i < datas.length; i++) {
			for (int j = 0; j < datas[i].length; j++) {
				odd.add(datas[i][j]);
			}
		}
		
		int sum = 0;
		for (int i = 0; i < odd.size(); i++) {
				sum += odd.get(i);
			}
		if (sum % 2 == 0) {
			System.out.println("총합 " + sum + " 짝수입니다.");
		} else {
			System.out.println("총합 " + sum + " 홀수입니다.");
		}
		

	}

}
