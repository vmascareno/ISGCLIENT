/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author vmascareno
 */
public abstract class Client {

    protected final Socket socket;

    public Client() throws IOException {
        socket = new Socket("192.168.0.16", 1406);
    }

}
