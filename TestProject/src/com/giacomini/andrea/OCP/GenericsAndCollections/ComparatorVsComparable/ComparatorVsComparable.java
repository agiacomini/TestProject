package com.giacomini.andrea.OCP.GenericsAndCollections.ComparatorVsComparable;

/*
N.B: E' stato discusso il concetto di ordine per le classi "TreeSet" e "TreeMap". Per  i numeri l'ordine è ovvio - è un
     ordine numerico. Per gli oggetti "String" l'ordine è definito secondo la mappatura Unicode dei caratteri.
     Per quanto riguarda l'esame ciò significa ordinare prima i numeri dei caratteri e ordinare prima le lettere maiscole
     di quelle minuscole.
     Si possono anche ordinare gli oggetti che si creano. Java fornisce un'interfaccia chiamata "Comparable". Se la propria
     classe implementa questa interfaccia "Comparable", può essere usata in quelle strutture dati che richiedono un
     confronto. C'è anche una classe chiamata "Comparator" la quale viene usata per specificare che si vuole usare un
     differente ordine che l'oggetto fornisce.
     "Comparable" e "Comparator" sono abbastanza simili da essere difficili. Durante l'esame sarà possibile vederli insieme
     nel tentativo di confondere l'esaminato. Non bisogna confonderli. In questa sezione, si discuterà prima dell'interfaccia
     "Comparable", poi si vedrà la classe "Comparator" ed infine verranno discusse le differenze.
 */

public class ComparatorVsComparable {
}
