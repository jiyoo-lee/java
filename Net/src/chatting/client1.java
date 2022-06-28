package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class client1 {

	public static void main(String[] args) {
		// IP, PORT Address 
		
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		String ip = "192.168.0.16";
		int port = 8080;
		
		try {
			socket = new Socket(ip,port);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.print("me >> ");
				String outputMessage = scanner.nextLine();
				if(outputMessage.equals("exit")) {
					out.write(outputMessage+"\n");
					out.flush(); // 스트림에 남아있는 문자를 모두 전송하게 하기 위한 메서드 
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("you :" + inputMessage);
			} // end of while (infinity) 
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				scanner.close();
				if(socket != null) socket.close();
			}catch(Exception e) {
				System.out.println("[warning!] 서버와의 채팅 중 문제가 발생했습니다.");
			}
		}	
	}
}
