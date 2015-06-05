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
import java.net.InetAddress;
import java.net.UnknownHostException;


public class Adressage {
	
	public static void main(String[] zero) {
		
		InetAddress LocaleAdresse ;
		InetAddress ServeurAdresse;
                
                
		try {

			//LocaleAdresse = InetAddress.getLocalHost().getAddress();
                        String Locathostname = InetAddress.getLocalHost().getHostName();
                        Locathostname = InetAddress.getLocalHost().getHostName();
			//System.out.println("L'adresse locale est : "+LocaleAdresse );
                        System.out.println("Le nom de l'hote est : "+Locathostname );
			
			ServeurAdresse= InetAddress.getByName("www.siteduzero.com");
                        System.out.println("L'adresse du serveur du site du zéro est : "+ServeurAdresse);
		
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}

}