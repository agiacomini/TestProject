package com.giacomini.andrea.AdvancedClassDesign.Test;

// N.B: il packeage "java.lang" viene automaticamente importato di defualt da java quindi non serve specificarlo nel codice; 
import java.util.ArrayList;
import java.util.List;
//import java.util.*;						// N.B: questo import include anche i precedenti due;

import static java.util.Collections.sort;
//import static java.util.Collections.*;	// N.B: import simile al precedente;

public class ListHelper {

	public List <String> copyAndSortList(List <String> original){
		
		List <String> list = new ArrayList<String>(original);
		sort(list);
		return list;
	}
}
