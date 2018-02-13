/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAJ
 */
public class messageListner extends Thread {

    ServerSocket server;
    int portNumber = 8877;

    public messageListner() throws IOException {
        server = new ServerSocket(portNumber);

    }

    public messageListner(int port) throws IOException {
        this.portNumber = port;
        server = new ServerSocket(port);
    }

    @Override
    public void run() {
        Socket clientSocket;
        try {
            while((clientSocket = server.accept()) != null){
                
            }
        } catch (IOException ex) {
            Logger.getLogger(messageListner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
