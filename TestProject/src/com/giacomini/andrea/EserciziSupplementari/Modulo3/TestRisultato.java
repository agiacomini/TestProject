package com.giacomini.andrea.EserciziSupplementari.Modulo3;

public class TestRisultato {

	public static void main(String[] args){
		
//		Risultato risultato = new Risultato();
		Risultato risultato = new Risultato(5.0F);
		
//		System.out.println(risultato.risultato);
		risultato.stampa();
		
		CambiaRisultato cambiaRisultato = new CambiaRisultato();
		cambiaRisultato.cambiaRisultato(risultato);
		
//		System.out.println(risultato.risultato);
		risultato.stampa();
	}
}
