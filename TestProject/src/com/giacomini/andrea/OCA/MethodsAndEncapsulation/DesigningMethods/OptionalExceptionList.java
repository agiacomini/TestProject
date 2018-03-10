package com.giacomini.andrea.OCA.MethodsAndEncapsulation.DesigningMethods;

/*
 * N.B: La lista delle eccezioni è opzionale ma se presente viene posizionata alla fine della dichirazione del metodo.
 * 		E' possibile elencare una lista di eccezioni, separate tra loro da una virgola, che potrebbero essere lanciate 
 * 		dal metodo in casi specifici di errore.
 */

public class OptionalExceptionList {
	
	public void zeroException(){ }
	public void oneException() throws IllegalArgumentException{ }
	public void twoException() throws IllegalArgumentException, InterruptedException{}

}
