import java.util.ArrayList;
import java.util.Arrays;

public class Exception7 {

	public static void main(String[] args) {
		
		/*���빮�� 
		 * ���������� {ȫ�浿, 55, ������, ������,48,�̼���,����,34,88}
		 * �ش� ������ �� �� ���ڰ��� ��µǵ��� ��迭 �Ͻñ� �ٶ��ϴ�.
		 * �� ���ο����� �ش� �迭�� �ܺ� Ŭ����(setter)�� �����մϴ�.
		 * �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� �����մϴ�.
		 * getter���� �ش� �迭�� return���� �������� �մϴ�. 
		 * ��, �ܺ� Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		 * add
		 * 
		 * */
		
		String name[] = {"ȫ�浿","55","������","������","48","�̼���","�������","34","88"};
		
		//����Ʈ�� �迭 �ֱ�
		ArrayList<String> firstData = new ArrayList<>(Arrays.asList(name)); 
		
		Extractor extractor = new Extractor();
		extractor.setData(firstData);

	}
}

class Extractor {
	protected ArrayList<String> secondData = null;
	ArrayList<String> nameData = new ArrayList<>();
	
	public void setData (ArrayList<String> secondData)  {
		this.secondData = secondData;
		String name ="";
		
		//���ڷ� �ٲپ �ȵ� ��츦 ����ó���Ͽ� ���ο� �迭�� �ֱ�
		for(int i =0; i <this.secondData.size(); i++) {
			
			try {
				name = secondData.get(i); 
				Integer.parseInt(name);
			}
			catch(Exception a) {
				nameData.add(name);
			}
		}
		
		System.out.println(nameData); //�̸��� ���
	}
	
}
