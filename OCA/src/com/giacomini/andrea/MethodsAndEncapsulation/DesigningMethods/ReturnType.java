package com.giacomini.andrea.MethodsAndEncapsulation.DesigningMethods;

/*
 * N.B: Il tipo di ritorno potrebbe essere un tipo JAVA come una String o un int.
 * 		Se non c'è un tipo di ritorno deve essere specificata la parola chiave void come alternativa.
 * 		Void significa "senza contenuto".
 * 		Nella dichiarazione di un metodo non può essere omesso il valore di ritorno.
 * 		Quando viene specificato un tipo di ritorno diverso da "void" allora nel corpo del metodo ci dovrà essere
 * 		sicuramente uno statement "return" che specifica il valore da ritornare (primitva o oggetto che sia).
 * 		Per i metodi nei quali è stato dichiarato void come valore di ritorno, nel corpo del metodo allora ci potrà o NON
 * 		potrà essere lo statement "return".
 */

public class ReturnType {
	
	public void walk1(){}
	public void walk2(){ return; }
	public String walk3(){ return ""; }
//	public String walk4(){ }					// NON COMPILA - manca lo statement "retunr" nel corpo del metodo;
//	public walk5(){ }							// NON COMPILA - manca il tipo di ritorno nella dichiarazione del metodo;
//	String walk6(int a){ if(a==4) return "";}	// NON COMPILA - lo statement "return" a seconda del parametro di input può
												//               o non può essere raggiunto;
	
	/*
	 * N.B: Quando si ritorna un valore è necessario che questo sia assegnabile al tipo di ritorno.
	 */
	int integer(){
		
		return 9;
	}
	
//	int longg(){
//		
//		return 9L;								// NON COMPILA - il valore ritornato non coincide con il valore di ritorno; 
//	}
	
	int integerExpanded(){
		
		int temp = 9;
		return temp;
	}
	
//	int longgExpanded(){						// NON COMPILA - il valore di ritornato, anche se in modo indiretto, non coincide
//												//               con il valore di ritorno nella dichiarazione del metodo;
//		int temp = 9L;
//		return temp;
//	}

}
