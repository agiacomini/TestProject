package com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism;

/*
 * N.B: Nell'esempio "com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism.Examples.Lemur;" si è creata una singola istanza
 * 		dell'oggetto "Lemur" e si è acceduto ad esso tramite un riferimento di superclasse (Primate) e tramite un riferimento d'interfaccia
 * 		(HasTail). Una volta che si è cambiato il tipo di riferimento, si perde l'accesso a metodi specifici definiti nella sotto-classe
 * 		"Lemur" che ancora esistono all'interno dell'oggetto.
 * 		E' possibile rivendicare quei riferimenti castando (cast) all'indietro l'oggetto alla specifica sotto-classe da cui proviene:
 * 
 *    		Primate primate = lemur;
 *    		Lemur lemur2 = primate; 	NON COMPILA -
 *    
 *    		Lemur lemur3 = (Lemur)primate;
 *    		System.out.println(lemur3.age)
 *    
 *    	In questo esempio, si prova prima a convertire all'indietro il riferimento "primate" ad un riferimento "lemur2" senza
 *    	un esplicito cast. Il risultato è che il codice non compilerà. Nel secondo esempio però, viene castato esplicitamente
 *    	l'oggetto alla sotto-classe dell'oggetto "Primate" e così di ottiene l'accesso a tutti i metodi disponibili nella classe
 *    	"Lemur".
 *    
 *     	Di seguito le regole per il cast:
 *     
 *     		1- Castare un'oggetto da una sotto-classe ad una super-classe non richiede un'esplicito cast;
 *     
 *     		2- Castare un'oggetto da una super-classe ad una sotto-classe richiede un'esplicito cast;
 *     
 *     		3- Il compilatore non permette cast tra tipi non correlati;
 *     
 *     		4- Anche quando il codice compila senza problemi, potrebbe essere lanciata un'eccezione a run-time se l'oggetto
 *     		   che viene castato non è un'istanza di quella classe;
 *     
 *      La 3 regola è molto importante, infatti nell'esame si potrebbero trovare dei cast che il compilatore non permetterebbe.
 *      (nell'esempio precedente era possibile castare un riferimento di tipo "Primate" ad un riferimento di tipo "Lemur" perché
 *      "Lemur" è una sotto-classe di "Primate" e quindi relazionate tra di loro).
 *      
 *      Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism.Examples.Bird;
 *      				   com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism.Examples.Fish;
 *      
 *      Il casting non è senza limitazioni. Anche se due classi sono relazionate tra di loro da una gerarchia di classe, questo
 *      non significa che un'istanza di una può essere castata in modo automatico nell'altra.
 *      
 *      Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism.Examples.Rodent;
 *      				   com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism.Examples.Capybara;
 *      
 *      Il codice compila senza errori, ma lancerà un eccezione "ClasCastException" in quanto l'oggetto che si referenzia non è
 *      un'istanza della classe "Capybara". La cosa da tenere in mente in questo esempio è che l'oggetto creato non è in relazione
 *      in alcun modo con la classe "Capybara".
 *      
 *      Durante l'esame, essere sicuri di ricordare qual'è l'istanza dell'oggetto, poi allora focalizzarsi se il compilatore
 *      permetterà all'oggetto di essere refenziato con o senza cast esplicito.  
 */

public class CastingObjects {

}
