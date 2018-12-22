package com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8;

import java.util.function.BiFunction;

/*
 * N.B: Java 8 ha aggiunto un numero di nuovi metodi sull'interfaccia "Map".
 * 		Nell'esame "OCP" è stato menzionato solo il metodo "merge()". Altri due metodi,
 * 		"computeIfPresent()" e "computeIfAbsent()", saranno spiegati ora.
 * 		Qualche volta si ha la necessità di aggiornare il valore per una specifica chiave in
 * 		una mappa. Ci sono alcuni modi per fare questa attività. Il primo è sostituire l'esistente
 * 		valore incondizionatamente:
 * 
 *  		Map<String,String> favorites = new HashMap<>();
 *  		favorites.put("Jenny","Bus Tour");
 *  
 *  		favorites.put("Jenny", "Tram");
 *  		System.out.println(favorites);		// {Jenny=Tram}
 *  
 *  	C'è un'altro metodo, chiamato "putIfAbsent()", che si può chiamare se si vuole impostare
 *  	un valore nella mappa, ma questo metodo lo salta se il valore è già impostato su un
 *  	valore non "null":
 *  
 *  		Map<String,String> favorites2 = new HashMap<>();
 *  		favorites2.put("Jenny","Bus Tour");
 *  		favorites2.put("Tom",null);
 *  
 *  		favorites2.putIfAbsent("Jenny","Tram");
 *  		favorites2.putIfAbsent("Sam","Tram");
 *  		favorites2.putIfAbsent("Tom","Tram");
 *  		System.out.println(favorites2);		// {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
 *  
 *  	Come si può vedere, il valore di "Jenny" non viene aggiornato perché già presente e diverso
 *  	da "null". "Sam" non c'era ancora (come chiave), così lui viene aggiunto per la prima 
 *  	volta. "Tom" era presente come chiave MA aveva assegnato un valore "null". Per questo motivo
 *  	è stato aggiunto il valore nuovo (o per meglio dire il suo vecchio valore "null" è stato
 *  	aggiornato con il valore nuovo).
 *  	Questi due metodi ("put" e "putIfAbsent") gesticono semplicemente le sostituzioni di valore.
 *  	Qualche volta, si ha bisogono di più logica per determinare quale valore dovrebbe 
 *  	essere usato. Le sezione seguente mostra tre approcci.
 *  
 *  	IL METODO MERGE ---------------------------------------------------------------------------
 *  	Il metodo "merge()" permette di aggiungere logica al problema di cosa scegliere.
 *  	Supponiamo che i nostri ospiti siano indecisi e non riescono a scegliere un favorito.
 *  	Sono d'accordo che la corsa che ha il nome più lungo deve essere la più divertente.
 *  	E' possibile scrivere del codice per esprimere questa situazione passando una funzione
 *  	di mappatura al metodo "merge()":
 *  
 *  	com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8.Test.MergeMethodTest;
 *  
 *  	La linea "BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;"
 *  	usa un'interfaccia funzionale chiamata "BiFunction". In questo caso, questa interfaccia
 *  	prende due parametri dello stesso tipo e ritorna un valore sempre di quel tipo.
 *  	La nostra implementazione ritorna il nome più lungo.
 *  	La linea "String jenny = favorites.merge("Jenny", "Skyride", mapper);" chiama questa
 *  	funzione di mappatura, e questa verifica che "Bus Tour" è un nome più lungo di "Skyride",
 *  	quindi lascia il valore "Bus Tour". 
 *  	La linea "String tom = favorites.merge("Tom", "Skyride", mapper);" chiama di nuovo questa
 *  	funzione di mappatura. Questa volta "Tram" non è un nome più lungo di "Skyride", quindi
 *  	la mappa viene aggiornata.
 *  	La linea "System.out.println(favorites);" stampa il nuovo contenuto della mappa.
 *  	Le linee "System.out.println(jenny);" e "System.out.println(tom);" mostrano che il risultato
 *  	viene restituito dal metodo "merge()".
 *  	Il metodo "merge()" ha anche una logica per cosa succede quando si incontra un valore "null"
 *  	e per quando manca la chiave. In questo caso, non chiama "BiFunction" e usa semplicemente
 *  	il nuovo valore:
 *  
 *  	com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8.Test.MergeMethodTest;
 *  
 *  	Si noti come la funzione di mappatura non viene chiamata. Se lo fosse (se venisse chiamata)
 *  	si avrebbe un "NullPointerException". La funziona di mappatura è usata solo quando ci sono due
 *  	valori tra cui decidere.
 *  	L'ultima cosa da sapere circa il metodo "merge()" è cosa accade quando la funzione di 
 *  	mappatura viene chiamata e ritorna "null". Quando succede questa situazione la chiave viene rimossa:
 *  
 *  	com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8.Test.MergeMethodTest;
 *  
 *  	"Tom" è stato lasciato perché non c'è una chiamata al metodo "merge()" per quella chiave. "Sam" è
 *  	stato aggiunto perché questa chiave non era presente nella lista originale. "Jenny" invece è stata
 *  	rimossa perché la funzione di mappatura ritorna "null".
 *  	Si vedrà ancora il metodo "merge()" nel prossimo capitolo.
 *  
 *  	"COMPUTEIFPRESENT" AND "COMPUTEIFABSENT" -------------------------------------------------------
 *  	Questi due metodi sono nell'esame upgrade ma non nell'esame OCP classico.
 *  	In poche parole, il metodo "computeIfPresent()" chiamata l'interfaccia funzionale
 *  	"BiFunction" se la chiave richiesta viene trovata.
 *  
 *  	com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8.Test.ComputeIfPresentMethodTest;
 *  
 *  	L'interfaccia funzionale è ancora una "BiFunction". Comunque, questa volta sono passati
 *  	la chiave e il valore piuttosto che due valori. Proprio come per il metodo "merge()", il 
 *  	valore di ritorno è il risultato di ciò che è cambiato nella mappa oppure "null" se questo
 *  	non è applicato.
 *  
 *   	Per il metodo "computeIfAbsent()", l'interfaccia funzionale viene eseguita solo quando
 *   	la chiave non è presente o è "null":
 *   
 *   	com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8.Test.ComputeIfAbsentMethodTest;
 *   
 *   	Dal momento che non ci sono già valori nella mappa, viene usata una "Function" piuttosto
 *   	che una "BiFunction". Solo la chiave viene passata come input. Come si può vedere,
 *   	il valore di "Jenny" non è cambiato perché la chiave è già presente nella mappa. Il valore
 *   	di "Tom" è aggiornato perché il suo valore "null" viene considerato come non presente.
 *   	Se la funzione di mappatura è chiamata e ritorna un valore "null", la chiave viene rimossa
 *   	dalla mappa per il metodo "computeIfPresent()". Per il metodo "computeIfAbsent()" invece
 *   	la chiave non è mai aggiunta alla mappa, per esempio: 
 *  	
 *  	com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8.Test.ComputeIfAbsentMethodTest;
 *  
 *  	Dopo l'esecuzione di questo codice "Test2", la mappa è vuota. La chiamata al metodo
 *  	"computeIfPresent()" rimuove la chiave dalla mappa. La chiamata al metodo "computeIfAbsent()"
 *  	non aggiunge una chiave.
 *  
 *  	 ------------------------------------------------------------------------------------------
 *  	|	Scenario				merge()				computeIfPresent()		computeIfAbsent()  |	
 *  	|------------------------------------------------------------------------------------------|
 *  	|																						   |
 *  	|	chiave già presente		risultato della		nessuna azione			risultato della	   |
 *  	|	nella mappa				funzione									funzione		   |
 *  	|																						   |
 *  	|	chiave non presente		aggiunge un nuovo	risultato della			nessuna azione	   |
 *  	|	nella mappa				valore alla mappa	funzione								   |
 *  	|																						   |
 *  	|	interfaccia				BiFunction (prende	BiFunction(prende		Function(prende	   |
 *  	|	funzionale				(il valore di		la chiave e il valore	la chiave e ritorna|
 *  	|							uscita e il nuovo	esistente. Ritorna il	il nuovo valore)   |
 *  	|							valore)				nuovo valore)							   |
 *  	|																						   |
 *  	--------------------------------------------------------------------------------------------
 *  
 *  	----------------------------------------------------------------------------------------------------------
 *  	|	Key has					Mapping				merge			computeIfAbsent		computeIfPresent	  |
 *  	|							functions return															  |
 *  	|																					  					  |
 *  	|---------------------------------------------------------------------------------------------------------
 *  	|																										  |
 *  	|	null value in			null				remove key		do not change		do not change		  |
 *  	|	mapp;										from map;		map;				map;				  |
 *  	|																										  |
 *  	|	null value in			Not null			Set key to		Add key to map		Do not change		  |
 *  	|	map;										mapping			with mapping		map;				  |
 *  	|												function 		function result							  |
 *  	|												result;			as value;								  |
 *  	|																										  |
 *  	|	Non-null value			null				Remove key		Do not change		Remove key from		  |
 *  	|	in map										from map;		map;				map;				  |
 *  	|																										  |
 *  	|	Not null value			Not null			Set key to		Do not change		Set key to mapping	  |		
 *  	|	in map										mapping			map;				function result;	  |
 *  	|												function												  |
 *  	|												result;													  |
 *  	|																										  |
 *  	|	Key not in map			null				Add key to		Do not change		Do not change		  |
 *  	|												map;			map;				map;				  |
 *  	|																										  |
 *  	|	Key not in map			Not null			Add key to		Add key to map		Do not change		  |
 *  	|												map;			with mapping		map;				  |
 *  	|																function result							  |
 *  	|																as value;								  |
 *  	|---------------------------------------------------------------------------------------------------------|
 * */

public class UsingNewJava8MapAPIs {

}
