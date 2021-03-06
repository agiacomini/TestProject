package com.giacomini.andrea.AdvancedClassDesign.UnderstandingVirtualMethodInvocation;

/*
 * N.B: In "UsingInstanceof" abbiamo visto un'esempio di come alimentare un'animale, richiamando il corretto metodo per alimentare
 * 		l'animale in funzione della natura dello stesso.
 * 
 * 			public void feedAnimal(Animal animal){
 *		
 *				if (animal instanceof Cow){
 *			
 *					((Cow)animal).addHay();
 *				} else if (animal instanceof Bird) {
 *	
 *					((Bird)animal).addSeed();		
 *				} else if (animal instaceof Lion) {
 *
 *					((Lion)animal).addMear();
 *				} else {
 *
 *					throw new RuntimeException("Unsupported animal");
 *				}
 *			}	
 *		
 *  	Un modo migliore sarebbe quello di sapere come ogni animale si alimenta da solo.
 *  
 *   	La class Animal è una classe "abstract", e richiede che qualsiasi sotto-classe concreta di Animal definisca il suo metodo
 *   	abstract "feed()". Le tre sotto-classi (Cow, Bird e Lion) che sono state definite hanno un meotodo "feed()" che delega 
 *   	l'attività ad un loro specifico metodo (per esempio "addHay()" per la classe Cow). In questo modo il metodo "feed()" è molto
 *   	più semplice. Chiamando "feed()" verrà eseguita l'appropriata versione della sotto-classe.
 *   
 *      Questo approccio ha un'enorme vantaggio rispetto al precedente. Il metodo "feedAnimal()" non deve essere cambiato nel
 *      momento in cui viene aggiunta una nuova sotto-classe di Animal. Protremmo avere metodi per alimntare animali in tutto il
 *      codice.
 *      
 *      Ci siamo appena affidati all' "invocazione di metodi virtuali". Abbiamo visto i metodi virtuali nell'esame OCA. 
 *      Sono semplicemente metodi regolari NON-STATIC. Java cerca un metodo overridden piuttosto che usare necessariamente
 *      quello nella classe che il compilatore dice di avere.
 *      
 *      In qusto nuovo esempio, si ha un'istanza di Animal, ma Java non chiama il metodo "feed()" sulla classe Animal. Al contrario,
 *      Java guarda il tipo attuale della variabile/parametro "animal" a runtime e richiama il metodo "feed()" di quel specifico
 *      tipo di Animal.
 *      
 *      Questa tecnica viene chiamata "invocazione di metodi virtuali". Le variabili d'istanza non funzionano in questo modo.
 *      
 *      Fino a questo momento non è stato detto nulla di nuovo ripetto a quello che è stato già discusso in OCA.
 *  
 * */
public class UnderstandingVirtualMethodInvocation {

	public void feedAnimal(Animal animal){
		animal.feed();
	}
	
	public static void main(String[] args){
		
		Animal animal = new Lion();
		animal.printName();					// output: ???
											// N.B: viene stampato il valore della variabile della super-classe (hidding) perché
											//		il riferimento è di tipo Animal e non di tipo Lion. Verrebbe stampato "Leo"
											//		solo se anche il riferimento fosse anche'esso di tipo Lion;
		
		animal.careFor();					// output: toss in meat
											// N.B: anche se si stà richiamando un metodo della super-classe padre "Animal" ereditato
											//		dalla classe figlia "Lion", al suo interno c'è un'altra chiamata ad un'altro metodo
											//		il quale però è stato overridden nella classe figlia. Per questo motivo Java
											// 		va a richiamare ed eseguire proprio il metodo che fa l'overriding,
											// 		nonostante la chiamata provenga da un metodo della classe padre;
	}
}

abstract class Animal {
	public abstract void feed();
	
	String name = "???";
	public void printName(){
		System.out.println(name);
	}
	
	public void careFor(){
		play();
	}
	public void play(){
		System.out.println("pet animal");
	}
} 

class Cow extends Animal {
	public void feed(){ addHay(); }
	private void addHay(){}
}

class Bird extends Animal {
	public void feed(){ addSeed(); }
	private void addSeed(){}
}

class Lion extends Animal {
	public void feed(){ addMeat(); }
	private void addMeat(){}
	
	// Hiding della variabile d'istanza "name" della super-classe padre Animal;
	String name = "Leo";
	
	// Overriding del metodo "play()" della super-classe padre Animal;
	public void play(){
		System.out.println("toss in meat");
	}
}
