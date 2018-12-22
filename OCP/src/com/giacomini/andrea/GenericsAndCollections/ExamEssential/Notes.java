package com.giacomini.andrea.GenericsAndCollections.ExamEssential;

/*
 * N.B: I "Generics" sono tipi di parametri per il codice. Per creare una classe
 * 		con un parametro generico, bisogna aggiungere <T> prima del nome della classe.
 * 		Si può usare qualsiasi nome si voglia per il tipo di parametro. Generalmente
 * 		vengono scelte letterse singole maiuscole.
 * 		L'operatore <> (diamond) viene usato per dire a Java che il tipo generico 
 * 		corrisponde alla dichiarazione senza doverlo specificare nuovamente.
 * 		L'operatore <> può essere usato per le variabili locali o variabili d'istanza
 * 		noncché per le dichiarazioni su una linea.
 * 		I Generics permettono di specificare wildcards (*). 
 * 		
 * 		<?> è un "wildcard unbounded" che significa qualsiasi tipo. 
 * 		
 * 		<? extends Object> è un "upper bound" che significa qualsiasi tipo che 
 * 		è "Object" o che estende "Object".
 * 
 * 		<? extends MyInterface> significa qualsiasi tipo che implementa "MyInterface".
 * 
 * 		<? super Number> è un "lower bound" che significa qualsiasi tipo che è "Number"
 * 		o che sia super classe di "Number".
 * 
 * 		Risultano errori di compilazione del codice quando si tenta di aggiungere o 
 * 		rimuovere un'elemento in una lista con un "unbounded" o con un "upper-bound wildcard".
 * 		Quando si lavora con codice che non usa i "Generics" (conosciuto anche come codice
 * 		legacy o di tipo grezzo "raw type"), Java mostra dei warning al momento della compilazione.
 * 		Con un "compile warning" a differenza di un "compile error" il compilatore produce
 * 		comunque una file .class. Se si ignora un "compile warning" il codice potrebbe
 * 		lanciare un "ClassCastException" a run-time. L'"Unboxing" da un "compile error"
 * 		quando non vengono usati i "Generics".
 * 
 *    	//pagina 160 libro OCP
 * 		
 * */

public class Notes {

}
