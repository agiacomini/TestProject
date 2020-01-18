package com.giacomini.andrea.chapter1.creatingAndDestroyingObjects;

/* Occasionally you'll want to write a class that is just a grouping of 
 * static methods and static fields. They do have a valid uses. They can be
 * used to group related methods on primitive values or arrays. They can also be used 
 * to group static methods, including factory methods.
 * Such utility classes were not designed to be instantiated: an instance
 * would be nonsensical.
 * 
 * Attempting to enforce noninstantiability by making a class abstract does
 * not work. There is, however, a simple idiom to ensure noninstantiability.
 * A class can be made noninstantiable by including a private constructor.
 * This idiom also prevents the class from being subclassed.  
 * */

// Noninstantiable utility class
public class ClassesNonInstantiability 
{
	// Suppress default constructor for noninstantiability
	private ClassesNonInstantiability()
	{
		// The "AssertionError()" isn't strictly required, but it provides
		// insurance in case the constructor is accidentally invoked from within 
		// the class. It guarantees that the class will never be instantiated under
		// any circumstance.
		throw new AssertionError();
	}
	
	public static void main( String[] args ) 
	{
		ClassesNonInstantiability classesNonInstantiability = new ClassesNonInstantiability();
		System.out.println( classesNonInstantiability );
	}
}
