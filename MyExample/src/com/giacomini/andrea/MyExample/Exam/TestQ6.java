package com.giacomini.andrea.MyExample.Exam;

public class TestQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,053,4}; // a[2] = 053 : notazione ottale di 43. 3 + (5 volte 8 = 40) = 43. 
							   // Si identifica dal fatto che il numero inizia con "0".
		
		int b[][] = {{1,2,4},{2,2,1},{0,43,2}};
		
		System.out.print(a[3] == b[0][2]);
		
		System.out.print(" " + (a[2] == b[2][1]));

	}

}
