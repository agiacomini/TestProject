package com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples;

public interface Walk {

	public default int getSpeed(){
		return 5;
	}
}
