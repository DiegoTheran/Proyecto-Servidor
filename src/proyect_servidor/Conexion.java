/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect_servidor;


import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/** 
 *
 * @author USER
 */
public class Conexion { //CON ESTA CLASE SE PUEDE CONECTAR UN SERVIDOR O UN CLIENTE
    private final int PUERTO = 1234; //Puerto para la conexion
    private final String HOST = "localhost"; //host para la conexion
    protected String mensajeServidor; // Mensajes entrantes (recibidos)
    protected ServerSocket ss; //Socket del server
    protected Socket cs; //Socket cliente
    protected DataOutputStream salidaServidor, salidaCliente;
    
    public Conexion (String tipo) throws IOException{
        //constructor
        if(tipo.equalsIgnoreCase("servidor")){
            ss = new ServerSocket(PUERTO); // Se crea el socket para el puerto 1234
            cs = new Socket(); //socket para el cliente
        }
        else{
            cs = new Socket(HOST,PUERTO); //
        }
    }
        
}

