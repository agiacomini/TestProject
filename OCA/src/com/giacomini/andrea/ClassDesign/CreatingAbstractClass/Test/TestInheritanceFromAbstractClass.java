package com.giacomini.andrea.ClassDesign.CreatingAbstractClass.Test;

public class TestInheritanceFromAbstractClass {
	
	public static void main(String[] args){
		
		Suv suv = new Suv();
		Car car = suv;
		Drivable drivable = suv;
		Veichle veichle = suv;
		
		System.out.println(Veichle.i);
		System.out.println(suv.i = 20);
		System.out.println(Veichle.i);
//		System.out.println(suv.a = 200);
		
		Car car2 = new Suv();
		Drivable drivable2 = car2;
		Veichle veichle2 = car2;
		Suv suv2 = (Suv)car2;
		
		Car car3 = new Car();
		Drivable drivable3 = car3;
//		DrivableSuv drivableSuv = (DrivableSuv)car3;
//		Suv suv3 = (Suv)car3;
		Veichle veichle3 = car3;
		
//		Suv suv4 = new Car();
		Drivable drivable4 = new Car();
	}

}

abstract class Veichle{
	
	static int i = 10;
}

interface Drivable {
	
	public int a = 100;
}

interface DrivableSuv {}

class Car extends Veichle implements Drivable {}

class Suv extends Car implements DrivableSuv {}
