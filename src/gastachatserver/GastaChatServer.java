/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gastachatserver;

/**
 *
 * @author gcarvalh
 */
import java.io.*;
import java.net.*;

public class GastaChatServer {
 public static ServerSocket ss = null;
 public static Thread t;

 
	public static void main(String[] args) {
		
		try {
			ss = new ServerSocket(2009);
			System.out.println("Le serveur est à l'écoute du port "+ss.getLocalPort());
			
			t = new Thread(new Accepter_connexion(ss));
			t.start();
			
		} catch (IOException e) {
			System.err.println("Le port "+ss.getLocalPort()+" est déjà utilisé !");
		}
	
	}

	
}