import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class m_server {

	public static void main(String[] args) {

		chatroom cr = new chatroom();
		
	}
}

class chatroom  { //�⺻ ���� -> �� �����ڸ��� thread�� ���� 
	ServerSocket server = null;
	static final int port = 9009; //thread���� �������� ����ϱ� ���ؼ� 
	Socket sk = null;
	
	public chatroom() {
		
		try {
			
		this.server =new ServerSocket(this.port);
		
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("****��Ƽ ä�� ����!!****");
		
		while(true) {
			
			try {
				
				this.sk = this.server.accept(); //socket open (client ���� �㰡)
				chat_thread ct = new chat_thread(this.sk); // accept ���� �����ϴ�.
				Thread t = new Thread(ct); //���� �Ҷ����� ������ ȣ��
				t.start();
				
			}catch(Exception e) {	 }
		}
	}
}

class chat_thread implements Runnable{
	
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	Scanner sc = null;
	//�迭�� �޸𸮿� ����Ŵ ���� : �������Ѿ���
	//������ �߻��� thread�� ���Ӱ� �����ǹǷ� static�� �ø��������� ���� ���� ��� �ʱ�ȭ�Ǿ����.
	static ArrayList<Socket> user = new ArrayList<Socket>(); // ������
	
	public chat_thread(Socket s) {
		this.sk = s;
		this.user.add(this.sk);
		try {
			System.out.println("ä�ÿ� �����ϼ̽��ϴ�.");
			System.out.println(this.sk);
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
		}
		catch(Exception e) {
			System.out.println("Ŭ���̾�Ʈ ���� ������ �ùٸ��� �ʽ��ϴ�.");
		}
	}
	
	@Override
	public void run() {
		try {
			byte[] data = new byte[1024];
			int n = this.is.read(data);
			this.message = new String(data,0,n);
			System.out.println(this.message);
			
			while(true) {
				System.out.println("���� ä�� ������ : "+this.user.size()); //������ �ο���				
				this.sc = new Scanner(System.in);
				System.out.println("���� �޼����� �Է��ϼ���.");
				this.result = "server : " + this.sc.nextLine();
				
				/*�迭�� �ִ� vport�� ���� ������ ���� ����ŭ �ݺ��� �մϴ�.*/
				for(int j = 0; j < this.user.size(); j++) {
					//�迭�� �ִ� ����� vport�� ������ �ϰԵ˴ϴ�. 
				OutputStream all = this.user.get(j).getOutputStream();
				//����ں��� Stream�� ���� 
				all.write(this.result.getBytes());
				all.flush(); // �ش� ���� �޼����� ���(�޸�)
//				this.os.write(this.result.getBytes());
//				this.os.flush(); 
				}
				
				/*
				this.os.write(this.message.getBytes()); // �ٽ� ȸ��
				this.os.flush();
				Thread.sleep(10000);
				String m = "������ �޼��� ���";
				this.os.write(m.getBytes());
				this.os.flush();*/
			}
		}catch(Exception e) {
			System.out.println("Ŭ���̾�Ʈ�� ä��â�� �������ϴ�.");
		}
		finally {
			try {
				this.os.close();
				this.is.close();
				this.sk.close();
			}catch(Exception e) { }
		}
	}
}