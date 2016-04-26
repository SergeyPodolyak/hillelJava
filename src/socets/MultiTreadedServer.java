package socets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by User on 26.04.2016.
 */
public class MultiTreadedServer {
    private ServerSocket  serverSocket;

    public MultiTreadedServer(ServerSocket serverSocket) {
        try {
            this.serverSocket =new ServerSocket(3502);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void start(){
        try {
            while (true) {
                Socket socket = serverSocket.accept();
                MesageHandler handler = new MesageHandler(socket);
                Thread thread = new Thread(handler);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
