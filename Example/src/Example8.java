import java.util.Arrays;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*���빮�� : 
		 * ���� ����ڰ� ���� ���� ���α׷��� ��û�Ͽ����ϴ�. math.random
		 * ����ڰ� �� �ټ����� ���ڸ� �Է��ϰ� �˴ϴ�. 
		 * "1~46�� ������ ���ڸ� �Է����ּ���" : 
		 * ����ڰ� �Է��� �ټ��� ���ڸ� �迭�� �ļ��մϴ� (main���� ó��)
		 * 
		 *  �ܺ� Ŭ������ �̿��Ͽ� pc�� ���� ��÷��ȣ �ټ����� �������� �̾Ƴ��ϴ�.
		 *  pc�� ���� 5���� ���ڸ� �迭�� �����մϴ�. (�ܺ� Ŭ���� method��)
		 *  
		 *  ������ ��� method�� �ϳ� �� �����Ͽ� ����ڰ� �Է��� 5���� �迭 �����Ϳ� pc�� ���� �迭 �����͸�
		 *  �ش� method�� �����Ͽ� ����Ͻø� �˴ϴ�.
		 *  ��, ��� ����ϴ� �ݺ����� ������ do while������ �ۼ��Ͻÿ�. �ϳ��� Ŭ������ �ΰ��� �޼ҵ带 ��������(pc�� �̴°�, ����ڿ� pc�� �޼ҵ�)
		 *  ����ڰ� �Ѱ� a �޼ҵ�� ���� ������. -> a���� b�� ������.
		 * */
		int [] selected_nums = new int [5];
		int i = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1~46�������� ���ڸ� �Է����ּ���.");
			selected_nums[i] = sc.nextInt();
			lottos.pc(selected_nums,i);
			i++;
		}while(i<=4);
		
	}
}


class lottos {
	public static void pc (int sn[],int j) {
		
		int [] pcnums = new int [5];
		int f = 0;
		do {
			 pcnums[f] = (int)(Math.random()*46)+1;
			 f++;
		}while(f<=4);
		
		 
		 if(j == 4) {
		 lottos lt = new lottos();
		 lt.compare(sn,pcnums);
		 }
		
	}
	public void compare(int lastsn[], int last_pcnums[] ) {
		System.out.println(Arrays.toString(lastsn));
		System.out.println(Arrays.toString(last_pcnums));
	}
	
}
