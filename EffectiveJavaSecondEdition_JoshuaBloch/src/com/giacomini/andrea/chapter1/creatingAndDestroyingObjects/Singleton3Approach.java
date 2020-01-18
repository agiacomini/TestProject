package com.giacomini.andrea.chapter1.creatingAndDestroyingObjects;

/* A singleton is simply a class that is instantiated exactly once. 
 * It represent a component that is intrinsically unique, like file system or cache.
 * Before release 1.5 the ways to implement singletons are based on keeping 
 * the constructor private and exporting a public static member to provide access 
 * to the sole instance. 
 * */
public enum Singleton3Approach 
{	
	/*-------------------------- Third Approach ---------------------------*/
	
	// It's the preferred approach.
	// This approach is functionally equivalent to the public field approach 
	// "Singleton1Approach", except is more concise. 
	INSTANCE;
	
	public void leaveTheBuilding(){}
	
	/*------------------------- ./Third Approach --------------------------*/
}
