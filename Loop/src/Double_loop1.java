import java.text.SimpleDateFormat;
import java.util.Date;

public class Double_loop1 {

	public static void main(String[] args) {
		/*Date */
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YY��MM��dd��");
		SimpleDateFormat time = new SimpleDateFormat("H:m:s"); //�빮�ڴ� 17�� 21�� �̷���
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		
		//format : �԰�ȭ�� ���·� ���� ǥ�� �Ҷ� ����ϰԵ˴ϴ�.
		// import �� �Ⱦ��� �����
		
		// �����Ұ� BigInteger, SimpleDateFormat date time + �����ϱ�� �Ѱ�(��������example 10�� ����)
		
		// int f;
		//for(f=1; f<=10; f=f+2){ }  -> 2������ (�ǹ����� �� ���� ����)
		
		/*���빮��
		 * ���ڵ�� ��ǰ�� �Է½����ּ����� �ϰ� �ݾ��� �Է��ϰ�(3���ݺ�)
		 * "���� %�� �Է����ּ���"��� ������ �Բ� �ش� ���� ���ڸ� �Է��ϸ� ���� �ݾ��� ����Ǿ� ��µǵ��� �մϴ�.
		 * ��ĳ��, if��,sysout
		 * ��Ʈ: int money = 10000 ;
		 * int coupon = 20;
		 * double discount = coupon * 0.01 -> 0.2
		 * 
		 * system.out.println(discount) 
		 * double a = money * discount
		 * system.out.println(discount)
		 * int c = money -(int)( a ) //double c�� �ᵵ �� 
		 * system.out.println(c)*/

		
	}

}
