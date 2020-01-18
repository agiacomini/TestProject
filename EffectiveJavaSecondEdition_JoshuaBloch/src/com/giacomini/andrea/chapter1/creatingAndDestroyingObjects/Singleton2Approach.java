package com.giacomini.andrea.chapter1.creatingAndDestroyingObjects;

/* A singleton is simply a class that is instantiated exactly once. 
 * It represent a component that is intrinsically unique, like file system or cache.
 * Before release 1.5 the ways to implement singletons are based on keeping 
 * the constructor private and exporting a public static member to provide access 
 * to the sole instance. 
 * */
public class Singleton2Approach 
{	
	/*-------------------------- Second Approach ---------------------------*/
	
	private static final Singleton2Approach SINGLETON_2_APPROACH = new Singleton2Approach();
	
	private Singleton2Approach(){}
	
	public void leaveTheBuilding(){}
	
	// Singleton with public "static factory method" ( member that provide access to the sole instance )
	// All calls to "Singleton2Approach.getInstance()" return the same object reference.
	public static Singleton2Approach getInstance()
	{
		return SINGLETON_2_APPROACH;
	}
	
	/*------------------------- ./Second Approach --------------------------*/
}
