package com.giacomini.andrea.OCP.AdvancedClassDesign.WorkingWithEnums.Test;

public enum Season3 {

	WINTER {
		public void printHours() { System.out.println("9am-3pm"); }
	}, SPRING {
		public void printHours() { System.out.println("9am-5pm"); }
	}, SUMMER {
		public void printHours() { System.out.println("9am-7pm"); }
	}, FALL {
		public void printHours() { System.out.println("9am-5pm"); }
 		};
 
	// Metodo abstract;
 	public abstract void printHours();
}
