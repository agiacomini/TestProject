package com.giacomini.andrea.Exceptions.CallingMethodsThatThrowExceptions.Examples;

//class CanNotHopException extends Exception {}

class Hopper3 {
	
	public void hop() throws Exception {};
}

public class Bunny5 extends Hopper3 {

	public void hop() throws CanNotHopException {};
}
