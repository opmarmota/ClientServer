package dev.Jogo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Server {

    public Server(int port) throws IOException {

        ServerSocket servidor = new ServerSocket(port);
        System.out.println("Porta "+ port +" aberta...");

        Socket cliente = servidor.accept();
        System.out.println("Cliente " +
                cliente.getInetAddress().getHostAddress() + " adicionado.");

        Scanner s = new Scanner(cliente.getInputStream());
        while (s.hasNextLine()) {
            Calendar c = Calendar.getInstance();
            Date Data = c.getTime();
            DateFormat formataData = DateFormat.getDateInstance();
            DateFormat hora = DateFormat.getTimeInstance();
            System.out.println(formataData.format(Data) + " " + hora.format(Data) + " : " + s.nextLine());
        }
        s.close();
        servidor.close();
        cliente.close();
    }

}