package com.giacomini.andrea.chapter2.methodsCommonToAllObjects;

public class OverridingEqualsMethod3{}

//-------------------------- Symmetric Requirement --------------------// 
// Example of possible violation; 
final class CaseInsensitiveString
{
	private final String s;
	
	public CaseInsensitiveString( String s )
	{
		if( s == null )
			throw new NullPointerException();
		this.s = s;
	}
	
	// Broken - violates symmetry !!!
	@Override
	public boolean equals( Object o )
	{
		if( o instanceof CaseInsensitiveString )
			return s.equalsIgnoreCase( ( ( CaseInsensitiveString ) o ).s);
		if( o instanceof String ) // One-way interoperability!
			return s.equalsIgnoreCase( ( String ) o );
		return false;
	}
}

//----------------------------- Transitivity Requirement ------------------//
// Example of possible violation;
// A simple immutable  two dimensional integer point class;
class Point
{
	private final int x;
	private final int y;
	
	public Point( int x, int y )
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals( Object o )
	{
		if( !( o instanceof Point ) )
			return false;
		Point p = ( Point ) o;
		return p.x == x && p.y == y; 
	}
}

class Color
{
	private final String color;
	
	public Color( String color ) { this.color = color; }
}

// Suppose to extends this class ( father class "Point" ), adding a new "value component";
class ColorPoint extends Point
{
	private final Color color;
	
	public ColorPoint( int x, int y, Color color )
	{
		super( x, y );
		this.color = color;
	}
	
	// Before
//	@Override
//	public boolean equals( Object o )		// this equals method return true only if its argument   
//	{										// is another "ColorPoint" with the same position and color;
//		if( !( o instanceof ColorPoint ) )
//			return false;
//		return super.equals( o ) && ( ( ColorPoint ) o ).color == color;
//	}
	
	// Later
	@Override
	public boolean equals( Object o )		  
	{										
		if( !( o instanceof Point ) )		// Return "false" if the Objects is neither "Point" nor "ColorPoint";
			return false;
		
		if( !( o instanceof ColorPoint ) )	// If "o" is a normal "Point" do a color-blind comparison (confronto daltonico);
			return o.equals( this );
		
		// Otherwise "o" is a "ColorPoint" do a full comparison;
		return super.equals( o ) && ( ( ColorPoint ) o ).color == color;
	}
}

// Use/Favor composition over inheritance;
class Colorpoint2
{
	private final Point point;
	private final Color color;
	
	public Colorpoint2( int x, int y, Color color )
	{
		if( color == null )
			throw new NullPointerException();
		point = new Point( x, y );
		this.color = color;
	}
	
	public Point asPoint()
	{
		return point;
	}
	
	@Override
	public boolean equals( Object o )
	{
		if( !( o instanceof Colorpoint2 ) )
			return false;
		Colorpoint2 colorpoint2 = ( Colorpoint2 ) o;
		return colorpoint2.point.equals( point ) && colorpoint2.color.equals( color );
	}
}