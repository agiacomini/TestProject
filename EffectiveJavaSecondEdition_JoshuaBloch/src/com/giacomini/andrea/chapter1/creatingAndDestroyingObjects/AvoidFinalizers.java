package com.giacomini.andrea.chapter1.creatingAndDestroyingObjects;

import org.apache.log4j.Logger;
import com.giacomini.andrea.utils.ProjectLogger;

public class AvoidFinalizers 
{
	public static Logger logger = ProjectLogger.logger;
	
	private static final String AVOID_MAX = "...";
	private String stringAvoid = "";					// required
	private int intAvoid;								// optional
	
	// static factory
//	public static AvoidFinalizers getInstance() { return new AvoidFinalizers();	}
	public static AvoidFinalizers getInstance() { return new AvoidFinalizers.Builder( "create Instance" ).intAvoid( 10 ).build(); }
	
	// constructors
	private AvoidFinalizers(){}
//	private AvoidFinalizers( String stringAvoid ) { this.stringAvoid = stringAvoid;	}
	private AvoidFinalizers( String stringAvoid ) { this( stringAvoid, 0 );	}
	private AvoidFinalizers( String stringAvoid, int intAvoid ) 
	{ 
		this.stringAvoid = stringAvoid;
		this.intAvoid = intAvoid;
	}
	private AvoidFinalizers( Builder builder )
	{
		this.stringAvoid = builder.stringAvoid;
		this.intAvoid = builder.intAvoid;
	}
	
	// getter & setter - Java Bean
	public String getStringAvoid() { return stringAvoid; }
	public void setStringAvoid( String stringAvoid ) { this.stringAvoid = stringAvoid; }
	public int getIntAvoid() { return intAvoid; }
	public void setIntAvoid( int intAvoid ) {	this.intAvoid = intAvoid; }

	// explicit termination method
	public static void terminateAvoidFinalizers( AvoidFinalizers avoidFinalizers ) throws Throwable 
	{
		logger.debug( "AvoidFinalizers::terminateAvoidFinalizers" );
		avoidFinalizers = null;
	}
	
	// builder class ( nested )
	public static class Builder
	{
		// the same fields of father class;
		private String stringAvoid;
		private int intAvoid;
		
		// constructors
		public Builder( String stringAvoid ){ this.stringAvoid = stringAvoid; }
		
		// setter
		public Builder intAvoid( int intAvoid )
		{
			logger.debug( "AvoidFinalizers.Builder::intAvoid" );
			this.intAvoid = intAvoid;
			return this;
		}
		
		public AvoidFinalizers build()
		{ 
			logger.debug( "AvoidFinalizers.Builder::build" );
			return new AvoidFinalizers( this ); } 
	}
	
	public void methodUtilityOnAvoidFinalizersObject()
	{
		logger.debug( "AvoidFinalizers::methodUtilityOnAvoidFinalizersObject - START" );
		// ... some business login
		logger.debug( "AvoidFinalizers::methodUtilityOnAvoidFinalizersObject - END" );
	}
	
	// toString()
	public String toString()
	{
		return "AvoidFinalizers: stringAvoid = " + this.stringAvoid + ", intAvoid = " + this.intAvoid; 
	}
	
	// test by main()
	public static void main( String[] args ) throws Throwable 
	{
//		AvoidFinalizers avoidFinalizers = new AvoidFinalizers();
		AvoidFinalizers avoidFinalizers = AvoidFinalizers.getInstance();
		
		try
		{
			// ...
			avoidFinalizers.methodUtilityOnAvoidFinalizersObject();
			System.out.println( avoidFinalizers );
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			AvoidFinalizers.terminateAvoidFinalizers( avoidFinalizers ); 
		}
	}
}