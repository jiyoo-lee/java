package socket.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketServer {

	private static final int port = 8080;
	
	public static void main(String[] args) {
		List<Socket> sockets = new ArrayList<>();
		
		try {
			ServerSocket server = new ServerSocket(port);
			System.out.println("서버를 시작합니다.");
			
			while (true) {
				Socket socket = new Socket();
				socket = server.accept();
				System.out.println("채팅을 시작합니다.");
				sockets.add(socket);
				
				SSReader reader = new SSReader(sockets, socket);
				Thread thread = new Thread(reader);
				thread.start();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("~~멀티루채팅꾸~~");
	}
}

class SSReader implements Runnable{
	
	private List<Socket> sockets;
	private Socket socket;
	
	public SSReader(List<Socket> sockets, Socket socket) {
		this.sockets = sockets;
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			while(true) {
				InputStream input = socket.getInputStream();
				byte[] data = new byte[1024];
				int readSize = input.read(data);
				
				String inputValue = new String(data, 0, readSize);
				System.out.println(inputValue);
				
				SSWriter writer = new SSWriter(sockets, socket);
				writer.broadcast(inputValue);
				writer = null;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class SSWriter {

	private List<Socket> sockets;
	private Socket inputSocket;
	
	public SSWriter(List<Socket> sockets, Socket socket) {
		this.sockets = sockets;
		this.inputSocket = socket;
	}
	
	public void broadcast(String message) {
		try {
			for (Socket socket : sockets) {
				if (socket == this.inputSocket) {
					continue;
				}
				OutputStream output = socket.getOutputStream();
				output.write(message.getBytes());
				output.flush();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}