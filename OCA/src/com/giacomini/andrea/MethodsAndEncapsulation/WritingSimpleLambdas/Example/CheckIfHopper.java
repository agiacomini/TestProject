package com.giacomini.andrea.MethodsAndEncapsulation.WritingSimpleLambdas.Example;

public class CheckIfHopper implements CheckTrait {

	public boolean test(Animal a){
		
		return a.canHop();
	}

}
