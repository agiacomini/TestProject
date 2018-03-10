package com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Test;

public class OvverideMethodInInheritanceInterface implements SuperInterface {
	
	public String getName(){
		return "";
	}
	
	public static void main(String[] args){
		
		SuperInterface s = new OvverideMethodInInheritanceInterface();
		System.out.println(s.location + 3);
//		s.location = 3;		ERRORE DI COMPILAZIONE - 
		
		OvverideMethodInInheritanceInterface over = (OvverideMethodInInheritanceInterface)s;
		System.out.println(over.location);
		
//		over.location = 33;	ERRORE DI COMPILAZIONE -
		
		System.out.println(SubInterface.name);
		
		System.out.println(SuperInterface.location);
	}
}

interface SuperInterface {
	
	public static final int location = 0;
	public int i = 10;
	
	public default String getId(){
		return "0000";
	}
	
	public String getName();
}

interface SubInterface extends SuperInterface{
	
	public static final String name = "Andrea";
	
	public String getId();
	
	public default String getName(){
		
		return "my Name";
	}
	
//	public static String getId(){
//		
//		return "0000 static";
//	}
	
}

interface SubInterface2 extends SuperInterface {
	
//	public static String getName(){
//		
//		return "my Name static";
//	}
}
