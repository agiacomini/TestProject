package com.giacomini.andrea.Exceptions.CallingMethodsThatThrowExceptions;

/*
 * N.B: Quando si sta chiamando un metodo che può lanciare una eccezione, le regole sono le stesse come all'interno di un
 * 		metodo.
 * 
 * 		Guarda l'esempio: com.giacomini.andrea.Exceptions.CallingMethodsThatThrowExceptions.Examples.Bunny;
 * 
 * 		Il problema di questo esempio è che "NoMoreCarrotsExcpetion" è una eccezione "checked". E quindi, essendo una eccezione
 * 		checked deve essere gestita o dichiarata. Il codice potrebbe compilare se il metodo "main()" cambiasse in questo modo:
 * 
 * 			public static void main(String[] args) throws NoMoreCarrotsExcpetion { // dichiara l'eccezione
 * 
 * 				eatCarrot();
 * 			}
 * 
 * 		oppure
 * 
 * 			public static void main(String[] args){
 * 
 * 				try{
 * 					
 * 					eatCarrot();
 * 	
 * 				} catch(NoMoreCarrotsExcpetion e) {	// gestisce l'eccezione
 * 					
 * 					System.out.println("sad rabbit");
 * 		
 * 				}
 * 			}
 * 
 * 		Si noti che "eatCarrot()" non ha lanciato una eccezione, si è solo dichiarato che potrebbe. Questo è sufficiente per il
 * 		compilatore per richiedere al chiamante di gestire o dichiarare l'eccezione.
 * 		Il compilatore è ancora alla ricerca di codice irraggiungibile. Dichiarare una eccezione non usata non è considerato
 * 		codice irraggiungibile. Da al metodo l'opzione di cambiare l'implementazione per lanciare una eccezione in futuro.
 * 
 * 		Guarda l'esempio: com.giacomini.andrea.OCA.Exceptions.CallingMethodsThatThrowExceptions.Examples.Bunny2;
 *
 */

public class CallingMethodsThatThrowExceptions  {

}
