package com.giacomini.andrea.BuildingBlocks.VariableScope;

public class TestScopeVariables {

	// Variabile di Classe.
	static int MAX_LENGTH = 5;
	// Variabile d'Istanza.
	int length;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void grow(int inches){
		
		if(length < MAX_LENGTH){
			
			int newSize =  length - inches;
			length = newSize;
		}
	}

}
