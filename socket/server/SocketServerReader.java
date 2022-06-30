package socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.List;

public class SocketServerReader implements Runnable{
	
	private List<Socket> sockets;
	private Socket socket;
	
	public SocketServerReader(List<Socket> sockets, Socket socket) {
		this.sockets = sockets;
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			while(true) {
				BufferedReader input =  new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String inputValue = input.readLine();
				String[] broadcastParams = inputValue.split(",");
				System.out.println(broadcastParams[0] + "> " + broadcastParams[1]);
				
				SocketServerWriter writer = new SocketServerWriter(sockets);
				writer.broadcast(broadcastParams[0], broadcastParams[1]);
				writer = null;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
