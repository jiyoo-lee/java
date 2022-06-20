package swing1;

import java.util.HashMap;
import java.util.Map;

public class Swing2 {

	public static void main(String[] args) {
		//ArrayList, LinkedList (�迭 ��) -add, remove, get, size
		//Map (�迭Ű, �迭��) �߿�~~~ : add ��� put, get,size
		//Map�� �迭Ű�� ����̱⶧���� Ű�� ���ؼ� �����͸� Ȯ���մϴ�. (�ӵ� �ֻ��)
		//���� Ű�� ���� �������� ����� ������ ���ŵ˴ϴ�. 
		// ��Ű���� ���� �ߺ���Ű�� ���� 
		
		Map<String, String> m = new HashMap<>(); // -> ����ȸ�� ���� ���� ��쿡 ���� ���̴� �ڵ� 
		// �ؽ��ڵ� hong -> Hash function(Hash map) -> 0 x 21949 CB (�ߺ����� �߻���������) 
		// Ű�� �ߺ��� ���������� ���� �ߺ��� �� �� �ֱ⶧���� ����Ѵ�. 
		// Ű�� ��� �ִµ� ���� �ִ� ���µ� �ν� �� �� ����
		
		m.put("HONG","ȫ�浿");
		m.put("KANG","������");
		System.out.println(m); // ���: {HONG=ȫ�浿, KANG=������}
		System.out.println(m.get("Hong")); // ���: ȫ�浿
		// Ű ���� �������͸� ����ϱ⶧���� �ߺ��� �Ǹ� �ߺ��� Ű�� �������� ������ ���� ����� �ȴ�.
		
		m.put("park", ""); // ���� ����ִ�. 
		if(m.get("park").equals("")) { // Ű�� ������ ���� ���� ���� 
			m.put("park", "��");
		}
		System.out.println(m.get("park")); //���: ��
		
		m.put("", "����"); // Ű ���� ���� �ִ� ���� but Map�� �������� �ùٸ��� ���� (���� ArrayList ���� ���°� ����)
		
		m.remove("Hong"); // ���� �״�ΰ� Ű�� ����� 
		
		//Map: �������� �ڷ����� ��� �� �� ����.
		Map<String,Integer> m2 = new HashMap<>(); // Ű�� String���� �ް� ���� ���ڷ� ���� ��� 
		Map<String,Object> m3 = new HashMap<>(); // Ű�� String���� �ް� ���� ���������� ������� 
		
		m2.put("age", 32);
		m2.put("level", 5);
		System.out.println(m2.get("level")); // ���: 5
		System.out.println(m2.keySet()); //Ű�� ��� [level, age]
		System.out.println(m2.values()); //���� ��� [5, 32]
		System.out.print(m2.containsKey("tel")); // ���: false �ش�Ű�� �ִ��� Ȯ�� (false : ���� true : ����)
		
		
	}

}
