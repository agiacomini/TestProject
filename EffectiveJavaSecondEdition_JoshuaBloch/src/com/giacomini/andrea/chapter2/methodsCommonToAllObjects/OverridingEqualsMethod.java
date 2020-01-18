package com.giacomini.andrea.chapter2.methodsCommonToAllObjects;

/* Obey the general contract when overriding "equals()" method;
 * */

public class OverridingEqualsMethod 
{
	public String stringField;
	public int intField;
	
	public OverridingEqualsMethod(){}

	@Override
	public boolean equals( Object o )
	{
		// if the object is compared with itself then return true;
		if( o == this ) return true;
				
		// check if "o" is an instance of "OverridingEqualsMethod" or not
		if( !( o instanceof OverridingEqualsMethod ) ) 
		{
			return false;	
		}
		else
		{
			// cast;
			OverridingEqualsMethod overridingEqualsMethod = ( OverridingEqualsMethod ) o;
			return stringField.equals( overridingEqualsMethod.getStringField() ) &&
					intField == overridingEqualsMethod.getIntField();
		} 
	}
	
	public String getStringField() { return stringField; }
	public void setStringField( String stringField ) { this.stringField = stringField; }
	public int getIntField() { return intField;	}
	public void setIntField( int intField ) { this.intField = intField; }
	
	public static void main(String[] args) 
	{
		String s = "Polish";
		System.out.println(s.equals("polish"));				// FALSE
		System.out.println(s.equalsIgnoreCase("polish"));	// TRUE
	}
}
