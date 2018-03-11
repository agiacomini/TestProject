package com.giacomini.andrea.ClassDesign.ImplementingInterfaces.Examples;

public interface Walk {

	public default int getSpeed(){
		return 5;
	}
}
