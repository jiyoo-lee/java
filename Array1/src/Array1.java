
public class Array1 {

	public static void main(String[] args) {
		
		//�迭�̶�? ������ ������ ���¸� ���մϴ�. (Array)
		/* �迭 ��ȣ�� ������ �����ϴ�. [] {}*/
		int [] a = new int [4]; //a[] ���������� �迭���� �޴� ���� /�迭�� ����
		// new int[4] : ���ڷ� �� 4���� �����͸� ������. -> ������ ũ�� �����ʹ� �۰� �ϴ°� ��������� �����ʹ� ū�� ������ ������ ����.
		// ������ϰ� �ʱ�ȭ�ϴ°� �ȵ�
		a[0] = 5;
		a[1] = 15;
		a[2] = 25;
		a[3] = 35; 
		// new int [�迭 ����] : �ش� ������ ���� ������ ���� ������ Ŀ�� ��.
		
		int ea = a.length; //a��� �迭�� ����
		//System.out.println(ea);
		int f;
		for(f=0; f<ea; f++) { //�迭������ ������ �۰ų� ���ٴ� ���� ������ �۾ƾ��Ѵ�. 
			//System.out.println(a[f]+" ");
			//a[f] : a[0]~a[4]���� ���ư��� �迭
		}
		
		String user[] = new String[3];
		user[0] = "ȫ�浿";
		user[1] = "�̼���";
		user[2] = "������";
		
		int k = user.length;
		int w = 0;
		
		while (w < k) {
			//System.out.println(user[w]);
			w++;
		}
		
		//int[] z : �迭���� �����ϰ� �ش� �����͸� ���������� �ڵ������Ͽ� ���� -> �ڱⰡ �˾Ƽ� ����°�
		//int z []: �迭���� �����ϸ鼭 ���� 0���� �����Ͽ� ���� ������ -> ���� �迭�� �������
		int z [] = new int [] {10, 20, 30, 33, 42, 11};
		int zea = z.length;
		//System.out.println(zea);
		
		int ww= 0;
		do {
			//System.out.println(z[ww]);
			ww++;
		}while(ww<zea);
		
		//int aa[] = { }; �� ������ (new int�Է��������)
		//aa[]�迭 ���� �迭����+���� ���������� �־���ϴ� �������� ����
		//������ ����Ǹ鼭 a[]�迭�� {}�� �νĽ�ų���ֵ��� ��ȭ��.
		
		int aa[] = {10,11,22,33,55}; // �̰� ���� ����.
		int aea = aa.length;
		System.out.println(aea);
		
		int aw =0;
		while(aw<aea) {
			System.out.println(aa[aw]);
			aw++;
		}
		
		
	}

}