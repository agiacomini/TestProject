package com.giacomini.andrea.BuildingBlocks.DeclaringInitializingVariables.Test;

public class TestAssignValueToVariable {
	
//	int hundred = 100.00;		ERRORE DI COMPILAZIONE - per assegnare un double ad un int serve un down-cast esplicito; 
	int hundred = (int)100.00;
	
	double d = 10d;
	
//	float f = 10d;				ERRORE DI COMPILAZIONE - per assegnare un double ad un float serve un down-cast esplicito;
	float f = (float)10d;

}
