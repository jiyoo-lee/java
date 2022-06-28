package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server1 {

	public static void main(String[] args) {

		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		ServerSocket listener = null;
		Scanner scanner = new Scanner(System.in);
		int port = 8080;
		
		try {
			listener = new ServerSocket(port);
			System.out.println("상대와 연결을 기다리는 중입니다...두근두근");
			socket = listener.accept(); //서버가 연결되면
			System.out.println("연결이 완료되었습니다!");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equals("exit")) {
					System.out.println("상대방이 채팅창을 나갔습니다. 연결을 종료합니다.");
					break;
				}
				System.out.println("you >> " + inputMessage);
				System.out.print(" me >> ");
				String outputMessage = scanner.nextLine();
				out.write(outputMessage + "\n");
				out.flush(); // 스트림속에 남아있는 데이터를 모두 전송해주는 
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
				System.out.println("[warning!] 오류가 발생하여 서버가 종료되었습니다.");
			}
		}
	}
}
