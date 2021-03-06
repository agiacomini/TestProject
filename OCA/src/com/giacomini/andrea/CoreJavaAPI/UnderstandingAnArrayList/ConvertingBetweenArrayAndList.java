package com.giacomini.andrea.CoreJavaAPI.UnderstandingAnArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingBetweenArrayAndList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ESEMPIO di conversione di un ArrayList in un Array.
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		
		// L'ArrayList conosce come covertire se stesso in un Array.
		// Di default l'ArrayList converte se stesso in un Array di oggetti Object.
		Object[] objectArray = list.toArray();
		
		System.out.println(objectArray.length);						// 2
		
		// Per convertire un ArrayList in un Array di oggetti String è necessario specificarlo chiaramente.
		// Il vantaggio di specificare una grandezza 0 come parametro, permette a JAVA di creare un array della data capacità
		// per il valore di ritorno.
		String[] stringArray = list.toArray(new String[0]);
		
		System.out.println(stringArray.length);						// 2
		
		// ESEMPIO di conversione di un Array in una List.
		// L'Array di partenza e la lista creata sono tra loro legate. Significa che, quando si apporta un cambiamento
		// sull'Array questo viene riportanto anche nella lista, e viceversa.
		// La lista ha una lunghezza fissa perché l'Array cambia con essa.
		String[] array = {"hawk", "hawk"};							// ["hawk", "hawk"]
		List<String> list2 = Arrays.asList(array);					// ritorna una lista con una lunghezza fissa.
		
		System.out.println(list2.size());							// 2
		
		// Aggiorna sia la List "list2" che l'Array "array", perché puntano alla stessa area di memoria.
		list2.set(1, "test");										// ["hawk", "test"]
		
		// Anche qui viene cambiato sia l'Array "array" che la List "list2".
		array[0] = "new";											// ["new", "test"]
		
		for (String b : array) {
			
			System.out.println(b + " ");							// "new" "test"
			
		}
		
//		list2.remove(1);											// ECCEZIONE UnsupportedException - non è possibile
																	// cambiare la grnadezza della List "list2".
		
		/*
		 * N.B: Di seguito un esempio utile per creare e popolare una lista tutto su una riga.
		 */
		List<String> list3 = Arrays.asList("one", "two");
		
		System.out.println(list3);

	}

}
