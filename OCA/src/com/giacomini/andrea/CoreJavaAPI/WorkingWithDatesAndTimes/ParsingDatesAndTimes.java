package com.giacomini.andrea.OCA.CoreJavaAPI.WorkingWithDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
 * N.B: E' possibile convertire (parsing) facilmente una data o un time in un formato String.
 * 		Esattamente come il metodo "format()" anche il metodo "parse()" segue un formato.
 * 		Se non viene specificato un formato, il metodo "parse()" usa quello di default.
 */

public class ParsingDatesAndTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		DateTimeFormatter patternTime = DateTimeFormatter.ofPattern("hh:mm");
		DateTimeFormatter formatterTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		
		LocalDate date = LocalDate.parse("01 02 2015", f);
		LocalTime time = LocalTime.parse("11:22");
		
		System.out.println(date);		// 2015-01-02
		System.out.println(time);		// 11:22
	}

}
