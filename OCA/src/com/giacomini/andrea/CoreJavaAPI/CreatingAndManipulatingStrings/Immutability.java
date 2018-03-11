package com.giacomini.andrea.CoreJavaAPI.CreatingAndManipulatingStrings;

/*
 * N.B: Una volta creato un'oggetto String non è più possibile modificarlo, per esempio aggiungendo o togliendo caratteri.
 * 		Un'oggetto che non può essere modificato una volta che è stato creato, viene chiamato IMMUTABILE.
 * 		
 * 		La Classe String è una classe IMMUTABILE.
 * 		 
 */ 
public class Immutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "1";
		String s2 = s1.concat("2");
		
		// N.B: Questo non muta l'oggetto String puntato da s2.
		s2.concat("3");
		
		System.out.println(s2);
		

	}

}

/*
 * N.B: Una classe MUTABILE ha sia un getter che un setter. Questo permette al riferimento "s" di cambiare puntamento, facendo
 * 		riferimento ad un nuovo oggetto String.
 */
class Mutable{
	private String s;
	
	public void setS(String newS){
		s = newS;
	}
	
	public String getS(){
		return s;
	}
}

/*
 * N.B: Una classe IMMUTABILE ha solo un metodo getter. Non è possibile cambiare il valore di "s" una volta settato.
 * 		E' possibile anche mettere a "final" la variabile d'istanza in modo che nel caso accidentalmente si modifichi 
 * 		il riferimento il compilatore possa avvertire l'utente.
 * 		In Java una classe IMMUTABILE è conseguentemente "final", e le sue eventuali sotto-classi non possono cambiare
 * 		questo comportamento.
 */
class Immutable {
	private String s = "name";
	
	public String getS(){
		return s;
	}
}


final class Immutable2 {
	private final String s = "name";
	
	public String getS(){
		return s;
	}
}