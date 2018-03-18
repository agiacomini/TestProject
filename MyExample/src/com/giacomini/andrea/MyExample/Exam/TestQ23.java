package com.giacomini.andrea.MyExample.Exam;

public class TestQ23 implements Multi {

	@Override
	public int multiply(int p1, int p2) {
		// TODO Auto-generated method stub
		return p1*p2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Multi mul = (x,y) -> { return x*y;};	
		
		Multi mul1 = (int x, int y) -> {return x*y;};

	}

}
