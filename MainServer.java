package dev.Jogo;

import java.io.IOException;

public class MainServer {

    public static void main(String[] args) throws IOException {

        Server servidor = new Server(12345);
        System.out.println("Servidor encerrado.");
    }
}