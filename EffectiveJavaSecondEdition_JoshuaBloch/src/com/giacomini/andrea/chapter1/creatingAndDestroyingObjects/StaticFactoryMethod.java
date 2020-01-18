package com.giacomini.andrea.chapter1.creatingAndDestroyingObjects;

import java.util.HashSet;
import java.util.Set;

// Static Factory Method: is different from "Static Factory pattern" GoF.
//						  Is simply a static method that return an instance
//						  of the class. The key idea of Static Factory Method
//						  is to gain the control over object creation and delegate
//						  it from constructor to static method. Example of commonly
//						  used static factory method: "valueOf()", "getInstance()" 
//						  e "newInstance()". A static factory method with a well-chosen
//						  name is easier to use and the resulting client code easier to read.
//						  The classic Singleton implementation is a special case of
//						  static factory method.
public class StaticFactoryMethod 
{
	private String stringField;
	private int intField;
	
	private StaticFactoryMethod(){}
	
	private StaticFactoryMethod( String stringField )
	{
		this.stringField = stringField;
	}
	
	private StaticFactoryMethod( String stringField, int intField )
	{
		this.stringField = stringField;
		this.intField = intField;
	}
	
	// 1- One advantage of static factory method is that, unlike constructor, 
	// they have names.
	// 2- Moreover, a second advantages of static factory method is that, unlike constructor,
	// they are not required to create a new object each time they're invoked 
	// (Classes "instance-controlled").
	// 3- A third advantages of static factory method is that, unlike constructors,
	// they can return an object of any subtype of their return type.
	// 4- A fourth advantage of static factory method is that they reduce the verbosity
	// of creating parameterized type instances.
	public static StaticFactoryMethod getObject()
	{
		return new StaticFactoryMethod();
	}
	
	public static StaticFactoryMethod createStaticFactoryMethodWithOnlyStringParameter( String stringField )
	{
		return new StaticFactoryMethod( stringField );
	}
	
	public static StaticFactoryMethod createStaticFactoryMethodWithStringAndIntParameters ( String stringField, int intField )
	{
		return new StaticFactoryMethod( stringField, intField );
	}
	
	public String toString()
	{
		return "StaticFactoryMethod: stringField = " + this.stringField + 
			   ", intField = " + this.intField;
	}
	
	public static void main( String[] args ) 
	{
		StaticFactoryMethod staticFactoryMethod = StaticFactoryMethod.createStaticFactoryMethodWithOnlyStringParameter( "testStringField" );
		System.out.println( staticFactoryMethod );
	}
}


// Example of Static Factory Method
class DbConnection
{
	private static final int MAX_CONNS = 100;
	private static int totalConnections = 0;

	private static Set<DbConnection> availableConnections = new HashSet<DbConnection>();
	
	// "private" Constructor, prevent the direct instantiation from Client.
	private DbConnection()
	{
		// ...
		totalConnections++;
	}

	// Static Factory method: this example avoid providing direct access to database.
	public static DbConnection getDbConnection() throws Exception
	{
		// Create a connection if we're below the limit.
		if( totalConnections < MAX_CONNS )
		{
			return new DbConnection();
	    }
		// Otherwise, it tries to provide a "spare" connection. A connection already 
		// present in the set "availableConnections"
		else if( availableConnections.size() > 0 )
		{
			DbConnection dbc = availableConnections.iterator().next();
			availableConnections.remove( dbc );
			return dbc;
	    }
		else 
		{
			throw new Exception();
	    }
	}

	public static void returnDbConnection( DbConnection dbc )
	{
		availableConnections.add( dbc );
     //...
	}
}