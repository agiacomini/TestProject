package com.giacomini.andrea.chapter1.creatingAndDestroyingObjects;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* It is often appropriate to reuse a single object instead of creating a new 
 * functionally equivalent object each time it is needed. 
 * An object can always be reused if it is "immutable". You can also reuse
 * mutable objects if you know they won't be modified.
 * 
 * */

public class AvoidCreatingUnnecessaryObjects 
{
	private final Date birthDate = Calendar.getInstance().getTime();
	
	// BAD VERSION - DON'T DO THIS!!!
	// This version of method unnecessarily creates a new Calendar, TimeZone, and
	// two Date instances each time it is invoked.
	
//	public boolean isBabyBoomer()		// baby boomer: person was born between 1946 - 1964
//	{
//		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
//		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
//		Date boomStart = gmtCal.getTime();
//		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
//		Date boomEnd = gmtCal.getTime();
//		return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
//	}
	
	// The starting and ending dates of the baby boom. They are mutable objects that
	// are never modified once their values have been computed;
	// Changing "boomStart" and "boomEnd" from local variable to static final fields
	// makes it clear that these dates are treated as constants, making the code more
	// understandable;
	private static final Date BOOM_START;
	private static final Date BOOM_END;
	
	// The improved version creates Calendar, TimeZone and Date instances only once,
	// when it is initialized; 
	
	// Static initialization
	static
	{
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		calendar.set(1946, Calendar.JANUARY, 1, 0 ,0 ,0);
		BOOM_START = calendar.getTime();
		calendar.set(1965, Calendar.JANUARY, 1, 0 ,0 ,0);
		BOOM_END = calendar.getTime();
	}
	
	public boolean isBabyBoomer()
	{
		return birthDate.compareTo(BOOM_START) >= 0 &&
				birthDate.compareTo(BOOM_END) < 0;
	}
	
	public static void main( String[] args ) 
	{
		AvoidCreatingUnnecessaryObjects avoidCreatingUnnecessaryObjects = 
				new AvoidCreatingUnnecessaryObjects();
		avoidCreatingUnnecessaryObjects.isBabyBoomer();
		System.out.println( avoidCreatingUnnecessaryObjects.birthDate.toString() +  
				" " + avoidCreatingUnnecessaryObjects.isBabyBoomer() );
	}
}

/* There's a new way to create unnecessary objects in release 1.5. 
 * It is called "autoboxing". Autoboxing blurs but does not erase the distinction
 * between primitive and boxed primitives type.
 * The lesson here is clear: prefer primitives to boxed primitives, and watch out 
 * for unintentional autoboxing.
 * */
class TestPerformanceAutoboxing
{
	public static void main( String[] args ) 
	{
		String start = new SimpleDateFormat( "HH.mm.ss" ).format( new Date() );
		System.out.println( "START: " + start );
		
		// Changing the declaration of "sum" from "Long" to "long" reduces the
		// runtime;
		
//		Long sum = 0L;		   8 seconds
		long sum = 0L;		// 2 seconds
		for( long i = 0 ; i <= Integer.MAX_VALUE ; i++ )
		{
			sum += i;
		}
		System.out.println( sum );
		
		String end = new SimpleDateFormat( "HH.mm.ss" ).format( new Date() );
		System.out.println( "END: " + end );
	}
}
