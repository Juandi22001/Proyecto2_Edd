

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class Servidor {

    public Servidor() {
    }
    
    void Servidor() throws IOException{
              
        while(true){
        final int Port=500;
        byte []buffer = new byte[1024];
 
        try {
            DatagramSocket UDP= new DatagramSocket(Port);
            System.out.println("Servidor Iniciado");
          
            
          DatagramPacket peticion= new DatagramPacket(buffer , buffer.length);
            
            UDP.receive(peticion);
            
           UDP.receive(peticion);
                       String Mensaje= new String(peticion.getData());
                       System.out.println(Mensaje);
                       int PortCliente=peticion.getPort();
                       InetAddress direccion= peticion.getAddress();
                       DatagramPacket Respuesta= new DatagramPacket(buffer, buffer.length,direccion,PortCliente);
                       UDP.send(Respuesta);
                       

        } catch (SocketException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}
    
    
}
