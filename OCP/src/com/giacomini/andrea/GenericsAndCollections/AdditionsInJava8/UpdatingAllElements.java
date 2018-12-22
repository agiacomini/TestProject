package com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8;

/*
 * N.B: Un'altro nuovo metodo introdotto sulle "List" è il metodo "replaceAll()".
 * 		Java 8 permette di passare una lambda expression ed applicarla ad ogni elemento
 * 		della lista. Il risultato sostituisce il valore corrente di quell'elemento.
 * 		La firma del metodo è la seguente:
 * 
 * 			void replaceAll(UnaryOperator<E> o)
 * 
 * 		Usa un "UnaryOperator", il quale prende un parametro e ritorna un valore dello stesso tipo.
 * 		Diamo uno sguardo ad un'esempio:
 * 
 * 			List<Integer> list = Arrays.asList(1,2,3);
 * 			list.replaceAll(x -> x*2);
 * 			System.out.println(list);		// [2,4,6]
 * 
 * 		La labda expression usa l'esecuzione differita per aumentare il valore di ogni elemento
 * 		nella lista.
 * */

public class UpdatingAllElements {

}
