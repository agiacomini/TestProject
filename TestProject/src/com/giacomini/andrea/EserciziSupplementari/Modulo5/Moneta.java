package com.giacomini.andrea.EserciziSupplementari.Modulo5;

/**
 * Questa classe astrae il concetto di Moneta.
 * 
 * @author Andrea Giacomini
 *
 */

public class Moneta {

	private int valore;
	private String valuta;
	// Variabile costante, in quanto tutte le monete saranno della stessa valuta;
	public static final String VALUTA_EURO = "EURO";
	
	public void setValore(int valore){
		this.valore = valore;
	}
	
	public int getValore(){
		return this.valore;
	}
	
	/**
	 * Costruttore che si aspetta come vincolo un valore da impostare come valore della moneta; 
	 * 
	 * @param valore
	 */
	public Moneta(int valore){
		this.valore = valore;
		this.valuta = VALUTA_EURO;
		System.out.println("Oggetto \"Moneta\" istanziato. Valore: " + formattaUnitaDiMisura(valore) + valuta);
	}
	
	/*
	 * Metodo di Utilità per la formattazione del testo;
	 */
	private static String formattaUnitaDiMisura(int valore){
		int resto = valore % 100;
		int euro = valore / 100;
		
		if (resto == 0){
			return Integer.toString(euro) + " "; 
		} else if (resto != 0 && euro > 0){
			return Integer.toString(euro) + " " + VALUTA_EURO + " e " + Integer.toString(resto) + " centesimi di ";
		} else {
			return valore + (valore == 1 ? " centesimo di " : " centesimi di ");
		}
		
	}
	
	public static void main(String[] args){
		
		if(args.length >= 1){
		
			Moneta moneta = new Moneta(Integer.valueOf(args[0]));
		}
		else {
			System.out.println("Il valore della moneta è obbligatorio!");
		}
		
	}
}
