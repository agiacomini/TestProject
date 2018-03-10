package com.giacomini.andrea.EserciziSupplementari.Modulo5;

public class Moneta2 {

	private final int valore;
	// Variabile costante, in quanto tutte le monete saranno della stessa valuta;
	public static final String VALUTA_EURO = "EURO";
	private String valuta = VALUTA_EURO;
	
	public int getValore(){
		return this.valore;
	}
	
	/**
	 * Costruttore che si aspetta come vincolo un valore da impostare come valore della moneta; 
	 * 
	 * @param valore
	 */
	public Moneta2(int valore){
		this.valore = valore;
		System.out.println("Oggetto \"Moneta\" istanziato. Valore: " + valore + " Valuta: " + valuta);
	}
	
	public static void main(String[] args){
		
		if(args.length >= 1){
		
			Moneta2 moneta = new Moneta2(Integer.valueOf(args[0]));
		}
		else {
			System.out.println("Il valore della moneta è obbligatorio!");
		}
		
	}
}
