package com.giacomini.andrea.MyExample.Exam;

public class TestQ1 {
	
	public static void main(String[] args){
	
		int[] a = {1,2,3,4,5,6};
		int i = a.length; // Il numero degli elementi dell'array è 6, mentre 
						  // il conteggio delle posizioni inizia dalla posizione 0
		
		while(i >= 1){
			
			System.out.print(a[i]);
		}
	}
}