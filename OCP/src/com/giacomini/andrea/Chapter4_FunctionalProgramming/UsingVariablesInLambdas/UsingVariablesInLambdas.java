package com.giacomini.andrea.FunctionalProgramming.UsingVariablesInLambdas;

/*
 * N.B: Intro:
 * 
 * 		Arrivati a questo punto si dovrebbe essere confidenti sia con 
 * 		la sintassi delle "lambda expression" sia con la sintassi
 * 		dei "method references". Eventualmente ripassare i capitoli
 * 		2 "Design Pattern and Principles" e 3 "Generics And Collections".
 * 		In questo capitolo si aggiungerà a questi argomenti anche la
 * 		programmazione funzionale, focalizzandoci sugli Stream API.
 * 		Si noti che gli Stream API in questo capitolo verranno usati per
 * 		la programmazione funzionale. Al contrario, esistono anche gli
 * 		stream "java.io" di cui discuteremo nel capitolo 8 "IO".
 * 		In questo capitolo, introdurremo molte altre interfacce funzionali
 * 		e le classi "Optional". Poi si introdurrà lo "Stream" pipeline e li
 * 		metteremo tutti insieme.
 * 
 * 		Using Variables In Lambdas:
 * 
 * 		Nel capitolo 1 "Advanced Class Design" si è parlato dell'idea 
 * 		"effectively final" (efficacemente).
 * 		Questo significa che se si aggiunge il modificatore "final" ad una
 * 		variabile locale, questa diventa efficacemente final. Le lambda
 * 		usano le stesse regole di accesso delle "inner classes".
 * 		Le lambda expression possono accedere a variabili statiche, variabili
 * 		d'istanza, "effectively final" parametri dei metodi e infine anche a 
 * 		"effectively final" variabili locali.
 * 
 *  	com.giacomini.andrea.FunctionalProgramming.UsingVariablesInLambdas.Test.Gorilla;
 *      com.giacomini.andrea.FunctionalProgramming.UsingVariablesInLambdas.Test.GorillaFamily;
 *  
 *  	Sulla linea "play(() -> walk);" viene usata una variabile d'istanza nella lambda.
 *  	Sulla linea "play(() -> baby ? "hitch a ride" : "run");" viene usato il parametro
 *  	"baby" del metodo "everyonePlay()". Si sa che si tratta di un parametro 
 *  	"effectively final" perché non ci sono altri ri-assegnamenti per quella variabile.
 *  	Se venisse de-commentata la linea "approach = "run";" ci sarebbe un ri-assegnamento
 *  	per la variabile locale "approach" e così questa variabile locale non sarebbe più
 *  	"effectively final". Questo, causerebbe di conseguenza un errore di compilazione 
 *  	alla riga "play(() -> approach);" dove si cerca di accedere ad una variabile locale
 *  	che in realtà non è più una variabile locale "effectively final".
 *  	
 *  	Si applicano ancora le normali regole per il controllo dell'accesso. Per esempio,
 *  	una lambda non può accedere a variabili "private" di un'altra classe.
 *  	Le lambda possono accedere ad un sottoinsieme di variabili che possono essere
 *  	accessibili, ma non più di questo.  
 *  	 
 * */

public class UsingVariablesInLambdas {

}
