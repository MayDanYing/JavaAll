package ru.geekbrains.lesson10;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nClient--->Server: enter message");
                String msg = scanner.nextLine();
                try {
                    output.writeUTF(msg);
                    output.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}