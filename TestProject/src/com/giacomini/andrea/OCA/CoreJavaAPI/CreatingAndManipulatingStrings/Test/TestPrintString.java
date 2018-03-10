package com.giacomini.andrea.OCA.CoreJavaAPI.CreatingAndManipulatingStrings.Test;

public class TestPrintString {

	public String string;
	
	TestPrintString(){
		this("white");
	}
	
	TestPrintString(String string){
		string = string;
		
	}
	
	public static void main(String[] args){
		
		TestPrintString test = new TestPrintString();
//		System.out.println("Color: ".concat(test.string) );		Eccezione a RunTime
		System.out.println("Color: " + test.string);
		
	}
}
