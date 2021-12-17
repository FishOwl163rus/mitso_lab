import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSideProgram {

    //here we simply initialize socket, input & output streams

    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;
    private DataInputStream inputSrv = null;

    public ClientSideProgram(String address, Integer port) {

        //code to establish a connection
        try {
            socket = new Socket(address, port);
            input = new DataInputStream(System.in);

            // sends output to the socket
            output = new DataOutputStream(socket.getOutputStream());
            inputSrv = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line = "";
        while (!(line.equals("Done"))) {
            try {
                line = input.readLine();
                output.writeUTF(line);
                System.out.println(inputSrv.readUTF());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            input.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ClientSideProgram clientProgram = new ClientSideProgram("127.0.0.1", 5000);
    }
}
