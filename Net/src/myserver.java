import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class myserver {

public static void main(String[] args) {
		
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(8080);
			System.out.println("������ ��ٸ��� �־��...");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� ������ �����߽��ϴ�.");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ :" + inputMessage);
				System.out.println("���������� >>");
				String outputMessage = scanner.nextLine();
				out.write(outputMessage + "\n");
				out.flush();
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {				
				scanner.close();
				socket.close();
				listener.close();
			}catch(Exception e) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��Ͽ� ����Ǿ����ϴ�.");
			}
		}

	}

}
