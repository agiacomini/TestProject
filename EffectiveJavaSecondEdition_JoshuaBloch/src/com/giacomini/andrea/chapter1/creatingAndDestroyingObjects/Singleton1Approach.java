package com.giacomini.andrea.chapter1.creatingAndDestroyingObjects;

/* A singleton is simply a class that is instantiated exactly once. 
 * It represent a component that is intrinsically unique, like file system or cache.
 * Before release 1.5 the ways to implement singletons are based on keeping 
 * the constructor private and exporting a public static member to provide access 
 * to the sole instance. 
 * */
public class Singleton1Approach 
{
	/*-------------------------- First Approach ----------------------------*/
	
	// Singleton with public "final field" ( member that provide access to the sole instance )
	public static final Singleton1Approach SINGLETON_1_APPROACH = new Singleton1Approach();
	
	private Singleton1Approach(){}
	
	public void leaveTheBuilding(){}
	
	/*------------------------- ./First Approach ---------------------------*/
}