/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.networking;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAJ
 */
public class messageTransmitter extends Thread {

    String message, hostname;
    int port;

    public messageTransmitter() {

    }

    public messageTransmitter(String message, String hostname, int port) {
        this.message = message;
        this.hostname = hostname;
        this.port = port;
    }

    @Override
    public void run() {
        try {
            Socket a = new Socket(hostname, port); //connects to the server socket
            a.getOutputStream().write(message.getBytes());
            a.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(messageTransmitter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

