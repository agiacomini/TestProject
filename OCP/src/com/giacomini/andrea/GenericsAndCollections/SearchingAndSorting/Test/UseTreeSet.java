package com.giacomini.andrea.GenericsAndCollections.SearchingAndSorting.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.giacomini.andrea.GenericsAndCollections.ComparatorVsComparable.Test.Duck;

public class UseTreeSet {

	static class Rabbit { int id; }
	
	public static void main(String[] args){
		Set<Duck> ducks = new TreeSet<>();
		ducks.add(new Duck("Puddles"));
		Set<Rabbit> rabbit = new TreeSet<>();
//		rabbit.add(new Rabbit());				LANCIA ECCEZIONE CLASSCASTEXCEPTION
		
		Set<Rabbit> rabbit2 = new TreeSet<>(new Comparator<Rabbit>() {
			 
		 	public int compare(Rabbit r1, Rabbit r2){
		 		return r1.id = r2.id;
		 	}
		 });
		 rabbit2.add(new Rabbit());
		
	}
}
