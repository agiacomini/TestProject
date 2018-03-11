package com.giacomini.andrea.OCA.CoreJavaAPI.WorkingWithDatesAndTimes;

/*
 * N.B: Esattamente come per gli "ArrayList" è necessario importare le classi appartenenti al package "java.time.*"
 * 		per poter lavorare con "Dates" e "Times".
 * 		Quando si lavora con "Dates" e "Times" è molto importante decidere di quante informazioni abbiamo bisogno.
 * 		Se per esempio si lavora con persone che stanno in una differente time zone sarà necessario specificare
 * 		anche quella. Per questo motivo è possibile scegliere tra 3 opzioni:
 * 
 * 			1- localDate: contiene solo una data, no time e no timezone (esempio la data del compleanno);
 * 			2- localTime: contiene solo time, no date e no timezone (per esemipo la mezzanotte);
 * 			3- localDateTime: contiene sia una date che un time, no timezone;
 * 
 *  	Oracle raccomanda di non usare timezone senza un reale bisogno. Se invece sarà necessario gestire anche la
 *  	timezone allora entrerà in gioco "ZonedDateTime".
 *  
 *  	Sia "LocalDate" che "LocalTime" non hanno un costruttore "pubic", questo perché forza l'uso dei metodi static.
 */

import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CreatingDatesAndTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ognuna delle tre classi "localTime", "localDate" e "localDateTime" ha un proprio metodo statico "now()"
		// che restituisce l'ora esatta.
		
		System.out.println(LocalDate.now());
		
		System.out.println(LocalTime.now());
		
		System.out.println(LocalDateTime.now());
		
		/*
		 *  Di seguito due modi (equivalenti) per creare una Date. Il metodo static "of()" prende in input
		 *  l'anno, il mese e il giorno. 
		 */
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
//		LocalDate date3 = LocalDate.of(2015, 1);	NON COMPILA - il metodo "of()" di LocalDate si aspetta 3 parametri;
		
		/*
		 *  Di seguito tre modi (equivalenti) di creare un Time. Il metodo static "of()" prende in input
		 *  ore, minuti, secondi e nanosecondi.
		 */
		LocalTime time1 = LocalTime.of(6, 15);						// ore e minuti
		LocalTime time2 = LocalTime.of(6, 15, 30);					// ore e minuti e secondi
		LocalTime time3 = LocalTime.of(6, 15, 30, 200);				// ore e minuti e secondi e nanosecondi
		
		/*
		 * Di seguito due modi (equivalenti) di combinare una Date con un Time. Il metodo static "of()" prende in
		 * input una serie di parametri oppure in alternativa è possibile passare in input un'oggetto LocalDate e un'oggetto
		 * LocalTime.
		 */
		LocalDateTime localDateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime localDateTime2 = LocalDateTime.of(date1, time1);
		
		System.out.println();
		System.out.println("LocalDateTime: " + localDateTime2);
		System.out.println();
		
		/*
		 * Sia "LocalDate" che "LocalTime" non hanno costruttori "public", questo per forzare l'uso dei metodi static.
		 * Quindi non è possibile costruire un oggetto "LocalDate" e "LocalTime" direttamente.
		 */
//		LocalDate date3 = new LocalDate();							// ERRORE DI COMPILAZIONE
		
		/*
		 * Se si dovessero sbagliare i parametri passati in input al metodo "of()" questo causerebbe il lancio
		 * di un'eccezione "DateTimeException".
		 */
//		LocalDate date4 = LocalDate.of(2015,  Month.JANUARY, 32);	// DateTimeExcpetion
		
		/*
		 * N.B: Prima di JAVA 8 creare un Date o Time era leggermente più tricky, e non era possibile distringuerli.
		 * 		Veniva creato un'oggetto Date che conteneva entrambi. 
		 */
//		import java.util.*;
//		Date d = new Date();
		
//		Calendar c = Calendar.getInstance();
//		Calendar c2 = GregorianCalendar(2015, Calendar.JANUARY, 1);
//		c.set(2015, Calendar.JANUARY, 1);
		
//		Date jan = c.getTime();
		

	}

}
