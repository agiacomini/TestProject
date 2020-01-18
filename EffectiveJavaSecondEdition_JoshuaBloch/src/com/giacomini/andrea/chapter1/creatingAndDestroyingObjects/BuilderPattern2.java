package com.giacomini.andrea.chapter1.creatingAndDestroyingObjects;

public class BuilderPattern2 
{
	private final String stringField;
	private final int intField;
	
	public static class Builder implements BuilderInterface<BuilderPattern2>
	{
		// required parameters
		private final String stringField;
		
		// optional parameters - initialized to default value
		private int intField = 0;
		
		public Builder( String stringField )
		{
			this.stringField = stringField;
		}
		
		public Builder intField( int intField )
		{
			this.intField = intField;
			return this;
		}
		
		public BuilderPattern2 build()
		{
			return new BuilderPattern2( this );
		}
	}
	
	private BuilderPattern2( Builder builder )
	{
		this.stringField = builder.stringField;
		this.intField = builder.intField;
	}
	
	public String toString()
	{
		return "BuilderPattern2 : stringField = " + this.stringField + 
				", intField = " + this.intField;
	}
	
	public static void main( String[] args ) 
	{
		BuilderPattern2 builderPattern2 = new BuilderPattern2.Builder("Test").
				intField(35).build();
		System.out.println( builderPattern2 );
	}
}