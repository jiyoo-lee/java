import java.util.LinkedList;

//exception7�� ���� ������ Ǯ��
public class Exception8 {

	public static void main(String[] args) {

		try {
			
		Redata rd = new Redata();
		Object[] data = {"ȫ�浿",55,"������","������",48,"�̼���","�������",34,88}; //���ڶ� ���ڶ� �������� object
		rd.setter(data);
		System.out.println(rd.getter());
		}
		catch(Exception e ) {
			if(e.getMessage() != null) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}
}


class Redata{
	
	LinkedList<String> rdata = new LinkedList<>();
	
	//���� �ǹ� ���ͼ��ʹ� �ʵ忡 �ִ°� ����°ǵ� �� �ڲ� �̷������� �������..����
	
	public void setter(Object[] call) throws Exception{
		int ea = call.length;
		int check =0;
		for(int i = 0; i < ea; i++) {
			try {
				check += (int)call[i]; //������Ʈ�� ����Ŭ������ ����ȯ���ص� ����ȴ�.
				
				//String check = new String((String)call[0]); ��� �����ĵ� ����.
			}
			catch(Exception a) {
				String ab = call[i].toString();
				rdata.add(ab);
			}
		}
	}
	
	public LinkedList<String> getter() { //����Ʈ�� �������� �ڷ����� �����ش�. �翬��.
		
		return this.rdata;
	}
	
}