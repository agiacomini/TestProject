package com.giacomini.andrea.OCP.AdvancedClassDesign.CreatingNestedClasses.Test2;

public class Toucan {

	public static class Beak{
		
		public static String string = "field PUBLIC STATIC inside class static Beak";
		public static void print(){

			System.out.println("method print() inside nested class static Beak");
		}

	}
}
