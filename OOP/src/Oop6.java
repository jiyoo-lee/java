
public class Oop6 {

	public static void main(String[] args) {
		// �迭 ������ ������ ��ü �߻� Ŭ���� �����
		
		box[] b = { new abox(), new abox2(), new abox3() }; //�迭������ ������
		/*b[0].dataload();
		b[1].dataload();*/
		
		/*for(box z : b) { //foreach �� ����: Ư�� Ŭ������ ���������� ����.
			z.dataload();
			}*/
		
		//�Ϲ� Ŭ���������� �迭�� ��밡���ϴ�.
		for(int i =0; i <b.length; i++) { //�迭 1�������� ����ϱ� 
			if(i != 1) { //�ε��� 1�� Ŭ������ �����������
				b[i].dataload();
				}
			} //end of for
		}
	}


abstract class box {
	public abstract void dataload(); //�����͸� �ѹ��� �� �������� �޼ҵ�
	
}

class abox extends box {
	
	@Override
	public void dataload() { //�迭 1
		System.out.println("test1");
	}
}

class abox2 extends box {
	
	@Override
	public void dataload() { //�迭 2
		System.out.println("Test2");
	}
}

class abox3 extends box {
	
	@Override
	public void dataload() { //�迭 3
		System.out.println("Test3");
	}
}