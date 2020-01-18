package com.giacomini.andrea.chapter1.creatingAndDestroyingObjects;

// Builder Pattern : combines the safety of the telescoping constructor pattern 
//					 with the readability of the JavaBeans pattern.
//					 It's more verbose than the telescoping constructor pattern,
//					 so it should be used only if there are enough parameters.
//					 The Builder pattern is a good choice when designing classes
//					 whose constructors or static factories would have more than a 
//					 handful ( manciata ) of parameters;
public class BuilderPattern 
{
	// more than five parameters;
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;			
	private final int sodium;				
	private final int carbohydrate;
	
	// The Builder is a static member class of the class it builds.
	// Like a constructor a Builder can impose invariants on its parameters. The "build()"
	// method can check these invariants.
	// A single builder can be used to build multiple objects;
	public static class Builder
	{
		// required parameters
		private final int servingSize;
		private final int servings;
		
		// optional parameters - initialized to default value;
		private int calories 	 = 0;
		private int fat		     = 0;			
		private int sodium 	     = 0;				
		private int carbohydrate = 0;
		
		public Builder( int servingSize, int servings )
		{
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories( int calories )
		{
			this.calories = calories;
			return this;
		}
		
		public Builder fat( int fat )
		{
			this.fat = fat;
			return this;
		}
		
		public Builder sodium( int sodium )
		{
			this.sodium = sodium;
			return this;
		}
		
		public Builder carbohydrate( int carbohydrate )
		{
			this.carbohydrate = carbohydrate;
			return this;
		}
		
		public BuilderPattern build()
		{
			return new BuilderPattern( this );
		}
	}
	
	private BuilderPattern( Builder builder )
	{
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}
	
	public String toString()
	{
		return "BuilderPattern: servingSize = " + this.servingSize + 
				", servings = " + this.servings + ", calories = " + this.calories +
				", fat = " + this.fat + ", sodium = " + this.sodium + 
				", carbohydrate = " + this.carbohydrate;
	}
	
	public static void main( String[] args ) 
	{
		// The class "BuilderPattern" is immutable and all parameter default values
		// are in a single location.
		// In order to create an object, you must first create its builder
		// "new BuilderPattern.Builder( 240, 8 )".
		BuilderPattern builderPattern = new BuilderPattern.Builder( 240, 8 ).
				calories( 100 ).sodium( 35 ).carbohydrate( 27 ).build();
		System.out.println( builderPattern );
	}
}