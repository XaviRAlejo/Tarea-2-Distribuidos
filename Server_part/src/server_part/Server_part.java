/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_part;

/**
 *
 * @author Ignacio Cofre
 */
public class Server_part {
     /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    	public static void main(String args[]) throws InterruptedException 
	{ 
            int port = 5000;
            int prioridad = 2;
            int num_maquinas = 2;
            String ip = "localhost";
            Server server2 = new Server(port,"server 2");
            server2.start();
            Thread.sleep(4000);
            //Client client = new Client("10.6.43.93", 5000); 
            //public Client(int port, String name,  int prioridad, String mensaje, String address)
            Client client2 = new Client(5001,"Client 2",prioridad,"saludos desde proceso 2",ip);
            client2.start();
            while(server2.get_message().size()<num_maquinas){
                Thread.sleep(2000);
            } 
            System.out.println("mensaje recibido desde main: "+server2.get_message());
            
            
            
            
	} 
    
}
