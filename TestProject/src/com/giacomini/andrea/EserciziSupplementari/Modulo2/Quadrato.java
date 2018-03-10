package com.giacomini.andrea.EserciziSupplementari.Modulo2;

public class Quadrato {

	public int lato;
	public final int NUMERO_LATI = 4;
	
	public Quadrato(int lato){
		
		this.lato = lato;
	}
	
	public int perimetro(){
		
		int perimetro = lato * NUMERO_LATI; 
		return perimetro;
	}
	
	public int area(){
		int area = lato * lato;
		return area;
	}
}
