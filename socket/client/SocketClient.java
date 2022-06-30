package socket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {

	static final String ipAddress = "192.168.0.16";
	static final int port = 8080;
	
	public static void main(String[] args) {
		try {
			System.out.println("client의 이름을 말해주세요.");
			Scanner scanner = new Scanner(System.in);
			String clientName = scanner.next();
			
			Socket socket = new Socket(ipAddress, port);
			
			SCWriter writer = new SCWriter(socket);
			Thread thread = new Thread(writer);
			thread.start();
			
			while(true) {
				InputStream input = socket.getInputStream();
				byte[] data = new byte[1024];
				int readSize = input.read(data);
				
				String inputValue = new String(data, 0, readSize);
				System.out.println(inputValue);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class SCWriter implements Runnable{
	
	private Socket socket;
	
	public SCWriter(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			while(true) {
				OutputStream output = socket.getOutputStream();
				Scanner scanner = new Scanner(System.in);
				output.write(scanner.nextLine().getBytes());
				output.flush();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
