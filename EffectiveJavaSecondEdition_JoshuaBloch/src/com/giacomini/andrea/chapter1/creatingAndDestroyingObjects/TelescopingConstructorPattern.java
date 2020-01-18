package com.giacomini.andrea.chapter1.creatingAndDestroyingObjects;

// Telescoping Patter: does not scale well !!!
//					   It is hard to write code when there are many parameters; 
public class TelescopingConstructorPattern 
{
	private final int servingSize;	// required
	private final int servings;		// required
	private final int calories;		// optional
	private final int fat;			// optional
	private final int sodium;			// optional
	private final int carbohydrate;	// optional
	
	// Constructor with only the required parameters
	public TelescopingConstructorPattern( int servingSize, int servings )
	{
		this( servingSize, servings, 0 );
	}
	
	// Costructor with a single optional parameter
	public TelescopingConstructorPattern( int servingSize, int servings, int calories )
	{
		this( servingSize, servings, calories, 0 );
	}
	
	// Costructor with two optional parameter
	public TelescopingConstructorPattern( int servingSize, int servings, int calories, 
										  int fat )
	{
		this( servingSize, servings, calories, fat, 0 );
	}
	
	// ... and so on !!!
	public TelescopingConstructorPattern( int servingSize, int servings, int calories, 
										  int fat, int sodium )
	{
		this( servingSize, servings, calories, fat, sodium, 0 );
	}
	
	// Costructor with all optional parameters
	public TelescopingConstructorPattern( int servingSize, int servings, int calories, 
			  							  int fat, int sodium, int carbohydrate )
	{
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}
	
	public String toString()
	{
		return "TelescopingConstructorPattern : servingSize = " + this.servingSize + 
				", servings = " + this.servings + ", calories = " + this.calories +
				", fat = " + this.fat + ", sodium = " + this.sodium + 
				", carbohydrate = " + this.carbohydrate;
	}
	
	public static void main( String[] args ) 
	{
		// N.B: this invocation require many parameters that you don't want to set,
		//		but you're forced to pass a value for them anyway;
		TelescopingConstructorPattern telescopingConstructorPattern = 
				new TelescopingConstructorPattern( 240, 8, 100, 0, 35, 27 );
		System.out.println( telescopingConstructorPattern );
	}
}