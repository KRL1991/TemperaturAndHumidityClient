import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        String host = "10.200.130.31";
        int port = 4501;
        String temp;
        String humd;

        Scanner inputScanner = new Scanner(System.in);

        try {
            Socket socket = new Socket(host, port);

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            new Thread(() -> {

                while (true) {
                    
                    DataInputStream inputStream;

                    try {
                        inputStream = new DataInputStream(socket.getInputStream());

                        System.out.println(inputStream.readUTF());

                        System.out.println(inputStream.readUTF());

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                
            }).start();

        } catch (Exception exception) {}
    }
}
