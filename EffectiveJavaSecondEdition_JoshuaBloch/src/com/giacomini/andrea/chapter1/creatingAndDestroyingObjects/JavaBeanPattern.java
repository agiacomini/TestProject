package com.giacomini.andrea.chapter1.creatingAndDestroyingObjects;

// JavaBean Pattern: allow Inconsistency, mandates mutability
public class JavaBeanPattern 
{
	private int servingSize  = -1;		// Required; No default value
	private int servings	 = -1;		// Required; No default value
	private int calories	 = 0;
	private int fat			 = 0;			
	private int sodium		 = 0;				
	private int carbohydrate = 0;	
	
	// Parameterless Constructor
	public JavaBeanPattern(){}
	
	public int getServingSize() { return servingSize; }
	
	public void setServingSize( int servingSize ) { this.servingSize = servingSize; }
	
	public int getServings() { return servings; }
	
	public void setServings( int servings ) { this.servings = servings; }
	
	public int getCalories() { return calories; }
	
	public void setCalories( int calories ) { this.calories = calories; }
	
	public int getFat() { return fat; }
	
	public void setFat( int fat ) { this.fat = fat; }
	
	public int getSodium() { return sodium; }
	
	public void setSodium( int sodium ) { this.sodium = sodium; }
	
	public int getCarbohydrate() { return carbohydrate; }
	
	public void setCarbohydrate( int carbohydrate ) { this.carbohydrate = carbohydrate; }
	
	public String toString()
	{
		return "JavaBeanPattern : servingSize = " + this.servingSize + 
				", servings = " + this.servings + ", calories = " + this.calories +
				", fat = " + this.fat + ", sodium = " + this.sodium + 
				", carbohydrate = " + this.carbohydrate;
	}
	
	public static void main( String[] args ) 
	{
		// N.B: The construction is split across multiple calls, a JavaBean
		//		may be in an inconsistent state partway ( in parte ) through 
		//		its construction;
		//		A related disadvantage is that the JavaBeans patter precludes
		//		the possibility of making a class immutable;
		JavaBeanPattern javaBeanPattern = new JavaBeanPattern();
		javaBeanPattern.setServingSize( 240 );
		javaBeanPattern.setServings( 8 );
		javaBeanPattern.setCalories( 100 );
		javaBeanPattern.setSodium( 35 );
		javaBeanPattern.setCarbohydrate( 27 );
		
		System.out.println( javaBeanPattern );
	}
}