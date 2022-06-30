package socket.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketClientWriter implements Runnable{
	
	private Socket socket;
	private String clientName;
	
	public SocketClientWriter(Socket socket, String clientName) {
		this.socket = socket;
		this.clientName = clientName;
	}

	@Override
	public void run() {
		try {
			while(true) {
				OutputStream output = socket.getOutputStream();
				Scanner scanner = new Scanner(System.in);
				output.write((clientName + "," + scanner.nextLine()).getBytes());
				output.flush();
				output.close();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
