package com.giacomini.andrea.chapter1.creatingAndDestroyingObjects;

import java.util.Arrays;
import java.util.EmptyStackException;

/* 
 * */
public class EliminateObsoleteObjectReferences 
{
	private Object[] elements;
	private int size = 0;
	private static final int DEFUALT_INITIAL_CAPACITY = 16;
	
	// Il costruttore inizializza l'array di elementi;
	public EliminateObsoleteObjectReferences()
	{
		elements = new Object[ DEFUALT_INITIAL_CAPACITY ];
	}
	
	public void push( Object object )
	{
		ensureCapacity();
		elements[size++] = object;
	}
	
//	public Object pop()
//	{
//		if( size == 0 )
//			throw new EmptyStackException();
//		return elements[--size];
//	}
	
	public Object pop()
	{
		if( size == 0 )
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null;					// Eliminate obsolete reference;
		return result;
	}
	
	private void ensureCapacity()
	{
		if( elements.length == size )
			elements = Arrays.copyOf(elements, 2 * size + 1 );
	}
}
