package com.giacomini.andrea.OCA.Exceptions.CallingMethodsThatThrowExceptions.Examples;

//class CanNotHopException extends Exception {}

class Hopper2 {
	
	public void hop() throws CanNotHopException {};
}

public class Bunny4 extends Hopper2 {

	public void hop() {
		
	}
}
