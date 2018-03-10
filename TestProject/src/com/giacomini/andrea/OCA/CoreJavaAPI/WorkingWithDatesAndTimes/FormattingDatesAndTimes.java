package com.giacomini.andrea.OCA.CoreJavaAPI.WorkingWithDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
 * N.B: Sia la classe "Date" che la classe "Time" supportano molti metodi per ritornare la data e l'orario,
 * 		per esempio per visualizzare a video informazioni riguardo la data e l'orario. Questo però richiede del lavoro aggiuntivo.
 * 		JAVA fornisce una class "DateTimeFormatter" (package: java.time.format) che aiuta in questo lavoro.
 * 		Diversamente dalla classe "LocalDateTime" la classe "DateTimeFormatter" può essere usata per formattare
 * 		qualsiasi tipo di data e orario.
 */

public class FormattingDatesAndTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		
		System.out.println(date.getDayOfWeek());												// MONDAY
		System.out.println(date.getMonth());													// JANUARY
		System.out.println(date.getYear());														// 2020
		System.out.println(date.getDayOfYear());												// 20
		
		System.out.println();
		
		/*
		 * N.B: ISO è uno standard (di formato) per le date.
		 * 		Esistono diversi tipi di formati predefiniti sia per le date che per gli orari.
		 */
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date2, time);
		
		System.out.println(date2.format(DateTimeFormatter.ISO_LOCAL_DATE));						// 2020-01-20
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));						// 11:12:34
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));				// 2020-01-20T11:12:34
		
		// Stiamo dicendo che vogliamo un formato tipicp dell'area geografica a cui apparteniamo, in un predefinito formato.
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);		// formato per i LocalDate
		DateTimeFormatter shortDateTime2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);	// formato per i LocalTime
		DateTimeFormatter shortDateTime3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);// formato sia per i LocalDataTime
		
		System.out.println();
		
		/*
		 * N.B: Sia le classi "Date", "Time" e "DateTime", come qualsiasi altra classe Formatter ("DateTimeFormatter") 
		 * possiedono un metodo "format()".
		 */
		// MODO 1 equivalente al MODO 2
		System.out.println(shortDateTime.format(dateTime));										// 20/01/20
		System.out.println(shortDateTime.format(date));											// 20/01/20
//		System.out.println(shortDateTime.format(time));											// ECCEZIONE - UnsupportedTemporalTypeException
																								// Non è possibile formattare un "time"
																								// in un formato tipico per le "date".
		
		System.out.println();
		
		// MODO 2
		System.out.println(dateTime.format(shortDateTime));
		System.out.println(date.format(shortDateTime));
//		System.out.println(time.format(shortDateTime));
		
		/*
		 * N.B: I due tipi di formati predefiniti usati nell'esame OCA sono:
		 * 		
		 * 		- SHORT;
		 * 		- MEDIUM;
		 * 
		 * 		Gli altri tipi predefiniti dipendono dalla "time zone".
		 */
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time2 = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime2 = LocalDateTime.of(date3, time2);
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		
		System.out.println();
		
		System.out.println(dateTime2.format(shortF));											// 20/01/20 11:12:34												
		System.out.println(dateTime2.format(mediumF));											// 20-gen-2020 11:12:34
		
		// Sono equivalenti a quelle sopra.
//		System.out.println(shortF.format(dateTime2));
//		System.out.println(mediumF.format(dateTime2));
		
		/*
		 * N.B: E' anche possibile definire un proprio formato nel caso in cui quelli standard non soddisfano le proprie esigenze.
		 */
		DateTimeFormatter f  = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM  dd, yyyy, hh:mm");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM   dd, yyyy, hh:mm");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("M    dd, yyyy, hh:mm");
		
		System.out.println();
		System.out.println("dateTime2 with format f1: " + dateTime2.format(f1));
		
		// Il formato definito sopra (f) andrà bene solo per il tipo "LocalDateTime" visto che è stato definito come dovranno
		// essere visualizzate la date e l'orario. Infatti, de dovessimo usare questo stesso formato anche per "LocalDate" e "LocalTime"
		// questo causerebbe il lancio di una eccezione a run-time.
//		System.out.println(date3.format(f));
//		System.out.println(time2.format(f));
		
		System.out.println();
		
		/*
		 * Exam TEST
		 */
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
//		Period p2 = Period.of(1, 2);	ERRORE DI COMPILAZIONE - il metodo "of()" si aspetta una lista di 3 parametri int;
		
		System.out.println(d);				// 2015-05-10T11:22:33
		
		d = d.minus(p);

		System.out.println(d);				// 2014-03-07T11:22:33
		
		DateTimeFormatter formatterTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		DateTimeFormatter formatterDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		System.out.println();
		System.out.println(d.format(formatterTime));		// 11:22
		
		System.out.println();
		System.out.println(d.format(formatterDateTime));	// 07/03/14 11:22
	}

}
