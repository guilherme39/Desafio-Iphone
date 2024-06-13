package desafio_iphone.programa;

import java.util.Scanner;

import desafio_iphone.internet.Internet;
import desafio_iphone.iphone.Iphone;
import desafio_iphone.media.Media;

public class Programa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Iphone iphone = new Iphone ();
		Internet internet = new Internet();
		
		 
		iphone.enviarMenssagem();
		iphone.reproduzirMusica();
		internet.AcessarInternet();
		iphone.AcessarInternet();
		
		
		scan.close();	
				
		
	

	}

}
