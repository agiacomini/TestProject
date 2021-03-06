package com.giacomini.andrea.CoreJavaAPI.UnderstandingAnArrayList;

import java.util.ArrayList;
import java.util.List;

/*
 * N.B: Quando non viene specificato un tipo (<>) al momento di creare un ArrayList, questo indica che verrà ospitati
 * 		oggetti di classe "Object".
 * 		ArrayList implementa anche il metodo "toString()" al fine di visualizzare facilmente il contenuto semplicemente
 * 		stampandolo. 
 */

public class UsingAnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * N.B: Il metodo "add()" inserisce un nuovo valore nell'ArrayList.
		 * 		Al primo passo viene inserita nell'ArrayList ancora vuota un'oggetto String.
		 * 		Al secondo passo invece viene inserito un booleano.
		 * 		Questo è permesso perché non è stato specificato un tipo per l'ArrayList quindi è possibile
		 * 		memorizzare qualsiasi tipo di oggetto (tranne le primitive).
		 */
		ArrayList list = new ArrayList();
		list.add("hawk");					// [hawk]
		list.add(Boolean.TRUE);				// [hawk, true]
		
		System.out.println(list);			// [hawk, true]
		
		/*
		 * N.B: In questo esempio sono stati usati i "Generics" per dire al compilatore che l'ArrayList conterrà solo
		 * 		oggetti String. 
		 */
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
//		safer.add(Boolean.TRUE);			// NON COMPILA
		
		/*
		 * N.B: Questo esempio inserisce valori multipli in differenti posizioni.
		 */
		List<String> birds = new ArrayList<>();
		birds.add("hawk");					// [hawk] - inserisce "hawk" alla fine della lista
		birds.add(1, "robin");				// [hawk, robin]
		birds.add(0, "blue jay");			// [blue jay, hawk, robin]
		birds.add(1, "cardinal");			// [blue jay, cardinal, hawk, robin]
		
		System.out.println(birds);			// [blue jay, cardinal, hawk, robin]
		
		/*
		 * N.B: Il metodo "remove()" rimuove il primo valore che match oppure rimuove l'elemento all'indice specificato. 
		 */
		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk");									// [hawk]
		birds2.add("hawk");									// [hawk, hawk]
		
		System.out.println(birds2.remove("cardinal"));		// stampa FALSE - si sta cercando di eliminare un'elemento che
															//				  non è nella lista, quindi ritorna FALSE.
		System.out.println(birds2.remove("hawk"));			// stampa TRUE - elimina l'elemento della lista che match
															//				 con la stringa "hawk". rimuove solo un elemento.
															//				 Ritorna TRUE.
		System.out.println(birds2.remove(0));				// stampa hawk - elimina l'elemento che si trova in posizione 0.
															//				 Era l'ultimo che rimaneva. Se si cerca di eliminare
															//				 un'elemento da un indice che non esiste lancia
															//				 un'eccezione "IndexOutOfBoundException".
		System.out.println(birds2);							// stampa []
		
		
		/*
		 * N.B: Il metodo "set()" cambia un'elemento dell'ArrayList senza cambiare la grandezza dell'ArrayList.
		 */
		List<String> birds3 = new ArrayList<>();
		birds3.add("hawk");									// [hawk]
		System.out.println(birds3.size());					// 1
		birds3.set(0, "robin");								// [robin]
		System.out.println(birds3.size());					// 1
		birds3.set(1, "robin");								// IndexOutOfBoundException - si stà cercando di sostituire un'elemento
															//							  che non esiste.

		/*
		 * N.B: I metodi "isEmpty()" e "size()" guardano quanti slot dell'ArrayList sono in uso.
		 */
		List<String> birds4 = new ArrayList<>();
		System.out.println(birds4.isEmpty());				// TRUE
		System.out.println(birds4.size());					// 0
		
		birds4.add("hawk");									// [hawk]
		birds4.add("hawk");									// [hawk, hawk]
		
		System.out.println(birds4.isEmpty());				// FALSE
		System.out.println(birds4.size());					// 2
		
		/*
		 * N.B: Il metodo "clear()" ripulisce tutto l'ArrayList rimuovendo tutti i suoi elementi. 
		 */
		List<String> birds5 = new ArrayList<>();
		birds5.add("hawk");									// [hawk]
		birds5.add("hawk");									// [hawk, hawk]
		
		System.out.println(birds.isEmpty());				// FALSE
		System.out.println(birds.size());					// 2
		
		birds5.clear();										// []
		
		System.out.println(birds.isEmpty());				// TRUE
		System.out.println(birds.size());					// 0
		
		/*
		 * N.B: Il metodo "contains()" controlla se un certo valore è presente nell'ArrayList.
		 */
		List<String> birds6 = new ArrayList<>();
		birds5.add("hawk");									// [hawk]
		
		System.out.println(birds6.contains("hawk"));		// TRUE
		System.out.println(birds6.contains("robin"));		// FALSE
		
		/*
		 * N.B: La classe ArrayList ha un suo metodo custom "equals()". E' possibile confrontare due liste per
		 * 		controllare che contengano gli stessi elementi nello stesso ordine.
		 */
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		
		System.out.println(one.equals(two));				// TRUE
		
		one.add("a");										// [a]
		
		System.out.println(one.equals(two));				// FALSE
		
		two.add("a");										// [a]
		
		System.out.println(one.equals(two));				// TRUE
		
		one.add("b");										// [a,b]
		two.add(0, "b");									// [b,a]
		
		System.out.println(one.equals(two));				// FALSE - stesso numero di elementi, stessi elementi MA ordine
															//		   differente.
	}

}
