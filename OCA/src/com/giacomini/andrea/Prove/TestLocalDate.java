package com.giacomini.andrea.Prove;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestLocalDate {

	public static void main(String[] args){
		
//		LocalDate localDate1 = LocalDate.now();
//		System.out.println(localDate1);
		
		DateTimeFormatter format = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(LocalDate.now().format(format));
		
		System.out.println();
		
		LocalDate localDate2 = LocalDate.of(2012, Month.APRIL, 1).plusMonths(-1);
		System.out.println(localDate2);
		
		System.out.println();
		
		// N.B: Le classi LocalDate/LocalTime/Period non permette il "chainging" (concatenamento) dei metodi, cioè i metodi 
		//		"minusMonths()", "plusDays()", ecc non sono richiamabili uno di seguito all'altro.	
		//		Viene preso in considerazione sempre e SOLO l'ultimo metodo chiamato;
		LocalDate localDate3 = LocalDate.of(2013, Month.APRIL, 1).minusMonths(-1).plusDays(-5);
		System.out.println(localDate3);
		
		System.out.println();
		
		LocalDate localDate4 = LocalDate.of(2014, Month.APRIL, 1);
		Period period1 = Period.of(1, 1, 3);
		Period period2 = Period.of(-1, 2, 3);
		
		System.out.println("LocalDate original: " + localDate4);
		LocalDate localDateUpdate = localDate4.minus(period2);
//		System.out.println(localDate4.minus(period1));
		System.out.println("LocalDate update: " + localDateUpdate);
		System.out.println(localDate4);
		
	}
}
