package com.giacomini.andrea.AdvancedClassDesign.Test2;

import com.giacomini.andrea.AdvancedClassDesign.Test.BigCat;

public class Lynx extends BigCat {
	
	public static void main(String[] args){
		
		BigCat cat = new BigCat();
		System.out.println(cat.name);
//		System.out.println(cat.hasFur);		NON COMPIAL - 
//		System.out.println(cat.hasPaws);	NON COMPIAL -
//		System.out.println(cat.id);			NON COMPILA - 
		
		Lynx cat2 = new Lynx();
		System.out.println(cat2.name);
		System.out.println(cat2.hasFur);
//		System.out.println(cat2.hasPaws);	NON COMPILA - 
//		System.out.println(cat2.id);		NON COMPILA -
	}

}
