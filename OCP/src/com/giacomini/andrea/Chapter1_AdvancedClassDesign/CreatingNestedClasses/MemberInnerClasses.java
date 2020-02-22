package com.giacomini.andrea.AdvancedClassDesign.CreatingNestedClasses;

import com.giacomini.andrea.AdvancedClassDesign.CreatingNestedClasses.Outer.Inner;

/*
 * N.B: Una class inner membro è definita a livello dei membri della classe esterna che la contiene (lo stesso livello dei metodi,
 *  	delle variabili d'istanza e dei	costruttori). Le classi inner membro hanno le seguenti proprietà:
 *  
 *  		- possono essere dichiarate PUBLIC, PRIVATE o PROTECTED o usare l'accesso di default;
 *  
 *  		- possono estendere qualsiasi classe e implementare interfacce;
 *  
 *  		- possono essere ABSTRACT o FINAL;
 *  
 *  		- non possono dichiarare meotdi o variabili STATIC a meno che non siano campi STATIC FINAL;
 *  
 *  		- possono accedere a membri della classe esterna inclusi i membri PRIVATE;
 *  
 *  	La dichiarazione di una classe inner membro assomiglia alla dichiarazione di una classe stand-alone eccetto che deve
 *  	essere dichiarata all'interno di un'altra classe e che può usare le variabili d'istanza della classe esterna che la
 *  	contiene.
 *  	Dal momento che una classe inner membro non è STATIC, deve essere usata con un'istanza della classe esterna che la usa.
 *  	Di fatto un'istanza della classe esterna può istanziare normalmente la classe innestata, per esempio come nel meotodo
 *  	"callInner()". Questo funziona perché il metodo "callInner()" è un metodo d'istanza della classe esterna "Outer".
 *  	Sia il metodo "callInner()" che la classe innestata "Inner" sono memebri della classe esterna "Outer".
 *  	
 *  	Esiste anche un altro modo di istanziare la classe inner "Inner" che può sembrare pià strano:
 *  
 *   		public static void main(String[] args){
 *   
 *   			Outer outer = new Outer();
 *   			Inner inner = outer.new Inner();		// Crea la classe "Inner";
 *   			inner.go();
 *   		}
 *   
 *   	Si guardi con più attenzione alla riga "Inner inner = outer.new Inner();". Si ha bisogno di un'istanza di "Outer" al fine
 *   	di creare un'istanza di "Inner". Non è possibile chiamare solo "new Inner()" perché Java non sa con quale istanza di
 *   	"Outer" è associata. Java risolve questa situazione chiamando "new" come se fosse un metodo sulla variabile "outer".
 *   
 *     	N.B: Compilando la classe "Outer.java" verranno creati dal compilatore due files ".class". Uno naturalmente quello che ci si aspetta
 *     	di avere ("Outer.class"), e un secondo file chiamato "Outer$Inner.class".
 *     
 *     	La classe Inner può avere gli stessi nomi di variabili che ha la classe esterna. Esiste un particolare modo di chiamare
 *     	"this" per dire a quale classe si vuole accedere. Inoltre non ci si limita ad una sola classe inner. Di seguito un'esempio
 *     	con più classi innestate e di come accedere alle diverse variabili di ognuna pur avendo nomi comuni. Questo è solo un esempio
 *     	per fare capire come si accede alle variabili ma non è un codice da imitare:
 *     
 *       	public class A {
 *       
 *       		private int x = 10;
 *       		
 *       		class B {
 *       
 *       			private int x = 20;
 *       
 *       			class C {
 *       
 *       				private int x = 30;
 *       				
 *       				private void allThex(){
 *       
 *       					System.out.println(x);				// 30
 *       					System.out.println(this.x);			// 30
 *       					System.out.println(B.this.x);		// 20
 *       					System.out.println(A.this.x);		// 10
 *       				}
 *       			}
 *       		}
 *       
 *       		public static void main(String[] args){
 *       
 *       			A a = new A();
 *       			A.B b = a.new B();
 *       			A.B.C c = b.new C();
 *       		
 *       			c.allThex(); 
 *       		}
 *       	}
 *       
 *       Si hanno due classi innestate. "A a = new A();" istanzia la classe più esterna. "A.B b = a.new B();" usa la sintassi 
 *       awkward (goffa) per istanziare la classe interna B. Avremmo potuto anche usare B come tipo perché disponibile a livello
 *       di membro di B. Java sa dove cercarla. Con "A.B.C c = b.new C();" viene istanziata la classe più interna C. Questa
 *       volta è necessario il tipo come A.B.C in quando è troppo profonda perchè Java sappia dove cercarla. Infine "c.allThex();"
 *       chiama il metodo di C. 
 *       "System.out.println(x);" e "System.out.println(this.x);" entrambe si rifersicono alla variabile d'istanza della
 *       classe corrente. La riga "System.out.println(B.this.x);" usa this in un modo speciale. Si vuole sempre una variabile
 *       d'istanza ma questa volta quella della classe B. Questa riga "System.out.println(A.this.x);" fa la stessa cosa per
 *       la class C.
 *       
 *       PRIVATE INTERFACE:
 *       N.B: Il codice seguente potrebbe sembrare strano ma è legale:
 *       
 *        		public class CaseOfThePrivateInterface{
 *        
 *        			private interface Secret {
 *        
 *        				public void ssh();
 *        			}
 *        
 *        			class DontTell implements Secret {
 *        
 *        				public void ssh(){	}
 *        			}
 *        		}
 *        
 *        La regola che tutti i metodi in una interfaccia sono public viene ancora rispettata. La classe che implementa quell'interfaccia
 *        dovrà dare un'implementazione al metodo ereditato dall'interfaccia. Tuttavia l'interfaccia non deve essere public. 
 *        Come qualsiasi classe inner/innestata, un'interfaccia inner può essere privata. Questo significa che l'interfaccia
 *        potrà essere referenziata solo all'interno della classe che la racchiude.
 */

public class MemberInnerClasses {

	public static void main(String[] args){
		
	}
}

class Outer {
	
	private String greeting = "Hi";
	
	// Classe innestat di tipo membro;
	protected class Inner{
		
		public int repeat = 3;
		
		public void go(){
			
			for(int i = 0 ; i < repeat ; i++)
				// N.B: la classe innestata può avere accesso ai membri della classe esterna che la contiene, anche se
				//		questi sono PRIVATE;
				System.out.println(greeting);
		}
	}
	
	public void callInner(){
		
		Inner inner = new Inner();
		inner.go();
	}
	
	public static void main(String[] args){
		
		// 1 MODO - 
		Outer outer = new Outer();
		outer.callInner();					// output: Hi Hi Hi
		
		System.out.println();
		
		// 2 MODO - modo alternativo (poco usato);
		Outer outer2 = new Outer();
		Inner inner = outer2.new Inner();
		inner.go();							// output: Hi Hi Hi
			
	}
}
