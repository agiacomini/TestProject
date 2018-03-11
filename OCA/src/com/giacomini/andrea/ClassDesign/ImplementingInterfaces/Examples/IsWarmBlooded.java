package com.giacomini.andrea.ClassDesign.ImplementingInterfaces.Examples;

public interface IsWarmBlooded {

	boolean hasScales();
	public default double getTemperature(){
		return 10.0;
	}
}
