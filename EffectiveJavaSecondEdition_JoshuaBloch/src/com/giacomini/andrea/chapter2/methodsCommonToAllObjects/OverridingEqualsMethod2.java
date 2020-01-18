package com.giacomini.andrea.chapter2.methodsCommonToAllObjects;

public class OverridingEqualsMethod2 extends OverridingEqualsMethod
{
	public String stringField2;
	public int intField2;
	
	public OverridingEqualsMethod2(){}

	// override "equals()" of the father's class "OverridingEqualsMethod"
	// but in this case in not necessary because the "logical equality"
	// is not different from that of father;
	@Override
	public boolean equals( Object o )
	{
		// if the object is compared with itself then return true;
		if( o == this ) return true;
		
		// check if "o" is an instance of "OverridingEqualsMethod2" or not
		if( !( o instanceof OverridingEqualsMethod2 ) ) return false;
		
		OverridingEqualsMethod2 overridingEqualsMethod2 = ( OverridingEqualsMethod2 ) o;
		return stringField2.equals( overridingEqualsMethod2.getStringField2() ) &&
				intField2 == overridingEqualsMethod2.getIntField2();
	}
	
	public String getStringField2() { return stringField2; }
	public void setStringField2( String stringField2 ) { this.stringField2 = stringField2; }
	public int getIntField2() { return intField2; }
	public void setIntField2( int intField2 ) { this.intField2 = intField2; }
}