package com.giacomini.andrea.OCA.BuildingBlocks.WriteAMainMethod;

/*
 * N.B: Quando si mettono due classi nello stesso file solo una delle due può essere di tipo PUBLIC.
 * 		Altrimenti da errore di compilazione.
 * 		In particolare la classe PUBLIC deve avere lo stesso nome del file.
 * 		Inoltre, in un file possono esistere due classi dove nessuna delle due è di tipo PUBLIC.
 * 		Una classe innestata all'interno di un'altra classe viene chiamata "Inner Class".
 */

public class MyClass {

	private String name;
	
	/*
	 * N.B: Il metodo "main" definisce l'"Entry point" della classe Java.
	 */
	// LEGAL
	//	public static void main(String name){}
	//	public static void main(String[] name){}
	//	public static void main(String name[]){}
	
	// NOT LEGAL
	// public static main(String args[]){}
	
	public static void main(String args[]){
		
		String firstWord = args[0];
		String secondWord = args[1];
		
		/*
		 * N.B: La Classe "System" è importanta in modo automatico dal sistema e quindi non � necessario fare l'import 
		 * 		del package associato.
		 * 		Infatti, tutto il pasckage "java.lang.*" (a cui appartiene anche System) è importanto automaticamente.
		 * 		
		 * 		Le altre classi presenti nello stesso package (com.giacomini.andrea.MyClass) della classe "Myclass" 
		 * 		NON devono essere importate. 
		 */
		System.out.print(firstWord);
		
		System.out.print(secondWord);
	}
}

class MyClass1{
	
}
