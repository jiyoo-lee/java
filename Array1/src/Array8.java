import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/*2���� �迭 (�� �̻��� ������ �迭)
		 * [][] 
		 * int a[] = new int[2]; �ű԰����� ����� �����͸� �Է��ϴ� ���
		 * a[0] = 1;
		 * a[1] = 2; -> �����迭
		 * 
		 * int b[] = {1,2,3,4};
		 * int[] c = {1,2,3,4};  -> �����迭
		 * int [] d = new int [] {1,2,3,4}; : ������ �����ʰ� ��������� �����͸� �Է��ϴ� ���
		 * */
		
		//********* String member2 [][] = new String[3][3]; // ���� �迭
		
		String member [][] = {
								{ "ȫ�浿", "������", "������"} //�׻� ,�� ��������
							,   { "25", "31", "22" }				
		}; // ->���� �迭 
		
		//System.out.println(member[1][2]); //�ϴ� ���� ����غ���.
		int f, ff;
		int data_ea = member[0].length; //������ ������ �� �ش� �迭�� ��ü ������ ���´�.
		int data = member.length; // �迭 ������ � �ִ�����  Ȯ��
		
		
		 for(f=0; f<data; f++) { //ū �ݺ����� �迭 ������ŭ ����
			for(ff=0; ff<data_ea; ff++) { // ���� �ݺ����� �迭�� �ִ� ������ ������ŭ ������ ���ϴ�.
				//System.out.println(member[f][ff]);
			}			
		}
		 
		 /* 2���� �迭 �հ�ġ ���ϴ� �� */
		 
		 int datas [][] = {
				 			{1,3,5},
				 			{2,4,6}			 
		 			};
		 
		 int fea = datas.length; // �迭�� �������� ->2�� = �ι� ������ ũ��
		 int dea = datas[0].length; //ù��° �ε��� �迭�� ��ü ���� -> �� ���� �迭�� ����(���� ������ 0 1 ��� �ε��� ��ȣ�� �־��ش�.)
		 int sum = 0; 
		 int w, ww;
		 
		 for(w=0;w<fea; w++) { //ū for��
			for(ww=0; ww<dea; ww++) { // ���� for��
				// System.out.println(datas[w][ww]);  //�迭�� Ȯ��
				sum += datas[w][ww];
			} //end of small for
		 } //end of big for
		 //System.out.println("�� �հ�: "+sum);
		 
		 
		 /* ���빮�� : �ش� ������ �迭�� �ִ� ��� �� �� ¦������ ��� ���Ͻÿ�. */
		 
		 int score [][] = {
				 			{11,42,22,16},
				 			{7,33,10,29}				 			
		 				};
		 
		 int score_ea1 = score.length;
		 int score_ea2 = score[0].length;
		 int total = 0;
		 int i, ii;
		 
		 for(i=0; i<score_ea1; i++) {
			 for(ii=0; ii<score_ea2; ii++){
				 if(score[i][ii]%2 == 0)  {
					 total += score[i][ii];
				 }
			 }
		 }
		 System.out.println("�����: "+total);
		 
		 
		 
		 
	}

}
