package dev.Jogo;

import dev.Jogo.Client;
import java.io.IOException;

public class MainClient {
    public static void main(String[] args) throws IOException {

        Client cliente = new Client("127.0.0.1",12345);
        System.out.println("Cliente saiu.");
    }
}