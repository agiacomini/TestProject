package com.giacomini.andrea.OCA.CoreJavaAPI.UsingStringBuilderClass;

public class MutabilityAndChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "start+middle+end";
		StringBuilder sb = new StringBuilder("start");		
		sb.append("+middle");								// sb = "start+middle"
		StringBuilder same = sb.append("+end");				// same = "start+middle+end"
		
		System.out.println(sb);								// start+middle+end
		System.out.println(same);							// start+middle+end
		
		if(sb == same){
			
			System.out.println("sb == same is TRUE");		// sb == same is TRUE
		} else {
			
			System.out.println("sb == same is FALSE");
		}
		
		if(sb.equals(same)){
			
			System.out.println("sb is equal() to same");	// sb is equal() to same
		} else {
			
			System.out.println("sb is NOT equal() to same");
		}
		
		if(sb.equals(string)){
			
			System.out.println("sb.equals(string) is TRUE");
			
		} else {
			
			System.out.println("sb.equals(string) is FALSE");
			
		}
		
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		
		// Questi sono due modi equivalenti di aggiornare un oggetto MUTABILE StringBuilder
		b = b.append("f").append("g");
//		b.append("f").append("g");
		
		System.out.println("a = " + a);						// a = abcdefg
		System.out.println("b = " + b);						// b = abcdefg

	}

}
