import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class myclient {
	public static void main(String[] args) {
		
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			socket = new Socket("192.168.100.128",8019);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			
			while(true) {
				System.out.println( "Ŭ���̾�Ʈ ������>>");
				String outputMessage = scanner.nextLine();
				
				if(outputMessage.equalsIgnoreCase("exit")){
					out.write(outputMessage + "\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("���� :"+inputMessage);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				scanner.close();
				if(socket!=null) socket.close();
				
			}catch(Exception e) {
				System.out.println("������ ä�� �� ������ �߻��߽��ϴ�...");
			}
		}
	}
}
