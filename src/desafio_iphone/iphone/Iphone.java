package desafio_iphone.iphone;

import desafio_iphone.internet.Safari;
import desafio_iphone.media.Itunes;
import desafio_iphone.menssagem.Sms;

public class Iphone implements Safari, Itunes, Sms {
	public void reproduzirMusica() {
		
		System.out.println("REPRODUZINDO MUSICA PELO IPHONE");
		
	}

	
	public void enviarMenssagem() {
		
		System.out.println("ENVIANDO MENSSAGEM PELO IPHONE"); 
		
	}

	
	public void AcessarInternet() {
		
		System.out.println("ENTRANDO NO SAFARI PELO IPHONE");
	}

}
