public class Example5 {

	public static void main(String[] args) {
		/* ���빮�� 
		 * 2���迭 + �⺻ (Ŭ����) �޼ҵ� ����
		 * ��ϵ� ���� vip ���� ����Ʈ�� ����Ͻÿ�
		 * user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺 
		 * user_level : gold, vip guest gold vip vip guest
		 * ������: �̼���,�������,������,
		 * */
		/*[�׷��ε���] [�������ε�����ȣ] */
		
		String users [][] = {
				  				{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
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
