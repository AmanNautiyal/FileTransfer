/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketHandler;

import java.io.File;
import java.net.*;

/**
 *
 * @author Aman Nautiyal
 */
public class DataHandler {

    Socket socket;

    DataHandler(Socket s) {
        socket = s;
    }

    void sendFiles(File file, String dir) {
        if (file.isDirectory()) {
            File subfiles[] = file.listFiles();
            for (File f : subfiles) {
                sendFiles(f, dir + "/" + f.getName());
            }
        } else {
            sendFile(file, dir);
        }
    }

    private void sendFile(File file, String loc) {

    }
}
