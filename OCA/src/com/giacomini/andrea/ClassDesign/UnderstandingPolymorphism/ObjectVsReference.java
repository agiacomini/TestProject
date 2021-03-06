package com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism;

/*
 * N.B: In JAVA tutti gli oggetti sono acceduti tramite riferimento, così come uno sviluppatore non si ha mai accesso diretto
 * 		all'oggetto stesso. Concettualmente, si dovrebbe considerare l'oggetto come l'entità che esiste in memoria, allocata dalla 
 * 		JAVA runtime environment. Indipendentemente dal il tipo del riferimento che si ha per l'oggetto in memoria, l'oggetto stesso 
 * 		non cambia. Per esempio, visto che tutti gli oggetti ereditano da "java.lang.Object", questi possono essere tutti riassegnati
 * 		a "java.lang.Object", come per esempio:
 * 
 * 			Lemur lemur = new Lemur();
 * 
 * 			Object lemurAsObject = lemur;
 * 
 * 		Anche se l'oggetto "Lemur" è stato assegnato ad un riferimento con un tipo differente, l'oggetto stesso non è cambiato
 * 		ed esiste ancora come oggetto "Lemur" in memoria. Quello che è cambiato, è la nostra abilità di accedere ai metodi all'interno
 * 		della classe "Lemur" con il riferimento "lemurAsObject". Senza un esplictio cast all'indietro, che vedremo nella prossima
 * 		sezione, non avremo più accesso alle proprietà Lemur dell'oggetto.
 * 		Di seguito le due regole da seguire:
 * 
 * 			1- Il tipo dell'oggetto determina quali proprietà esistono all'interno dell'oggetto in memoria;
 * 
 * 			2- Il tipo del riferimento all'oggetto determina quali metodi e variabili sono accedibili dal programma JAVA;
 * 
 * 		Ne consegue che, la modifica con successo di un riferimento ad un'oggetto ad un nuovo tipo di riferimento può dare accesso 
 * 		a nuove proprietà dell'oggetto, ma queste proprietà esistevano anche prima della modifica del riferimento.
 * 		 
 */

public class ObjectVsReference {

}
