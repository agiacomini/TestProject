package com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples;

public interface HasFins {

	public default int getNumberOfFins(){
		return 4;
	}
	
	public default double getLongestFinLength(){
		return 20.0;
	}
	
	public default boolean doFinsHaveScales(){
		return true;
	}
}
