package com.giacomini.andrea.OCP.AdvancedClassDesign.CodingEqualsHashCodeToString;

/*
 * N.B: Java usa l'operaotre "==" per confrontare due primitive e per controllare se due variabili si riferiscono allo
 *      stesso oggetto. Per controllare se due oggetti sono equivalenti usa il metodo "equals()", o al massimo lo fa se 
 *      lo sviluppatore ha implementato il metodo che fa l'override di "equals()". Nell'esempio di seguito riportato (Equals)
 *      , solo una delle due classi (String e StringBuilder) fornisce una implementazione personale del metodo "equals()" (String).
 *      La classe "Lion2" esegue l'override del metodo "equals()" per verificare se due oggetti di questa classe hanno lo
 *      stesso "idNumber". In particolare il metodo prende in input un paramtro di tipo Object (piuttosto che un parametro di
 *      tipo Lion2, come ci si aspettava). Controlla se un cast (in particolare il down-cast) è permesso, usando l'operatore
 *      "instanceof" imparato nella sezione "UsingInstanceof.java". Nel caso l'operatore "instanceof" ritoerni FALSE anche
 *      il metodo "equals()", di cui si stà facendo l'override, ritorna FALSE. Se invece il controllo dell'operatore
 *      "instanceof" ritorna TRUE allora si passa al cast. Infine viene controllato che i due oggetti abbiano o meno lo stesso
 *      indetificatore "idNumber";
 *      
 *      N.B: Le regole del metodo "equals()" dato un valore di riferimento non null:
 *      		- riflessiva: dato "x", x.equals(x) è sempre TRUE;
 *      		- simmetrica: dato "x" e "y", se x.equals(y) TRUE, allora y.equals(x) è TRUE;
 *      		- transitiva: dato "x", "y" e "z", se x.equals(y) TRUE e y.equals(z) TRUE, allora x.equals(z) è TRUE;
 *      		- consistente: dato "x" e "y", x.equals(y) TRUE ad ogni invocazione consecutiva; 
 *      		- non null: dato "x", x.equals(null) è sempre FALSE;
 *      
 *      Come per il "toString()", anche per il metodo "equals()" esistono gli Apache Common Langs utili per fare del lavoro
 *      al posto del programmatore. Nel caso del metodo "equals()", utili per controllare tutte le variabili d'istanza del
 *      della classe in oggetto;
 *      
 *      	public boolean equals(Object obj) {
 *				return EqualsBuilder.reflectionEquals(this, obj);
 * 			}
 * 
 * 		Comunque sia, in situazioni reali, è molto più utile, dati due oggetti dello stesso tipo, controllare 
 * 		solo uno o due campi di questi oggetti;
 */

public class Equals {
	
	public static void mian(String[] args){
		
		// N.B: La class String ha un suo metodo "equals()" personale. Questo controlla che i due valori siano identici; 
		String s1 = new String("lion");
		String s2 = new String("lion");
		System.out.println(s1.equals(s2));					// TRUE
		
		// N.B: "StirngBuilder" invece usa l'implementazion del metodo "equals()" fornita dalla classe padre "Object",
		//		il quale controlla semplicemente che i due oggetti a cui si fa riferimento siano gli stessi;
		StringBuilder sb1 = new StringBuilder("lion");
		StringBuilder sb2 = new StringBuilder("lion");
		System.out.println(sb1.equals(sb2));				// FALSE
	}

}

class Lion2{
	
	private int idNumber;
	private int age;
	private String name;
	
	// Costruttore;
	public Lion2(int idNumber, int age, String name){
		this.idNumber = idNumber;
		this.age = age;
		this.name = name;
	}
	
	// Override il metodo "equals()" ereditato da Object;
	 @Override
	 public boolean equals(Object obj){
		 
		 if( !(obj instanceof Lion2)) return false;
		 
		 Lion2 otherLion = (Lion2)obj;
		 
		 return this.idNumber == otherLion.idNumber;
	 }
	
	 // Overload (non Overriding) del metodo "equals()" ereditato da Object, infatti si può vedere che la firma è diversa;
	 public boolean equals(Lion2 obj){
		 
		 if( obj == null) return false;
		 
		 return this.idNumber == obj.idNumber;
	 }
}
