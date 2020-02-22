package com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8;

/*
 * N.B: Il "Method References" è un modo per rendere il codice più corto riducendo il codice
 * 		che può essere inferito e menzionando semplicemente il nome del metodo. Come per le 
 * 		lambda expression, anche per il "method references" servirà del tempo per prendere confidenza
 * 		con la nuova sintassi.
 * 		Si supponga di avere una classe "Duck" con nome e peso come attributi.
 * 
 * 		com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8.Test.DuckHelper;
 * 		com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8.Test.Duck;
 * 
 * 		Ora pensiamo a come scrivere un "Comparator" per questa classe se volessimo ordinare
 * 		per "weight". Usando le lambda expression avremmo:
 * 
 * 			Comparator<Duck> byweight = (d1,d2) -> DuckHelper.compareByWeight(d1,d2);
 * 
 * 		Ma questo non è buono (non è la soluzione migliore). C'è un pò di ridondanza. 
 * 		Le lambda expression prendono due parametri	e non fanno nient'altro che passare questi 
 * 		parametri ad un'altro metodo. Java 8 ci permette di rimuovere questa ridondanza semplicemente 
 * 		scrivendo questo di seguito:
 * 
 * 			Comparator<Duck> byWeight = DuckHelper::compareByWeight;
 * 
 * 		L'operatore "::" dice a Java di passare i parametri automaticamente al metodo "compareByWeight".
 * 
 * 		N.B: DuckHelper::compareByWeight ritorna un'interfaccia funzionale e non un "int". Ricordarsi
 * 			 che l'operatore "::" è come le lambda expression, ed è tipicamente usato per l'esecuzione
 * 			 differita.
 * 
 * 		Esistono quattro formati per il "method references":
 * 
 * 			1- metodi statici;
 * 			2- metodi d'istanza su una particolare istanza;
 * 			3- metodi d'istanza su una istanza determinata a run-time;
 * 			4- costruttori;
 * 
 * 		In questo capitolo, useremo tre interfacce funzionali nei nostri esempi. Le useremo ancora
 * 		di più nei prossimi capitoli. Si è già studiato che, capitolo 2 "Design Patterns and Principles",
 * 		"Predicate" è un'interfaccia funzionale che prende un singolo parametro di qualsiasi tipo
 * 		e ritorna un booleano. Un'altra interfaccia funzionale è "Consumer", la quale prende un singolo
 * 		parametro di qualsiasi tipo ma non ritorna nulla (return void). Infine, "Supplier" non prende
 * 		nessun tipo di parametro e ritorna qualsiasi tipo.
 * 		Diamo un'occhiata a qualche esempio dalle Java API. In ogni gruppo di esempio, mostriamo 
 * 		la lambda expression equivalente. Ricorda che nessuno di questi "method references" sono 
 * 		in realtà chiamati nel codice che segue. Sono semplicemente disponibili per essere chiamati 
 * 		in futuro. 
 * 		Iniziamo con un metodo statico (formato 1-):
 * 
 *   		14: Consumer<List<Integer>> methodRef1 = Collections::sort;
 *   		15: Consumer<List<Integer>> lamda1 = l -> Collections.sort(l);
 *   
 *   	Sulla linea 14 viene chiamato un metodo con un solo parametro, e Java sa che dovrebbe creare
 *   	una lambda expression con un parametro e passarlo al metodo.
 *   	Aspetta un minuto. Noi sappiamo che il metodo "sort()" è overloaded. Come fa Java a sapere
 *   	che si vuole chiamare la versione che omette il comparator? Sia con le lambda expressione
 *   	che con i "method references", Java inferisce informazioni dal contesto. In questo caso, 
 *   	noi diciamo che stiamo dichiarando un "Consumer", il quale prende solo un parametro. 
 *   	Java cerca un metodo che match con questa descrizione. 
 *   	Il prossimo passo è chiamare un metodo d'istanza su una specifica instanza (formato 2-):
 *   	
 *   		16: String str = "abc";
 *   		17: Predicate<String> methodRef2 = str::startWith;
 *   		18: Predicate<String> lambda2 = s -> str.startWith(s);
 *   
 *    	La linea 17 mostra che si vuole chiamare "string.startWith()" e passare un singolo parametro
 *    	per essere fornito a run-time. Questo vorrebbe essere un buon metodo di filtrare i dati
 *    	in una lista. 
 *    	Poi, vine chiamato un metodo d'istanza senza saper l'istanza in anticipo (formato 3-):
 *    
 *    		19: Predicate<String> methodRef3 = String::isEmpty;
 *    		20: Predicate<String> lambda3 = s -> s.isEmpty();
 *    
 *    	La linea 19 dice che il metodo che si vuole chiamare è dichiarato nell'oggetto "String".
 *    	Sembra un metodo static ma non lo è. Invece, Java sa che "isEmpty" è un metodo d'istanza
 *    	che non prende nessun parametro. Java usa il parametro fornito a run-time come l'istanza 
 *    	sulla quale il metodo è chiamato. 
 *    	Infine, si ha un riferimento a costruttore (formato 4-):
 *    
 *     		21: Supplier<ArrayList> methodRef4 = ArrayList::new;
 *     		22: Supplier<ArrayList> lambda4 = () -> new ArrayList();
 *     
 *     	Il riferimento a costruttore è un tipo partciolare di "method references" che usa "new" invece
 *     	di un metodo, e crea un nuovo oggetto. E' un'espansione del "method refences" visto fino
 *     	ad ora. Si vedrà ancora il "method references" nel prossimo capitolo quando si parlerà di
 *     	altri tipi di interfacce funzionali. 
 * */

public class UsingMethodReferences {

}
