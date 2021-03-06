package com.giacomini.andrea.CoreJavaAPI.UnderstandingAnArrayList;
/*
 * N.B: A differenza di un "Array", dove è necessario sapere a priori la sua dimensione al momento della sua
 * 		creazione, un "ArrayList" può cambiare dimensione a run-time (come per lo StringBuilder).
 * 		L'ArrayList come l'Array è una sequenza ordinata che permette anche dei duplicati.
 * 		Per poter usare un ArrayList è necessario importare la libreria "import java.util.ArrayList;".  
 */

import java.util.ArrayList;
import java.util.List;

public class CreatingAnArrayList {

	public static void main(String[] args) {

		/*
		 * N.B: Come per lo StringBuilder, esistono 3 modi per creare un ArrayList (prima di JAVA 5).
		 * 		Il primo crea un ArrayList con una dimesnione di slot di default non ancora riempiti.
		 * 		Il secondo crea un ArrayList contenente un numero specifico di slot, al momento ancora vuoti.
		 * 		Il terzo crea una copia di un ArrayList, copiando sia la dimensione che il contenuto dell'ArrayList specificato.
		 * 		Questi tre modi di creare un ArrayList venivano usati con le versioni di JAVA antecendenti la 5,
		 * 		ma è possibile usare ancora questi tre modi con le versioni più recenti di JAVA.   
		 */
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);
		
		/*
		 * N.B: Con JAVA 5 sono stati introdotti i "Generics" che permettono alla creazione di un ArrayList
		 * 		di specificare il tipo di classe che l'ArrayList conterrà.
		 * 		JAVA 5 permette di specificare al compilatore quale tipo classe conterrà L'arrayList specificandolo
		 * 		tra <String>.
		 * 		A partire da JAVA 7 è possibile anche omettere tale specificazione dalla parte destra della dichiarazione,
		 * 		mantenendo però <> (Diamond Operator).
		 */
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();
		
		/*
		 * N.B: L'arrayList implementa un'interfaccia chiamata "List".
		 * 		In altre parole un ArrayList è una List.
		 * 		E' possibile memorizzare un ArrayList in una List MA non viceversa, in quando List è un'interfaccia
		 * 		e non è possibile istanziarla.
		 */
		List<String> list6 = new ArrayList<>();
//		ArrayList<String> list7 = new List<>();		// ERRORE DI COMPILAZIONE

	}

}
