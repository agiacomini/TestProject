package com.giacomini.andrea.OCA.Exceptions.UsingTryStatement.Examples;

public class test1 {

	// E' un metodo non un costruttore;
	public void test1(){
		
		String s = "";
		try{
			s += "t";
		}catch(Exception e){
			s += "c";
		} finally{
			s += "f";
		}
		
		s += "a";
		System.out.println(s);					// stampa: tfa
	}
	
}
