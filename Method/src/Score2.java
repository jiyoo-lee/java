
public class Score2 {


	private String name;
	private String subject;
	private String sign = "false";
	private String score;
	
	public void Scores(String name, String subject) {
		
	
		this.name = name;
		this.subject = subject;
		
		String[][] st = {
						{"������", "�̰���", "���", "������", "������"},
						{"80", "78", "92", "67", "40"}, //����
						{"40", "80", "88", "92", "100"}, //����
						{"95", "30", "55", "90", "65"}, // ����
						{"20", "80", "100", "95", "30"} // ����
						};
		
		//System.out.println(name + subject); -> �� �Ѿ�� ��µǴ��� Ȯ��
		
		int w = 0;
		int index = 0;
		
		while(w < st[0].length) {
			
			if(this.subject == null || this.name != null) {
				if(this.name.equals(st[0][w])) {
					this.sign = "true";
					}
				}
				else if(this.subject !=null) {
					
					if(this.name.equals(st[0][w])) { //�� ���� �ٽ� ���
						index = w;
						}
					
					switch(this.subject) {
					case "����":
						this.score = st[1][index];
						break;
					case "����":
						this.score = st[2][index];
						break;
					case "����":
						this.score = st[3][index];
						break;
					case "����":
						this.score = st[4][index];
						break;
					default: //�ݺ��� ������ ���� ����.
						this.score = st[1][index] + "," +st[2][index] + ","+st[3][index]+","+st[4][index];
						break;
					}
				}
			w++;
		}	
	}
	
		//getter ����
	public String gtdata() { 
		
		if(this.subject == null) {
			return this.sign;
			}
		else {
			return this.score;	
			//return this.sign; �ε��� ������ üũ
		}
	}
}	
	