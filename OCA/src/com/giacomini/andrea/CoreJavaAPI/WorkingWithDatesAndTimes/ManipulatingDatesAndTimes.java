package com.giacomini.andrea.CoreJavaAPI.WorkingWithDatesAndTimes;

/*
 * N.B: Le classi "localDate" e "localTime" sono classi IMMUTABILI come le classi "String".
 * 		Significa che sarà necessario ricordarsi di assegnare il risultato di questi metodi ad un riferimento di variabile.
 * 		 
 */

import java.time.*;

public class ManipulatingDatesAndTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		
		System.out.println(date);										// 2014-01-20
		
		date = date.plusDays(2);
		
		System.out.println(date);										// 2014-01-22
		
		date = date.plusWeeks(1);
		
		System.out.println(date);										// 2014-01-29
		
		date = date.plusMonths(1);
		
		System.out.println(date);										// 2014-02-28
		
		date = date.plusYears(5);
		
		System.out.println(date);										// 2019-02-28
		
		/*
		 * N.B: Oltre a poter aggiungere valori agli oggetti LocalDate e LocalTime è possibile anche sottrarre valori.
		 */
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date2, time);
		
		System.out.println(dateTime);									// 2020-01-20T05:15
		
		dateTime = dateTime.minusDays(1);
		
		System.out.println("minusDay(1): " + dateTime);					// 2020-01-19T05:15
		
		dateTime = dateTime.minusHours(10);
		
		System.out.println("minusHours(10): " + dateTime);				// 2020-01-18T19:15
		
		dateTime = dateTime.minusSeconds(30);
		
		System.out.println("minusSeconds(30): " + dateTime);			// 2020-01-18T19:14:30
		
		System.out.println();
		
		/*
		 * N.B: A causa dell'IMMUTABILITA' delle classi "LoadDate" e "LoadTime" e "LocalDateTime" è molto importante prestare 
		 * 		attenzione che il valore di ritorno della chiamata di un metodo non sia ignorato.
		 */
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		// In questo esempio il valore di ritorno della chiamata del metodo "plusDay()" viene ignorato (non viene assegnato 
		// ad una nuova variabile) e quindi sarebbe come se nulla fosse accaduto.
		date3.plusDays(10);
		
		System.out.println(date3);										// 2020-01-20
		
//		date = date.plusMinutes(1);										// ERRORE DI COMPILAZIONE - non è possibile aggiungere 1 minuto
//																									ad un'oggetto LocalDate;
	}

}
