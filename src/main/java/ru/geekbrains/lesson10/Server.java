package ru.geekbrains.lesson10;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{

    private final Socket socket;
    public Server(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            DataInputStream input = new DataInputStream(socket.getInputStream());
            while (true) {
                String msg = input.readUTF();
                System.out.printf("\nServer received from Client: %s", msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
       try(ServerSocket serverSocket = new ServerSocket(8080)) {
        System.out.println("Server is working...");
        Socket clientSocket = serverSocket.accept();
        new Server(clientSocket).start();
        }
    }
}