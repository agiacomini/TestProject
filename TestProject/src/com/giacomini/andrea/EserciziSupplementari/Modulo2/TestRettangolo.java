package com.giacomini.andrea.EserciziSupplementari.Modulo2;

public class TestRettangolo {

	public static void main(String[] args){
		
		Rettangolo rettangolo1 = new Rettangolo(3,4);
		Rettangolo rettangolo2 = new Rettangolo(5,7);
		
		int perimetro1 = rettangolo1.perimetro();
		System.out.println("Il perimetro del rettangolo 1: " + perimetro1);
		
		int area1 = rettangolo1.area();
		System.out.println("L'area del rettangolo 1: " + area1);
		
		int perimetro2 = rettangolo2.perimetro();
		System.out.println("Il perimetro del rettangolo 2: " + perimetro2);
		
		int area2 = rettangolo2.area();
		System.out.println("L'area del rettangolo 2: " + area2);
	}
}
