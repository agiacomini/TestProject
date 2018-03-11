package com.giacomini.andrea.OCA.MethodsAndEncapsulation.WritingSimpleLambdas.Example;

public class CheckIfHopper implements CheckTrait {

	public boolean test(Animal a){
		
		return a.canHop();
	}

}
