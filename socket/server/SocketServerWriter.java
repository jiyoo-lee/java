package socket.server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

public class SocketServerWriter {

	private List<Socket> sockets;
	
	public SocketServerWriter(List<Socket> sockets) {
		this.sockets = sockets;
	}
	
	public void broadcast(String clientName, String message) {
		try {
			String outputMessage = clientName + "> " + message;
			for (Socket socket : sockets) {
				OutputStream output = socket.getOutputStream();
				output.write(outputMessage.getBytes());
				output.flush();
				output.close();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
