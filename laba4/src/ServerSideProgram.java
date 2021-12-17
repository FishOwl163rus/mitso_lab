import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static java.lang.Integer.parseInt;

public class ServerSideProgram {

    //initialize socket and input stream
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    private DataOutputStream output = null;

    // constructor with port
    public ServerSideProgram(int port) {
        // starts server and waits for a connection
        try {
            server = new ServerSocket(port);
            System.out.println("Server started::");

            System.out.println("Waiting for a client ........");

            socket = server.accept();
            System.out.println("Client accepted.");

            // takes input from the client socket
            in = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));
            output = new DataOutputStream(socket.getOutputStream());

            int i = 0;

            while (i != -1) {
                try {
                    float res;
                    i = parseInt(in.readUTF());
                    if(i < 100000 - 1){
                        res = i * 0.05f;
                        output.writeUTF("Tax of payer: " + res);
                        continue;
                    }

                    if (i >= 100000 && i <= 500000) {
                        res = i * 0.1f;
                        output.writeUTF("Tax of payer: " + res);
                        continue;
                    }

                    if (i > 500000) {
                        res = i * 0.15f;
                        output.writeUTF("Tax of payer: " + res);
                    }

                } catch (IOException ie) {
                    System.out.println(ie);
                }
            }
            System.out.println("Closing connection");

            // close connection
            socket.close();
            output.close();
            in.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ServerSideProgram serverSideProgram = new ServerSideProgram(5000);
    }

}