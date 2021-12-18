import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

class ChatServer extends Thread {
    public final static int PORT = 7331;
    private final static int BUFFER = 1024;

    private DatagramSocket socket;
    private ArrayList<InetAddress> clientAddresses;
    private ArrayList<Integer> clientPorts;
    private HashSet<String> existingClients;
    public ChatServer() throws IOException {
        socket = new DatagramSocket(PORT);
        clientAddresses = new ArrayList();
        clientPorts = new ArrayList();
        existingClients = new HashSet();
    }

    public void run() {
        byte[] buf = new byte[BUFFER];
        while (true) {
            try {
                Arrays.fill(buf, (byte)0);
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);

                String content = new String(packet.getData()).trim();
                var spl = content.split(" ");

                var x = Double.parseDouble(spl[0]);
                var y = Double.parseDouble(spl[1]);
                var z = Double.parseDouble(spl[2]);

                var res = ((2 * Math.cos(x - (3.14d / 6))) / (Math.exp(0.5) + Math.pow(Math.sin(y), 2))) * (1 + ((z * z) / ((3 - Math.pow(z, 5)) / 5)));
                InetAddress clientAddress = packet.getAddress();
                int clientPort = packet.getPort();

                String id = clientAddress.toString() + "," + clientPort;
                if (!existingClients.contains(id)) {
                    existingClients.add( id );
                    clientPorts.add( clientPort );
                    clientAddresses.add(clientAddress);
                }

                System.out.println(id + " : " + content);
                byte[] data = (id + " response: " +  res).getBytes();
                for (int i=0; i < clientAddresses.size(); i++) {
                    InetAddress cl = clientAddresses.get(i);
                    int cp = clientPorts.get(i);
                    packet = new DatagramPacket(data, data.length, cl, cp);
                    socket.send(packet);
                }
            } catch(Exception e) {
                System.err.println(e);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        ChatServer s = new ChatServer();
        s.start();
    }
}