package com.giacomini.andrea.OCA.BuildingBlocks.DistinguishingObjectReferenceAndPrimitives;

/*
 * N.B: Un Reference Type si riferisce ad un oggetto (un'istanza di una classe).
 * 		A differenza dei tipi primitivi che contengono il valore in memoria dove la variabile è allocata,
 * 		i "reference" non contengono il valore dell'oggetto a cui si riferiscono MA l'indirizzo di memoria 
 * 		dove l'oggetto è allocato (un puntatore). 
 */

public class ReferenceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Date today; // Può contenere solo un riferimento ad un oggetto di tipo "Date";
		String greeting;	  // Può contenere solo un riferimento ad un oggetto di tipo String;
		
		/*
		 * N.B: E' possibile assegnare un valore ad un riferimento in due modi:
		 * 		- un riferimento può essere assegnato ad un'altro oggetto dello stesso tipo;
		 * 		- un riferimento può essere assegnato ad un nuovo oggetto usando la parola chiave "new";
		 */
		today = new java.util.Date(); // "today" punta ora ad un nuovo oggetto Date in memoria e sempre con il
									  // riferimento "today" è possibile accedere ai vari campi e metodi di questo oggetto.
		
		// PROVA di assegnamento tra riferimenti
		java.util.Date tomorrow;
		tomorrow = today;
		
		today.setTime(13);
		System.out.println(tomorrow.getTime());
		
		greeting = "How are you?"; // "greeting" punta invece ad un nuovo oggetto di tipo String.
		
		/*
		 * N.B: Gli oggetti Date e String che vengono referenziati rispettivamente da "today" e "greeting" 
		 * 		non hanno un nome e possono essere acceduti SOLO tramite il loro riferimento.
		 * 		Ai "Reference Type" a differenza delle "primitive" può essere assegnato un valore NULL, il che significa
		 * 		che non puntano a nessun oggetto. 
		 */ 
		greeting = null;
//		int i = null;	ERRORE DI COMPILAZIONE
		
		/*
		 * N.B: Un'altra differenza tra una primitiva e un refence è che le primitive non hanno metodi dichiarati.
		 */
		String reference = "Hello";
		int len = reference.length();
//		int bad = len.lenght(); ERRORE DI COMPILAZIONE
	}

}
