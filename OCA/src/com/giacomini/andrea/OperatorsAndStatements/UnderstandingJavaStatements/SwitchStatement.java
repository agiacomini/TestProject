package com.giacomini.andrea.OperatorsAndStatements.UnderstandingJavaStatements;

/*
 * N.B: Lo SWITCH STATEMENT è una struttura di decisione complessa dove un singolo valore viene valutato e 
 * 		il flusso di esecuzione è diretto al primo ramo (conosciuto come Case statement) che match con quel valore.
 * 		Nel caso in cui nessun ramo match con il valore verrà chiamato uno statement di default. Nel caso in cui
 * 		invece non ci fosse nemmeno lo statement di default allora l'intero switch statement verrà skippato.
 * 
 * 		RICORDARSI L'ELENCO PER L'ESAME
 * 		Il valore dello switch statement viene valutato a runtime. Questo valore può essere di tipo:
 * 		- int (prima di Java 5);
 * 		- byte, short, char e naturalmente int (da Java 5 in poi);
 * 		- enum (enumerativi) (da Java 5);
 * 		- String (da Java 7);
 * 		- Wrapper Class Byte, Short, Character e Integer;
 * 
 * 		- WARNING : boolean, Boolean (wrapper), long e Long (wrapper) NON SONO SUPPORTATI.
 * 
 * 		I valori di ogni singolo case statement deve essere dello stesso tipo del valore dello switch statement.
 * 
 *  	Il break statement alla fine di ogni case statement e del default statement termina lo switch statement e ritorna
 *  	il controllo di flusso alla fine dello switch statement.
 *  	Non c'è nessuna limitazione all'ordine dei case statement e del default statement.
 *  	Tutti i data type dei case statement devono coincidere con il data type della variabile dello switch.
 *  	
 *  	I valori dei case statement possono essere:
 *  	- letterali;
 *  	- enum;
 *  	- costanti final, come per esempio "String final" e cioè costanti che non cambiano il proprio valore;
 *  	
 */

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dayOfWeek = 7;
		// Esempio con break - un singolo case statement può essere visitato in una singola esecuzione.
//		switch(dayOfWeek){
//		
//			default:
//				System.out.println("WeekDay");
//				break;
//				
//			case 0: 
//				System.out.println("Sunday");
//				break;
//				
//			case 6: 
//				System.out.println("Saturday");
//				break;
//		}
		
		// Esempio senza break - molti case statement possono essere visitati in una singola esecuzione.
		switch(dayOfWeek){
			
		case 0: 
			System.out.println("Sunday");
			
		default:
			System.out.println("WeekDay");
			
		case 6: 
			System.out.println("Saturday");
		}
	}
	
	private int getSortOrder(String firstName, final String lastName){
		
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		
		switch(firstName){
		
			// String literal
			case "Test":
				return 52; // Il "return" statement, esattamente come il "break" statement può essere usato per
						   // per uscire prima dallo "switch" statement.
			
			// String MA non è una variabile costante final, infatti può cambiare durante l'esecuzione del programma.
//			case middleName:
//				id = 5;
//				break;
			
			case suffix:
				id = 0;
				break;
				
			// String e final MA non è costante in quanto è passata come parametro alla funzione
//			case lastName:
//				id = 8;
//				break;
			
			// int
//			case 5:
//				id = 7;
//				break;
			
			// char
//			case 'J':
//				id = 10;
//				break;
			
			// ENUM value
//			case java.time.DayOfWeek.SUNDAY:
//				id = 15;
//				break;
			
		}
		return id;
	}

}
