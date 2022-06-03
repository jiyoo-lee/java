public class Example5 {

	public static void main(String[] args) {
		/* 응용문제 
		 * 2차배열 + 기본 (클래스) 메소드 문제
		 * 등록된 고객중 vip 고객만 리스트를 출력하시오
		 * user_list : 홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군 
		 * user_level : gold, vip guest gold vip vip guest
		 * 결과출력: 이순신,세종대왕,김유신,
		 * */
		/*[그룹인덱스] [데이터인덱스번호] */
		
		String users [][] = {
				  				{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"},
				  				{"gold","vip","guest","gold","vip","vip","guest"}				  				
							};
		
		levels(users);
		users = null;

	}
	
	public static void levels(String vips[][] ) {
		
			/*for(int i =0; i<vips[0].length; i++) {
				if(vips[1][i].equals("vip")) {
					vipList += vips[0][i]+", ";
				}
			}*/
		
		int gp = vips.length; //2
		int ea = vips[0].length; //7
		
		int w = 0;
		while(w<gp) {
			int ww = 0;
			while(ww<ea) {
				if(vips[w][ww].equals("vip")) {
					System.out.println(vips[0][ww]+" ");
				}				
				ww++;
			}
			w++;
		}
		
	}

}
